package geek.rmaam.items;

import net.minecraft.util.text.TextFormatting;
import slimeknights.tconstruct.library.materials.Material;

public class AntiMatter extends Material {

	private static final String amidentifier = "antimatter";

	public AntiMatter() {
		super(amidentifier, TextFormatting.BLACK);
		this.setCastable(true);
		this.setCraftable(true);
	}


}
