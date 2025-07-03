package net.zomi.customanimations;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.entity.EntityType;
import org.lwjgl.glfw.GLFW;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.PlayerEntityRenderer;
import net.minecraft.entity.player.PlayerEntity;
import net.zomi.customanimations.animations.PlayerEntityGeoRenderer;

import net.zomi.customanimations.animations.AnimationGuiScreen;

public class CustomAnimationsClient implements ClientModInitializer {

    private static KeyBinding openAnimationMenuKey;

    @Override
    public void onInitializeClient() {
        openAnimationMenuKey = KeyBindingHelper.registerKeyBinding(
                new KeyBinding(
                        "key.customanimations.open_animation_menu",
                        InputUtil.Type.KEYSYM,
                        GLFW.GLFW_KEY_H,
                        "category.customanimations.keys"
                )
        );

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while (openAnimationMenuKey.wasPressed()) {
                client.setScreen(new AnimationGuiScreen());
            }
        });

        EntityRendererRegistry.register(
                EntityType.PLAYER,
                EntityRendererRegistry.register(
                        EntityType.PLAYER,
                        ctx -> new PlayerEntityGeoRenderer(ctx)
                );
    }
}
