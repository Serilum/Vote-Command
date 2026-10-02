package com.serilum.votecommand.forge.events;

import com.serilum.votecommand.cmds.CommandVote;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ForgeCommandRegisterEvent {
	@SubscribeEvent
	public static void registerCommands(RegisterCommandsEvent e) {
		CommandVote.register(e.getDispatcher());
	}
}
