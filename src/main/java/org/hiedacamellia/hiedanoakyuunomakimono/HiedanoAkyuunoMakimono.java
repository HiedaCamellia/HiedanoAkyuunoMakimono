package org.hiedacamellia.hiedanoakyuunomakimono;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import org.hiedacamellia.hiedanoakyuunomakimono.core.data.Data;
import org.hiedacamellia.hiedanoakyuunomakimono.registers.*;

@Mod(HiedanoAkyuunoMakimono.MODID)
public class HiedanoAkyuunoMakimono {
    public static final String MODID = "hiedanoakyuunomakimono";

    public HiedanoAkyuunoMakimono(IEventBus modEventBus, ModContainer modContainer)
    {
        modEventBus.addListener(Data::onGatherData);

        HAMBlock.BLOCKS.register(modEventBus);
        HAMBlockItem.ITEMS.register(modEventBus);
        HAMItem.ITEMS.register(modEventBus);
        HAMTab.TABS.register(modEventBus);
        HAMAttachment.ATTACHMENTS.register(modEventBus);
        HAMDataComponent.DATA_COMPONENTS.register(modEventBus);
        HAMEffect.EFFECTS.register(modEventBus);
        HAMMenu.MENUS.register(modEventBus);
        HAMRicipe.RECIPE_TYPES.register(modEventBus);
        HAMRicipeSerializer.RECIPE_SERIALIZERS.register(modEventBus);
        HAMBlockEntity.BLOCK_ENTITIES.register(modEventBus);

//        NeoForge.EVENT_BUS.register(this);


       modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }
}
