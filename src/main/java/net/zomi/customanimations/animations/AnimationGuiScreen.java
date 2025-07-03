package net.zomi.customanimations.animations;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.MinecraftClient;
import net.minecraft.text.Text;

public class AnimationGuiScreen extends Screen {
    public AnimationGuiScreen() {
        super(Text.literal("Choose Animation"));
    }

    @Override
    protected void init() {
        int centerX = width / 2;
        int centerY = height / 2;

        this.addDrawableChild(ButtonWidget.builder(Text.literal("Wave"), button -> {
            System.out.println("Wave animation triggered!");
            client.setScreen(null);
        }).dimensions(centerX - 50, centerY - 20, 100, 20).build());

    }

    @Override
    public boolean shouldPause() {
        return false;
    }
}
