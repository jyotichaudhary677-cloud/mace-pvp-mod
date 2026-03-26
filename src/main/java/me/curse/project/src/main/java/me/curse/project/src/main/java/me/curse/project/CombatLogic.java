package me.curse.project;

import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Items;

import java.util.List;

public class CombatLogic {

    public static void activate() {
        Minecraft mc = Minecraft.getInstance();
        Player player = mc.player;

        if (player == null) return;

        // Elytra equip
        player.getInventory().armor.set(2, Items.ELYTRA.getDefaultInstance());

        // Jump + fly
        player.jumpFromGround();
        player.startFallFlying();

        List<LivingEntity> list = mc.level.getEntitiesOfClass(
                LivingEntity.class,
                player.getBoundingBox().inflate(10),
                e -> e != player
        );

        if (list.isEmpty()) return;

        LivingEntity target = list.get(0);

        mc.gameMode.attack(player, target);
    }
}
