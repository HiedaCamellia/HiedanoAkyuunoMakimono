package org.hiedacamellia.hiedanoakyuunomakimono.core.data.lang;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;
import org.hiedacamellia.hiedanoakyuunomakimono.HiedanoAkyuunoMakimono;


public class ChineseLanguageProvider extends LanguageProvider {

        public ChineseLanguageProvider(PackOutput output) {
            super(output, HiedanoAkyuunoMakimono.MODID, "zh_cn");
        }

        @Override
        protected void addTranslations() {
            add("tooltip.hiedanoakyuunomakimono.press_shift","按住Shift键以显示更多信息");
            add("itemGroup.hiedanoakyuunomakimono", "浅草轻语");
            add("network.hiedanoakyuunomakimono.failed","无法处理网络数据: %s");
            add("cmd.hiedanoakyuunomakimono.modify.success","修改值成功：%f");
            add("cmd.hiedanoakyuunomakimono.modify.failed","修改值失败：%s");
            add("cmd.hiedanoakyuunomakimono.set.success","设置值成功：%f");
            add("cmd.hiedanoakyuunomakimono.set.failed","设置值失败：%s");
            add("cmd.hiedanoakyuunomakimono.get.success","获取值成功：%f");
            add("cmd.hiedanoakyuunomakimono.get.failed","获取值失败：%s");
            add("cmd.hiedanoakyuunomakimono.reset.success","重设值成功");
            add("cmd.hiedanoakyuunomakimono.reset.failed","重设值失败");

            
        }
}
