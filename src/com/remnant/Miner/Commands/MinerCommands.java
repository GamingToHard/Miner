package com.remnant.Miner.Commands;


import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;


class ChestLocation{
    public static int x;
    public static int y;
    public static int z;
}
class BotLocation{
    public static int x;
    public static int y;
    public static int z;
}

public class MinerCommands implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender Sender, Command cmd, String label, String[] args) {

        if (!(Sender instanceof Player)) {
            return true;
        }
        Player player = (Player) Sender;

        if (cmd.getName().equalsIgnoreCase("MinerChest")) {

            ChestLocation.x = player.getLocation().getBlockX();
            ChestLocation.y = player.getLocation().getBlockY();
            ChestLocation.z = player.getLocation().getBlockZ();

            BotLocation.x = player.getLocation().getBlockX();
            BotLocation.y = player.getLocation().getBlockY();
            BotLocation.z = player.getLocation().getBlockZ();


            World W = player.getWorld();

            Location location = new Location(W, ChestLocation.x, ChestLocation.y, ChestLocation.z);

            W.getBlockAt(location).setType(Material.CHEST);
            //player.sendMessage("Chest created at " + ChestLocation.x + ChestLocation.y + ChestLocation.z);
            return true;
        }

        if (cmd.getName().equalsIgnoreCase("StartBot")) {

            int Blocks = 50;

            World W = player.getWorld();
            Material block;
            Location BotChest = new Location(W, ChestLocation.x, ChestLocation.y, ChestLocation.z);

            player.sendMessage(ChatColor.RED + "Bot will now run");
            Chest chest = (Chest) BotChest.getBlock().getState();
            Inventory chestinv = chest.getInventory();


            //special For loop for the z Axis
            int i;
            for (i = 0; i < Blocks; i++) {
                BotLocation.z = BotLocation.z + 1;
                Location MineLocation = new Location(W, BotLocation.x, BotLocation.y, BotLocation.z);


                //Mine the x level
                for (int j = 0; j < Blocks; j++) {

                    BotLocation.x = BotLocation.x + 1;
                    MineLocation = new Location(W, BotLocation.x, BotLocation.y, BotLocation.z);

                    block = W.getBlockAt(MineLocation).getType();
                    if (block != Material.AIR) {

                        if (block == Material.STONE) {

                            chestinv.addItem(new ItemStack(Material.COBBLESTONE));
                            W.getBlockAt(MineLocation).setType(Material.AIR);

                        } else if (block == Material.ANDESITE) {

                            chestinv.addItem(new ItemStack(Material.ANDESITE));
                            W.getBlockAt(MineLocation).setType(Material.AIR);

                        } else if (block == Material.COAL_ORE) {

                            chestinv.addItem(new ItemStack(Material.COAL));
                            W.getBlockAt(MineLocation).setType(Material.AIR);

                        } else if (block == Material.IRON_ORE) {

                            chestinv.addItem(new ItemStack(Material.IRON_ORE));
                            W.getBlockAt(MineLocation).setType(Material.AIR);

                        } else if (block == Material.DIAMOND_ORE) {

                            chestinv.addItem(new ItemStack(Material.DIAMOND));
                            W.getBlockAt(MineLocation).setType(Material.AIR);

                        } else if (block == Material.GRANITE) {

                            chestinv.addItem(new ItemStack(Material.GRANITE));
                            W.getBlockAt(MineLocation).setType(Material.AIR);

                        } else if (block == Material.DIRT) {

                            chestinv.addItem(new ItemStack(Material.DIRT));
                            W.getBlockAt(MineLocation).setType(Material.AIR);

                        } else if (block == Material.DIORITE) {

                            chestinv.addItem(new ItemStack(Material.DIORITE));
                            W.getBlockAt(MineLocation).setType(Material.AIR);

                        } else if (block == Material.GRAVEL) {

                            chestinv.addItem(new ItemStack(Material.GRAVEL));
                            W.getBlockAt(MineLocation).setType(Material.AIR);

                        } else if (block == Material.GOLD_ORE) {

                            chestinv.addItem(new ItemStack(Material.GOLD_ORE));
                            W.getBlockAt(MineLocation).setType(Material.AIR);

                        } else if (block == Material.DIORITE) {

                            chestinv.addItem(new ItemStack(Material.DIORITE));
                            W.getBlockAt(MineLocation).setType(Material.AIR);

                        } else if (block == Material.REDSTONE_ORE) {

                            chestinv.addItem(new ItemStack(Material.REDSTONE));
                            W.getBlockAt(MineLocation).setType(Material.AIR);

                        } else if (block == Material.LAPIS_ORE) {

                            chestinv.addItem(new ItemStack(Material.LAPIS_LAZULI));
                            W.getBlockAt(MineLocation).setType(Material.AIR);

                        }


                    }


                }

                //Y level up one

                BotLocation.x = ChestLocation.x;
                BotLocation.y = BotLocation.y + 1;

                for (int k = 0; k < Blocks; k++) {

                    BotLocation.x = BotLocation.x + 1;
                    MineLocation = new Location(W, BotLocation.x, BotLocation.y, BotLocation.z);

                    block = W.getBlockAt(MineLocation).getType();
                    if (block != Material.AIR) {

                        if (block == Material.STONE) {

                            chestinv.addItem(new ItemStack(Material.COBBLESTONE));
                            W.getBlockAt(MineLocation).setType(Material.AIR);

                        } else if (block == Material.ANDESITE) {

                            chestinv.addItem(new ItemStack(Material.ANDESITE));
                            W.getBlockAt(MineLocation).setType(Material.AIR);

                        } else if (block == Material.COAL_ORE) {

                            chestinv.addItem(new ItemStack(Material.COAL));
                            W.getBlockAt(MineLocation).setType(Material.AIR);

                        } else if (block == Material.IRON_ORE) {

                            chestinv.addItem(new ItemStack(Material.IRON_ORE));
                            W.getBlockAt(MineLocation).setType(Material.AIR);

                        } else if (block == Material.DIAMOND_ORE) {

                            chestinv.addItem(new ItemStack(Material.DIAMOND));
                            W.getBlockAt(MineLocation).setType(Material.AIR);

                        } else if (block == Material.GRANITE) {

                            chestinv.addItem(new ItemStack(Material.GRANITE));
                            W.getBlockAt(MineLocation).setType(Material.AIR);

                        } else if (block == Material.DIRT) {

                            chestinv.addItem(new ItemStack(Material.DIRT));
                            W.getBlockAt(MineLocation).setType(Material.AIR);

                        } else if (block == Material.DIORITE) {

                            chestinv.addItem(new ItemStack(Material.DIORITE));
                            W.getBlockAt(MineLocation).setType(Material.AIR);

                        } else if (block == Material.GRAVEL) {

                            chestinv.addItem(new ItemStack(Material.GRAVEL));
                            W.getBlockAt(MineLocation).setType(Material.AIR);

                        } else if (block == Material.GOLD_ORE) {

                            chestinv.addItem(new ItemStack(Material.GOLD_ORE));
                            W.getBlockAt(MineLocation).setType(Material.AIR);

                        } else if (block == Material.DIORITE) {

                            chestinv.addItem(new ItemStack(Material.DIORITE));
                            W.getBlockAt(MineLocation).setType(Material.AIR);

                        } else if (block == Material.REDSTONE_ORE) {

                            chestinv.addItem(new ItemStack(Material.REDSTONE));
                            W.getBlockAt(MineLocation).setType(Material.AIR);

                        }

                    }


                }

                BotLocation.x = ChestLocation.x;
                BotLocation.y = ChestLocation.y;




            }


            return true;
        }


        return true;
    }
}
