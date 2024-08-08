package dev.cassis2310.falloutmc.client.handler;

import dev.cassis2310.falloutmc.FalloutMC;
import dev.cassis2310.falloutmc.client.Keybindings;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = FalloutMC.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ClientForgeHandler {
    private static final Component FALLOUT_INVENTORY_KEY_PRESSED =
            Component.literal("Pip-Boy");
    @SubscribeEvent
    public static void onClientTick(TickEvent.ClientTickEvent event) {
        Minecraft minecraft = Minecraft.getInstance();
        if (Keybindings.INSTANCE.FalloutInventoryKey.isDown() && minecraft.player != null) {
            Keybindings.INSTANCE.FalloutInventoryKey.consumeClick();
            // Show the inventory screen
        }
    }
}
