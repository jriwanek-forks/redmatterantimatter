package geek.rmaam.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ThePredicament extends Item {
	private Object hand = EnumHand.MAIN_HAND;

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		BlockPos playerSpawnLocation = playerIn.getBedLocation(playerIn.getSpawnDimension());
		if (playerSpawnLocation == null) {
			playerSpawnLocation = worldIn.getSpawnPoint();
		}
		if(handIn == hand) {
			if (playerIn.dimension != playerIn.getSpawnDimension()) {
				playerIn.changeDimension(playerIn.getSpawnDimension());
			}
				playerIn.attemptTeleport(playerSpawnLocation.getX(), playerSpawnLocation.getY(), playerSpawnLocation.getZ());
			
		}

		return new ActionResult<ItemStack>(EnumActionResult.PASS, playerIn.getHeldItem(handIn));
	}
	

}
