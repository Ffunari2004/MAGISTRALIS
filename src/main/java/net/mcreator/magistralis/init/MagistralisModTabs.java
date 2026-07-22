
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magistralis.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.magistralis.MagistralisMod;

public class MagistralisModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MagistralisMod.MODID);
	public static final RegistryObject<CreativeModeTab> MAGISTRALIS = REGISTRY.register("magistralis",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.magistralis.magistralis")).icon(() -> new ItemStack(MagistralisModBlocks.QUARTZ_DORIC.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MagistralisModBlocks.SMALL_QUARTZ_SMOOTH_COLUMN.get().asItem());
				tabData.accept(MagistralisModBlocks.SMALL_QUARTZ_COLUMN.get().asItem());
				tabData.accept(MagistralisModBlocks.SMALL_QUARTZ_BASE.get().asItem());
				tabData.accept(MagistralisModBlocks.SMALL_QUARTZ_DORIC.get().asItem());
				tabData.accept(MagistralisModBlocks.SMALL_QUARTZ_IONIC.get().asItem());
				tabData.accept(MagistralisModBlocks.SMALL_QUARTZ_CORINTHIAN.get().asItem());
				tabData.accept(MagistralisModBlocks.QUARTZ_SMOOTH_COLUMN.get().asItem());
				tabData.accept(MagistralisModBlocks.QUARTZ_COLUMN.get().asItem());
				tabData.accept(MagistralisModBlocks.QUARTZ_BASE.get().asItem());
				tabData.accept(MagistralisModBlocks.QUARTZ_DORIC.get().asItem());
				tabData.accept(MagistralisModBlocks.QUARTZ_IONIC.get().asItem());
				tabData.accept(MagistralisModBlocks.QUARTZ_CORINTHIAN.get().asItem());
				tabData.accept(MagistralisModBlocks.BIG_BASE.get().asItem());
				tabData.accept(MagistralisModBlocks.BIG_DORIC_CAPITAL.get().asItem());
				tabData.accept(MagistralisModBlocks.BIG_IONIC_CAPITAL.get().asItem());
				tabData.accept(MagistralisModBlocks.BIG_CORITHIAN_CAPITAL.get().asItem());
				tabData.accept(MagistralisModBlocks.GOLDEN_QUARTZ_BASE.get().asItem());
				tabData.accept(MagistralisModBlocks.GOLDEN_QUARTZ_DORIC.get().asItem());
				tabData.accept(MagistralisModBlocks.GOLDEN_QUARTZ_IONIC.get().asItem());
				tabData.accept(MagistralisModBlocks.GOLDEN_QUARTZ_CORINTHIAN.get().asItem());
				tabData.accept(MagistralisModBlocks.SMALL_GOLDEN_QUARTZ_BASE.get().asItem());
				tabData.accept(MagistralisModBlocks.SMALL_GOLDEN_QUARTZ_DORIC.get().asItem());
				tabData.accept(MagistralisModBlocks.SMALL_GOLDEN_QUARTZ_IONIC.get().asItem());
				tabData.accept(MagistralisModBlocks.SMALL_GOLDEN_QUARTZ_CORINTHIAN.get().asItem());
				tabData.accept(MagistralisModBlocks.BIG_GOLDEN_BASE.get().asItem());
				tabData.accept(MagistralisModBlocks.BIG_GOLDEN_DORIC_CAPITAL.get().asItem());
				tabData.accept(MagistralisModBlocks.BIG_GOLDEN_IONIC_CAPITAL.get().asItem());
				tabData.accept(MagistralisModBlocks.BIG_GOLDEN_CORITHIAN_CAPITAL.get().asItem());
				tabData.accept(MagistralisModBlocks.SMALL_SANDSTONE_SMOOTH_COLUMN.get().asItem());
				tabData.accept(MagistralisModBlocks.SMALL_SANDSTONE_COLUMN.get().asItem());
				tabData.accept(MagistralisModBlocks.SMALL_SANDSTONE_BASE.get().asItem());
				tabData.accept(MagistralisModBlocks.SMALL_SANDSTONE_DORIC.get().asItem());
				tabData.accept(MagistralisModBlocks.SMALL_SANDSTONE_IONIC.get().asItem());
				tabData.accept(MagistralisModBlocks.SMALL_SANDSTONE_CORINTHIAN.get().asItem());
				tabData.accept(MagistralisModBlocks.SANDSTONE_SMOOTH_COLUMN.get().asItem());
				tabData.accept(MagistralisModBlocks.SANDSTONE_COLUMN.get().asItem());
				tabData.accept(MagistralisModBlocks.SANDSTONE_DORIC.get().asItem());
				tabData.accept(MagistralisModBlocks.SANDSTONE_IONIC.get().asItem());
				tabData.accept(MagistralisModBlocks.SANDSTONE_CORINTHIAN.get().asItem());
				tabData.accept(MagistralisModBlocks.SANDSTONE_BASE.get().asItem());
				tabData.accept(MagistralisModBlocks.BIG_SANDSTONE_BASE.get().asItem());
				tabData.accept(MagistralisModBlocks.BIG_SANDSTONE_DORIC_CAPITAL.get().asItem());
				tabData.accept(MagistralisModBlocks.BIG_SANDSTONE_IONIC_CAPITAL.get().asItem());
				tabData.accept(MagistralisModBlocks.BIG_SANDSTONE_CORITHIAN_CAPITAL.get().asItem());
				tabData.accept(MagistralisModBlocks.RED_COLUMN.get().asItem());
				tabData.accept(MagistralisModBlocks.QUARTZ_ENTABLATURE.get().asItem());
				tabData.accept(MagistralisModBlocks.SANDSTONE_ENTABLATURE.get().asItem());
				tabData.accept(MagistralisModBlocks.RED_ENTABLATURE.get().asItem());
				tabData.accept(MagistralisModBlocks.BLUE_ENTABLATURE.get().asItem());
				tabData.accept(MagistralisModBlocks.SANDSTONE_PILLAR.get().asItem());
				tabData.accept(MagistralisModBlocks.POLISHED_SANDSTONE.get().asItem());
			}).build());
}
