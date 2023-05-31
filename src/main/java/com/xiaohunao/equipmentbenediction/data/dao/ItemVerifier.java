package com.xiaohunao.equipmentbenediction.data.dao;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemVerifier {
    private final String id;
    private final String tag;

    public ItemVerifier(String id, String tag) {
        this.id = id;
        this.tag = tag;
    }


    public boolean isValid(ResourceLocation itemID) {
        if (id != null) {
            return itemID.toString().equals(id);
        } else if (tag != null) {
            TagKey<Item> itemTag = TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation(tag));
            ItemStack stack = new ItemStack(ForgeRegistries.ITEMS.getValue(itemID));
            return stack.is(itemTag);
        }
        return false;
    }
}