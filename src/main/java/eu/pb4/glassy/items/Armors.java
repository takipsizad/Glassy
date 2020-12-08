package eu.pb4.glassy.items;

import eu.pb4.glassy.Glassy;
import eu.pb4.glassy.other.ClearDyeableArmorItem;
import eu.pb4.glassy.other.GlassArmorMaterial;
import net.devtech.arrp.json.recipe.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.decoration.ArmorStandEntity;
import net.minecraft.item.*;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Armors {
    public static final ArmorMaterial glassArmorMaterial = new GlassArmorMaterial();
    public static final Identifier GLASS_ARMOR_SOUND = new Identifier("glassy:glass_armor_equip");
    public static SoundEvent GLASS_ARMOR_SOUND_EVENT = new SoundEvent(GLASS_ARMOR_SOUND);

    public static final ArmorItem NETHERITE_HELMET = new ArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.HEAD, new Item.Settings().group(Glassy.ITEM_GROUP));
    public static final ArmorItem NETHERITE_CHESTPLATE = new ArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.CHEST, new Item.Settings().group(Glassy.ITEM_GROUP));
    public static final ArmorItem NETHERITE_LEGGINGS = new ArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.LEGS, new Item.Settings().group(Glassy.ITEM_GROUP));
    public static final ArmorItem NETHERITE_BOOTS = new ArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.FEET, new Item.Settings().group(Glassy.ITEM_GROUP));

    public static final ArmorItem DIAMOND_HELMET = new ArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.HEAD, new Item.Settings().group(Glassy.ITEM_GROUP));
    public static final ArmorItem DIAMOND_CHESTPLATE = new ArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.CHEST, new Item.Settings().group(Glassy.ITEM_GROUP));
    public static final ArmorItem DIAMOND_LEGGINGS = new ArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.LEGS, new Item.Settings().group(Glassy.ITEM_GROUP));
    public static final ArmorItem DIAMOND_BOOTS = new ArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.FEET, new Item.Settings().group(Glassy.ITEM_GROUP));

    public static final ArmorItem GOLD_HELMET = new ArmorItem(ArmorMaterials.GOLD, EquipmentSlot.HEAD, new Item.Settings().group(Glassy.ITEM_GROUP));
    public static final ArmorItem GOLD_CHESTPLATE = new ArmorItem(ArmorMaterials.GOLD, EquipmentSlot.CHEST, new Item.Settings().group(Glassy.ITEM_GROUP));
    public static final ArmorItem GOLD_LEGGINGS = new ArmorItem(ArmorMaterials.GOLD, EquipmentSlot.LEGS, new Item.Settings().group(Glassy.ITEM_GROUP));
    public static final ArmorItem GOLD_BOOTS = new ArmorItem(ArmorMaterials.GOLD, EquipmentSlot.FEET, new Item.Settings().group(Glassy.ITEM_GROUP));

    public static final ArmorItem IRON_HELMET = new ArmorItem(ArmorMaterials.IRON, EquipmentSlot.HEAD, new Item.Settings().group(Glassy.ITEM_GROUP));
    public static final ArmorItem IRON_CHESTPLATE = new ArmorItem(ArmorMaterials.IRON, EquipmentSlot.CHEST, new Item.Settings().group(Glassy.ITEM_GROUP));
    public static final ArmorItem IRON_LEGGINGS = new ArmorItem(ArmorMaterials.IRON, EquipmentSlot.LEGS, new Item.Settings().group(Glassy.ITEM_GROUP));
    public static final ArmorItem IRON_BOOTS = new ArmorItem(ArmorMaterials.IRON, EquipmentSlot.FEET, new Item.Settings().group(Glassy.ITEM_GROUP));

    public static final ArmorItem GLASS_HELMET = new ArmorItem(glassArmorMaterial, EquipmentSlot.HEAD, new Item.Settings().group(Glassy.ITEM_GROUP));
    public static final ArmorItem GLASS_CHESTPLATE = new ArmorItem(glassArmorMaterial, EquipmentSlot.CHEST, new Item.Settings().group(Glassy.ITEM_GROUP));
    public static final ArmorItem GLASS_LEGGINGS = new ArmorItem(glassArmorMaterial, EquipmentSlot.LEGS, new Item.Settings().group(Glassy.ITEM_GROUP));
    public static final ArmorItem GLASS_BOOTS = new ArmorItem(glassArmorMaterial, EquipmentSlot.FEET, new Item.Settings().group(Glassy.ITEM_GROUP));

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("glassy", "netherite_helmet"), NETHERITE_HELMET);
        Registry.register(Registry.ITEM, new Identifier("glassy", "netherite_chestplate"), NETHERITE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("glassy", "netherite_leggings"), NETHERITE_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("glassy", "netherite_boots"), NETHERITE_BOOTS);

        Registry.register(Registry.ITEM, new Identifier("glassy", "diamond_helmet"), DIAMOND_HELMET);
        Registry.register(Registry.ITEM, new Identifier("glassy", "diamond_chestplate"), DIAMOND_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("glassy", "diamond_leggings"), DIAMOND_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("glassy", "diamond_boots"), DIAMOND_BOOTS);

        Registry.register(Registry.ITEM, new Identifier("glassy", "golden_helmet"), GOLD_HELMET);
        Registry.register(Registry.ITEM, new Identifier("glassy", "golden_chestplate"), GOLD_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("glassy", "golden_leggings"), GOLD_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("glassy", "golden_boots"), GOLD_BOOTS);

        Registry.register(Registry.ITEM, new Identifier("glassy", "iron_helmet"), IRON_HELMET);
        Registry.register(Registry.ITEM, new Identifier("glassy", "iron_chestplate"), IRON_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("glassy", "iron_leggings"), IRON_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("glassy", "iron_boots"), IRON_BOOTS);

        Registry.register(Registry.ITEM, new Identifier("glassy", "glass_helmet"), GLASS_HELMET);
        Registry.register(Registry.ITEM, new Identifier("glassy", "glass_chestplate"), GLASS_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("glassy", "glass_leggings"), GLASS_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("glassy", "glass_boots"), GLASS_BOOTS);


        Glassy.RESOURCE_PACK.addRecipe(new Identifier("glassy", "glass_helmet"), JRecipe.shaped(
                JPattern.pattern("XXX", "X X"),
                JKeys.keys().key("X", JIngredient.ingredient().item(Items.GLASS)),
                JResult.itemStack(GLASS_HELMET, 1)));
        Glassy.RESOURCE_PACK.addRecipe(new Identifier("glassy", "glass_chestplate"), JRecipe.shaped(
                JPattern.pattern("X X", "XXX", "XXX"),
                JKeys.keys().key("X", JIngredient.ingredient().item(Items.GLASS)),
                JResult.itemStack(GLASS_CHESTPLATE, 1)));
        Glassy.RESOURCE_PACK.addRecipe(new Identifier("glassy", "glass_boots"), JRecipe.shaped(
                JPattern.pattern("X X", "X X"),
                JKeys.keys().key("X", JIngredient.ingredient().item(Items.GLASS)),
                JResult.itemStack(GLASS_BOOTS, 1)));
        Glassy.RESOURCE_PACK.addRecipe(new Identifier("glassy", "glass_leggings"), JRecipe.shaped(
                JPattern.pattern("XXX", "X X", "X X"),
                JKeys.keys().key("X", JIngredient.ingredient().item(Items.GLASS)),
                JResult.itemStack(GLASS_LEGGINGS, 1)));


        for (String type : new String[]{"netherite", "diamond", "golden", "iron"}) {
            for (String armor : new String[]{"helmet", "chestplate", "leggings", "boots"}) {
                Glassy.RESOURCE_PACK.addRecipe(new Identifier("glassy", "smithing_" + type + "_" + armor), JRecipe.smithing(
                        JIngredient.ingredient().item("minecraft:" + type + "_" + armor),
                        JIngredient.ingredient().item("glassy:glass_" + armor),
                        JResult.result("glassy:" + type + "_" + armor)
                ));

                Glassy.RESOURCE_PACK.addRecipe(new Identifier("glassy", "smithing_" + type + "_" + armor + "_unglass"), JRecipe.smithing(
                        JIngredient.ingredient().item("glassy:" + type + "_" + armor),
                        JIngredient.ingredient().item("minecraft:air"),
                        JResult.result("minecraft:" + type + "_" + armor)
                ));
            }
        }
    }

}
