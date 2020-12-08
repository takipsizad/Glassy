package eu.pb4.glassy.other;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;

public class ClearDyeableArmorItem extends ArmorItem implements ClearDyeableItem {
    public ClearDyeableArmorItem(ArmorMaterial material, EquipmentSlot slot, Settings settings) {
        super(material, slot, settings);
    }
}
