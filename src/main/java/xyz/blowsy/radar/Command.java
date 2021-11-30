package xyz.blowsy.radar;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraftforge.common.MinecraftForge;

public class Command extends CommandBase {

    private Main main;

    public Command(Main main) {
        this.main = main;
    }

    @Override
    public String getCommandName() {
        return "radar";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "/radar";
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {
        if (main.ENABLED = !main.ENABLED) { // set to true
            MinecraftForge.EVENT_BUS.register(main.getListener());
        } else { // set to false
            MinecraftForge.EVENT_BUS.unregister(main.getListener());
        }
    }

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender sender) {
        return true;
    }

}
