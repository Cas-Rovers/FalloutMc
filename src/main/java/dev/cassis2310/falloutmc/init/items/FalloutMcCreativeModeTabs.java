package dev.cassis2310.falloutmc.init.items;

import dev.cassis2310.falloutmc.FalloutMC;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class FalloutMcCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FalloutMC.MOD_ID);

    public static final RegistryObject<CreativeModeTab> FALLOUT_ITEMS_TAB = CREATIVE_MODE_TABS.register("fallout_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(FalloutMcItems.NUKA_COLA.get()))
                    .title(Component.translatable("creativetab.fallout_items_tab"))
                    .displayItems((displayParameters, output) -> {
                        output.accept(FalloutMcItems.NUKA_COLA.get());
                        output.accept(FalloutMcItems.STIMPACK.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
