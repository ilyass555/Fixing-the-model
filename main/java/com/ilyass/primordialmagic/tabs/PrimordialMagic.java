package com.ilyass.primordialmagic.tabs;

import com.ilyass.primordialmagic.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class PrimordialMagic extends CreativeTabs{
	
	public PrimordialMagic(String label) { super("primordialmagic");
	this.setBackgroundImageName("primordialmagic.png"); }
	public ItemStack getTabIconItem() { return new ItemStack(ModItems.Ancient_Tome);}

	

}