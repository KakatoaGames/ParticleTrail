package ParticleTrail.ParticleAPI;

import ParticleTrail.utility;
import de.slikey.effectlib.util.ParticleEffect;
import org.bukkit.entity.Player;

import static ParticleTrail.ParticleTrail.plugin;

/**
 * Created by User on 12/30/2016.
 */
public class flameTrail {

    public static boolean isFlameToggled(Player player){
        String path = "particle." + player.getUniqueId() + ".flame effect";
        return plugin.getConfig().getBoolean(path);
    }

    public static void addFlameToggled(Player player, Boolean bool){
        String path = "particle." + player.getUniqueId() + ".flame effect";
        plugin.getConfig().set(path, bool);
        utility.save();
    }

    public static void flameTrail(Player player){
        ParticleEffect.FLAME.display(player.getLocation().add(0, 0.3, 0), 20, 0, 0, 0, 0, 20);
    }

    public static boolean hasBoughtFlame(Player player){
        String path = "particle." + player.getUniqueId() + ".has bought flame effect";
        return plugin.getConfig().getBoolean(path);
    }

    public static void setBoughtFlame(Player player, Boolean bool){
        String path = "particle." + player.getUniqueId() + ".has bought flame effect";
        plugin.getConfig().set(path, bool);
        utility.save();
    }


}
