package me.aroze.baseybase.commands

import me.aroze.arozeutils.minecraft.generic.text.translate
import me.vaperion.blade.annotation.argument.Sender
import me.vaperion.blade.annotation.command.*
import org.bukkit.command.CommandSender

class ExampleCommand {

    @Command("exampley")
    @Permission("basey.exampley")
    fun exampley(
        @Sender sender: CommandSender
    ) {
        sender.sendMessage(translate("<#cef5d4>no way!"))
    }


}