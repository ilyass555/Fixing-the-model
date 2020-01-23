package com.ilyass.primordialmagic.util.handler;

import com.ilyass.primordialmagic.blocks.ancientjar.ContainerAncientJar;
import com.ilyass.primordialmagic.blocks.ancientjar.GuiAncientJar;
import com.ilyass.primordialmagic.blocks.ancientjar.TileEntityAncientJar;
import com.ilyass.primordialmagic.util.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class GuiHandler implements IGuiHandler
{
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_ANCIENT_JAR)
	    return new ContainerAncientJar(player.inventory, (TileEntityAncientJar)world.getTileEntity(new BlockPos(x, y, z)), player);
		
		return null;
		

	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_ANCIENT_JAR)
		return new GuiAncientJar(player.inventory, (TileEntityAncientJar)world.getTileEntity(new BlockPos(x, y, z)), player);
		
		return null;
	}

	public static void registerGuis() {
		
      }
}