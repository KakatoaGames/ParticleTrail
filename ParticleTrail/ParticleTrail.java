package ParticleTrail;

import ParticleTrail.command.trail;
import ParticleTrail.listener.confirmation;
import ParticleTrail.listener.moving;
import org.black_ixx.playerpoints.PlayerPoints;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by User on 12/30/2016.
 */
public class ParticleTrail extends JavaPlugin implements Listener{
    public static Plugin plugin;
    public static PlayerPoints playerPoints;
    public static TableGenerator tg = new TableGenerator(TableGenerator.Alignment.LEFT, TableGenerator.Alignment.CENTER, TableGenerator.Alignment.RIGHT);


    @Override
    public void onEnable(){
        plugin = this;
        utility.loadConfig();
        getCommand("trail").setExecutor(new trail());
        registerEvents(this, new trail(), new moving(), new confirmation());
        hookPlayerPoints();
    }

    @Override
    public void onDisable(){
        utility.save();
        plugin = null;
    }

    /**
     * Validate that we have access to PlayerPoints
     *
     * @return True if we have PlayerPoints, else false.
     */
    private boolean hookPlayerPoints() {
        final Plugin plugin = this.getServer().getPluginManager().getPlugin("PlayerPoints");
        playerPoints = PlayerPoints.class.cast(plugin);
        return playerPoints != null;
    }

    /**
     * Accessor for other parts of your plugin to retrieve PlayerPoints.
     *
     * @return PlayerPoints plugin instance
     */
    public PlayerPoints getPlayerPoints() {
        return playerPoints;
    }


    public static void registerEvents(org.bukkit.plugin.Plugin plugin, Listener... listeners) {
        for (Listener listener : listeners) {
            Bukkit.getServer().getPluginManager().registerEvents(listener, plugin);
        }
    }

    public static Plugin getPlugin() {
        return plugin;
    }
}
