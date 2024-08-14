package org.hiedacamellia.hiedanoakyuunomakimono;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.config.ModConfigEvent;
import net.neoforged.neoforge.common.ModConfigSpec;

// An example config class. This is not required, but it's a good idea to have one to keep your config organized.
// Demonstrates how to use Neo's config APIs
@EventBusSubscriber(modid = HiedanoAkyuunoMakimono.MODID, bus = EventBusSubscriber.Bus.MOD)
public class Config
{
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    private static final ModConfigSpec.BooleanValue DEBUG = BUILDER
            .comment("Set to true to enable debug info")
            .comment("设置为true以启用调试信息")
            .define("debug", true);


    static final ModConfigSpec SPEC = BUILDER.build();

    public static boolean debug;

    public static void setDebug(boolean debug){
        DEBUG.set(debug);
    }


    @SubscribeEvent
    static void onLoad(final ModConfigEvent event)
    {
        debug = DEBUG.get();
    }
}
