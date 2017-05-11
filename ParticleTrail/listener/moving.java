package ParticleTrail.listener;

import ParticleTrail.ParticleAPI.flameTrail;
import ParticleTrail.ParticleAPI.magicTrail;
import ParticleTrail.ParticleAPI.smokeTrail;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

/**
 * Created by User on 12/30/2016.
 */
public class moving implements Listener {

    @EventHandler
    public void onMove(PlayerMoveEvent e) {
        Player p = e.getPlayer();
        if (p.hasPermission("trail.flame")) {
            if (flameTrail.isFlameToggled(p)) {
                flameTrail.flameTrail(p);
            } else {
                // do nothing
            }
        } else {
            // do nothing
        }


        if (p.hasPermission("trail.magic")) {
            if (magicTrail.isMagicToggled(p)) {
                magicTrail.magicTrail(p);
            } else {
                magicTrail.addMagicToggled(p, false);
            }
        } else {
            // do nothing
        }

        if (p.hasPermission("trail.smoke")) {
            if (smokeTrail.isSmokeToggled(p)) {
                smokeTrail.smokeTrail(p);
            } else {
                smokeTrail.addSmokeToggled(p, false);
            }
        } else {
            // do nothing
        }
    }
}
