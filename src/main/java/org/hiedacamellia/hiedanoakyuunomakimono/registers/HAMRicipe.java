package org.hiedacamellia.hiedanoakyuunomakimono.registers;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.hiedacamellia.hiedanoakyuunomakimono.HiedanoAkyuunoMakimono;

public class HAMRicipe {
    public static final DeferredRegister<RecipeType<?>> RECIPE_TYPES =
            DeferredRegister.create(Registries.RECIPE_TYPE, HiedanoAkyuunoMakimono.MODID);

}
