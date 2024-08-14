package org.hiedacamellia.hiedanoakyuunomakimono.core.entry.builder;

import net.minecraft.world.item.Item;
import org.hiedacamellia.hiedanoakyuunomakimono.core.entry.BaseItem;

public class BaseItemBuilder {

    private String regname;
    private Item.Properties properties;

    public BaseItem build(){
        return new BaseItem(properties,regname);
    }

    public BaseItemBuilder regname(String regname){
        this.regname = regname;
        return this;
    }

    public BaseItemBuilder properties(Item.Properties properties){
        this.properties = properties;
        return this;
    }
}
