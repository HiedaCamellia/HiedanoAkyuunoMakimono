package org.hiedacamellia.hiedanoakyuunomakimono.registers;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.hiedacamellia.hiedanoakyuunomakimono.HiedanoAkyuunoMakimono;

import java.util.function.Supplier;

public class HAMRicipeSerializer {
    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZERS =
            DeferredRegister.create(Registries.RECIPE_SERIALIZER, HiedanoAkyuunoMakimono.MODID);

}
