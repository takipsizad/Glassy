package eu.pb4.glassy.other;

import net.minecraft.item.DyeableItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundTag;

public interface ClearDyeableItem extends DyeableItem {
    default int getColor(ItemStack stack) {
        CompoundTag compoundTag = stack.getSubTag("display");
        return compoundTag != null && compoundTag.contains("color", 99) ? compoundTag.getInt("color") : 0xFFFFFF55;
    }
}
