package com.ilyass.primordialmagic.blocks.ancientjar;
import com.ilyass.primordialmagic.util.Reference;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class GuiAncientJar extends GuiContainer
	{
		private static final ResourceLocation GUI_ANCIENT_JAR = new ResourceLocation(Reference.MOD_ID + ":textures/gui/ancient_jar.png");
		private final InventoryPlayer playerInventory;
		private final TileEntityAncientJar te;
		
		public GuiAncientJar(InventoryPlayer playerInventory, TileEntityAncientJar chestInventory, EntityPlayer player) 
		{
			super(new ContainerAncientJar(playerInventory, chestInventory, player));
			this.playerInventory = playerInventory;
			this.te = chestInventory;
			
			this.xSize = 179;
			this.ySize = 221;
		}
		
		@Override
		protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) 
		{
			GlStateManager.color(1.0f, 1.0f, 1.0f);
			this.mc.getTextureManager().bindTexture(GUI_ANCIENT_JAR);
			this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
		}
		
		@Override
		protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) 
		{
			this.fontRenderer.drawString(this.te.getDisplayName().getUnformattedText(), 8, 6, 000000);
			this.fontRenderer.drawString(this.playerInventory.getDisplayName().getUnformattedText(), 8, this.ySize - 92, 000000);
		}
	}
	

