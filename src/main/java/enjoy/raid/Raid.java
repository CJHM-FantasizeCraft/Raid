package enjoy.raid;

import enjoy.raid.events.SpawnWave;
import enjoy.raid.events.Stop;
import enjoy.raid.events.Trigger;
import org.bukkit.plugin.java.JavaPlugin;

public final class Raid extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("[Riad]加载中……");
        System.out.println("[Raid]Loading...");
        getServer().getPluginManager().registerEvents(new Trigger(),this);
        getServer().getPluginManager().registerEvents(new Trigger(),this);
        getServer().getPluginManager().registerEvents(new Stop(),this);
        getServer().getPluginManager().registerEvents(new SpawnWave(),this);
        System.out.println("[Riad]加载完毕");
        System.out.println("[Raid]Done.");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("[Raid]卸载中……");
        System.out.println("[Raid]Unloading...");
        System.out.println("[Raid]卸载完毕");
        System.out.println("[Riad]Unload done.");
    }
}
