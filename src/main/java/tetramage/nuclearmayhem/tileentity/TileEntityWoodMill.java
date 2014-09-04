package tetramage.nuclearmayhem.tileentity;

import net.minecraft.tileentity.TileEntity;

public class TileEntityWoodMill extends TileEntity{
	@SuppressWarnings("unused")
	private String localizedName;

	public void setGuiDisplayName(String displayName) {
		this.localizedName = displayName;
	}

}
