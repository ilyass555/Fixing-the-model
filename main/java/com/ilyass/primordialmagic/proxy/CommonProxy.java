package com.ilyass.primordialmagic.proxy;

import com.ilyass.primordialmagic.init.ModBlocks;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	public void registerItemRenderer(Item item, int meta, String id) {}

	public void registerModel(Item item, int metadata) {}
		
	
    public void preInit(FMLPreInitializationEvent event)
 {
    
    	
}
    public void init(FMLInitializationEvent event)
    {

    }

    public void postInit(FMLPostInitializationEvent event)
    {

    }

	public void render() {
		// TODO Auto-generated method stub
		
	}
}


	

