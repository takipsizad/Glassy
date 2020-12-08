package eu.pb4.glassy.other;

import eu.pb4.glassy.items.Armors;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;

public class GlassArmorMaterial implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[] {7, 9, 8, 7};
    private static final int[] PROTECTION_VALUES = new int[] {1, 2, 1, 1};

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * 10;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 5;
    }

    @Override
    public SoundEvent getEquipSound() {
        return Armors.GLASS_ARMOR_SOUND_EVENT;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.GLASS);
    }

    @Override
    public String getName() {
        return "glass";
    }

    @Override
    public float getToughness() {
        return 0.0F;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.0F;
    }
}
