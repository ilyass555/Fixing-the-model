package com.ilyass.primordialmagic.blocks;

import java.util.Random;

import com.ilyass.primordialmagic.Main;
import com.ilyass.primordialmagic.blocks.BlockBase;
import com.ilyass.primordialmagic.util.Reference;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;



public class AncientMagicTableBlock extends BlockBase {

	
	
	public static final AxisAlignedBB ANCIENT_MAGIC_TABLE_BLOCK_AABB = new AxisAlignedBB(0.125D, 0, 0.125D, 0.875D, 0.625D, 0.875D); 
	
	
	public AncientMagicTableBlock(String name) {
		super(name, Material.ROCK);
		
		setSoundType(SoundType.STONE);
		setHardness(1.5F);
		setResistance(20.0F);
		setHarvestLevel("pickaxe", 1);
	
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
		
		return ANCIENT_MAGIC_TABLE_BLOCK_AABB;
	}





	
	
	
  
 }


