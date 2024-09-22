package gg.wrldmap.qgautilities;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QGAUtilities implements ModInitializer {
	public static final String MOD_ID = "qga_utilities";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Welcome to the world of QQue's Great Adventure!");
	}
}