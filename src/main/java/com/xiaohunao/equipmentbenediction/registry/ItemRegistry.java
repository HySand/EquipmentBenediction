package com.xiaohunao.equipmentbenediction.registry;


import com.xiaohunao.equipmentbenediction.EquipmentBenediction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, EquipmentBenediction.MOD_ID);
    public static final RegistryObject<Item> RECASTING_DESK = ITEMS.register("recasting_desk", () -> new BlockItem(BlockRegistry.RECASTING_DESK.get(), new Item.Properties().tab(EquipmentBenediction.EQUIPMENT_QUALITY_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
