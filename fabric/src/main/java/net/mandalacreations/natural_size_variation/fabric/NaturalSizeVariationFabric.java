package net.mandalacreations.natural_size_variation.fabric;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents;
import net.mandalacreations.natural_size_variation.NaturalSizeVariation;
import net.fabricmc.api.ModInitializer;
import net.minecraft.world.entity.Mob;

public class NaturalSizeVariationFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        ServerEntityEvents.ENTITY_LOAD.register((entity, world) -> {
            if (entity instanceof Mob mob) {
                NaturalSizeVariation.randomizeEntityScale(mob);
            }
        });
    }
}