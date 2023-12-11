package com.natamus.votecommand.config;

import com.natamus.collective.config.DuskConfig;
import com.natamus.votecommand.util.Reference;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ConfigHandler extends DuskConfig {
	public static HashMap<String, List<String>> configMetaData = new HashMap<String, List<String>>();

	@Entry public static String voteCommandMessage = "This is an example /vote message. You can change it in the config.";

	public static void initConfig() {
		configMetaData.put("voteCommandMessage", Arrays.asList(
			"The message which will be sent to players when they use the /vote command."
		));

		DuskConfig.init(Reference.NAME, Reference.MOD_ID, ConfigHandler.class);
	}
}