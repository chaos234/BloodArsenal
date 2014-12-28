package com.arc.bloodarsenal.block;

import com.arc.bloodarsenal.items.block.BloodStoneBlock;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class ModBlocks
{
    public static Block blood_stone;
    public static Block blood_tnt;
    public static Block blood_stained_glass;
    public static Block blood_infused_wood;
    public static Block blood_infused_planks;
    public static Block blood_stained_ice;
    public static Block blood_stained_ice_packed;
    public static Block blood_infused_iron_block;
    public static Block blood_door_wood;
    public static Block blood_door_iron;
    public static Block blood_cake;
    public static Block blood_torch;
    public static Block blood_infused_glowstone;
    public static Block blood_lamp;
    public static Block blood_infused_diamond_block;
    public static BlockPortableAltar portable_altar;

    public static void init()
    {
        blood_stone = new BlockBloodStone();
        blood_tnt = new BlockBloodTNT();
        blood_stained_glass = new BlockBloodStainedGlass();
        blood_infused_wood = new BlockBloodInfusedWood();
        blood_infused_planks = new BlockBloodInfusedPlanks();
        blood_stained_ice = new BlockBloodStainedIce();
        blood_stained_ice_packed = new BlockBloodStainedPackedIce();
        blood_infused_iron_block = new BlockInfusedIron();
        blood_door_wood = new BlockInfusedWoodenDoor();
        blood_door_iron = new BlockInfusedIronDoor();
        blood_cake = new BlockBloodCake();
        blood_torch = new BlockBloodTorch();
        blood_infused_glowstone = new BlockBloodInfusedGlowstone();
        blood_lamp = new BlockBloodLamp();
        blood_infused_diamond_block = new BlockBloodInfusedDiamond();
        portable_altar = new BlockPortableAltar();
    }

    public static void registerBlocksInPre()
    {
        GameRegistry.registerBlock(ModBlocks.blood_stone, BloodStoneBlock.class, "BloodArsenal" + (ModBlocks.blood_stone.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(ModBlocks.blood_tnt, "blood_tnt");
        GameRegistry.registerBlock(ModBlocks.blood_stained_glass, "blood_stained_glass");
        GameRegistry.registerBlock(ModBlocks.blood_infused_wood, "blood_infused_wood");
        GameRegistry.registerBlock(ModBlocks.blood_infused_planks, "blood_infused_planks");
        GameRegistry.registerBlock(ModBlocks.blood_stained_ice, "blood_stained_ice");
        GameRegistry.registerBlock(ModBlocks.blood_stained_ice_packed, "blood_stained_ice_packed");
        GameRegistry.registerBlock(ModBlocks.blood_infused_iron_block, "blood_infused_iron_block");
        GameRegistry.registerBlock(ModBlocks.blood_door_wood, "blood_door_wood");
        GameRegistry.registerBlock(ModBlocks.blood_door_iron, "blood_door_iron");
        GameRegistry.registerBlock(ModBlocks.blood_cake, "blood_cake");
        GameRegistry.registerBlock(ModBlocks.blood_torch, "blood_torch");
        GameRegistry.registerBlock(ModBlocks.blood_infused_glowstone, "blood_infused_glowstone");
        GameRegistry.registerBlock(ModBlocks.blood_lamp, "blood_lamp");
        GameRegistry.registerBlock(ModBlocks.blood_infused_diamond_block, "blood_infused_diamond_block");
        GameRegistry.registerBlock(ModBlocks.portable_altar, "portable_altar");
    }
}