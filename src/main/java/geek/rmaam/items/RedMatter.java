package geek.rmaam.items;

import net.minecraftforge.fluids.Fluid;
import slimeknights.tconstruct.library.materials.Material;

public class RedMatter extends Material {
	public boolean castable = true;
	public Fluid fluid;

	public RedMatter(String identifier, int color) {
		super(identifier, color);
		super.castable = this.castable;
		super.fluid = this.fluid;
		// TODO Auto-generated constructor stub
	}


}
