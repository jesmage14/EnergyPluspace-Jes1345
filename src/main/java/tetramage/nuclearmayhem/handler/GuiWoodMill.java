package tetramage.nuclearmayhem.handler;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import tetramage.nuclearmayhem.tileentity.TileEntityWoodMill;

public class GuiWoodMill extends GuiContainer{
	
	public TileEntityWoodMill woodMill;
	
	public GuiWoodMill(InventoryPlayer inventoryPlayer, TileEntityWoodMill entity) {
		super(ContainerWoodMill(inventoryPlayer, entity));
		
		this.woodMill = entity;
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {
		
	}

}
