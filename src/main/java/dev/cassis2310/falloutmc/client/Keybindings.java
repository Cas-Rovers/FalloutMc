package dev.cassis2310.falloutmc.client;

import com.mojang.blaze3d.platform.InputConstants;
import dev.cassis2310.falloutmc.FalloutMC;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.settings.KeyConflictContext;

public class Keybindings {
    public static final Keybindings INSTANCE = new Keybindings();

    private Keybindings() {
    }

    private static final String CATEGORY = "key.categories." + FalloutMC.MOD_ID;

    public final KeyMapping FalloutInventoryKey = new KeyMapping(
            "key." + FalloutMC.MOD_ID + ".fallout_inventory_key",
            KeyConflictContext.IN_GAME,
            InputConstants.getKey(InputConstants.KEY_TAB, -1),
            CATEGORY
    );
}
