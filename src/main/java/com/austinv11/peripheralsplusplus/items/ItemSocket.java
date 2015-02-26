package com.austinv11.peripheralsplusplus.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemSocket extends ItemPPP {

	public ItemSocket() {
		super();
		this.setUnlocalizedName("socket");
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack item, EntityPlayer player, List info, boolean isShiftHeld) {
		info.add("[WIP] This item may produce unexpected results!");
	}
}
