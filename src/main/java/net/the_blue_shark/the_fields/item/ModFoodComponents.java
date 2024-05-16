package net.the_blue_shark.the_fields.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent EDIBLE_COTTON_SEEDS = new FoodComponent.Builder().nutrition(2).saturationModifier(0.3f)
            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 30), 1f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 200), 0.25f).build();
}
