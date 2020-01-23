package com.ilyass.primordialmagic.util.handler;

import com.ilyass.primordialmagic.blocks.ancientjar.TileEntityAncientJar;
import com.ilyass.primordialmagic.util.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler {

	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntityAncientJar.class, new ResourceLocation(Reference.MOD_ID + ":ancient_jar"));
		
	}
}
	
	



