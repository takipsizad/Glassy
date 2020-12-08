package eu.pb4.glassy.blocks;

import eu.pb4.glassy.Glassy;
import eu.pb4.glassy.other.UniversalRecipes;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.GlassBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ShatterproofGlass {
    public static final GlassBlock SHATTERPROOF_GLASS = new GlassBlock(AbstractBlock.Settings.of(Material.GLASS).strength(5.0F, 1200.0F)
            .sounds(BlockSoundGroup.GLASS).nonOpaque().allowsSpawning(Other::never).solidBlock(Other::never)
            .suffocates(Other::never).blockVision(Other::never));

    public static final BlockItem SHATTERPROOF_GLASS_ITEM = new BlockItem(SHATTERPROOF_GLASS, new Item.Settings().group(Glassy.ITEM_GROUP));

    public static final CustomPaneBlock SHATTERPROOF_GLASS_PANE = new CustomPaneBlock(AbstractBlock.Settings.of(Material.GLASS).strength(5.0F, 1200.0F)
            .sounds(BlockSoundGroup.GLASS).nonOpaque().allowsSpawning(Other::never).solidBlock(Other::never)
            .suffocates(Other::never).blockVision(Other::never));

    public static final BlockItem SHATTERPROOF_GLASS_PANE_ITEM = new BlockItem(SHATTERPROOF_GLASS_PANE, new Item.Settings().group(Glassy.ITEM_GROUP));


    static public void register() {
        Registry.register(Registry.BLOCK, new Identifier("glassy", "shatterproof_glass"), SHATTERPROOF_GLASS);
        Registry.register(Registry.ITEM, new Identifier("glassy", "shatterproof_glass"), SHATTERPROOF_GLASS_ITEM);
        Registry.register(Registry.BLOCK, new Identifier("glassy", "shatterproof_glass_pane"), SHATTERPROOF_GLASS_PANE);
        Registry.register(Registry.ITEM, new Identifier("glassy", "shatterproof_glass_pane"), SHATTERPROOF_GLASS_PANE_ITEM);

        UniversalRecipes.addGlassPane("shatterproof_glass_pane",
                new Identifier("glassy", "shatterproof_glass"),
                new Identifier("glassy", "shatterproof_glass_pane"));
    }

}
