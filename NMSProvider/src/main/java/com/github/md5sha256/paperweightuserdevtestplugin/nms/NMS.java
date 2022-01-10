package com.github.md5sha256.paperweightuserdevtestplugin.nms;


import net.minecraft.server.level.ServerLevel;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.craftbukkit.v1_18_R1.CraftWorld;

import java.util.logging.Logger;

public class NMS {

    public static void test(Logger logger) {
        for (World world : Bukkit.getWorlds()) {
            final ServerLevel level = ((CraftWorld) world).getHandle();
            logger.info("World UUID: " + level.uuid);
        }
    }

}
