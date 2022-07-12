package com.jusipat.castleblocks.registry;

import com.jusipat.castleblocks.CastleBlocksMod;
import com.jusipat.castleblocks.item.TrowelItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final BlockItem CASTLE_BRICKS = new BlockItem(ModBlocks.CASTLE_BRICKS, new Item.Settings().group(CastleBlocksMod.CASTLEBLOCKS_GROUP));
    public static final BlockItem ANDESITE_CASTLE_BRICKS = new BlockItem(ModBlocks.ANDESITE_CASTLE_BRICKS, new Item.Settings().group(CastleBlocksMod.CASTLEBLOCKS_GROUP));
    public static final BlockItem DIORITE_CASTLE_BRICKS = new BlockItem(ModBlocks.DIORITE_CASTLE_BRICKS, new Item.Settings().group(CastleBlocksMod.CASTLEBLOCKS_GROUP));
    public static final BlockItem GRANITE_CASTLE_BRICKS = new BlockItem(ModBlocks.GRANITE_CASTLE_BRICKS, new Item.Settings().group(CastleBlocksMod.CASTLEBLOCKS_GROUP));
    public static final BlockItem SANDSTONE_CASTLE_BRICKS = new BlockItem(ModBlocks.SANDSTONE_CASTLE_BRICKS, new Item.Settings().group(CastleBlocksMod.CASTLEBLOCKS_GROUP));
    public static final BlockItem RED_SANDSTONE_CASTLE_BRICKS = new BlockItem(ModBlocks.RED_SANDSTONE_CASTLE_BRICKS, new Item.Settings().group(CastleBlocksMod.CASTLEBLOCKS_GROUP));
    public static final BlockItem BLACKSTONE_CASTLE_BRICKS = new BlockItem(ModBlocks.BLACKSTONE_CASTLE_BRICKS, new Item.Settings().group(CastleBlocksMod.CASTLEBLOCKS_GROUP));
    public static final BlockItem NETHER_CASTLE_BRICKS = new BlockItem(ModBlocks.NETHER_CASTLE_BRICKS, new Item.Settings().group(CastleBlocksMod.CASTLEBLOCKS_GROUP));
    public static final BlockItem END_STONE_CASTLE_BRICKS = new BlockItem(ModBlocks.END_STONE_CASTLE_BRICKS, new Item.Settings().group(CastleBlocksMod.CASTLEBLOCKS_GROUP));
    public static final BlockItem PURPUR_CASTLE_BRICKS = new BlockItem(ModBlocks.PURPUR_CASTLE_BRICKS, new Item.Settings().group(CastleBlocksMod.CASTLEBLOCKS_GROUP));
    public static final BlockItem PRISMARINE_CASTLE_BRICKS = new BlockItem(ModBlocks.PRISMARINE_CASTLE_BRICKS, new Item.Settings().group(CastleBlocksMod.CASTLEBLOCKS_GROUP));
    public static final BlockItem BRICK_CASTLE_BRICKS = new BlockItem(ModBlocks.BRICK_CASTLE_BRICKS, new Item.Settings().group(CastleBlocksMod.CASTLEBLOCKS_GROUP));

    public static final Item IRON_TROWEL = new TrowelItem(new FabricItemSettings().group(CastleBlocksMod.CASTLEBLOCKS_GROUP), 250);
    public static final Item DIAMOND_TROWEL = new TrowelItem(new FabricItemSettings().group(CastleBlocksMod.CASTLEBLOCKS_GROUP), 1561);
    public static final Item GOLD_TROWEL = new TrowelItem(new FabricItemSettings().group(CastleBlocksMod.CASTLEBLOCKS_GROUP), 32);
    public static final Item NETHERITE_TROWEL = new TrowelItem(new FabricItemSettings().group(CastleBlocksMod.CASTLEBLOCKS_GROUP), 2031);

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(CastleBlocksMod.MOD_ID, "castle_bricks"), CASTLE_BRICKS);
        Registry.register(Registry.ITEM, new Identifier(CastleBlocksMod.MOD_ID, "andesite_castle_bricks"), ANDESITE_CASTLE_BRICKS);
        Registry.register(Registry.ITEM, new Identifier(CastleBlocksMod.MOD_ID, "diorite_castle_bricks"), DIORITE_CASTLE_BRICKS);
        Registry.register(Registry.ITEM, new Identifier(CastleBlocksMod.MOD_ID, "granite_castle_bricks"), GRANITE_CASTLE_BRICKS);
        Registry.register(Registry.ITEM, new Identifier(CastleBlocksMod.MOD_ID, "sandstone_castle_bricks"), SANDSTONE_CASTLE_BRICKS);
        Registry.register(Registry.ITEM, new Identifier(CastleBlocksMod.MOD_ID, "red_sandstone_castle_bricks"), RED_SANDSTONE_CASTLE_BRICKS);
        Registry.register(Registry.ITEM, new Identifier(CastleBlocksMod.MOD_ID, "nether_castle_bricks"), NETHER_CASTLE_BRICKS);
        Registry.register(Registry.ITEM, new Identifier(CastleBlocksMod.MOD_ID, "blackstone_castle_bricks"), BLACKSTONE_CASTLE_BRICKS);
        Registry.register(Registry.ITEM, new Identifier(CastleBlocksMod.MOD_ID, "purpur_castle_bricks"), PURPUR_CASTLE_BRICKS);
        Registry.register(Registry.ITEM, new Identifier(CastleBlocksMod.MOD_ID, "brick_castle_bricks"), BRICK_CASTLE_BRICKS);
        Registry.register(Registry.ITEM, new Identifier(CastleBlocksMod.MOD_ID, "end_stone_castle_bricks"), END_STONE_CASTLE_BRICKS);
        Registry.register(Registry.ITEM, new Identifier(CastleBlocksMod.MOD_ID, "prismarine_castle_bricks"), PRISMARINE_CASTLE_BRICKS);

        Registry.register(Registry.ITEM, new Identifier(CastleBlocksMod.MOD_ID, "iron_trowel"), IRON_TROWEL);
        Registry.register(Registry.ITEM, new Identifier(CastleBlocksMod.MOD_ID, "gold_trowel"), GOLD_TROWEL);
        Registry.register(Registry.ITEM, new Identifier(CastleBlocksMod.MOD_ID, "diamond_trowel"), DIAMOND_TROWEL);
        Registry.register(Registry.ITEM, new Identifier(CastleBlocksMod.MOD_ID, "netherite_trowel"), NETHERITE_TROWEL);
    }
}
