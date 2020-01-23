package com.ilyass.primordialmagic.blocks.slabs;

import com.ilyass.primordialmagic.Main;
import com.ilyass.primordialmagic.init.ModItems;


import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSlab;

public class AncientStoneSlabHalf extends AncientStoneSlab implements com.ilyass.primordialmagic.util.IHasModel
{
	public AncientStoneSlabHalf(String name, Material materialIn, CreativeTabs tab, BlockSlab half, BlockSlab doubleSlab)
	{
		super(name, materialIn, tab, half);
		
		ModItems.ITEMS.add(new ItemSlab(this, this, doubleSlab).setRegistryName(name));
	}
	
	@Override
	public boolean isDouble() 
	{
		return false;
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerModel(Item.getItemFromBlock(this), 0);
	}
}