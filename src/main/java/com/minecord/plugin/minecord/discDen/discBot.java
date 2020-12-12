package com.minecord.plugin.minecord.discDen;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

public class discBot {
    public static void discEnabler() throws LoginException {
        //TODO get new token from discord 2OATH
        JDA jda = JDABuilder.createDefault("").build();
    }
}
