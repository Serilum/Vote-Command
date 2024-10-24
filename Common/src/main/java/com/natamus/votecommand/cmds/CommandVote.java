package com.natamus.votecommand.cmds;

import com.mojang.brigadier.CommandDispatcher;
import com.natamus.collective.functions.MessageFunctions;
import com.natamus.votecommand.config.ConfigHandler;
import net.minecraft.ChatFormatting;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.world.entity.player.Player;

public class CommandVote {
	public static void register(CommandDispatcher<CommandSourceStack> dispatcher) {
		dispatcher.register(Commands.literal("vote")
			.requires((iCommandSender) -> iCommandSender.getEntity() instanceof Player)
			.executes((command) -> {
				Player player = command.getSource().getPlayer();
				if (player != null) {
					MessageFunctions.sendMessage(player, ConfigHandler.voteCommandMessage, ChatFormatting.DARK_GREEN);
				}
				return 1;
			})
		);
	}
}