package com.serilum.votecommand.neoforge.events;

import com.serilum.votecommand.cmds.CommandVote;
import net.neoforged.neoforge.event.RegisterCommandsEvent;
import net.neoforged.bus.api.SubscribeEvent;

public class NeoForgeCommandRegisterEvent {
	@SubscribeEvent
	public static void registerCommands(RegisterCommandsEvent e) {
		CommandVote.register(e.getDispatcher());
	}
}
