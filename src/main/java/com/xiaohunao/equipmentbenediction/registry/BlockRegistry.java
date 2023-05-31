package com.xiaohunao.equipmentbenediction.registry;


import com.xiaohunao.equipmentbenediction.EquipmentBenediction;
import com.xiaohunao.equipmentbenediction.block.RecastingDeskBlock;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, EquipmentBenediction.MOD_ID);
    public static final RegistryObject<Block> RECASTING_DESK = BLOCKS.register("recasting_desk", RecastingDeskBlock::new);


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}