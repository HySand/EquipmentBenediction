package com.xiaohunao.equipmentbenediction.data.dao;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;


public record QualityData(String id, List<ItemVerifier> verifiers, String color, float chance, int level, int count,
                          List<RecastingRequirement> recastingRequirement) {

    public boolean isValid(ItemStack stack) {
        return isValid(ForgeRegistries.ITEMS.getKey(stack.getItem()));
    }

    public boolean isValid(ResourceLocation id) {
        for (ItemVerifier verifier : verifiers) {
            if (verifier.isValid(id)) {
                return true;
            }
        }
        return false;
    }

    public boolean Recasting(ItemStack stack) {
        for (RecastingRequirement requirement : this.recastingRequirement) {
            if (requirement.isCompleteValid(stack)) {
                stack.shrink(requirement.count());
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "EquipmentQualityData{" +
                "id='" + id + '\'' +
                ", verifiers=" + verifiers +
                ", color='" + color + '\'' +
                ", chance=" + chance +
                ", level=" + level +
                ", count=" + count +
                '}';
    }
}