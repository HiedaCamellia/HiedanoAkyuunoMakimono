package org.hiedacamellia.hiedanoakyuunomakimono.core.entry;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import java.util.List;

public class BaseItem extends Item {

    private final String regname;

    public BaseItem(Properties properties, String regname) {
        super(properties);
        this.regname = regname;
    }

    @Override
    public void appendHoverText(ItemStack itemstack, TooltipContext ctx, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, ctx, list, flag);
        if (!Screen.hasShiftDown()) {
            list.add(Component.literal(
                    "§7§o" + Component.translatable("tooltip.whispergrove.press_shift").getString() + "§r"));
        } else {
            String[] description = Component.translatable("tooltip.whispergrove."+this.regname).getString().split("§n");
            for (String line : description) {
                list.add(Component.literal(line));
            }
        }
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
        FoodProperties foodproperties = stack.getFoodProperties(livingEntity);
        if (livingEntity instanceof Player player){
        }
        return foodproperties != null ? livingEntity.eat(level, stack, foodproperties) : stack;
    }

    public String getReg() {
        return regname;
    }
}


