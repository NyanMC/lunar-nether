package dev.dhyces.lunarnether.registry;

import dev.dhyces.lunarnether.LunarNether;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;

public class BiomeKeys {
    public static final ResourceKey<Biome> OUTROCKS = key("outrocks");
    public static final ResourceKey<Biome> ASHEN_PLAINS = key("ashen_plains");
    public static final ResourceKey<Biome> ICY_BARRENS = key("icy_barrens");

    private static ResourceKey<Biome> key(String id) {
        return ResourceKey.create(Registries.BIOME, LunarNether.id(id));
    }
}
