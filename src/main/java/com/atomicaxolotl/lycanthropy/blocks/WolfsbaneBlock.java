package com.atomicaxolotl.lycanthropy.blocks;

import net.minecraft.block.BushBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class WolfsbaneBlock extends BushBlock {

    public WolfsbaneBlock() {
        super(Properties.create(Material.PLANTS)
                .sound(SoundType.PLANT)
                .harvestTool(ToolType.SHOVEL)
                .notSolid()

        );
    }
}
