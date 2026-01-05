package mc.kessud.dashboard;

import mc.kessud.dashboard.bootstrap.PluginBootstrap;
import org.bukkit.plugin.java.JavaPlugin;

public final class DashboardPlugin extends JavaPlugin {

    private PluginBootstrap bootstrap;

    @Override
    public void onEnable() {
        bootstrap = new PluginBootstrap(this);
        bootstrap.enable();
    }

    @Override
    public void onDisable() {
        if (bootstrap != null) {
            bootstrap.disable();
        }
    }
}
