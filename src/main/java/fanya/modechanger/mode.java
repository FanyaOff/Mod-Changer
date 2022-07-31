package fanya.modechanger;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class mode implements TabExecutor {
    @Override
    @Deprecated
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        String Mode = toString().valueOf(args[0]);
        if (Mode.equals("creative")){
            player.setGameMode(GameMode.CREATIVE);
            player.sendMessage("§6[MODE] Creative mode enabled");
        }
        if (Mode.equals("survival")) {
            player.setGameMode(GameMode.SURVIVAL);
            player.sendMessage("§6[MODE] Survival mode enabled");
        }
        if (!Mode.equals("creative") && !Mode.equals("survival") )
            player.sendMessage("§4[MODE] Invalid arguments");
        return true;
    }

    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {

        if (args.length == 1) {
            List<String> arguments = new ArrayList<>();
            arguments.add("creative");
            arguments.add("survival");
            return arguments;
        }
        return null;
    }
}
