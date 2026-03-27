package dev.squidee.noelytraflight;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.entity.event.v1.EntityElytraEvents;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NoElytraFlight implements ModInitializer {
	public static final String MOD_ID = "no-elytra-flight";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		EntityElytraEvents.ALLOW.register((entity) -> false);

		LOGGER.info("Disabled elytra flight!");
	}
}