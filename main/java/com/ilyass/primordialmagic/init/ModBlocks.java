package com.ilyass.primordialmagic.init;

import java.util.ArrayList;
import java.util.List;

import com.ilyass.primordialmagic.Main;
import com.ilyass.primordialmagic.blocks.AncientStoneBlock;
import com.ilyass.primordialmagic.blocks.AncientMagicTableBlock;
import com.ilyass.primordialmagic.blocks.BlockBase;
import com.ilyass.primordialmagic.blocks.ExplorerTorch;
import com.ilyass.primordialmagic.blocks.RuneStoneBlock;
import com.ilyass.primordialmagic.blocks.ancientjar.AncientJar;
import com.ilyass.primordialmagic.blocks.slabs.AncientStoneSlabDouble;
import com.ilyass.primordialmagic.blocks.slabs.AncientStoneSlabHalf;
import com.ilyass.primordialmagic.proxy.CommonProxy;
import com.ilyass.primordialmagic.tabs.PrimordialMagic;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDoubleStoneSlab;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {

	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final BlockBase ANCIENT_STONE_BLOCK = new AncientStoneBlock("ancient_stone_block", Material.ROCK);
	
	public static final Block ANCIENT_MAGIC_TABLE_BLOCK = new AncientMagicTableBlock("ancient_magic_table_block");

	public static final Block RUNE_STONE_BLOCK = new RuneStoneBlock("rune_stone_block");

	public static final BlockSlab ANCIENT_STONE_SLAB_DOUBLE = new AncientStoneSlabDouble("ancient_stone_slab_double", Material.ROCK, Main.primordialmagic, ModBlocks.ANCIENT_STONE_SLAB_HALF);
	
	public static final BlockSlab ANCIENT_STONE_SLAB_HALF = new AncientStoneSlabHalf("ancient_stone_slab_half", Material.ROCK, Main.primordialmagic, ModBlocks.ANCIENT_STONE_SLAB_HALF, ModBlocks.ANCIENT_STONE_SLAB_DOUBLE);
	
	public static final Block EXPLORER_TORCH = new ExplorerTorch("explorer_torch", Material.ROCK);
	
	public static final Block ANCIENT_JAR = new AncientJar("ancient_jar", Material.ROCK);

}
	


	