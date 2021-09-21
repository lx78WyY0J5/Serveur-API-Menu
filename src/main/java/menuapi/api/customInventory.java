package menuapi.api;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;

public class customInventory implements InventoryHolder
{
    private CustomInventoryType inventoryType;

    private Inventory inventory;

    public customInventory(CustomInventoryType inventoryType, int size, String title)
    {
        this.inventory     = Bukkit.createInventory(this, size, title);
        this.inventoryType = inventoryType;
    }

    @Override
    public Inventory getInventory()
    {
        return this.inventory;
    }

    public CustomInventoryType getInventoryType()
    {
        return this.inventoryType;
    }


    public enum CustomInventoryType
    {
        SKYBLOCK, MENU
    }
}