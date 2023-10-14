package me.aroze.baseybase.commands

import me.aroze.arozeutils.minecraft.generic.text.translator.translate
import me.vaperion.blade.annotation.argument.Sender
import me.vaperion.blade.annotation.command.Command
import me.vaperion.blade.annotation.command.Permission
import org.bukkit.command.CommandSender

object ExampleCommand {

    @Command("exampley")
    @Permission("basey.exampley")
    fun exampley(
        @Sender sender: CommandSender
    ) {
        sender.sendMessage(translate("<p>no way! <s>this is crazy!"))
    }


}