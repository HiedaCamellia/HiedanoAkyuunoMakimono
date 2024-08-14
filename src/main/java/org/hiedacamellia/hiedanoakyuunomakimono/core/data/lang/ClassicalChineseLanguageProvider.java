package org.hiedacamellia.hiedanoakyuunomakimono.core.data.lang;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;
import org.hiedacamellia.hiedanoakyuunomakimono.HiedanoAkyuunoMakimono;

public class ClassicalChineseLanguageProvider extends LanguageProvider {

    public ClassicalChineseLanguageProvider(PackOutput output) {
        super(output, HiedanoAkyuunoMakimono.MODID, "lzh");
    }

    @Override
    protected void addTranslations() {
        add("tooltip.hiedanoakyuunomakimono.press_shift","按住變鍵以示詳情。");
        add("itemGroup.hiedanoakyuunomakimono", "淺草輕語");
    }

}
