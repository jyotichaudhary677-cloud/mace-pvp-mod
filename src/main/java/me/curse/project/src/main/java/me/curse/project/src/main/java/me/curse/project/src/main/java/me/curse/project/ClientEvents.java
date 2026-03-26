package me.curse.project;

import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class ClientEvents {

    @SubscribeEvent
    public static void tick(TickEvent.ClientTickEvent event) {
        if (KeyHandler.KEY != null && KeyHandler.KEY.consumeClick()) {
            CombatLogic.activate();
        }
    }
}
