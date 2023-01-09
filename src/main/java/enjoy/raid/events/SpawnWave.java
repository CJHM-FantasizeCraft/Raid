package enjoy.raid.events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Raider;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.raid.RaidSpawnWaveEvent;

import java.util.Collections;
import java.util.List;

public class SpawnWave implements Listener {

    @EventHandler
    public void RaidSpawnWaveEvent(RaidSpawnWaveEvent RaidSpawnWave){
        List<Raider> Raiders = Collections.unmodifiableList(RaidSpawnWave.getRaiders());
        Bukkit.getServer().broadcastMessage(ChatColor.YELLOW+"[Raid] "+ChatColor.RED+"新的一波袭击已开始......");
        Bukkit.getServer().broadcastMessage(ChatColor.YELLOW+"[Raid] "+ChatColor.BLUE+"本次的袭击者名单如下:");
        int i=1;
        for(Object raider : Raiders){
            Bukkit.getServer().broadcastMessage(ChatColor.YELLOW+"第 "+ i +" 位:"+ ChatColor.GOLD+raider);
            i++;
        }
    }
}
