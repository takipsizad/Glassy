package eu.pb4.glassy.items;

import eu.pb4.glassy.Glassy;
import eu.pb4.glassy.blocks.Other;
import eu.pb4.glassy.other.UniversalRecipes;
import net.devtech.arrp.json.models.JModel;
import net.devtech.arrp.json.models.JTextures;
import net.devtech.arrp.json.recipe.*;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.GlassBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterials;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class GlassShards {
    public static final GlassCutterToolItem GLASS_CUTTER = new GlassCutterToolItem(0, 2, ToolMaterials.IRON, new FabricItemSettings().group(Glassy.ITEM_GROUP));

    public static final String[] VANILLA_TYPES = {"", "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"};
    public static final String[] CUSTOM_TYPES = {"glowing", "soul"};

    public static void register() {
        for (String type : VANILLA_TYPES) {
            String type2 = type.equals("") ? "" : type + "_";
            Registry.register(Registry.ITEM, new Identifier("glassy", type2 + "glass_shard"), new Item(new FabricItemSettings().group(Glassy.ITEM_GROUP)));
        }
        for (String type : CUSTOM_TYPES) {
            Registry.register(Registry.ITEM, new Identifier("glassy", type + "_glass_shard"), new Item(new FabricItemSettings().group(Glassy.ITEM_GROUP)));
        }

        Registry.register(Registry.ITEM, new Identifier("glassy", "glass_cutter"), GLASS_CUTTER);
    }

    public static void createRecipes() {
        for (String type : VANILLA_TYPES) {
            String beg = (type.equals("") ? "" : type + "_");
            String beg2 = (type.equals("") ? "" : type + "_stained_");
            UniversalRecipes.addShardsToGlass(beg + "glass",
                    new Identifier("glassy", beg + "glass_shard"),
                    new Identifier("minecraft", beg2 + "glass")
            );
        }

        for (String type : CUSTOM_TYPES) {
            String beg = (type.equals("") ? "" : type + "_");
            UniversalRecipes.addShardsToGlass(beg + "glass",
                    new Identifier("glassy", beg + "glass_shard"),
                    new Identifier("glassy", beg + "glass")
            );
        }

        Glassy.RESOURCE_PACK.addRecipe(new Identifier("glassy", "glass_cutter"), JRecipe.shaped(
                JPattern.pattern("XY", "Z "),
                JKeys.keys().key("X", JIngredient.ingredient().item(Items.IRON_INGOT))
                        .key("Y", JIngredient.ingredient().tag("glassy:glass_shards"))
                        .key("Z", JIngredient.ingredient().item(Items.STICK)),
                JResult.itemStack(GLASS_CUTTER, 1)));
    };
}
