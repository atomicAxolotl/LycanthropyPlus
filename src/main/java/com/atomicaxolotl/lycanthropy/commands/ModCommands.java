package com.atomicaxolotl.lycanthropy.commands;

import com.atomicaxolotl.lycanthropy.Lycanthropy;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.tree.LiteralCommandNode;
import net.minecraft.command.CommandSource;
import net.minecraft.command.Commands;

public class ModCommands {

    public static void register(CommandDispatcher<CommandSource> dispatcher) {
        LiteralCommandNode<CommandSource> cmdTut = dispatcher.register(
                Commands.literal(Lycanthropy.MOD_ID)
                        .then(CommandTest.register(dispatcher))
        );

        dispatcher.register(Commands.literal("lyc").redirect(cmdTut));
    }

}
