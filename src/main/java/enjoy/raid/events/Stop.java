package enjoy.raid.events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.raid.RaidStopEvent;

import java.lang.String;

public class Stop implements Listener {
    @EventHandler
    public void RaidStopEvent(RaidStopEvent RaidStop){
        String reason = RaidStop.getReason().toString();
        Bukkit.getServer().broadcastMessage(ChatColor.YELLOW+"[Raid] 本次袭击已终止,终止原因"+ChatColor.ITALIC+ChatColor.UNDERLINE+reason);
    }
}
