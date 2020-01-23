package com.ilyass.primordialmagic.items;

import com.ilyass.primordialmagic.Main;
import com.ilyass.primordialmagic.init.ModItems;
import com.ilyass.primordialmagic.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
	
	
	public ItemBase(String name) {
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.primordialmagic);
		
		ModItems.ITEMS.add(this);
		
	}
	

	@Override
	public void registerModels() {
		
		
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
		
	}

}
