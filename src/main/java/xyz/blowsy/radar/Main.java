package xyz.blowsy.radar;

import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = "radarmod", name = "radar mod", version = "1.0", acceptedMinecraftVersions = "[1.8.9]")
public class Main {

    public boolean ENABLED;
    private Listener listener;

    @EventHandler
    public void init(FMLInitializationEvent e) {
        ClientCommandHandler.instance.registerCommand(new Command(this));
        listener = new Listener();
    }

    public Listener getListener() {
        return listener;
    }

}
