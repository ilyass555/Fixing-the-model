package com.ilyass.primordialmagic.entity.render;

import com.ilyass.primordialmagic.entity.EntityUndeadroman;
import com.ilyass.primordialmagic.entity.model.ModelUndeadroman;
import com.ilyass.primordialmagic.util.Reference;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderUndeadroman extends RenderLiving<EntityUndeadroman>
{

	
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/undeadroman.png");
	
	
	public RenderUndeadroman(RenderManager manager) {
		super(manager, new ModelUndeadroman(), 0.5F);
	
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityUndeadroman entity) {
		 
		return TEXTURES;
	}

	@Override
	protected void applyRotations(EntityUndeadroman entityLiving, float p_77043_2_, float rotationYaw,
			float partialTicks) {
		// TODO Auto-generated method stub
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
	
}
