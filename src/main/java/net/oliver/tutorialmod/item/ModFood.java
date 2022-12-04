package net.oliver.tutorialmod.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFood {
    public static final FoodProperties ELFBAR = (new FoodProperties.Builder()
            .effect(() -> new MobEffectInstance(MobEffects.GLOWING,360), 1F)
            .nutrition(0)
            .saturationMod(0F).build());
}
