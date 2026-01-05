package mc.kessud.dashboard.identity;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.UUID;

public final class ServerIdentity {

    private final String id;

    private ServerIdentity(String id) {
        this.id = id;
    }

    public static ServerIdentity load(JavaPlugin plugin) {
        FileConfiguration cfg = plugin.getConfig();

        if (!cfg.contains("server-id")) {
            String generated = UUID.randomUUID().toString();
            cfg.set("server-id", generated);
            plugin.saveConfig();
            return new ServerIdentity(generated);
        }

        return new ServerIdentity(cfg.getString("server-id"));
    }

    public String id() {
        return id;
    }
}
