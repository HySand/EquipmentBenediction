package com.xiaohunao.equipmentbenediction.registry;

import com.xiaohunao.equipmentbenediction.EquipmentBenediction;
import com.xiaohunao.equipmentbenediction.attribute.*;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class AttributesRegister {
    public static final DeferredRegister<Attribute> ATTRIBUTES = DeferredRegister.create(ForgeRegistries.ATTRIBUTES, EquipmentBenediction.MOD_ID);

    public static final RegistryObject<Attribute> EXECUTE = ATTRIBUTES.register("generic.execute", ExecuteAttribute::new);
    public static final RegistryObject<Attribute> BOW_SPEED = ATTRIBUTES.register("generic.bow_speed", BowSpeedAttribute::new);
    public static final RegistryObject<Attribute> BOW_MOVEMENT_SPEED = ATTRIBUTES.register("generic.bow_movement_speed", BowMovementSpeedAttribute::new);
    public static final RegistryObject<Attribute> ABSORB_BLOOD = ATTRIBUTES.register("generic.absorb_blood", AbsorbBloodAttribute::new);
    public static final RegistryObject<Attribute> SUMMON_LIGHTNING = ATTRIBUTES.register("generic.summon_lightning", SummonLightningAttribute::new);
    public static final RegistryObject<Attribute> ATTACK_POISON = ATTRIBUTES.register("generic.attack_poison", PoisonAttackAttribute::new);
    public static final RegistryObject<Attribute> FAR_DISTANCE_ATTACK = ATTRIBUTES.register("generic.far_distance_attack", DistanceAttackAttribute.Far::new);
    public static final RegistryObject<Attribute> NIGH_DISTANCE_ATTACK = ATTRIBUTES.register("generic.nigh_distance_attack", DistanceAttackAttribute.Nigh::new);
    public static final RegistryObject<Attribute> SLOWNESS_ATTACK = ATTRIBUTES.register("generic.slowness_attack", SlownessAttackAttribute::new);
    public static final RegistryObject<Attribute> WITHER_ATTACK = ATTRIBUTES.register("generic.wither_attack", WitherAttackAttribute::new);
    public static final RegistryObject<Attribute> LEVITATION_ATTACK = ATTRIBUTES.register("generic.levitation_attack", LevitationAttackAttribute::new);

    public static void register(IEventBus eventBus) {
        ATTRIBUTES.register(eventBus);
    }
}