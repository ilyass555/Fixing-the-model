package com.ilyass.primordialmagic.blocks;

import com.ilyass.primordialmagic.Main;
import com.ilyass.primordialmagic.init.ModBlocks;
import com.ilyass.primordialmagic.init.ModItems;
import com.ilyass.primordialmagic.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel{

		public BlockBase(String name, Material material) {
			
			super(material);
			setUnlocalizedName(name);
			setRegistryName(name);
			setCreativeTab(Main.primordialmagic);
			
			ModBlocks.BLOCKS.add(this);
			ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
			
		}

		@Override
		public void registerModels() {
			
			
			Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
			
		}
	
		
			


}
		
