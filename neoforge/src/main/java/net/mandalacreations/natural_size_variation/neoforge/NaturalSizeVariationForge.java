package net.mandalacreations.natural_size_variation.neoforge;

import net.mandalacreations.natural_size_variation.NaturalSizeVariation;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.entity.living.FinalizeSpawnEvent;

@EventBusSubscriber
@Mod(NaturalSizeVariation.MOD_ID)
public class NaturalSizeVariationForge {

    @SubscribeEvent
    public static void onEntitySpawn(FinalizeSpawnEvent event) {
        NaturalSizeVariation.randomizeEntityScale(event.getEntity());
    }
}