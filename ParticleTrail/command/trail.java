package ParticleTrail.command;

import ParticleTrail.IconMenu;
import ParticleTrail.ParticleAPI.flameTrail;
import ParticleTrail.ParticleAPI.magicTrail;
import ParticleTrail.ParticleAPI.smokeTrail;
import ParticleTrail.TableGenerator;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;

import java.util.UUID;

import static ParticleTrail.ParticleTrail.playerPoints;
import static ParticleTrail.ParticleTrail.plugin;
import static ParticleTrail.ParticleTrail.tg;

/**
 * Created by User on 12/30/2016.
 */
public class trail implements CommandExecutor, Listener{

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;
        if (command.getName().equalsIgnoreCase("trail")) {
            if (args.length == 0) {
                menuGUI(p);
            }
        }
        return false;
    }

    public void menuGUI(Player player){
        UUID pl = player.getUniqueId();
        String ps = player.getName();
        IconMenu menu = new IconMenu("Particle effect", 45, new IconMenu.OptionClickEventHandler() {
            @Override
            public void onOptionClick(IconMenu.OptionClickEvent event) {
                if (event.getName().contains(ChatColor.GREEN + "Points: " + ChatColor.YELLOW + "" + ChatColor.BOLD + playerPoints.getAPI().look(pl))){
                    event.setWillDestroy(true);
                }
                if (event.getName().contains("Flame trail")){
                    if (flameTrail.hasBoughtFlame(player)){
                        if (flameTrail.isFlameToggled(player)){
                            event.setWillDestroy(true);
                            flameTrail.addFlameToggled(player, false);
                        } else {
                            event.setWillDestroy(true);
                            flameTrail.addFlameToggled(player, true);
                        }
                    } else {
                        if (playerPoints.getAPI().take(pl, 35000)){
                            event.setWillDestroy(true);
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow("",ChatColor.YELLOW + "" + ChatColor.BOLD + "Particle Effect");
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow("",ChatColor.GRAY + "You bought this item for " + ChatColor.YELLOW + ChatColor.UNDERLINE + "35000" + ChatColor.RESET + ChatColor.YELLOW + " Point");
                            tg.addRow();
                            tg.addRow("",ChatColor.GRAY + "Total point: " + ChatColor.YELLOW + playerPoints.getAPI().look(pl));
                            for (String line : tg.generate(TableGenerator.Receiver.CLIENT, true, true)) {
                                player.sendMessage(line);
                            }
                            flameTrail.addFlameToggled(player, true);
                            flameTrail.setBoughtFlame(player, true);
                        } else {
                            event.setWillDestroy(true);
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow("",ChatColor.YELLOW + "" + ChatColor.BOLD + "Particle Effect");
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow("",ChatColor.RED + "You can't bought this item for " + ChatColor.YELLOW + ChatColor.UNDERLINE + "35000" + ChatColor.RESET + ChatColor.YELLOW + " Point");
                            tg.addRow();
                            tg.addRow("",ChatColor.GRAY + "Total point: " + ChatColor.YELLOW + playerPoints.getAPI().look(pl));
                            for (String line : tg.generate(TableGenerator.Receiver.CLIENT, true, true)) {
                                player.sendMessage(line);
                            }
                        }
                    }
                }
                if (event.getName().contains("Magic trail")){
                    if (magicTrail.hasBoughtMagic(player)){
                        if (magicTrail.isMagicToggled(player)){
                            event.setWillDestroy(true);
                            magicTrail.addMagicToggled(player, false);
                        } else {
                            event.setWillDestroy(true);
                            magicTrail.addMagicToggled(player, true);
                        }
                    } else {
                        if (playerPoints.getAPI().take(pl, 90000)){
                            event.setWillDestroy(true);
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow("",ChatColor.YELLOW + "" + ChatColor.BOLD + "Particle Effect");
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow("",ChatColor.GRAY + "You bought this item for " + ChatColor.YELLOW + ChatColor.UNDERLINE + "90000" + ChatColor.RESET + ChatColor.YELLOW + " Point");
                            tg.addRow();
                            tg.addRow("",ChatColor.GRAY + "Total point: " + ChatColor.YELLOW + playerPoints.getAPI().look(pl));
                            for (String line : tg.generate(TableGenerator.Receiver.CLIENT, true, true)) {
                                player.sendMessage(line);
                            }
                            magicTrail.addMagicToggled(player, true);
                            magicTrail.setBoughtMagic(player, true);
                        } else {
                            event.setWillDestroy(true);
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow("",ChatColor.YELLOW + "" + ChatColor.BOLD + "Particle Effect");
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow("",ChatColor.RED + "You can't bought this item for " + ChatColor.YELLOW + ChatColor.UNDERLINE + "90000" + ChatColor.RESET + ChatColor.YELLOW + " Point");
                            tg.addRow();
                            tg.addRow("",ChatColor.GRAY + "Total point: " + ChatColor.YELLOW + playerPoints.getAPI().look(pl));
                            for (String line : tg.generate(TableGenerator.Receiver.CLIENT, true, true)) {
                                player.sendMessage(line);
                            }
                        }
                    }
                }
                if (event.getName().contains("Smoke trail")){
                    if (smokeTrail.hasBoughtSmoke(player)){
                        if (smokeTrail.isSmokeToggled(player)){
                            event.setWillDestroy(true);
                            smokeTrail.addSmokeToggled(player, false);
                        } else {
                            event.setWillDestroy(true);
                            smokeTrail.addSmokeToggled(player, true);
                        }
                    } else {
                        if (playerPoints.getAPI().take(pl, 35000)){
                            event.setWillDestroy(true);
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow("",ChatColor.YELLOW + "" + ChatColor.BOLD + "Particle Effect");
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow("",ChatColor.GRAY + "You bought this item for " + ChatColor.YELLOW + ChatColor.UNDERLINE + "35000" + ChatColor.RESET + ChatColor.YELLOW + " Point");
                            tg.addRow();
                            tg.addRow("",ChatColor.GRAY + "Total point: " + ChatColor.YELLOW + playerPoints.getAPI().look(pl));
                            for (String line : tg.generate(TableGenerator.Receiver.CLIENT, true, true)) {
                                player.sendMessage(line);
                            }
                            smokeTrail.addSmokeToggled(player, true);
                            smokeTrail.setBoughtSmoke(player, true);
                        } else {
                            event.setWillDestroy(true);
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow("",ChatColor.YELLOW + "" + ChatColor.BOLD + "Particle Effect");
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow();
                            tg.addRow("",ChatColor.RED + "You can't bought this item for " + ChatColor.YELLOW + ChatColor.UNDERLINE + "35000" + ChatColor.RESET + ChatColor.YELLOW + " Point");
                            tg.addRow();
                            tg.addRow("",ChatColor.GRAY + "Total point: " + ChatColor.YELLOW + playerPoints.getAPI().look(pl));
                            for (String line : tg.generate(TableGenerator.Receiver.CLIENT, true, true)) {
                                player.sendMessage(line);
                            }
                        }
                    }
                }
            }
        }, plugin);
        menu.setOption(0, new ItemStack(Material.EMERALD, 1), ChatColor.GREEN + "Points: " + ChatColor.YELLOW + "" + ChatColor.BOLD + playerPoints.getAPI().look(pl));
        menu.setOption(8, new ItemStack(Material.EMERALD, 1), ChatColor.GREEN + "Points: " + ChatColor.YELLOW + "" + ChatColor.BOLD + playerPoints.getAPI().look(pl));
        menu.setOption(36, new ItemStack(Material.EMERALD, 1), ChatColor.GREEN + "Points: " + ChatColor.YELLOW + "" + ChatColor.BOLD + playerPoints.getAPI().look(pl));
        menu.setOption(44, new ItemStack(Material.EMERALD, 1), ChatColor.GREEN + "Points: " + ChatColor.YELLOW + "" + ChatColor.BOLD + playerPoints.getAPI().look(pl));
        if (flameTrail.hasBoughtFlame(player)){
            if (flameTrail.isFlameToggled(player)){
                menu.setOption(10, new ItemStack(Material.BLAZE_ROD, 1), ChatColor.GREEN + "Flame trail", ChatColor.GRAY + "Set flame trail effect on your feet.", ChatColor.GREEN + "Price: " + ChatColor.YELLOW + "You own this item",ChatColor.GRAY + "" + ChatColor.ITALIC + "Common");
            } else {
                menu.setOption(10, new ItemStack(Material.BLAZE_ROD, 1), ChatColor.RED + "Flame trail", ChatColor.GRAY + "Set flame trail effect on your feet.", ChatColor.GREEN + "Price: " + ChatColor.YELLOW + "You own this item",ChatColor.GRAY + "" + ChatColor.ITALIC + "Common");
            }
        } else {
            menu.setOption(10, new ItemStack(Material.BLAZE_ROD, 1), ChatColor.RED + "Flame trail", ChatColor.GRAY + "Set flame trail effect on your feet.", ChatColor.GREEN + "Price: " + ChatColor.YELLOW + "35000 Point",ChatColor.GRAY + "" + ChatColor.ITALIC + "Common");
        }

        if (magicTrail.hasBoughtMagic(player)){
            if (magicTrail.isMagicToggled(player)){
                menu.setOption(12, new ItemStack(Material.ENDER_PEARL, 1), ChatColor.GREEN + "Magic trail", ChatColor.GRAY + "Set magic trail effect on your feet.", ChatColor.GREEN + "Price: " + ChatColor.YELLOW + "You own this item",ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "Legendary");
            } else {
                menu.setOption(12, new ItemStack(Material.ENDER_PEARL, 1), ChatColor.RED + "Magic trail", ChatColor.GRAY + "Set magic trail effect on your feet.", ChatColor.GREEN + "Price: " + ChatColor.YELLOW + "You own this item",ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "Legendary");
            }
        } else {
            menu.setOption(12, new ItemStack(Material.ENDER_PEARL, 1), ChatColor.RED + "Magic trail", ChatColor.GRAY + "Set magic trail effect on your feet.", ChatColor.GREEN + "Price: " + ChatColor.YELLOW + "90000 Point",ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "Legendary");
        }
        if (smokeTrail.hasBoughtSmoke(player)){
            if (smokeTrail.isSmokeToggled(player)){
                menu.setOption(14, new ItemStack(Material.INK_SACK, 1), ChatColor.GREEN + "Smoke trail", ChatColor.GRAY + "Set smoke trail effect on your feet.", ChatColor.GREEN + "Price: " + ChatColor.YELLOW + "You own this item",ChatColor.GRAY + "" + ChatColor.ITALIC + "Common");
            } else {
                menu.setOption(14, new ItemStack(Material.INK_SACK, 1), ChatColor.RED + "Smoke trail", ChatColor.GRAY + "Set smoke trail effect on your feet.", ChatColor.GREEN + "Price: " + ChatColor.YELLOW + "You own this item",ChatColor.GRAY + "" + ChatColor.ITALIC + "Common");
            }
        } else {
            menu.setOption(14, new ItemStack(Material.INK_SACK, 1), ChatColor.RED + "Smoke trail", ChatColor.GRAY + "Set smoke trail effect on your feet.", ChatColor.GREEN + "Price: " + ChatColor.YELLOW + "35000 Point",ChatColor.GRAY + "" + ChatColor.ITALIC + "Common");
        }
        menu.open(player);

    }


}
