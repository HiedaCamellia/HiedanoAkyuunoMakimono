package org.hiedacamellia.hiedanoakyuunomakimono.registers;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.hiedacamellia.hiedanoakyuunomakimono.HiedanoAkyuunoMakimono;

import java.util.function.Supplier;

public class HAMMenu {
    public static final DeferredRegister<MenuType<?>> MENUS = DeferredRegister.create(Registries.MENU, HiedanoAkyuunoMakimono.MODID);

}
