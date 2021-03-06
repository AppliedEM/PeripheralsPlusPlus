/*******************************************************************************
 * Copyright (c) 2011-2014 SirSengir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v3
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-3.0.txt
 *
 * Various Contributors including, but not limited to:
 * SirSengir (original work), CovertJaguar, Player, Binnie, MysteriousAges
 ******************************************************************************/
package forestry.api.core;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.ForgeDirection;

/**
 * Taken from BuildCraft 5.0.x
 */
public interface ISpecialInventory extends IInventory {

    /**
     * Offers an ItemStack for addition to the inventory.
     *
     * @param stack
     *            ItemStack offered for addition. Do not manipulate this!
     * @param doAdd
     *            If false no actual addition should take place. Implementors should simulate.
     * @param from
     *            Orientation the ItemStack is offered from.
     * @return Amount of items used from the passed stack.
     */
    int addItem(ItemStack stack, boolean doAdd, ForgeDirection from);

    /**
     * Requests items to be extracted from the inventory
     *
     * @param doRemove
     *            If false no actual extraction may occur. Implementors should simulate.
     *            Can be used to "peek" at what the result would be
     * @param from
     *            Orientation the ItemStack is requested from.
     * @param maxItemCount
     *            Maximum amount of items to extract (spread over all returned item stacks)
     * @return Array of item stacks that were/would be extracted from the inventory
     */
    ItemStack[] extractItem(boolean doRemove, ForgeDirection from, int maxItemCount);

}