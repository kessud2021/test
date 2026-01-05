package mc.kessud.dashboard.config;

import mc.kessud.dashboard.util.Preconditions;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public final class ConfigLoader {

    public static DashboardConfig load(JavaPlugin plugin) {
        plugin.saveDefaultConfig();

        FileConfiguration cfg = plugin.getConfig();

        String url = cfg.getString("dashboard.url");

        Preconditions.notNull(url, "dashboard.url is missing in config.yml");

        return new DashboardConfig(url);
    }
}
