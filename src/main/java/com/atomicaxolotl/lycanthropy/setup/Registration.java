package com.atomicaxolotl.lycanthropy.setup;

import com.atomicaxolotl.lycanthropy.Lycanthropy;
import com.atomicaxolotl.lycanthropy.armor.ModArmorMaterial;
import com.atomicaxolotl.lycanthropy.blocks.BlockItemBase;
import com.atomicaxolotl.lycanthropy.blocks.LycanFlowerBlock;
import com.atomicaxolotl.lycanthropy.blocks.SilverOreBlock;
import com.atomicaxolotl.lycanthropy.entities.FaoladhMobEntity;
import com.atomicaxolotl.lycanthropy.items.ItemBase;
import com.atomicaxolotl.lycanthropy.items.MobSpawnEggItem;
import com.atomicaxolotl.lycanthropy.items.OddMeat;
import com.atomicaxolotl.lycanthropy.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Registration {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Lycanthropy.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Lycanthropy.MOD_ID);
    private static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, Lycanthropy.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Items
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", ItemBase::new);
    public static final RegistryObject<OddMeat> ODD_MEAT = ITEMS.register("odd_meat", OddMeat::new);
    public static final RegistryObject<MobSpawnEggItem> SPAWN_WEREWOLF = ITEMS.register("spawn_werewolf", MobSpawnEggItem::new);

    //Tools
    public static final RegistryObject<SwordItem> SILVER_SWORD =  ITEMS.register("silver_sword", () ->
            new SwordItem(ModItemTier.SILVER, 3, -2.2f, new Item.Properties().group(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<PickaxeItem> SILVER_PICKAXE =  ITEMS.register("silver_pickaxe", () ->
            new PickaxeItem(ModItemTier.SILVER, 0, -2.6f, new Item.Properties().group(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<AxeItem> SILVER_AXE =  ITEMS.register("silver_axe", () ->
            new AxeItem(ModItemTier.SILVER, 6, -3.0f, new Item.Properties().group(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<ShovelItem> SILVER_SHOVEL =  ITEMS.register("silver_shovel", () ->
            new ShovelItem(ModItemTier.SILVER, 0, -3.0f, new Item.Properties().group(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<HoeItem> SILVER_HOE =  ITEMS.register("silver_hoe", () ->
            new HoeItem(ModItemTier.SILVER, 1, -3.0f, new Item.Properties().group(ModSetup.ITEM_GROUP)));

    //Armor
    public static final RegistryObject<ArmorItem> SILVER_HELMET = ITEMS.register("silver_helmet", () ->
             new ArmorItem(ModArmorMaterial.SILVER, EquipmentSlotType.HEAD, new Item.Properties().group(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> SILVER_CHESTPLATE = ITEMS.register("silver_chestplate", () ->
            new ArmorItem(ModArmorMaterial.SILVER, EquipmentSlotType.CHEST, new Item.Properties().group(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> SILVER_LEGGINGS = ITEMS.register("silver_leggings", () ->
            new ArmorItem(ModArmorMaterial.SILVER, EquipmentSlotType.LEGS, new Item.Properties().group(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> SILVER_BOOTS = ITEMS.register("silver_boots", () ->
            new ArmorItem(ModArmorMaterial.SILVER, EquipmentSlotType.FEET, new Item.Properties().group(ModSetup.ITEM_GROUP)));

    //Blocks
    public static final RegistryObject<Block> SILVER_ORE = BLOCKS.register("silver_ore", SilverOreBlock::new);
    public static final RegistryObject<LycanFlowerBlock> WOLFSBANE = BLOCKS.register("wolfsbane", LycanFlowerBlock::new);

    //Block Items
    public static final RegistryObject<Item> SILVER_ORE_ITEM = ITEMS.register("silver_ore", () -> new BlockItemBase(SILVER_ORE.get()));
    public static final RegistryObject<Item> WOLFSBANE_ITEM = ITEMS.register("wolfsbane", () -> new BlockItemBase(WOLFSBANE.get()));

    //Entities
    public static final RegistryObject<EntityType<FaoladhMobEntity>> WEREWOLF = ENTITIES.register("werewolf", () -> EntityType.Builder.create(FaoladhMobEntity::new, EntityClassification.MONSTER)
    .size(1.2f, 2.6f)
    .setShouldReceiveVelocityUpdates(true)
    .build("werewolf"));

}
