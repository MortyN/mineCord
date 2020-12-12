package com.minecord.plugin.minecord.discDen;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public class disc2Mine extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event){

        User usr = event.getAuthor();
        Message msg = event.getMessage();

        Bukkit.broadcastMessage(ChatColor.LIGHT_PURPLE + "DISCORD: " + ChatColor.RESET + usr + " " + msg);


    }
}
