package menuapi.api;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;

public class customInventoryClick implements Listener
{
    @EventHandler
    public void playerClick(InventoryClickEvent e)
    {
        if (e.getClickedInventory() == null || e.getView().getTopInventory() == null)
        {
            return;
        }

        if (customInventory.isCancelled(e.getClickedInventory()))
        {
            e.setCancelled(true);
        }

        if (e.isShiftClick() && customInventory.isCancelled(e.getView().getTopInventory()))
        {
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void playerDrag(InventoryDragEvent e)
    {
        for (int i : e.getRawSlots())
        {
            if (e.getView().getInventory(i) != null && customInventory.isCancelled(e.getView().getInventory(i)))
            {
                e.setCancelled(true);
                return;
            }
        }
    }
}