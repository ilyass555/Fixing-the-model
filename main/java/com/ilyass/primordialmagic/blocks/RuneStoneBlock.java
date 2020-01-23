package com.ilyass.primordialmagic.blocks;

import java.util.Random;

import com.ilyass.primordialmagic.Main;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;



public class RuneStoneBlock extends BlockBase {

	
	
	public static final AxisAlignedBB RUNE_STONE_BLOCK_AABB = new AxisAlignedBB(0.125D, 0, 0.125D, 0.875D, 0.625D, 0.875D); 
	
	
	public RuneStoneBlock(String name) {
		super(name, Material.ROCK);
		
		setSoundType(SoundType.STONE);
		setHardness(1.5F);
		setResistance(20.0F);
		setHarvestLevel("pickaxe", 1);
	    setBlockUnbreakable();
	}
	
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	@Override
	public boolean isFullCube(IBlockState state) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		
		return RUNE_STONE_BLOCK_AABB;
	}


  
 }



