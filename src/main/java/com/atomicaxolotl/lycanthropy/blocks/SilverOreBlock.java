package com.atomicaxolotl.lycanthropy.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class SilverOreBlock extends Block {

    public SilverOreBlock() {
        super(Properties.create(Material.ROCK)
                .hardnessAndResistance(4.0f, 5.0f)
                .sound(SoundType.STONE)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
                .setRequiresTool()

        );
    }
}
