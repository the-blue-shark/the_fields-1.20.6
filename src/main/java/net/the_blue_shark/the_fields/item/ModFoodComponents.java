package net.the_blue_shark.the_fields.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent EDIBLE_COTTON_SEEDS = new FoodComponent.Builder()
            .nutrition(2).saturationModifier(0.3f)
            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 30), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 200), 0.25f).build();

    public static final FoodComponent GREEN_TOMATO = new FoodComponent.Builder()
            .nutrition(1).saturationModifier(0.0f).build();

    public static final FoodComponent YELLOW_TOMATO = new FoodComponent.Builder()
            .nutrition(3).saturationModifier(0.1f).build();

    public static final FoodComponent RED_TOMATO = new FoodComponent.Builder()
            .nutrition(5).saturationModifier(0.3f).build();

    public static final FoodComponent PEPPER = new FoodComponent.Builder()
            .nutrition(5).saturationModifier(0.5f).build();

    public static final FoodComponent STRAWBERRY = new FoodComponent.Builder()
            .nutrition(5).saturationModifier(0.3f).build();


}
