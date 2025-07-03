package net.zomi.customanimations.animations;

import net.minecraft.util.Identifier;
import net.minecraft.entity.player.PlayerEntity;
import software.bernie.geckolib.model.GeoModel;
import net.zomi.customanimations.CustomAnimations;

public class PlayerEntityGeoModel extends GeoModel<PlayerEntity> {
    @Override
    public Identifier getModelResource(PlayerEntity animatable) {
        return new Identifier(CustomAnimations.MOD_ID, "geo/player.geo.json");
    }

    @Override
    public Identifier getTextureResource(PlayerEntity animatable) {
        return new Identifier(CustomAnimations.MOD_ID, "textures/entity/player.png");
    }

    @Override
    public Identifier getAnimationResource(PlayerEntity animatable) {
        return new Identifier(CustomAnimations.MOD_ID, "animations/wave.animation.json");
    }
}
