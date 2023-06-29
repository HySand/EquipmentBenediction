package com.xiaohunao.equipmentbenediction.data.dao;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;

public record RecastingRequirement(int count, List<ItemVerifier> verifiers) {

    public boolean isCompleteValid(ItemStack stack) {
        int count = stack.getCount();
        ResourceLocation name = ForgeRegistries.ITEMS.getKey(stack.getItem());
        for (ItemVerifier verifier : verifiers) {
            System.out.println("isCompleteValid name : " + name);
            if (verifier.isValid(name)) {
                boolean b = count >= this.count;
                System.out.println("isCompleteValid  count: " + b);
                if (b) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isValid(ItemStack stack) {
        for (ItemVerifier verifier : verifiers) {
            if (verifier.isValid(ForgeRegistries.ITEMS.getKey(stack.getItem()))) {
                return true;
            }
        }
        return false;
    }
}
