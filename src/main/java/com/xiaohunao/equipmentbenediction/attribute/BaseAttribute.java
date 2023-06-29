package com.xiaohunao.equipmentbenediction.attribute;

import com.xiaohunao.equipmentbenediction.EquipmentBenediction;
import net.minecraft.world.entity.ai.attributes.RangedAttribute;

public class BaseAttribute extends RangedAttribute {
    public BaseAttribute(String name, double defaultValue, double minValue, double maxValue) {
        super("attribute." + EquipmentBenediction.MOD_ID + "." + name, defaultValue, minValue, maxValue);
        this.setSyncable(true);
    }

    public BaseAttribute(String name) {
        super("attribute." + EquipmentBenediction.MOD_ID + "." + name, 0.0, 0.0, 1.0);
        this.setSyncable(true);
    }
}
