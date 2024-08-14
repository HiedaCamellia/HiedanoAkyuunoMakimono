package org.hiedacamellia.hiedanoakyuunomakimono.core.data.provider;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.hiedacamellia.hiedanoakyuunomakimono.HiedanoAkyuunoMakimono;

public class StateProvider extends BlockStateProvider {
    public StateProvider(PackOutput gen, ExistingFileHelper helper) {
        super(gen, HiedanoAkyuunoMakimono.MODID, helper);
    }

    @Override
    protected void registerStatesAndModels() {

    }
}
