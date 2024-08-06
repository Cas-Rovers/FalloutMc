package dev.cassis2310.falloutmc.init.items;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class FalloutMcFoodProperties {
    public static FoodProperties NUKA_COLA = new FoodProperties.Builder().nutrition(3).saturationMod(0.25f)
            .effect(() -> new MobEffectInstance(MobEffects.LUCK, 200), 0.1f).build();
}
