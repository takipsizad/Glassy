package eu.pb4.glassy.other;

import eu.pb4.glassy.Glassy;
import net.devtech.arrp.json.recipe.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class UniversalRecipes {
    public static void addGlassPane(String name, Identifier glass, Identifier out) {
        Glassy.RESOURCE_PACK.addRecipe(new Identifier("glassy", name), JRecipe.shaped(
                JPattern.pattern("XXX", "XXX"),
                JKeys.keys().key("X", JIngredient.ingredient().item(Registry.ITEM.get(glass))),
                JResult.itemStack(Registry.ITEM.get(out), 16)));
    }

    public static void addShardsToGlass(String name, Identifier shard, Identifier glass) {
        Glassy.RESOURCE_PACK.addRecipe(new Identifier("glassy", name), JRecipe.shaped(
                JPattern.pattern("XX", "XX"),
                JKeys.keys().key("X", JIngredient.ingredient().item(Registry.ITEM.get(shard))),
                JResult.itemStack(Registry.ITEM.get(glass), 1)));
    }
}
