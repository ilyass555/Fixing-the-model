package com.ilyass.primordialmagic.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class AncientStoneBlock extends BlockBase{

	public AncientStoneBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(1.5F);
		setResistance(20.0F);
		setHarvestLevel("pickaxe", 1);
		
	}

}
