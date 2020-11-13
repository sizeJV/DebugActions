package com.sizejv;

import com.sizejv.commands.DebuggerCommand;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class DebugActions extends JavaPlugin {

    @Override
    public void onEnable() {

        this.getCommand("c").setExecutor(new DebuggerCommand());

        Bukkit.getConsoleSender().sendMessage("Successfully enabled Debug Actions");
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("Successfully disabled Debug Actions");
    }
}
