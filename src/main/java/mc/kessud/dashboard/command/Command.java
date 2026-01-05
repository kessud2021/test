package mc.kessud.dashboard.command;

import mc.kessud.dashboard.identity.ServerIdentity;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public final class DashboardCommand implements CommandExecutor {

    private final ServerIdentity identity;

    public DashboardCommand(ServerIdentity identity) {
        this.identity = identity;
    }

    @Override
    public boolean onCommand(
            CommandSender sender,
            Command command,
            String label,
            String[] args
    ) {
        sender.sendMessage("§aDashboard connected");
        sender.sendMessage("§7Server ID: §f" + identity.id());
        return true;
    }
}
