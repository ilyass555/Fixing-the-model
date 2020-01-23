package com.ilyass.primordialmagic.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityBodyHelper;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.EntityAIZombieAttack;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityUndeadroman extends EntityZombie{

	public EntityUndeadroman(World worldIn) {
		super(worldIn);
		 this.setSize(0.9F, 2.8F);
	}
	
	public EntityZombie createChild(EntityAgeable ageable) {
		
		return new EntityUndeadroman(world);
	
	}
	
	public void Entitytest(World world) {
		
		setSize(0.6f, 1.8f);
		experienceValue = 5;
		this.isImmuneToFire = true;
		setNoAI(!true);
		this.tasks.addTask(1, new EntityAIWander(this, 1));
		this.tasks.addTask(2, new EntityAILookIdle(this));
		this.tasks.addTask(3, new EntityAISwimming(this));
		this.tasks.addTask(4, new EntityAILeapAtTarget(this, (float) 0.8));
		this.tasks.addTask(5, new EntityAIPanic(this, 1.2));
		this.targetTasks.addTask(6, new EntityAIHurtByTarget(this, true));
	}


	
	
	
	
	
	@Override
	protected SoundEvent getAmbientSound() {
		// TODO Auto-generated method stub
		return super.getAmbientSound();
	}
	
	
	@Override
	protected SoundEvent getDeathSound() {
		// TODO Auto-generated method stub
		return super.getDeathSound();
	}
	
	@Override
	protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
		// TODO Auto-generated method stub
		return super.getHurtSound(damageSourceIn);
	}
}

