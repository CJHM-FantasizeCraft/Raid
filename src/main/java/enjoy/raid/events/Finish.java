package enjoy.raid.events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.raid.RaidFinishEvent;

import java.util.List;

public class Finish implements Listener {
    @EventHandler
    public void RaidFinishEvent(RaidFinishEvent RaidFinish){
        List<Player> Winners = RaidFinish.getWinners();
        Bukkit.getServer().broadcastMessage(ChatColor.YELLOW+"[Raid] "+ ChatColor.AQUA+"本次袭击已结束,赢家列表如下:");
        for (Object winner : Winners) {
            Bukkit.getServer().broadcastMessage(ChatColor.YELLOW + "[Raid] " + ChatColor.AQUA+"玩家: "+winner);
        }
    }
}
