package tetramage.nuclearmayhem.common;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import tetramage.nuclearmayhem.container.ContainerWoodMill;
import tetramage.nuclearmayhem.handler.GuiWoodMill;
import tetramage.nuclearmayhem.tileentity.TileEntityWoodMill;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler{

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
TileEntity entity = world.getTileEntity(x, y, z);
		
		if(entity != null) {
			switch(ID) {
			case NuclearMayhem.guiIDWoodMill:
				if (entity instanceof TileEntityWoodMill){
					return new ContainerWoodMill(player.inventory, (TileEntityWoodMill) entity);
				}
				return null;
			}
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
TileEntity entity = world.getTileEntity(x, y, z);
		
		if(entity != null) {
			switch(ID) {
			case NuclearMayhem.guiIDWoodMill:
				if (entity instanceof TileEntityWoodMill){
					return new GuiWoodMill(player.inventory, (TileEntityWoodMill) entity);
				}
				return null;
			}
		}
		return null;
	}
}
