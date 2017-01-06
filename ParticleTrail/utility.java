package ParticleTrail;

import static ParticleTrail.ParticleTrail.plugin;

/**
 * Created by User on 12/30/2016.
 */
public class utility {

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
