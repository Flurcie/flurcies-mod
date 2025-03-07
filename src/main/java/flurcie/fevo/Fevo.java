package flurcie.fevo;

import flurcie.fevo.block.ModBlocks;
//import flurcie.fevo.entity.ModEntities;
import flurcie.fevo.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Fevo implements ModInitializer {
	public static final String MOD_ID = "fevo";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Init FEVO");
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		//ModEntities.registerModEntities();
	}
}