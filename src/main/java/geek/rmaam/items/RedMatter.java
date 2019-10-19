package geek.rmaam.items;

import net.minecraft.util.text.TextFormatting;
import slimeknights.tconstruct.library.materials.Material;

public class RedMatter extends Material {
	
	private static final String rmidentifier = "redmatter";

	public RedMatter() {
		super(rmidentifier, TextFormatting.RED);
		this.setCastable(true);
		this.setCraftable(true);
	}


}
