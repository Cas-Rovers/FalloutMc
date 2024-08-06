package dev.cassis2310.falloutmc.init.items;

import dev.cassis2310.falloutmc.FalloutMC;
import dev.cassis2310.falloutmc.init.items.custom.DrinkItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FalloutMcItems {
    public static DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FalloutMC.MOD_ID);

    public static final RegistryObject<Item> NUKA_COLA = ITEMS.register("nuka_cola",
            () -> new DrinkItem(new Item.Properties().food(FalloutMcFoodProperties.NUKA_COLA)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
