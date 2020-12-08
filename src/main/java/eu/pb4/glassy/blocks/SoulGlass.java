package eu.pb4.glassy.blocks;

import eu.pb4.glassy.Glassy;
import eu.pb4.glassy.other.UniversalRecipes;
import net.devtech.arrp.json.recipe.JIngredient;
import net.devtech.arrp.json.recipe.JRecipe;
import net.devtech.arrp.json.recipe.JResult;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.GlassBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SoulGlass {
    public static final GlassBlock SOUL_GLASS = new GlassBlock(AbstractBlock.Settings.of(Material.GLASS).strength(0.3F)
            .sounds(BlockSoundGroup.GLASS).nonOpaque().allowsSpawning(Other::never).solidBlock(Other::never)
            .suffocates(Other::never).blockVision(Other::never).luminance((state) -> 4));

    public static final BlockItem SOUL_GLASS_ITEM = new BlockItem(SOUL_GLASS, new Item.Settings().group(Glassy.ITEM_GROUP));

    public static final CustomPaneBlock SOUL_GLASS_PANE = new CustomPaneBlock(AbstractBlock.Settings.of(Material.GLASS).strength(0.3F)
            .sounds(BlockSoundGroup.GLASS).nonOpaque().allowsSpawning(Other::never).solidBlock(Other::never)
            .suffocates(Other::never).blockVision(Other::never).luminance((state) -> 4));

    public static final BlockItem SOUL_GLASS_PANE_ITEM = new BlockItem(SOUL_GLASS_PANE, new Item.Settings().group(Glassy.ITEM_GROUP));


    static public void register() {
        Registry.register(Registry.BLOCK, new Identifier("glassy", "soul_glass"), SOUL_GLASS);
        Registry.register(Registry.ITEM, new Identifier("glassy", "soul_glass"), SOUL_GLASS_ITEM);
        Registry.register(Registry.BLOCK, new Identifier("glassy", "soul_glass_pane"), SOUL_GLASS_PANE);
        Registry.register(Registry.ITEM, new Identifier("glassy", "soul_glass_pane"), SOUL_GLASS_PANE_ITEM);

        UniversalRecipes.addGlassPane("soul_glass_pane",
                new Identifier("glassy", "soul_glass"),
                new Identifier("glassy", "soul_glass_pane"));

        Glassy.RESOURCE_PACK.addRecipe(new Identifier("glassy", "soul_glass_smelting"),
                JRecipe.smelting(JIngredient.ingredient()
                                .item("minecraft:soul_sand"),
                        JResult.result("glassy:soul_glass")
                ).cookingTime(200).experience(20));
    }
}
