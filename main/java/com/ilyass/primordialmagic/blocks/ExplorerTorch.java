package com.ilyass.primordialmagic.blocks;

import com.ilyass.primordialmagic.Main;
import com.ilyass.primordialmagic.init.ModBlocks;
import com.ilyass.primordialmagic.init.ModItems;
import com.ilyass.primordialmagic.util.IHasModel;

import net.minecraft.block.BlockTorch;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;



public class ExplorerTorch extends BlockTorch implements IHasModel{

	  public ExplorerTorch(String name, Material material) {
	    
	
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setHardness(0.0F);
	    this.setLightLevel(0.9375F);
	    this.setSoundType(SoundType.STONE);
	    
	    this.setCreativeTab(Main.primordialmagic);
	    
	    ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		
	  }

	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
	
}