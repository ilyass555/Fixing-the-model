package com.ilyass.primordialmagic.init;

import com.ilyass.primordialmagic.Main;
import com.ilyass.primordialmagic.entity.EntityUndeadroman;
import com.ilyass.primordialmagic.util.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit {

	
	public	 static void registerEntities()
	{
		
		registerEnitity("undeadroman", EntityUndeadroman.class, Reference.ENTITY_UNDEADROMAN, 20, 2440511, 13806375);
		
	}
	
		

	private static void registerEnitity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
	
	{
		
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);

	}
	
}
