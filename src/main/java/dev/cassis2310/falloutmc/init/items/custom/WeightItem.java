package dev.cassis2310.falloutmc.init.items.custom;

import net.minecraft.world.item.Item;

public class WeightItem extends Item {
    private final float weight;

    public WeightItem(Properties pProperties, float weight) {
        super(pProperties);
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }
}
