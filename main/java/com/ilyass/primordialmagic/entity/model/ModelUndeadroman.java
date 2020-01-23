package com.ilyass.primordialmagic.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * ModelSkeleton - Either Mojang or a mod author
 * Created using Tabula 7.0.1
 */
public class ModelUndeadroman extends ModelBase {
    public ModelRenderer rightarm;
    public ModelRenderer rightleg;
    public ModelRenderer face;
    public ModelRenderer chest;
    public ModelRenderer leftarm;
    public ModelRenderer lefleg;
    public ModelRenderer hattop;
    public ModelRenderer hatright;
    public ModelRenderer hatleft;
    public ModelRenderer hathawk;

    public ModelUndeadroman() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.rightleg = new ModelRenderer(this, 0, 16);
        this.rightleg.setRotationPoint(-2.0F, 12.0F, 0.1F);
        this.rightleg.addBox(-1.0F, 0.0F, -1.0F, 2, 12, 2, 0.0F);
        this.hattop = new ModelRenderer(this, 43, 4);
        this.hattop.mirror = true;
        this.hattop.setRotationPoint(0.7F, -8.6F, -0.1F);
        this.hattop.addBox(-5.0F, 0.0F, -4.3F, 9, 2, 9, 0.1F);
        this.setRotateAngle(hattop, 0.0F, 0.0F, 0.017453292519943295F);
        this.chest = new ModelRenderer(this, 16, 16);
        this.chest.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.chest.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
        this.hathawk = new ModelRenderer(this, 90, 20);
        this.hathawk.setRotationPoint(-0.5F, -8.0F, -1.5F);
        this.hathawk.addBox(0.0F, -8.2F, -1.2F, 1, 9, 3, 0.0F);
        this.leftarm = new ModelRenderer(this, 40, 16);
        this.leftarm.mirror = true;
        this.leftarm.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.leftarm.addBox(-1.0F, -2.0F, -1.0F, 2, 12, 2, 0.0F);
        this.setRotateAngle(leftarm, 0.0F, 0.0F, -0.10000736613927509F);
        this.rightarm = new ModelRenderer(this, 40, 16);
        this.rightarm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.rightarm.addBox(-1.0F, -2.0F, -1.0F, 2, 12, 2, 0.0F);
        this.setRotateAngle(rightarm, 0.0F, 0.0F, 0.10000736613927509F);
        this.face = new ModelRenderer(this, 0, 0);
        this.face.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.face.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.lefleg = new ModelRenderer(this, 0, 16);
        this.lefleg.mirror = true;
        this.lefleg.setRotationPoint(2.0F, 12.0F, 0.1F);
        this.lefleg.addBox(-1.0F, 0.0F, -1.0F, 2, 12, 2, 0.0F);
        this.hatright = new ModelRenderer(this, 80, 0);
        this.hatright.setRotationPoint(-4.6F, -4.7F, 0.1F);
        this.hatright.addBox(0.0F, -3.5F, -4.0F, 1, 8, 8, 0.0F);
        this.hatleft = new ModelRenderer(this, 100, 0);
        this.hatleft.setRotationPoint(3.8F, -4.4F, 0.1F);
        this.hatleft.addBox(0.0F, -3.5F, -4.0F, 1, 8, 8, 0.0F);
        this.setRotateAngle(hatleft, -0.017453292519943295F, 0.0F, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.rightleg.render(f5);
        this.hattop.render(f5);
        this.chest.render(f5);
        this.hathawk.render(f5);
        this.leftarm.render(f5);
        this.rightarm.render(f5);
        this.face.render(f5);
        this.lefleg.render(f5);
        this.hatright.render(f5);
        this.hatleft.render(f5);
    }

    /**
     * This is a helper function from Tabular to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
 
    }
    
    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
    		float headPitch, float scaleFactor, Entity entityIn) {
    	
    	this.lefleg.rotateAngleX = MathHelper.cos(limbSwing * 0.66627F) * 1.4F * limbSwingAmount;
    	this.rightleg.rotateAngleX =MathHelper.cos(limbSwing* 0.66627F+(float)Math.PI) * 1.4F * limbSwingAmount;
        this.leftarm.rotateAngleX = MathHelper.cos(limbSwing * 0.66627F) * 1.4F * limbSwingAmount;
    	this.rightarm.rotateAngleX =MathHelper.cos(limbSwing* 0.66627F+(float)Math.PI) * 1.4F * limbSwingAmount;
    	
        this.face.rotateAngleY = netHeadYaw * 0.017453292F;
        this.face.rotateAngleX = headPitch * 0.017453292F;
        this.hattop.rotateAngleY = netHeadYaw * 0.017453292F;
        this.hattop.rotateAngleX = headPitch * 0.017453292F;
        
        this.hathawk.rotateAngleY = netHeadYaw * 0.017453292F;
       
    
    }   
    
}

