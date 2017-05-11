package ParticleTrail;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static ParticleTrail.ParticleTrail.plugin;

/**
 * Created by User on 12/30/2016.
 */
public class utility {
    public static List<UUID> toggle = new ArrayList<UUID>();

    public static void loadConfig(){
        plugin.getConfig().options().copyDefaults(true);
        plugin.saveConfig();
    }

    public static void reload(){
        plugin.reloadConfig();
    }

    public static void save(){
        plugin.getConfig().options().copyDefaults(true);
        plugin.saveConfig();
    }
}
