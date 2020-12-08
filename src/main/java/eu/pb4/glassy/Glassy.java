package eu.pb4.glassy;

import eu.pb4.glassy.blocks.GlowingGlass;
import eu.pb4.glassy.blocks.RedstoneGlass;
import eu.pb4.glassy.blocks.ShatterproofGlass;
import eu.pb4.glassy.blocks.SoulGlass;
import eu.pb4.glassy.items.Armors;
import eu.pb4.glassy.items.GlassShards;
import net.devtech.arrp.api.RRPCallback;
import net.devtech.arrp.api.RuntimeResourcePack;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.tag.TagRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class Glassy implements ModInitializer {
    public static Tag GLASS_TAG = TagRegistry.block(new Identifier("glassy", "glass_cutter_effective"));
    public static Tag GLASS_SHARD_TAG = TagRegistry.item(new Identifier("glassy", "glass_shards"));

    public static Item GLASSY_LOGO = new Item(new FabricItemSettings());

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier("glassy", "general"),
            () -> new ItemStack(GLASSY_LOGO));

    public static final RuntimeResourcePack RESOURCE_PACK = RuntimeResourcePack.create("glassy:resources");



    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("glassy", "logo_item"), GLASSY_LOGO);

        GlassShards.register();
        GlowingGlass.register();
        SoulGlass.register();
        ShatterproofGlass.register();
        RedstoneGlass.register();
        Armors.register();

        GlassShards.createRecipes();
        RRPCallback.EVENT.register(a -> a.add(RESOURCE_PACK));
    }

}
