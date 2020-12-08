package eu.pb4.glassy.blocks;

import eu.pb4.glassy.Glassy;
import net.devtech.arrp.json.recipe.*;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.BlockView;

public class RedstoneGlass {
    public static final RedstoneGlassBlock REDSTONE_GLASS = new RedstoneGlassBlock(AbstractBlock.Settings.of(Material.GLASS).strength(0.3F)
            .sounds(BlockSoundGroup.GLASS).nonOpaque().allowsSpawning(Other::never).solidBlock(Other::never)
            .suffocates(Other::never).blockVision(RedstoneGlass::blockVisionCheck));

    public static final BlockItem REDSTONE_GLASS_ITEM = new BlockItem(REDSTONE_GLASS, new Item.Settings().group(Glassy.ITEM_GROUP));

    public static final RedstoneGlassBlock INVERTED_REDSTONE_GLASS = new RedstoneGlassBlock(AbstractBlock.Settings.of(Material.GLASS).strength(0.3F)
            .sounds(BlockSoundGroup.GLASS).nonOpaque().allowsSpawning(Other::never).solidBlock(Other::never)
            .suffocates(Other::never).blockVision(RedstoneGlass::blockVisionCheck));

    public static final BlockItem INVERTED_REDSTONE_GLASS_ITEM = new BlockItem(INVERTED_REDSTONE_GLASS, new Item.Settings().group(Glassy.ITEM_GROUP));

    static public void register() {
        Registry.register(Registry.BLOCK, new Identifier("glassy", "redstone_glass"), REDSTONE_GLASS);
        Registry.register(Registry.ITEM, new Identifier("glassy", "redstone_glass"), REDSTONE_GLASS_ITEM);
        Registry.register(Registry.BLOCK, new Identifier("glassy", "inverted_redstone_glass"), INVERTED_REDSTONE_GLASS);
        Registry.register(Registry.ITEM, new Identifier("glassy", "inverted_redstone_glass"), INVERTED_REDSTONE_GLASS_ITEM);

        Glassy.RESOURCE_PACK.addRecipe(new Identifier("glassy", "redstone_glass"), JRecipe.shaped(
                JPattern.pattern(" X ", "XYX", " X "),
                JKeys.keys().key("X", JIngredient.ingredient().item(Items.REDSTONE))
                        .key("Y", JIngredient.ingredient().item(Items.GLASS)),
                JResult.itemStack(REDSTONE_GLASS_ITEM, 1)));

        Glassy.RESOURCE_PACK.addRecipe(new Identifier("glassy", "inverted_redstone_glass"), JRecipe.shaped(
                JPattern.pattern("X"),
                JKeys.keys().key("X", JIngredient.ingredient().item(REDSTONE_GLASS_ITEM)),
                JResult.itemStack(INVERTED_REDSTONE_GLASS_ITEM, 1)));
        Glassy.RESOURCE_PACK.addRecipe(new Identifier("glassy", "redstone_glass_from_inverted"), JRecipe.shaped(
                JPattern.pattern("X"),
                JKeys.keys().key("X", JIngredient.ingredient().item(INVERTED_REDSTONE_GLASS_ITEM)),
                JResult.itemStack(REDSTONE_GLASS_ITEM, 1)));

    }

    private static boolean blockVisionCheck(BlockState blockState, BlockView blockView, BlockPos blockPos) {
        return blockState.get(RedstoneGlassBlock.ACTIVE);
    }
}
