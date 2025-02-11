package net.mechalopa.hmag.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoulSandBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PoisonSandBlock extends SoulSandBlock
{
	public PoisonSandBlock(AbstractBlock.Properties properties)
	{
		super(properties);
	}

	@Override
	public void entityInside(BlockState state, World worldIn, BlockPos pos, Entity entityIn)
	{
		if (!worldIn.isClientSide && entityIn != null && entityIn instanceof LivingEntity)
		{
			LivingEntity livingentity = (LivingEntity)entityIn;

			if (!livingentity.hasEffect(Effects.POISON))
			{
				livingentity.addEffect(new EffectInstance(Effects.POISON, 5 * 20, 0));
			}
		}
	}
}