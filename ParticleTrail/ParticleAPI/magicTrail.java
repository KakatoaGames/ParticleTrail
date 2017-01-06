package ParticleTrail.ParticleAPI;

import ParticleTrail.utility;
import de.slikey.effectlib.util.ParticleEffect;
import org.bukkit.entity.Player;

import static ParticleTrail.ParticleTrail.plugin;

/**
 * Created by User on 12/30/2016.
 */
public class magicTrail {

    public static boolean isMagicToggled(Player player){
        String path = "particle." + player.getUniqueId() + ".magic effect";
        return plugin.getConfig().getBoolean(path);
    }

    public static void addMagicToggled(Player player, Boolean bool){
        String path = "particle." + player.getUniqueId() + ".magic effect";
        plugin.getConfig().set(path, bool);
        utility.save();
    }

    public static void magicTrail(Player player){
        ParticleEffect.SPELL_WITCH.display(player.getLocation().add(0, 0.3, 0), 20, 0, 0, 0, 0, 20);
    }

    public static boolean hasBoughtMagic(Player player){
        String path = "particle." + player.getUniqueId() + ".has bought magic effect";
        return plugin.getConfig().getBoolean(path);
    }

    public static void setBoughtMagic(Player player, Boolean bool){
        String path = "particle." + player.getUniqueId() + ".has bought magic effect";
        plugin.getConfig().set(path, bool);
        utility.save();
    }

}
