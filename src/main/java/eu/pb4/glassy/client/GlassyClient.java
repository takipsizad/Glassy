package eu.pb4.glassy.client;

import eu.pb4.glassy.blocks.GlowingGlass;
import eu.pb4.glassy.blocks.RedstoneGlass;
import eu.pb4.glassy.blocks.ShatterproofGlass;
import eu.pb4.glassy.blocks.SoulGlass;
import eu.pb4.glassy.items.Armors;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ArmorRenderingRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class GlassyClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutoutMipped(),
                GlowingGlass.GLOWING_GLASS,
                GlowingGlass.GLOWING_GLASS_PANE,
                RedstoneGlass.REDSTONE_GLASS,
                RedstoneGlass.INVERTED_REDSTONE_GLASS

        );

        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(),
                ShatterproofGlass.SHATTERPROOF_GLASS,
                ShatterproofGlass.SHATTERPROOF_GLASS_PANE,
                SoulGlass.SOUL_GLASS,
                SoulGlass.SOUL_GLASS_PANE
        );

        ArmorRenderingRegistry.registerSimpleTexture(new Identifier("glassy", "netherite"), Armors.NETHERITE_BOOTS, Armors.NETHERITE_LEGGINGS, Armors.NETHERITE_CHESTPLATE, Armors.NETHERITE_HELMET);
        ArmorRenderingRegistry.registerSimpleTexture(new Identifier("glassy", "diamond"), Armors.DIAMOND_BOOTS, Armors.DIAMOND_LEGGINGS, Armors.DIAMOND_CHESTPLATE, Armors.DIAMOND_HELMET);
        ArmorRenderingRegistry.registerSimpleTexture(new Identifier("glassy", "gold"), Armors.GOLD_BOOTS, Armors.GOLD_LEGGINGS, Armors.GOLD_CHESTPLATE, Armors.GOLD_HELMET);
        ArmorRenderingRegistry.registerSimpleTexture(new Identifier("glassy", "iron"), Armors.IRON_BOOTS, Armors.IRON_LEGGINGS, Armors.IRON_CHESTPLATE, Armors.IRON_HELMET);

        ArmorRenderingRegistry.registerSimpleTexture(new Identifier("glassy", "glass"), Armors.GLASS_BOOTS, Armors.GLASS_LEGGINGS, Armors.GLASS_CHESTPLATE, Armors.GLASS_HELMET);
        //ArmorRenderingRegistry.registerSimpleTexture(new Identifier("glassy", "stained_glass"), Armors.STAINED_GLASS_BOOTS, Armors.STAINED_GLASS_LEGGINGS, Armors.STAINED_GLASS_CHESTPLATE, Armors.STAINED_GLASS_HELMET);
    }

}
