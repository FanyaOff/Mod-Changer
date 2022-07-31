package fanya.modechanger;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class ModeChanger extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        getCommand("mode").setExecutor(new mode());
        System.out.println("[MODE] YEP");
    }

    @Override
    public void onDisable() {
        System.out.println("[MODE] Bye bye!");
    }
}
