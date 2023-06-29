package com.xiaohunao.equipmentbenediction.attribute;

import com.xiaohunao.equipmentbenediction.util.AttributeUtil;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Random;


@Mod.EventBusSubscriber
public abstract class BaseEffectAttribute extends BaseAttribute {

    public BaseEffectAttribute(String name) {
        super(name);
    }

    abstract Attribute getAttribute();

    abstract MobEffect getMobEffect();

    abstract int getDuration();

    abstract int getLevel();


    public void onLivingAttack(LivingAttackEvent event) {
        Entity entity = event.getSource().getEntity();
        if (entity == null ||
                entity.level.isClientSide ||
                !(entity instanceof LivingEntity living) ||
                new Random().nextFloat() > AttributeUtil.getAttributeValue(living, getAttribute())) return;
        event.getEntity().addEffect(new MobEffectInstance(getMobEffect(), getDuration(), getLevel()));
    }
}
