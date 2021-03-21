package com.atomicaxolotl.lycanthropy.blocks;

import com.atomicaxolotl.lycanthropy.setup.ModSetup;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem {

    public BlockItemBase(Block block) {
        super(block, new Item.Properties().group(ModSetup.ITEM_GROUP));
    }
}
