package net.mechalopa.hmag.entity;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import net.mechalopa.hmag.registry.ModSoundEvents;
import net.mechalopa.hmag.util.ModUtils;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Pose;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.WaterAvoidingRandomWalkingGoal;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.Difficulty;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.IServerWorld;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

public class CursedDollEntity extends MonsterEntity implements IModMob
{
	public CursedDollEntity(EntityType<? extends CursedDollEntity> type, World worldIn)
	{
		super(type, worldIn);
		this.maxUpStep = 1.5F;
		this.xpReward = 12;
	}

	@Override
	protected void registerGoals()
	{
		this.goalSelector.addGoal(1, new SwimGoal(this));
		this.goalSelector.addGoal(4, new MeleeAttackGoal(this, 1.0D, false));
		this.goalSelector.addGoal(5, new WaterAvoidingRandomWalkingGoal(this, 1.0D));
		this.goalSelector.addGoal(6, new LookAtGoal(this, PlayerEntity.class, 8.0F));
		this.goalSelector.addGoal(6, new LookRandomlyGoal(this));
		this.targetSelector.addGoal(1, new HurtByTargetGoal(this));
		this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, true).setUnseenMemoryTicks(120));
	}

	public static AttributeModifierMap.MutableAttribute createAttributes()
	{
		return MonsterEntity.createMonsterAttributes()
				.add(Attributes.MAX_HEALTH, 40.0D)
				.add(Attributes.MOVEMENT_SPEED, 0.29D)
				.add(Attributes.ATTACK_DAMAGE, 4.0D)
				.add(Attributes.ATTACK_KNOCKBACK, 1.0D)
				.add(Attributes.KNOCKBACK_RESISTANCE, 0.25D);
	}

	@Override
	public void aiStep()
	{
		if (this.level.isClientSide)
		{
			this.level.addParticle(ParticleTypes.MYCELIUM, this.getRandomX(0.5D), this.getRandomY() - 0.5D, this.getRandomZ(0.5D), (this.getRandom().nextDouble() - 0.5D) * 3.0D, -this.getRandom().nextDouble(), (this.getRandom().nextDouble() - 0.5D) * 3.0D);
		}

		ModUtils.burnInDay(this, this.getRandom(), this.isSunBurnTick(), 8);

		super.aiStep();

		Vector3d vector3d = this.getDeltaMovement();

		if (!this.onGround && vector3d.y < 0.0D)
		{
			this.setDeltaMovement(vector3d.multiply(1.0D, 0.6D, 1.0D));
		}
	}

	@Override
	public boolean causeFallDamage(float distance, float damageMultiplier)
	{
		return false;
	}

	@Override
	public boolean doHurtTarget(Entity entityIn)
	{
		if (super.doHurtTarget(entityIn))
		{
			if (entityIn instanceof LivingEntity)
			{
				int i = 0;

				if (this.level.getDifficulty() == Difficulty.NORMAL)
				{
					i = 7;
				}
				else if (this.level.getDifficulty() == Difficulty.HARD)
				{
					i = 15;
				}

				if (i > 0)
				{
					((LivingEntity)entityIn).addEffect(new EffectInstance(Effects.MOVEMENT_SLOWDOWN, i * 20, 0));
				}
			}

			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public boolean hurt(DamageSource source, float amount)
	{
		if (source.isFire())
		{
			amount = amount * 2.0F;
		}

		return super.hurt(source, amount);
	}

	@Override
	protected void populateDefaultEquipmentSlots(DifficultyInstance difficulty)
	{
		float f = difficulty.getSpecialMultiplier();

		if (this.getRandom().nextFloat() < 0.25F * f + 0.25F)
		{
			this.setItemSlot(EquipmentSlotType.MAINHAND, new ItemStack(Items.STONE_AXE));
		}
		else
		{
			this.setItemSlot(EquipmentSlotType.MAINHAND, new ItemStack(Items.WOODEN_AXE));
		}
	}

	@Override
	@Nullable
	public ILivingEntityData finalizeSpawn(IServerWorld worldIn, DifficultyInstance difficultyIn, SpawnReason reason, @Nullable ILivingEntityData spawnDataIn, @Nullable CompoundNBT dataTag)
	{
		spawnDataIn = super.finalizeSpawn(worldIn, difficultyIn, reason, spawnDataIn, dataTag);
		this.populateDefaultEquipmentSlots(difficultyIn);
		this.populateDefaultEquipmentEnchantments(difficultyIn);

		return spawnDataIn;
	}

	@Override
	public int getMaxSpawnClusterSize()
	{
		return 3;
	}

	@Override
	public double getMyRidingOffset()
	{
		return -0.32D;
	}

	@Override
	protected float getStandingEyeHeight(Pose poseIn, EntitySize sizeIn)
	{
		return 1.52F;
	}

	@Override
	protected SoundEvent getAmbientSound()
	{
		return ModSoundEvents.DOLL_AMBIENT.get();
	}

	@Override
	protected SoundEvent getHurtSound(DamageSource damageSourceIn)
	{
		return ModSoundEvents.DOLL_HURT.get();
	}

	@Override
	protected SoundEvent getDeathSound()
	{
		return ModSoundEvents.DOLL_DEATH.get();
	}

	@Nonnull
	@Override
	public IPacket<?> getAddEntityPacket()
	{
		return NetworkHooks.getEntitySpawningPacket(this);
	}
}