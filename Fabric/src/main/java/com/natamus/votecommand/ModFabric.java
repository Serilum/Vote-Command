package com.natamus.votecommand;

import com.natamus.collective.check.RegisterMod;
import com.natamus.votecommand.cmds.CommandVote;
import com.natamus.votecommand.util.Reference;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;

public class ModFabric implements ModInitializer {
	
	@Override
	public void onInitialize() {
		setGlobalConstants();
		ModCommon.init();

		loadEvents();

		RegisterMod.register(Reference.NAME, Reference.MOD_ID, Reference.VERSION, Reference.ACCEPTED_VERSIONS);
	}

	private void loadEvents() {
		CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
			CommandVote.register(dispatcher);
		});
	}

	private static void setGlobalConstants() {

	}
}
