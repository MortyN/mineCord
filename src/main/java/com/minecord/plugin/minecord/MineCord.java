package com.minecord.plugin.minecord;

import com.minecord.plugin.minecord.discDen.discBot;
import com.minecord.plugin.minecord.discDen.disc2Mine;
import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import javax.security.auth.login.LoginException;

import static com.minecord.plugin.minecord.discDen.discBot.discEnabler;

public final class MineCord extends JavaPlugin {

    @Override
    public void onEnable() {
        try {
            discEnabler();
        } catch (LoginException e) {
            e.printStackTrace();
        }




        getServer().getConsoleSender().sendMessage(ChatColor.GREEN +"xXDiscBotXx hacked the mainframe, plugin enabled 127.0.0.1");

        // Plugin startup logic
        //getCommand("discord").setExecutor(new writeToDiscord());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
