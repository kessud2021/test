package mc.kessud.dashboard.bootstrap;

import mc.kessud.dashboard.command.DashboardCommand;
import mc.kessud.dashboard.config.ConfigLoader;
import mc.kessud.dashboard.config.DashboardConfig;
import mc.kessud.dashboard.identity.ServerIdentity;
import mc.kessud.dashboard.lifecycle.ShutdownHook;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class PluginBootstrap {

    private final JavaPlugin plugin;
    private final Logger logger;

    private DashboardConfig config;
    private ServerIdentity identity;

    public PluginBootstrap(JavaPlugin plugin) {
        this.plugin = plugin;
        this.logger = plugin.getLogger();
    }

    public void enable() {
        long start = System.currentTimeMillis();

        logger.info("Bootstrapping dashboard plugin");

        config = ConfigLoader.load(plugin);
        identity = ServerIdentity.load(plugin);

        plugin.getCommand("dashboard")
                .setExecutor(new DashboardCommand(identity));

        Runtime.getRuntime()
                .addShutdownHook(new ShutdownHook(logger));

        logger.info("Startup completed in " +
                (System.currentTimeMillis() - start) + "ms");
    }

    public void disable() {
        logger.info("Dashboard plugin shutting down");
    }
}
