package me.aroze.baseybase

import me.aroze.arozeutils.kotlin.reflection.getClassesInPackage
import me.aroze.arozeutils.kotlin.reflection.registerListenersPackage
import me.aroze.arozeutils.minecraft.FancyPlugin
import me.aroze.arozeutils.minecraft.generic.text.translator.addCustomReplacements
import me.vaperion.blade.Blade
import me.vaperion.blade.bukkit.BladeBukkitPlatform

class BaseyBase : FancyPlugin() {

    override fun onEnable() {
        registerCommands()
        registerColourCodes()
        registerListenersPackage("me.aroze.punsies.listeners")
    }

    override fun onPluginDisable() {
        // Plugin shutdown logic
    }

    private fun registerCommands() {
        val commandHandler = Blade.forPlatform(BladeBukkitPlatform(this))
            .config { it.defaultPermissionMessage = "<#ff6e6e>⚠ <#ff7f6e>Nuh uh!" }
            .build()
        for (command in getClassesInPackage("me.aroze.baseybase.commands")) // Remember to replace this!
            commandHandler.register(command.getField("INSTANCE")[null])
    }

    // Easily override custom colour codes! This would be <p> and <s>
    private fun registerColourCodes() {
        addCustomReplacements(mapOf(
            "p" to ("<color:#ffd4e3>" to "</color>"),
            "s" to ("<color:#ffb5cf>" to "</color>"),
        ))
    }

}
