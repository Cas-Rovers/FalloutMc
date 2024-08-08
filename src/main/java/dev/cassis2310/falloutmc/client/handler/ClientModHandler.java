package dev.cassis2310.falloutmc.client.handler;

import dev.cassis2310.falloutmc.FalloutMC;
import dev.cassis2310.falloutmc.client.Keybindings;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = FalloutMC.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModHandler {
    @SubscribeEvent
    public static void ClientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
           //
        });
    }

    @SubscribeEvent
    public static void registerKeys(RegisterKeyMappingsEvent event) {
        event.register(Keybindings.INSTANCE.FalloutInventoryKey);
    }
}
