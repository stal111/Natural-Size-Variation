package net.mandalacreations.natural_size_variation;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;

public class NaturalSizeVariation
{
	public static final String MOD_ID = "natural_size_variation";
	public static final ResourceLocation SIZE_VARIATION_MODIFIER = ResourceLocation.fromNamespaceAndPath(MOD_ID, "size_variation");

	public static void randomizeEntityScale(Mob entity) {
		AttributeInstance instance = entity.getAttribute(Attributes.SCALE);

		if (instance != null && instance.getModifier(SIZE_VARIATION_MODIFIER) == null) {
			double scale = 0.065 * entity.getRandom().nextGaussian();

			instance.addPermanentModifier(new AttributeModifier(SIZE_VARIATION_MODIFIER, scale, AttributeModifier.Operation.ADD_VALUE));
		}
	}
}
