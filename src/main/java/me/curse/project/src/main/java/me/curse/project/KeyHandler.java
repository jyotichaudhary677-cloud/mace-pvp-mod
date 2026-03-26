package me.curse.project;

import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.lwjgl.glfw.GLFW;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class KeyHandler {

    public static KeyMapping KEY;

    @SubscribeEvent
    public static void register(RegisterKeyMappingsEvent event) {
        KEY = new KeyMapping(
                "key.maceaim",
                GLFW.GLFW_KEY_F12,
                "key.categories.gameplay"
        );
        event.register(KEY);
    }
}
