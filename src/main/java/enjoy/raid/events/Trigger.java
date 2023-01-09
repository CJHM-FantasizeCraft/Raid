package enjoy.raid.events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.raid.RaidTriggerEvent;

public class Trigger implements Listener {
    @EventHandler
    public void RiadTriggerEvent(RaidTriggerEvent RaidTrigger){
        String TriggerPlayerName = RaidTrigger.getPlayer().getName();
        RaidTrigger.getPlayer().sendMessage(ChatColor.YELLOW+"[Raid]"+ChatColor.WHITE+"你触发了袭击!");
        Bukkit.getServer().broadcastMessage(ChatColor.YELLOW+"[Riad]"+ChatColor.GOLD+"玩家: "+ChatColor.ITALIC+TriggerPlayerName+ChatColor.RED+" 触发了袭击!");
        Bukkit.getServer().broadcastMessage(ChatColor.YELLOW+"[Raid]"+ChatColor.AQUA+"如果你想去打袭击,输入/tpa "+TriggerPlayerName+"以tp到袭击触发者那里");
    }
}
