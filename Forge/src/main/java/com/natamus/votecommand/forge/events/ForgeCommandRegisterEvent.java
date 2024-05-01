package com.natamus.votecommand.forge.events;

import com.natamus.votecommand.cmds.CommandVote;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class ForgeCommandRegisterEvent {
    @SubscribeEvent
    public void registerCommands(RegisterCommandsEvent e) {
    	CommandVote.register(e.getDispatcher());
    }
}
