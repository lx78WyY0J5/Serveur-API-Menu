import menu.api.customInventoryClick;
import menu.menus.mainMenu;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class main extends JavaPlugin
{
    private static Logger logger = Bukkit.getLogger();

    @Override
    public void onLoad()
    {
        logger.info("Plugin Loaded");
    }

    @Override
    public void onEnable()
    {
        logger.info("Plugin Enabled");
        registerEvents();
    }

    @Override
    public void onDisable()
    {
        logger.info("Plugin Disabled");
    }

    public void registerEvents()
    {
        Bukkit.getPluginManager().registerEvents(new customInventoryClick(), this);
        Bukkit.getPluginManager().registerEvents(new mainMenu(), this);
    }
}