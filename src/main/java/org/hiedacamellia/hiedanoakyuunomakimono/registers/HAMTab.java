package org.hiedacamellia.hiedanoakyuunomakimono.registers;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.hiedacamellia.hiedanoakyuunomakimono.HiedanoAkyuunoMakimono;

public class HAMTab {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HiedanoAkyuunoMakimono.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> WG_TAB = TABS.register("hiedanoakyuunomakimono", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.hiedanoakyuunomakimono")) //The language key for the title of your CreativeModeTab
            .withTabsBefore(CreativeModeTabs.COMBAT)
            //.icon()
            .displayItems((parameters, tab) -> {
                for(DeferredHolder<Item, ? extends Item> item: HAMBlockItem.ITEMS.getEntries()){
                    tab.accept(item.get());
                }
                for(DeferredHolder<Item, ? extends Item> item: HAMItem.ITEMS.getEntries()){
                    tab.accept(item.get());
                }
            }).build());
}
