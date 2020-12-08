package eu.pb4.glassy.blocks;

import eu.pb4.glassy.Glassy;
import eu.pb4.glassy.other.UniversalRecipes;
import net.devtech.arrp.json.recipe.*;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.GlassBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class GlowingGlass {
    public static final GlassBlock GLOWING_GLASS = new GlassBlock(AbstractBlock.Settings.of(Material.GLASS).strength(0.3F)
            .sounds(BlockSoundGroup.GLASS).nonOpaque().allowsSpawning(Other::never).solidBlock(Other::never)
            .suffocates(Other::never).blockVision(Other::never).luminance((state) -> { return 14; }));

    public static final BlockItem GLOWING_GLASS_ITEM = new BlockItem(GLOWING_GLASS, new Item.Settings().group(Glassy.ITEM_GROUP));

    public static final CustomPaneBlock GLOWING_GLASS_PANE = new CustomPaneBlock(AbstractBlock.Settings.of(Material.GLASS).strength(0.3F)
            .sounds(BlockSoundGroup.GLASS).nonOpaque().allowsSpawning(Other::never).solidBlock(Other::never)
            .suffocates(Other::never).blockVision(Other::never).luminance((state) -> { return 12; }));

    public static final BlockItem GLOWING_GLASS_PANE_ITEM = new BlockItem(GLOWING_GLASS_PANE, new Item.Settings().group(Glassy.ITEM_GROUP));


    static public void register() {
        Registry.register(Registry.BLOCK, new Identifier("glassy", "glowing_glass"), GLOWING_GLASS);
        Registry.register(Registry.ITEM, new Identifier("glassy", "glowing_glass"), GLOWING_GLASS_ITEM);
        Registry.register(Registry.BLOCK, new Identifier("glassy", "glowing_glass_pane"), GLOWING_GLASS_PANE);
        Registry.register(Registry.ITEM, new Identifier("glassy", "glowing_glass_pane"), GLOWING_GLASS_PANE_ITEM);

        UniversalRecipes.addGlassPane("glowing_glass_pane",
                new Identifier("glassy", "glowing_glass"),
                new Identifier("glassy", "glowing_glass_pane"));

        Glassy.RESOURCE_PACK.addRecipe(new Identifier("glassy", "glowing_glass"), JRecipe.shaped(
                JPattern.pattern(" X ", "XYX", " X "),
                JKeys.keys().key("X", JIngredient.ingredient().item(Items.GLOWSTONE_DUST))
                        .key("Y", JIngredient.ingredient().item(Items.GLASS)),
                JResult.itemStack(GLOWING_GLASS_ITEM, 1)));

    }
}
