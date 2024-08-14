package org.hiedacamellia.hiedanoakyuunomakimono.core.data.lang;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;
import org.hiedacamellia.hiedanoakyuunomakimono.HiedanoAkyuunoMakimono;


public class EnglishLanguageProvider extends LanguageProvider {

    public EnglishLanguageProvider(PackOutput output) {
        super(output, HiedanoAkyuunoMakimono.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add("tooltip.hiedanoakyuunomakimono.press_shift","Press Shift to display more information");
        add("itemGroup.hiedanoakyuunomakimono", "Whisper Grove");
        add("item.hiedanoakyuunomakimono.test_item", "Test Item");
        add("tooltip.hiedanoakyuunomakimono.test_item", "This is a test item");
        add("block.hiedanoakyuunomakimono.test_block", "Example Block");
        add("tooltip.hiedanoakyuunomakimono.test_block", "This is an example block");
        add("network.hiedanoakyuunomakimono.failed","Failed to handle network data: %s");
        add("cmd.hiedanoakyuunomakimono.modify.success","Modify Value success: %f");
        add("cmd.hiedanoakyuunomakimono.modify.failed","Modify Value failed: %s");
        add("cmd.hiedanoakyuunomakimono.set.success","Set Value success: %f");
        add("cmd.hiedanoakyuunomakimono.set.failed","Set Value failed: %s");
        add("cmd.hiedanoakyuunomakimono.get.success","Get Value success: %f");
        add("cmd.hiedanoakyuunomakimono.get.failed","Get Value failed: %s");
        add("cmd.hiedanoakyuunomakimono.reset.success","Reset Value success");
        add("cmd.hiedanoakyuunomakimono.reset.failed","Reset Value failed");

    }
}
