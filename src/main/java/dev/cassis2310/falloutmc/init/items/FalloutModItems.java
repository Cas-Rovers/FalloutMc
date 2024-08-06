package dev.cassis2310.falloutmc.init.items;

import dev.cassis2310.falloutmc.FalloutMC;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FalloutModItems {
    public static DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FalloutMC.MOD_ID);

    public static final RegistryObject<Item> NUKA_COLA = ITEMS.register("nuka_cola",
            () -> new Item(new Item.Properties().food(FalloutFoodProperties.NUKA_COLA)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
