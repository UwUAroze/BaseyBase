package me.aroze.baseybase

import me.aroze.arozeutils.kotlin.reflection.getClassesInPackage
import me.aroze.arozeutils.minecraft.FancyPlugin
import me.aroze.arozeutils.minecraft.instance
import me.vaperion.blade.Blade
import me.vaperion.blade.bukkit.BladeBukkitPlatform
import net.kyori.adventure.text.minimessage.MiniMessage
import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin

class BaseyBase : FancyPlugin() {

    override fun onEnable() {
        registerCommands()
    }

    override fun onPluginDisable() {
        // Plugin shutdown logic
    }

    private fun registerCommands() {
        val commandHandler = Blade.forPlatform(BladeBukkitPlatform(this))
            .config { it.defaultPermissionMessage = "<#ff6e6e>⚠ <#ff7f6e>Nuh uh!" }
            .build()
        for (command in getClassesInPackage("me.aroze.baseybase.commands")) // Remember to replace this!
            commandHandler.register(command.getDeclaredConstructor().newInstance())
    }

}
