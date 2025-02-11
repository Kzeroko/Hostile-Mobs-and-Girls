package net.mechalopa.hmag.registry;

import net.mechalopa.hmag.HMaG;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.particles.ParticleType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModParticleTypes
{
	private static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, HMaG.MODID);

	public static final RegistryObject<BasicParticleType> ENCHANTMENT_RUNE = REGISTRY.register("enchantment_rune", () -> new BasicParticleType(false));
	public static final RegistryObject<BasicParticleType> NEMESIS_FLAME = REGISTRY.register("nemesis_flame", () -> new BasicParticleType(false));

	@SubscribeEvent
	public static void register(IEventBus eventBus)
	{
		REGISTRY.register(eventBus);
	}
}