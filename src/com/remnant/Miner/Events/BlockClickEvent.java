/*package com.remnant.Miner.Events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class BlockClickEvent implements Listener {

    @EventHandler
    public static void onPlayerClickBlock(PlayerInteractEvent e){
       Player player = e.getPlayer();


        //Gets player location to later set bot location
        int x = player.getLocation().getBlockX();
        int y = player.getLocation().getBlockY();
        int z = player.getLocation().getBlockZ();

        Material block = player.getWorld().getBlockAt(x,y,z).getType();
        if (block == Material.CHEST){
            player.sendMessage("Chest location set");
        }





    }

}*/


