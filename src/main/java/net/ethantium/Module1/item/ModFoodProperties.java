package net.ethantium.Module1.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.level.block.Blocks;

public class ModFoodProperties {
    public static final FoodProperties ONION = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(3)
            .build();
}
