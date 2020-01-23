package com.ilyass.primordialmagic.util.handler;

import com.ilyass.primordialmagic.entity.EntityUndeadroman;
import com.ilyass.primordialmagic.entity.render.RenderUndeadroman;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {

	public static void registerEntityRenders()
	{
		
		RenderingRegistry.registerEntityRenderingHandler(EntityUndeadroman.class, new IRenderFactory<EntityUndeadroman>() 
		{
			


			@Override
			public Render<? super EntityUndeadroman> createRenderFor(RenderManager manager) {
				// TODO Auto-generated method stub
				return new RenderUndeadroman(manager);
			}
			
			
		});
	}
	
}
