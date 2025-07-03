package net.zomi.customanimations.mixin;

import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.util.GeckoLibUtil;
import software.bernie.geckolib.animatable.GeoAnimatable;
import software.bernie.geckolib.core.controller.AnimationData;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin implements GeoAnimatable {
    private final AnimatableInstanceCache animatableInstanceCache =
            GeckoLibUtil.createInstanceCache(this);

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.animatableInstanceCache;
    }

    @Override
    public void registerControllers(AnimationData data) {
    }
}
