package menuapi.menu.menus;

import menuapi.menu.api.customInventory;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class mainMenu implements Listener
{
    public static Inventory inventory = createMainMenu();

    private static Inventory createMainMenu()
    {
        customInventory inventoryBuilder = new customInventory(customInventory.CustomInventoryType.SKYBLOCK, 9, "test");
        inventoryBuilder.getInventory().addItem(new ItemStack(Material.BEDROCK, 1));
        return inventoryBuilder.getInventory();
    }

    public static void openMainMenu(Player player)
    {
        player.openInventory(inventory);
    }
}