package com.indemnity83.irontanks.common;

import com.indemnity83.irontanks.IronTanks;
import com.indemnity83.irontanks.common.blocks.BlockIronTank;
import com.indemnity83.irontanks.common.entities.*;
import com.indemnity83.irontanks.common.items.ItemIronTank;
import com.indemnity83.irontanks.common.items.TankChangerType;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class Content {

    public static BlockIronTank ironTankBlock = new BlockIronTank();
    private static ItemIronTank ironTankItemBlock = new ItemIronTank(ironTankBlock);

    public static void registerBlocks() {
        GameRegistry.register(ironTankBlock);
        GameRegistry.register(ironTankItemBlock);

        GameRegistry.registerTileEntity(TileEntityCopperTank.class, "copper_tank_tile_entity");
        GameRegistry.registerTileEntity(TileEntityDiamondTank.class, "diamond_tank_tile_entity");
        GameRegistry.registerTileEntity(TileEntityGoldTank.class, "gold_tank_tile_entity");
        GameRegistry.registerTileEntity(TileEntityIronTank.class, "iron_tank_tile_entity");
        GameRegistry.registerTileEntity(TileEntityObsidianTank.class, "obsidian_tank_tile_entity");
        GameRegistry.registerTileEntity(TileEntitySilverTank.class, "silver_tank_tile_entity");
    }

    public static void registerItems() {
        TankChangerType.buildItems();
    }

    public static void registerRenders() {
        for (TankChangerType type : TankChangerType.VALUES) {
            ModelLoader.setCustomModelResourceLocation(type.item, 0, new ModelResourceLocation(new ResourceLocation(IronTanks.MODID, "iron_tank_upgrades"), "variant=" + type.itemName));
        }

    }


}