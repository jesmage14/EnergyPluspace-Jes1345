package tetramage.nuclearmayhem.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import tetramage.nuclearmayhem.tileentity.TileEntityWoodMill;

public class ContainerWoodMill extends Container{
	
	private TileEntityWoodMill woodMill;
	
	public ContainerWoodMill(InventoryPlayer inventory, TileEntityWoodMill tileentity) {
		this.woodMill = tileentity;
	}

	@Override
	public boolean canInteractWith(EntityPlayer var1) {
		// TODO Auto-generated method stub
		return false;
	}

}
