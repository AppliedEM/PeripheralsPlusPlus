package com.austinv11.peripheralsplusplus.init;

import com.austinv11.peripheralsplusplus.blocks.BlockPPP;
import com.austinv11.peripheralsplusplus.blocks.BlockTest;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	public static final BlockPPP blockTest = new BlockTest();

	public static void init() {
		GameRegistry.registerBlock(blockTest, blockTest.getName());
	}
}
