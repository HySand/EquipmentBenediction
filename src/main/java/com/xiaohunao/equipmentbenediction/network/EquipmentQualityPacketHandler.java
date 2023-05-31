package com.xiaohunao.equipmentbenediction.network;

import com.xiaohunao.equipmentbenediction.EquipmentBenediction;
import com.xiaohunao.equipmentbenediction.network.message.QualitySyncMessage;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.simple.SimpleChannel;

public class EquipmentQualityPacketHandler {
    private static final String PROTOCOL_VERSION = "0.0.1";
    public static final SimpleChannel INSTANCE = NetworkRegistry.newSimpleChannel(
            EquipmentBenediction.asResource("main"),
            () -> PROTOCOL_VERSION,
            PROTOCOL_VERSION::equals,
            PROTOCOL_VERSION::equals
    );

    public static void init() {
        INSTANCE.registerMessage(0, QualitySyncMessage.class, QualitySyncMessage::encode, QualitySyncMessage::decode, QualitySyncMessage::handle);
    }
}