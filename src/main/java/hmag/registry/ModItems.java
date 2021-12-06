package hmag.registry;

import hmag.HMaG;
import hmag.item.AncientShieldItem;
import hmag.item.CrimsonBowItem;
import hmag.item.EnchantmentUpgradeItem;
import hmag.item.EndlessPearlItem;
import hmag.item.EvilThornItem;
import hmag.item.FireBottleItem;
import hmag.item.FortressShieldItem;
import hmag.item.InsomniaSwordItem;
import hmag.item.InvincibleBlockItem;
import hmag.item.LightningBottleItem;
import hmag.item.LightningSoupItem;
import hmag.item.ModArmorMaterial;
import hmag.item.ModFoodItem;
import hmag.item.ModItem;
import hmag.item.ModSwordItem;
import hmag.item.NemesisBladeItem;
import hmag.item.NetherStarBlockItem;
import hmag.item.PurificationClothItem;
import hmag.util.ModTags;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EntityType;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraft.item.Rarity;
import net.minecraft.item.SoupItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems
{
	private static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, HMaG.MODID);

	public static final RegistryObject<Item> EVIL_CRYSTAL_BLOCK = REGISTRY.register("evil_crystal_block", () -> new BlockItem(ModBlocks.EVIL_CRYSTAL_BLOCK.get(), new Item.Properties().tab(HMaG.MODTAB)));
	public static final RegistryObject<Item> SOUL_POWDER_BLOCK = REGISTRY.register("soul_powder_block", () -> new BlockItem(ModBlocks.SOUL_POWDER_BLOCK.get(), new Item.Properties().tab(HMaG.MODTAB)));
	public static final RegistryObject<Item> ANCIENT_STONE_BLOCK = REGISTRY.register("ancient_stone_block", () -> new BlockItem(ModBlocks.ANCIENT_STONE_BLOCK.get(), new Item.Properties().tab(HMaG.MODTAB).rarity(Rarity.UNCOMMON)));
	public static final RegistryObject<Item> NETHER_STAR_BLOCK = REGISTRY.register("nether_star_block", () -> new NetherStarBlockItem(ModBlocks.NETHER_STAR_BLOCK.get(), new Item.Properties().tab(HMaG.MODTAB).rarity(Rarity.UNCOMMON)));
	public static final RegistryObject<Item> THORN_SAND = REGISTRY.register("thorn_sand", () -> new BlockItem(ModBlocks.THORN_SAND.get(), new Item.Properties().tab(HMaG.MODTAB)));
	public static final RegistryObject<Item> POISON_SAND = REGISTRY.register("poison_sand", () -> new BlockItem(ModBlocks.POISON_SAND.get(), new Item.Properties().tab(HMaG.MODTAB)));
	public static final RegistryObject<Item> WITHER_SAND = REGISTRY.register("wither_sand", () -> new BlockItem(ModBlocks.WITHER_SAND.get(), new Item.Properties().tab(HMaG.MODTAB)));
	public static final RegistryObject<Item> HEALING_SAND = REGISTRY.register("healing_sand", () -> new BlockItem(ModBlocks.HEALING_SAND.get(), new Item.Properties().tab(HMaG.MODTAB)));
	public static final RegistryObject<Item> REINFORCED_BLOCK = REGISTRY.register("reinforced_block", () -> new InvincibleBlockItem(ModBlocks.REINFORCED_BLOCK.get(), new Item.Properties().tab(HMaG.MODTAB).rarity(Rarity.UNCOMMON).fireResistant()));
	public static final RegistryObject<Item> REINFORCED_GLASS = REGISTRY.register("reinforced_glass", () -> new InvincibleBlockItem(ModBlocks.REINFORCED_GLASS.get(), new Item.Properties().tab(HMaG.MODTAB).rarity(Rarity.UNCOMMON).fireResistant()));

	public static final RegistryObject<Item> EVIL_CRYSTAL_FRAGMENT = REGISTRY.register("evil_crystal_fragment", () -> new Item(new Item.Properties().tab(HMaG.MODTAB)));
	public static final RegistryObject<Item> EVIL_CRYSTAL = REGISTRY.register("evil_crystal", () -> new Item(new Item.Properties().tab(HMaG.MODTAB)));
	public static final RegistryObject<Item> SOUL_POWDER = REGISTRY.register("soul_powder", () -> new Item(new Item.Properties().tab(HMaG.MODTAB)));
	public static final RegistryObject<Item> KOBOLD_LEATHER = REGISTRY.register("kobold_leather", () -> new Item(new Item.Properties().tab(HMaG.MODTAB)));
	public static final RegistryObject<Item> LICH_CLOTH = REGISTRY.register("lich_cloth", () -> new Item(new Item.Properties().tab(HMaG.MODTAB)));
	public static final RegistryObject<Item> OGRE_HORN = REGISTRY.register("ogre_horn", () -> new Item(new Item.Properties().tab(HMaG.MODTAB)));
	public static final RegistryObject<Item> ENDER_PLASM = REGISTRY.register("ender_plasm", () -> new Item(new Item.Properties().tab(HMaG.MODTAB).rarity(Rarity.UNCOMMON)));
	public static final RegistryObject<Item> ANCIENT_STONE = REGISTRY.register("ancient_stone", () -> new Item(new Item.Properties().tab(HMaG.MODTAB).rarity(Rarity.UNCOMMON)));
	public static final RegistryObject<Item> CRIMSON_CUTICULA = REGISTRY.register("crimson_cuticula", () -> new Item(new Item.Properties().tab(HMaG.MODTAB)));
	public static final RegistryObject<Item> DYSSOMNIA_SKIN = REGISTRY.register("dyssomnia_skin", () -> new Item(new Item.Properties().tab(HMaG.MODTAB)));
	public static final RegistryObject<Item> CANINE_TOOTH = REGISTRY.register("canine_tooth", () -> new Item(new Item.Properties().tab(HMaG.MODTAB)));
	public static final RegistryObject<Item> BURNING_CORE = REGISTRY.register("burning_core", () -> new ModItem(new Item.Properties().tab(HMaG.MODTAB), new ModItem.Properties().burnTime(4000)));
	public static final RegistryObject<Item> NECROFIBER = REGISTRY.register("necrofiber", () -> new Item(new Item.Properties().tab(HMaG.MODTAB)));
	public static final RegistryObject<Item> BAT_WING = REGISTRY.register("bat_wing", () -> new Item(new Item.Properties().tab(HMaG.MODTAB)));
	public static final RegistryObject<Item> LIGHTNING_PARTICLE = REGISTRY.register("lightning_particle", () -> new Item(new Item.Properties().tab(HMaG.MODTAB).rarity(Rarity.UNCOMMON)));
	public static final RegistryObject<Item> DIAMOND_FRAGMENT = REGISTRY.register("diamond_fragment", () -> new Item(new Item.Properties().tab(HMaG.MODTAB)));
	public static final RegistryObject<Item> EMERALD_FRAGMENT = REGISTRY.register("emerald_fragment", () -> new Item(new Item.Properties().tab(HMaG.MODTAB)));
	public static final RegistryObject<Item> TINY_NETHERITE_SCRAP = REGISTRY.register("tiny_netherite_scrap", () -> new Item(new Item.Properties().tab(HMaG.MODTAB).fireResistant()));
	public static final RegistryObject<Item> NETHERITE_NUGGET = REGISTRY.register("netherite_nugget", () -> new Item(new Item.Properties().tab(HMaG.MODTAB).fireResistant()));
	public static final RegistryObject<Item> NETHER_STAR_FRAGMENT = REGISTRY.register("nether_star_fragment", () -> new ModItem(new Item.Properties().tab(HMaG.MODTAB).rarity(Rarity.UNCOMMON), new ModItem.Properties().foil().setResistanceType(ModItem.ResistanceType.NETHER_STAR)));
	public static final RegistryObject<Item> COPPER_NUGGET = REGISTRY.register("copper_nugget", () -> new ModItem(new Item.Properties().tab(HMaG.MODTAB), new ModItem.Properties().setCheckingItemTagId(ModTags.FORGE_COPPER_INGOTS)));
	public static final RegistryObject<Item> SILVER_NUGGET = REGISTRY.register("silver_nugget", () -> new ModItem(new Item.Properties().tab(HMaG.MODTAB), new ModItem.Properties().setCheckingItemTagId(ModTags.FORGE_SILVER_INGOTS)));
	public static final RegistryObject<Item> RUBY_FRAGMENT = REGISTRY.register("ruby_fragment", () -> new ModItem(new Item.Properties().tab(HMaG.MODTAB), new ModItem.Properties().setCheckingItemTagId(ModTags.FORGE_RUBY_GEMS)));
	public static final RegistryObject<Item> SAPPHIRE_FRAGMENT = REGISTRY.register("sapphire_fragment", () -> new ModItem(new Item.Properties().tab(HMaG.MODTAB), new ModItem.Properties().setCheckingItemTagId(ModTags.FORGE_SAPPHIRE_GEMS)));
	public static final RegistryObject<Item> LEMON = REGISTRY.register("lemon", () -> new Item(new Item.Properties().tab(HMaG.MODTAB).food((new Food.Builder()).nutrition(2).saturationMod(0.1F).build())));
	public static final RegistryObject<Item> STRAWBERRY = REGISTRY.register("strawberry", () -> new Item(new Item.Properties().tab(HMaG.MODTAB).food((new Food.Builder()).nutrition(2).saturationMod(0.1F).build())));
	public static final RegistryObject<Item> BLUEBERRY = REGISTRY.register("blueberry", () -> new Item(new Item.Properties().tab(HMaG.MODTAB).food((new Food.Builder()).nutrition(2).saturationMod(0.1F).build())));
	public static final RegistryObject<Item> SOUL_APPLE = REGISTRY.register("soul_apple", () -> new ModFoodItem(new Item.Properties().tab(HMaG.MODTAB).food((new Food.Builder()).nutrition(3).saturationMod(0.3F).effect(() -> new EffectInstance(Effects.INVISIBILITY, 3 * 20, 0), 1.0F).alwaysEat().build()), new ModFoodItem.Properties().eatDuration(16).healAmount(1.0F)));
	public static final RegistryObject<Item> PHANTOM_APPLE = REGISTRY.register("phantom_apple", () -> new ModFoodItem(new Item.Properties().tab(HMaG.MODTAB).food((new Food.Builder()).nutrition(4).saturationMod(0.9F).effect(() -> new EffectInstance(Effects.SLOW_FALLING, 30 * 20, 0), 1.0F).alwaysEat().build()), new ModFoodItem.Properties().healAmount(1.0F)));
	public static final RegistryObject<Item> HONEYED_APPLE = REGISTRY.register("honeyed_apple", () -> new ModFoodItem(new Item.Properties().tab(HMaG.MODTAB).food((new Food.Builder()).nutrition(6).saturationMod(0.4F).alwaysEat().build()), new ModFoodItem.Properties().eatDuration(24).removePoison()));
	public static final RegistryObject<Item> HONEYED_LEMON = REGISTRY.register("honeyed_lemon", () -> new ModFoodItem(new Item.Properties().tab(HMaG.MODTAB).food((new Food.Builder()).nutrition(6).saturationMod(0.3F).alwaysEat().build()), new ModFoodItem.Properties().removePoison()));
	public static final RegistryObject<Item> LEMON_PIE = REGISTRY.register("lemon_pie", () -> new Item(new Item.Properties().tab(HMaG.MODTAB).food((new Food.Builder()).nutrition(7).saturationMod(0.3F).build())));
	public static final RegistryObject<Item> BLUEBERRY_PIE = REGISTRY.register("blueberry_pie", () -> new Item(new Item.Properties().tab(HMaG.MODTAB).food((new Food.Builder()).nutrition(6).saturationMod(0.3F).build())));
	public static final RegistryObject<Item> GOLDEN_TROPICAL_FISH = REGISTRY.register("golden_tropical_fish", () -> new Item(new Item.Properties().tab(HMaG.MODTAB).food((new Food.Builder()).nutrition(5).saturationMod(2.5F).effect(() -> new EffectInstance(Effects.ABSORPTION, 60 * 20, 1), 1.0F).effect(() -> new EffectInstance(Effects.FIRE_RESISTANCE, 15 * 20, 0), 1.0F).effect(() -> new EffectInstance(Effects.WATER_BREATHING, 15 * 20, 0), 1.0F).alwaysEat().build()).rarity(Rarity.RARE)));
	public static final RegistryObject<Item> CUBIC_NUCLEUS = REGISTRY.register("cubic_nucleus", () -> new ModFoodItem(new Item.Properties().tab(HMaG.MODTAB).food((new Food.Builder()).nutrition(4).saturationMod(0.8F).effect(() -> new EffectInstance(Effects.REGENERATION, 15 * 20, 0), 1.0F).alwaysEat().build()), new ModFoodItem.Properties().eatDuration(48)));
	public static final RegistryObject<Item> SAVAGEFANG_MEAT = REGISTRY.register("savagefang_meat", () -> new Item(new Item.Properties().tab(HMaG.MODTAB).food((new Food.Builder()).nutrition(3).saturationMod(0.1F).effect(() -> new EffectInstance(Effects.HUNGER, 30 * 20, 0), 0.2F).build())));
	public static final RegistryObject<Item> COOKED_SAVAGEFANG_MEAT = REGISTRY.register("cooked_savagefang_meat", () -> new Item(new Item.Properties().tab(HMaG.MODTAB).food((new Food.Builder()).nutrition(6).saturationMod(0.7F).build())));
	public static final RegistryObject<Item> BAT_STEW = REGISTRY.register("bat_stew", () -> new SoupItem(new Item.Properties().tab(HMaG.MODTAB).food((new Food.Builder()).nutrition(6).saturationMod(0.6F).build()).stacksTo(1)));
	public static final RegistryObject<Item> SPECTRAL_SOUP = REGISTRY.register("spectral_soup", () -> new SoupItem(new Item.Properties().tab(HMaG.MODTAB).food((new Food.Builder()).nutrition(6).saturationMod(1.5F).effect(() -> new EffectInstance(Effects.GLOWING, 30 * 20, 0), 1.0F).alwaysEat().build()).stacksTo(1)));
	public static final RegistryObject<Item> LIGHTNING_SOUP = REGISTRY.register("lightning_soup", () -> new LightningSoupItem(new Item.Properties().tab(HMaG.MODTAB).food((new Food.Builder()).nutrition(9).saturationMod(1.8F).effect(() -> new EffectInstance(Effects.GLOWING, 60 * 20, 0), 1.0F).effect(() -> new EffectInstance(Effects.NIGHT_VISION, 60 * 20, 0), 1.0F).effect(() -> new EffectInstance(Effects.DAMAGE_BOOST, 60 * 20, 0), 1.0F).effect(() -> new EffectInstance(Effects.DIG_SPEED, 60 * 20, 0), 1.0F).effect(() -> new EffectInstance(Effects.MOVEMENT_SPEED, 60 * 20, 1), 1.0F).effect(() -> new EffectInstance(Effects.JUMP, 60 * 20, 1), 1.0F).alwaysEat().build()).stacksTo(1).rarity(Rarity.RARE)));
	public static final RegistryObject<Item> INSOMNIA_SWORD = REGISTRY.register("insomnia_sword", () -> new InsomniaSwordItem(ItemTier.DIAMOND, new Item.Properties().tab(HMaG.MODTAB).rarity(Rarity.RARE)));
	public static final RegistryObject<Item> NEMESIS_BLADE = REGISTRY.register("nemesis_blade", () -> new NemesisBladeItem(ItemTier.NETHERITE, new Item.Properties().tab(HMaG.MODTAB).rarity(Rarity.EPIC).fireResistant()));
	public static final RegistryObject<Item> IRON_SPEAR = REGISTRY.register("iron_spear", () -> new ModSwordItem(ItemTier.IRON, 2.0F, -2.4F, new Item.Properties().tab(HMaG.MODTAB)));
	public static final RegistryObject<Item> GOLDEN_FORK = REGISTRY.register("golden_fork", () -> new ModSwordItem(ItemTier.GOLD, 2.0F, -2.4F, new Item.Properties().tab(HMaG.MODTAB)));
	public static final RegistryObject<Item> CRIMSON_BOW = REGISTRY.register("crimson_bow", () -> new CrimsonBowItem(new Item.Properties().tab(HMaG.MODTAB).durability(575).rarity(Rarity.RARE)));
	public static final RegistryObject<Item> ANCIENT_HELMET = REGISTRY.register("ancient_helmet", () -> new ArmorItem(ModArmorMaterial.ANCIENT, EquipmentSlotType.HEAD, (new Item.Properties()).tab(HMaG.MODTAB).rarity(Rarity.UNCOMMON)));
	public static final RegistryObject<Item> ANCIENT_CHESTPLATE = REGISTRY.register("ancient_chestplate", () -> new ArmorItem(ModArmorMaterial.ANCIENT, EquipmentSlotType.CHEST, (new Item.Properties()).tab(HMaG.MODTAB).rarity(Rarity.UNCOMMON)));
	public static final RegistryObject<Item> ANCIENT_LEGGINGS = REGISTRY.register("ancient_leggings", () -> new ArmorItem(ModArmorMaterial.ANCIENT, EquipmentSlotType.LEGS, (new Item.Properties()).tab(HMaG.MODTAB).rarity(Rarity.UNCOMMON)));
	public static final RegistryObject<Item> ANCIENT_BOOTS = REGISTRY.register("ancient_boots", () -> new ArmorItem(ModArmorMaterial.ANCIENT, EquipmentSlotType.FEET, (new Item.Properties()).tab(HMaG.MODTAB).rarity(Rarity.UNCOMMON)));
	public static final RegistryObject<Item> ANCIENT_SHIELD = REGISTRY.register("ancient_shield", () -> new AncientShieldItem(new Item.Properties().tab(HMaG.MODTAB).durability(671).rarity(Rarity.UNCOMMON)));
	public static final RegistryObject<Item> FORTRESS_SHIELD = REGISTRY.register("fortress_shield", () -> new FortressShieldItem(new Item.Properties().tab(HMaG.MODTAB).durability(671).rarity(Rarity.UNCOMMON)));
	public static final RegistryObject<Item> NECROTIC_CHAINMAIL_HELMET = REGISTRY.register("necrotic_chainmail_helmet", () -> new ArmorItem(ModArmorMaterial.NECROTIC_CHAIN, EquipmentSlotType.HEAD, (new Item.Properties()).tab(HMaG.MODTAB).rarity(Rarity.UNCOMMON)));
	public static final RegistryObject<Item> NECROTIC_CHAINMAIL_CHESTPLATE = REGISTRY.register("necrotic_chainmail_chestplate", () -> new ArmorItem(ModArmorMaterial.NECROTIC_CHAIN, EquipmentSlotType.CHEST, (new Item.Properties()).tab(HMaG.MODTAB).rarity(Rarity.UNCOMMON)));
	public static final RegistryObject<Item> NECROTIC_CHAINMAIL_LEGGINGS = REGISTRY.register("necrotic_chainmail_leggings", () -> new ArmorItem(ModArmorMaterial.NECROTIC_CHAIN, EquipmentSlotType.LEGS, (new Item.Properties()).tab(HMaG.MODTAB).rarity(Rarity.UNCOMMON)));
	public static final RegistryObject<Item> NECROTIC_CHAINMAIL_BOOTS = REGISTRY.register("necrotic_chainmail_boots", () -> new ArmorItem(ModArmorMaterial.NECROTIC_CHAIN, EquipmentSlotType.FEET, (new Item.Properties()).tab(HMaG.MODTAB).rarity(Rarity.UNCOMMON)));
	public static final RegistryObject<Item> FIRE_BOTTLE = REGISTRY.register("fire_bottle", () -> new FireBottleItem(new Item.Properties().tab(HMaG.MODTAB).stacksTo(16)));
	public static final RegistryObject<Item> LIGHTNING_BOTTLE = REGISTRY.register("lightning_bottle", () -> new LightningBottleItem(new Item.Properties().tab(HMaG.MODTAB).stacksTo(16).rarity(Rarity.RARE)));
	public static final RegistryObject<Item> REINFORCING_PLATE = REGISTRY.register("reinforcing_plate", () -> new EnchantmentUpgradeItem(new Item.Properties().tab(HMaG.MODTAB), Enchantments.UNBREAKING, 0, 2));
	public static final RegistryObject<Item> SHARD_OF_IMMORTALITY_TIER_1 = REGISTRY.register("shard_of_immortality_tier_1", () -> new EnchantmentUpgradeItem(new Item.Properties().tab(HMaG.MODTAB).rarity(Rarity.UNCOMMON), Enchantments.UNBREAKING, 3, 5));
	public static final RegistryObject<Item> SHARD_OF_IMMORTALITY_TIER_2 = REGISTRY.register("shard_of_immortality_tier_2", () -> new EnchantmentUpgradeItem(new Item.Properties().tab(HMaG.MODTAB).rarity(Rarity.RARE), new ModItem.Properties().foil(), Enchantments.UNBREAKING, 6, 9));
	public static final RegistryObject<Item> REPULSION_GADGET = REGISTRY.register("repulsion_gadget", () -> new EnchantmentUpgradeItem(new Item.Properties().tab(HMaG.MODTAB), new Enchantment[]{Enchantments.KNOCKBACK, Enchantments.PUNCH_ARROWS}, 0, 9));
	public static final RegistryObject<Item> EVIL_THORN = REGISTRY.register("evil_thorn", () -> new EvilThornItem(new Item.Properties().tab(HMaG.MODTAB)));
	public static final RegistryObject<Item> SHATTER_EFFECTOR_TIER_1 = REGISTRY.register("shatter_effector_tier_1", () -> new EnchantmentUpgradeItem(new Item.Properties().tab(HMaG.MODTAB).rarity(Rarity.UNCOMMON), Enchantments.BLOCK_EFFICIENCY, 5, 6));
	public static final RegistryObject<Item> SHATTER_EFFECTOR_TIER_2 = REGISTRY.register("shatter_effector_tier_2", () -> new EnchantmentUpgradeItem(new Item.Properties().tab(HMaG.MODTAB).rarity(Rarity.RARE), new ModItem.Properties().foil(), Enchantments.BLOCK_EFFICIENCY, 7, 9));
	public static final RegistryObject<Item> WICKED_WHETSTONE_TIER_1 = REGISTRY.register("wicked_whetstone_tier_1", () -> new EnchantmentUpgradeItem(new Item.Properties().tab(HMaG.MODTAB).rarity(Rarity.UNCOMMON), Enchantments.SHARPNESS, 5, 6));
	public static final RegistryObject<Item> WICKED_WHETSTONE_TIER_2 = REGISTRY.register("wicked_whetstone_tier_2", () -> new EnchantmentUpgradeItem(new Item.Properties().tab(HMaG.MODTAB).rarity(Rarity.RARE), new ModItem.Properties().foil(), Enchantments.SHARPNESS, 7, 9));
	public static final RegistryObject<Item> POWERFUL_BOWSTRING_TIER_1 = REGISTRY.register("powerful_bowstring_tier_1", () -> new EnchantmentUpgradeItem(new Item.Properties().tab(HMaG.MODTAB).rarity(Rarity.UNCOMMON), Enchantments.POWER_ARROWS, 5, 6));
	public static final RegistryObject<Item> POWERFUL_BOWSTRING_TIER_2 = REGISTRY.register("powerful_bowstring_tier_2", () -> new EnchantmentUpgradeItem(new Item.Properties().tab(HMaG.MODTAB).rarity(Rarity.RARE), new ModItem.Properties().foil(), Enchantments.POWER_ARROWS, 7, 9));
	public static final RegistryObject<Item> REINFORCED_PROTECTOR_TIER_1 = REGISTRY.register("reinforced_protector_tier_1", () -> new EnchantmentUpgradeItem(new Item.Properties().tab(HMaG.MODTAB).rarity(Rarity.UNCOMMON), Enchantments.ALL_DAMAGE_PROTECTION, 4, 6));
	public static final RegistryObject<Item> REINFORCED_PROTECTOR_TIER_2 = REGISTRY.register("reinforced_protector_tier_2", () -> new EnchantmentUpgradeItem(new Item.Properties().tab(HMaG.MODTAB).rarity(Rarity.RARE), new ModItem.Properties().foil().setResistanceType(ModItem.ResistanceType.INVINCIBLE), Enchantments.ALL_DAMAGE_PROTECTION, 7, 9));
	public static final RegistryObject<Item> SHARD_OF_GREED_TIER_1 = REGISTRY.register("shard_of_greed_tier_1", () -> new EnchantmentUpgradeItem(new Item.Properties().tab(HMaG.MODTAB).rarity(Rarity.UNCOMMON), Enchantments.MOB_LOOTING, 3, 4));
	public static final RegistryObject<Item> SHARD_OF_GREED_TIER_2 = REGISTRY.register("shard_of_greed_tier_2", () -> new EnchantmentUpgradeItem(new Item.Properties().tab(HMaG.MODTAB).rarity(Rarity.RARE), new ModItem.Properties().foil(), Enchantments.MOB_LOOTING, 5, 6));
	public static final RegistryObject<Item> SHARD_OF_GREED_TIER_3 = REGISTRY.register("shard_of_greed_tier_3", () -> new EnchantmentUpgradeItem(new Item.Properties().tab(HMaG.MODTAB).rarity(Rarity.EPIC).fireResistant(), new ModItem.Properties().foil(), Enchantments.MOB_LOOTING, 7, 9));
	public static final RegistryObject<Item> SHARD_OF_FORTUNE_TIER_1 = REGISTRY.register("shard_of_fortune_tier_1", () -> new EnchantmentUpgradeItem(new Item.Properties().tab(HMaG.MODTAB).rarity(Rarity.UNCOMMON), Enchantments.BLOCK_FORTUNE, 3, 4));
	public static final RegistryObject<Item> SHARD_OF_FORTUNE_TIER_2 = REGISTRY.register("shard_of_fortune_tier_2", () -> new EnchantmentUpgradeItem(new Item.Properties().tab(HMaG.MODTAB).rarity(Rarity.RARE), new ModItem.Properties().foil(), Enchantments.BLOCK_FORTUNE, 5, 6));
	public static final RegistryObject<Item> SHARD_OF_FORTUNE_TIER_3 = REGISTRY.register("shard_of_fortune_tier_3", () -> new EnchantmentUpgradeItem(new Item.Properties().tab(HMaG.MODTAB).rarity(Rarity.EPIC).fireResistant(), new ModItem.Properties().foil().setResistanceType(ModItem.ResistanceType.INVINCIBLE), Enchantments.BLOCK_FORTUNE, 7, 9));
	public static final RegistryObject<Item> PURIFICATION_CLOTH = REGISTRY.register("purification_cloth", () -> new PurificationClothItem(new Item.Properties().tab(HMaG.MODTAB).stacksTo(16).rarity(Rarity.UNCOMMON)));
	public static final RegistryObject<Item> ENDLESS_PEARL = REGISTRY.register("endless_pearl", () -> new EndlessPearlItem(new Item.Properties().tab(HMaG.MODTAB).stacksTo(1).rarity(Rarity.UNCOMMON)));

	public static final RegistryObject<Item> ZOMBIE_GIRL_SPAWN_EGG = createSpawnEggRegistryObject("zombie_girl", ModEntityTypes.ZOMBIE_GIRL, 0xB4AD53, 0x577431);
	public static final RegistryObject<Item> HUSK_GIRL_SPAWN_EGG = createSpawnEggRegistryObject("husk_girl", ModEntityTypes.HUSK_GIRL, 0xD3B87D, 0x62453D);
	public static final RegistryObject<Item> DROWNED_GIRL_SPAWN_EGG = createSpawnEggRegistryObject("drowned_girl", ModEntityTypes.DROWNED_GIRL, 0x7DBAAC, 0x0E6866);
	public static final RegistryObject<Item> SKELETON_GIRL_SPAWN_EGG = createSpawnEggRegistryObject("skeleton_girl", ModEntityTypes.SKELETON_GIRL, 0xB6A28D, 0x615042);
	public static final RegistryObject<Item> WITHER_SKELETON_GIRL_SPAWN_EGG = createSpawnEggRegistryObject("wither_skeleton_girl", ModEntityTypes.WITHER_SKELETON_GIRL, 0x2F2E37, 0x5B5B63);
	public static final RegistryObject<Item> STRAY_GIRL_SPAWN_EGG = createSpawnEggRegistryObject("stray_girl", ModEntityTypes.STRAY_GIRL, 0xA6B6B7, 0x576C6D);
	public static final RegistryObject<Item> CREEPER_GIRL_SPAWN_EGG = createSpawnEggRegistryObject("creeper_girl", ModEntityTypes.CREEPER_GIRL, 0x00A500, 0xFF7E00);
	public static final RegistryObject<Item> GHOST_SPAWN_EGG = createSpawnEggRegistryObject("ghost", ModEntityTypes.GHOST, 0xC3EEEE, 0xC4C495);
	public static final RegistryObject<Item> WITHER_GHOST_SPAWN_EGG = createSpawnEggRegistryObject("wither_ghost", ModEntityTypes.WITHER_GHOST, 0x7B4B3E, 0x2C2C2C);
	public static final RegistryObject<Item> ENDER_EXECUTOR_SPAWN_EGG = createSpawnEggRegistryObject("ender_executor", ModEntityTypes.ENDER_EXECUTOR, 0x100A1A, 0xD3D3A0);
	public static final RegistryObject<Item> KOBOLD_SPAWN_EGG = createSpawnEggRegistryObject("kobold", ModEntityTypes.KOBOLD, 0x0D1B27, 0xA9AF8D);
	public static final RegistryObject<Item> LICH_SPAWN_EGG = createSpawnEggRegistryObject("lich", ModEntityTypes.LICH, 0x391010, 0x55666A);
	public static final RegistryObject<Item> OGRE_SPAWN_EGG = createSpawnEggRegistryObject("ogre", ModEntityTypes.OGRE, 0x4A4839, 0x6E1C02);
	public static final RegistryObject<Item> SPIDER_NEST_SPAWN_EGG = createSpawnEggRegistryObject("spider_nest", ModEntityTypes.SPIDER_NEST, 0xE8E8DC, 0x828D85);
	public static final RegistryObject<Item> MELTY_MONSTER_SPAWN_EGG = createSpawnEggRegistryObject("melty_monster", ModEntityTypes.MELTY_MONSTER, 0xA80000, 0xFF9100);
	public static final RegistryObject<Item> CURSED_DOLL_SPAWN_EGG = createSpawnEggRegistryObject("cursed_doll", ModEntityTypes.CURSED_DOLL, 0x050000, 0xB53A95);
	public static final RegistryObject<Item> JACK_FROST_SPAWN_EGG = createSpawnEggRegistryObject("jack_frost", ModEntityTypes.JACK_FROST, 0xEEFFFF, 0x53629B);
	public static final RegistryObject<Item> HORNET_SPAWN_EGG = createSpawnEggRegistryObject("hornet", ModEntityTypes.HORNET, 0xFF770F, 0x851A05);
	public static final RegistryObject<Item> DULLAHAN_SPAWN_EGG = createSpawnEggRegistryObject("dullahan", ModEntityTypes.DULLAHAN, 0x6E2424, 0xA97D48);
	public static final RegistryObject<Item> BANSHEE_SPAWN_EGG = createSpawnEggRegistryObject("banshee", ModEntityTypes.BANSHEE, 0xDC8BC7, 0xC36CAA);
	public static final RegistryObject<Item> ARURAUNE_SPAWN_EGG = createSpawnEggRegistryObject("aruraune", ModEntityTypes.ARURAUNE, 0x23AA23, 0xD52B39);
	public static final RegistryObject<Item> CATOBLEPAS_SPAWN_EGG = createSpawnEggRegistryObject("catoblepas", ModEntityTypes.CATOBLEPAS, 0x74620B, 0x4E2310);
	public static final RegistryObject<Item> SCORPION_SPAWN_EGG = createSpawnEggRegistryObject("scorpion", ModEntityTypes.SCORPION, 0xDAB68F, 0x625358);
	public static final RegistryObject<Item> KASHA_SPAWN_EGG = createSpawnEggRegistryObject("kasha", ModEntityTypes.KASHA, 0x200000, 0xFFAE4A);
	public static final RegistryObject<Item> DOGU_SPAWN_EGG = createSpawnEggRegistryObject("dogu", ModEntityTypes.DOGU, 0xB45927, 0x692707);
	public static final RegistryObject<Item> GHASTLY_SEEKER_SPAWN_EGG = createSpawnEggRegistryObject("ghastly_seeker", ModEntityTypes.GHSATLY_SHEEKER, 0xF4E6D7, 0xC3B5A6);
	public static final RegistryObject<Item> REDCAP_SPAWN_EGG = createSpawnEggRegistryObject("redcap", ModEntityTypes.REDCAP, 0x73530D, 0x8E2323);
	public static final RegistryObject<Item> SLIME_GIRL_SPAWN_EGG = createSpawnEggRegistryObject("slime_girl", ModEntityTypes.SLIME_GIRL, 0xFD73AC, 0xFA476B);
	public static final RegistryObject<Item> MAGICAL_SLIME_SPAWN_EGG = createSpawnEggRegistryObject("magical_slime", ModEntityTypes.MAGICAL_SLIME, 0xFD73AC, 0xFF7D98);
	public static final RegistryObject<Item> MONOLITH_SPAWN_EGG = createSpawnEggRegistryObject("monolith", ModEntityTypes.MONOLITH, 0x4A3B71, 0x99A6C7);
	public static final RegistryObject<Item> CRIMSON_SLAUGHTERER_SPAWN_EGG = createSpawnEggRegistryObject("crimson_slaughterer", ModEntityTypes.CRIMSON_SLAUGHTERER, 0x942020, 0x562C3E);
	public static final RegistryObject<Item> DYSSOMNIA_SPAWN_EGG = createSpawnEggRegistryObject("dyssomnia", ModEntityTypes.DYSSOMNIA, 0x374377, 0xC3B9A1);
	public static final RegistryObject<Item> SNOW_CANINE_SPAWN_EGG = createSpawnEggRegistryObject("snow_canine", ModEntityTypes.SNOW_CANINE, 0xE9E3DF, 0xB19B8A);
	public static final RegistryObject<Item> STONEULAR_SPAWN_EGG = createSpawnEggRegistryObject("stoneular", ModEntityTypes.STONEULAR, 0x525252, 0xB5B5B5);
	public static final RegistryObject<Item> HARPY_SPAWN_EGG = createSpawnEggRegistryObject("harpy", ModEntityTypes.HARPY, 0xD29741, 0x6B5244);
	public static final RegistryObject<Item> SAVAGEFANG_SPAWN_EGG = createSpawnEggRegistryObject("savagefang", ModEntityTypes.SAVAGEFANG, 0x415A4E, 0x690C1B);
	public static final RegistryObject<Item> FORTRESS_KEEPER_SPAWN_EGG = createSpawnEggRegistryObject("fortress_keeper", ModEntityTypes.FORTRESS_KEEPER, 0x291519, 0xF48522);
	public static final RegistryObject<Item> NECROTIC_REAPER_SPAWN_EGG = createSpawnEggRegistryObject("necrotic_reaper", ModEntityTypes.NECROTIC_REAPER, 0x6A4B54, 0xADB5A7);
	public static final RegistryObject<Item> DODOMEKI_SPAWN_EGG = createSpawnEggRegistryObject("dodomeki", ModEntityTypes.DODOMEKI, 0x242121, 0xB3ACAB);
	public static final RegistryObject<Item> IMP_SPAWN_EGG = createSpawnEggRegistryObject("imp", ModEntityTypes.IMP, 0x5E2E78, 0x4E181B);

	@SubscribeEvent
	public static void register(IEventBus eventBus)
	{
		REGISTRY.register(eventBus);
	}

	protected static RegistryObject<Item> createSpawnEggRegistryObject(String name, RegistryObject<? extends EntityType<?>> entityTypeSupplier, int primaryColorIn, int secondaryColorIn)
	{
		return REGISTRY.register(name + "_spawn_egg", () -> new ForgeSpawnEggItem(entityTypeSupplier, primaryColorIn, secondaryColorIn, new Item.Properties().tab(HMaG.MODTAB)));
	}
}