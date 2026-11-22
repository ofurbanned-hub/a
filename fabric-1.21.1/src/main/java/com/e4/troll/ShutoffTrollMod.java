package com.e4.troll;

import net.fabricmc.api.ClientModInitializer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class ShutoffTrollMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        if (!System.getProperty("os.name", "").toLowerCase(Locale.ROOT).contains("win")) return;
        try {
            Path message = Files.createTempFile("e4-prank-", ".txt");
            Files.writeString(message, "get ratted by e4 ez\r\n\r\nJust a Minecraft prank — no account data was accessed.\r\n", StandardCharsets.UTF_8);
            message.toFile().deleteOnExit();
            new ProcessBuilder("notepad.exe", message.toAbsolutePath().toString()).start();
        } catch (Exception e) {
            System.err.println("[ShutoffTrollMod] Could not open Notepad: " + e.getMessage());
        }
    }
}
