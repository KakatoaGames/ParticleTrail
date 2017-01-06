package ParticleTrail.ParticleAPI;

import ParticleTrail.utility;
import de.slikey.effectlib.util.ParticleEffect;
import org.bukkit.entity.Player;

import static ParticleTrail.ParticleTrail.plugin;

/**
 * Created by User on 12/30/2016.
 */
public class smokeTrail {

    public static boolean isSmokeToggled(Player player){
        String path = "particle." + player.getUniqueId() + ".smoke effect";
        return plugin.getConfig().getBoolean(path);
    }

    public static void addSmokeToggled(Player player, Boolean bool){
        String path = "particle." + player.getUniqueId() + ".smoke effect";
        plugin.getConfig().set(path, bool);
        utility.save();
    }

    public static void smokeTrail(Player player){
        ParticleEffect.SMOKE_NORMAL.display(player.getLocation().add(0, 0.3, 0), 20, 0, 0, 0, 0, 20);
    }

    public static boolean hasBoughtSmoke(Player player){
        String path = "particle." + player.getUniqueId() + ".has bought smoke effect";
        return plugin.getConfig().getBoolean(path);
    }

    public static void setBoughtSmoke(Player player, Boolean bool){
        String path = "particle." + player.getUniqueId() + ".has bought smoke effect";
        plugin.getConfig().set(path, bool);
        utility.save();
    }

}
