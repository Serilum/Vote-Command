package com.natamus.votecommand.forge.events;

import com.natamus.votecommand.cmds.CommandVote;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ForgeCommandRegisterEvent {
    @SubscribeEvent
    public static void registerCommands(RegisterCommandsEvent e) {
    	CommandVote.register(e.getDispatcher());
    }
}
