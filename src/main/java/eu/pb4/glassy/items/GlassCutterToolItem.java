package eu.pb4.glassy.items;

import eu.pb4.glassy.Glassy;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.item.MiningToolItem;

import net.minecraft.item.ToolMaterial;

import java.util.Collections;

public class GlassCutterToolItem extends MiningToolItem {

    protected GlassCutterToolItem(float attackDamage, float attackSpeed, ToolMaterial material, Settings settings) {
        super(attackDamage, attackSpeed, material, Collections.<Block>emptySet(), settings);
    }

    @Override
    public boolean isEffectiveOn(BlockState state) {
        return Glassy.GLASS_TAG.contains(state.getBlock());
    }

    @Override
    public float getMiningSpeedMultiplier(ItemStack stack, BlockState state) {
        return (Glassy.GLASS_TAG.contains(state.getBlock())) ? this.miningSpeed / 2 : 1.0F;
    }
}
