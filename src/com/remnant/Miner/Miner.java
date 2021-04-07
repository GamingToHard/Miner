package com.remnant.Miner;

//import com.remnant.Miner.Commands.MinerBot;
import com.remnant.Miner.Commands.MinerCommands;
//import com.remnant.Miner.Events.BlockClickEvent;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Miner extends JavaPlugin {

    @Override
    public void onEnable(){

        MinerCommands cmds = new MinerCommands();
        //MinerBot BOT = new MinerBot();

        //getServer().getPluginManager().registerEvents(new BlockClickEvent(), this);
        getCommand("MinerChest").setExecutor(cmds);
        getCommand("StartBot").setExecutor(cmds);
        //getCommand("startminer").setExecutor(BOT);


        getServer().getConsoleSender().sendMessage(ChatColor.RED + "Hello, Plugin enabled");

    }

    @Override
    public void onDisable(){

        getServer().getConsoleSender().sendMessage(ChatColor.RED + "Goodbye");

    }


}
