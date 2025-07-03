package net.zomi.customanimations.animations;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;

public class PlayerEntityGeoRenderer
        extends GeoEntityRenderer<PlayerEntity> {
    public PlayerEntityGeoRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new PlayerEntityGeoModel());
    }
}
