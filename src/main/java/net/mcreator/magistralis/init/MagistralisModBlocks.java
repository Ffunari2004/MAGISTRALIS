
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magistralis.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.magistralis.block.SmallSandstoneSmoothColumnBlock;
import net.mcreator.magistralis.block.SmallSandstoneIonicBlock;
import net.mcreator.magistralis.block.SmallSandstoneDoricBlock;
import net.mcreator.magistralis.block.SmallSandstoneCorinthianBlock;
import net.mcreator.magistralis.block.SmallSandstoneColumnBlock;
import net.mcreator.magistralis.block.SmallSandstoneBaseBlock;
import net.mcreator.magistralis.block.SmallQuartzSmoothColumnBlock;
import net.mcreator.magistralis.block.SmallQuartzIonicBlock;
import net.mcreator.magistralis.block.SmallQuartzDoricBlock;
import net.mcreator.magistralis.block.SmallQuartzCorinthianBlock;
import net.mcreator.magistralis.block.SmallQuartzColumnBlock;
import net.mcreator.magistralis.block.SmallQuartzBaseBlock;
import net.mcreator.magistralis.block.SmallGoldenQuartzIonicBlock;
import net.mcreator.magistralis.block.SmallGoldenQuartzDoricBlock;
import net.mcreator.magistralis.block.SmallGoldenQuartzCorinthianBlock;
import net.mcreator.magistralis.block.SmallGoldenQuartzBaseBlock;
import net.mcreator.magistralis.block.SandstoneSmoothColumnBlock;
import net.mcreator.magistralis.block.SandstonePillarBlock;
import net.mcreator.magistralis.block.SandstoneIonicBlock;
import net.mcreator.magistralis.block.SandstoneEntablatureBlock;
import net.mcreator.magistralis.block.SandstoneDoricBlock;
import net.mcreator.magistralis.block.SandstoneCorinthianBlock;
import net.mcreator.magistralis.block.SandstoneColumnBlock;
import net.mcreator.magistralis.block.SandstoneBaseBlock;
import net.mcreator.magistralis.block.RedEntablatureBlock;
import net.mcreator.magistralis.block.RedColumnBlock;
import net.mcreator.magistralis.block.QuartzSmoothColumnBlock;
import net.mcreator.magistralis.block.QuartzIonicBlock;
import net.mcreator.magistralis.block.QuartzEntablatureBlock;
import net.mcreator.magistralis.block.QuartzDoricBlock;
import net.mcreator.magistralis.block.QuartzCorinthianBlock;
import net.mcreator.magistralis.block.QuartzColumnBlock;
import net.mcreator.magistralis.block.QuartzBaseBlock;
import net.mcreator.magistralis.block.PolishedSandstoneBlock;
import net.mcreator.magistralis.block.GoldenQuartzIonicBlock;
import net.mcreator.magistralis.block.GoldenQuartzDoricBlock;
import net.mcreator.magistralis.block.GoldenQuartzCorinthianBlock;
import net.mcreator.magistralis.block.GoldenQuartzBaseBlock;
import net.mcreator.magistralis.block.BlueEntablatureBlock;
import net.mcreator.magistralis.block.BigSandstoneIonicCapitalBlock;
import net.mcreator.magistralis.block.BigSandstoneDoricCapitalBlock;
import net.mcreator.magistralis.block.BigSandstoneCorithianCapitalBlock;
import net.mcreator.magistralis.block.BigSandstoneBaseBlock;
import net.mcreator.magistralis.block.BigIonicCapitalBlock;
import net.mcreator.magistralis.block.BigGoldenIonicCapitalBlock;
import net.mcreator.magistralis.block.BigGoldenDoricCapitalBlock;
import net.mcreator.magistralis.block.BigGoldenCorithianCapitalBlock;
import net.mcreator.magistralis.block.BigGoldenBaseBlock;
import net.mcreator.magistralis.block.BigDoricCapitalBlock;
import net.mcreator.magistralis.block.BigCorithianCapitalBlock;
import net.mcreator.magistralis.block.BigBaseBlock;
import net.mcreator.magistralis.MagistralisMod;

public class MagistralisModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MagistralisMod.MODID);
	public static final RegistryObject<Block> QUARTZ_COLUMN = REGISTRY.register("quartz_column", () -> new QuartzColumnBlock());
	public static final RegistryObject<Block> QUARTZ_DORIC = REGISTRY.register("quartz_doric", () -> new QuartzDoricBlock());
	public static final RegistryObject<Block> QUARTZ_IONIC = REGISTRY.register("quartz_ionic", () -> new QuartzIonicBlock());
	public static final RegistryObject<Block> QUARTZ_CORINTHIAN = REGISTRY.register("quartz_corinthian", () -> new QuartzCorinthianBlock());
	public static final RegistryObject<Block> QUARTZ_BASE = REGISTRY.register("quartz_base", () -> new QuartzBaseBlock());
	public static final RegistryObject<Block> GOLDEN_QUARTZ_DORIC = REGISTRY.register("golden_quartz_doric", () -> new GoldenQuartzDoricBlock());
	public static final RegistryObject<Block> GOLDEN_QUARTZ_IONIC = REGISTRY.register("golden_quartz_ionic", () -> new GoldenQuartzIonicBlock());
	public static final RegistryObject<Block> GOLDEN_QUARTZ_CORINTHIAN = REGISTRY.register("golden_quartz_corinthian", () -> new GoldenQuartzCorinthianBlock());
	public static final RegistryObject<Block> GOLDEN_QUARTZ_BASE = REGISTRY.register("golden_quartz_base", () -> new GoldenQuartzBaseBlock());
	public static final RegistryObject<Block> RED_COLUMN = REGISTRY.register("red_column", () -> new RedColumnBlock());
	public static final RegistryObject<Block> QUARTZ_ENTABLATURE = REGISTRY.register("quartz_entablature", () -> new QuartzEntablatureBlock());
	public static final RegistryObject<Block> RED_ENTABLATURE = REGISTRY.register("red_entablature", () -> new RedEntablatureBlock());
	public static final RegistryObject<Block> BLUE_ENTABLATURE = REGISTRY.register("blue_entablature", () -> new BlueEntablatureBlock());
	public static final RegistryObject<Block> QUARTZ_SMOOTH_COLUMN = REGISTRY.register("quartz_smooth_column", () -> new QuartzSmoothColumnBlock());
	public static final RegistryObject<Block> BIG_BASE = REGISTRY.register("big_base", () -> new BigBaseBlock());
	public static final RegistryObject<Block> BIG_DORIC_CAPITAL = REGISTRY.register("big_doric_capital", () -> new BigDoricCapitalBlock());
	public static final RegistryObject<Block> BIG_GOLDEN_DORIC_CAPITAL = REGISTRY.register("big_golden_doric_capital", () -> new BigGoldenDoricCapitalBlock());
	public static final RegistryObject<Block> BIG_GOLDEN_BASE = REGISTRY.register("big_golden_base", () -> new BigGoldenBaseBlock());
	public static final RegistryObject<Block> BIG_GOLDEN_IONIC_CAPITAL = REGISTRY.register("big_golden_ionic_capital", () -> new BigGoldenIonicCapitalBlock());
	public static final RegistryObject<Block> BIG_IONIC_CAPITAL = REGISTRY.register("big_ionic_capital", () -> new BigIonicCapitalBlock());
	public static final RegistryObject<Block> BIG_CORITHIAN_CAPITAL = REGISTRY.register("big_corithian_capital", () -> new BigCorithianCapitalBlock());
	public static final RegistryObject<Block> BIG_GOLDEN_CORITHIAN_CAPITAL = REGISTRY.register("big_golden_corithian_capital", () -> new BigGoldenCorithianCapitalBlock());
	public static final RegistryObject<Block> SANDSTONE_DORIC = REGISTRY.register("sandstone_doric", () -> new SandstoneDoricBlock());
	public static final RegistryObject<Block> SANDSTONE_COLUMN = REGISTRY.register("sandstone_column", () -> new SandstoneColumnBlock());
	public static final RegistryObject<Block> SANDSTONE_IONIC = REGISTRY.register("sandstone_ionic", () -> new SandstoneIonicBlock());
	public static final RegistryObject<Block> SANDSTONE_CORINTHIAN = REGISTRY.register("sandstone_corinthian", () -> new SandstoneCorinthianBlock());
	public static final RegistryObject<Block> SANDSTONE_BASE = REGISTRY.register("sandstone_base", () -> new SandstoneBaseBlock());
	public static final RegistryObject<Block> SANDSTONE_ENTABLATURE = REGISTRY.register("sandstone_entablature", () -> new SandstoneEntablatureBlock());
	public static final RegistryObject<Block> BIG_SANDSTONE_BASE = REGISTRY.register("big_sandstone_base", () -> new BigSandstoneBaseBlock());
	public static final RegistryObject<Block> BIG_SANDSTONE_DORIC_CAPITAL = REGISTRY.register("big_sandstone_doric_capital", () -> new BigSandstoneDoricCapitalBlock());
	public static final RegistryObject<Block> BIG_SANDSTONE_IONIC_CAPITAL = REGISTRY.register("big_sandstone_ionic_capital", () -> new BigSandstoneIonicCapitalBlock());
	public static final RegistryObject<Block> BIG_SANDSTONE_CORITHIAN_CAPITAL = REGISTRY.register("big_sandstone_corithian_capital", () -> new BigSandstoneCorithianCapitalBlock());
	public static final RegistryObject<Block> SANDSTONE_PILLAR = REGISTRY.register("sandstone_pillar", () -> new SandstonePillarBlock());
	public static final RegistryObject<Block> SANDSTONE_SMOOTH_COLUMN = REGISTRY.register("sandstone_smooth_column", () -> new SandstoneSmoothColumnBlock());
	public static final RegistryObject<Block> POLISHED_SANDSTONE = REGISTRY.register("polished_sandstone", () -> new PolishedSandstoneBlock());
	public static final RegistryObject<Block> SMALL_QUARTZ_COLUMN = REGISTRY.register("small_quartz_column", () -> new SmallQuartzColumnBlock());
	public static final RegistryObject<Block> SMALL_QUARTZ_DORIC = REGISTRY.register("small_quartz_doric", () -> new SmallQuartzDoricBlock());
	public static final RegistryObject<Block> SMALL_QUARTZ_IONIC = REGISTRY.register("small_quartz_ionic", () -> new SmallQuartzIonicBlock());
	public static final RegistryObject<Block> SMALL_QUARTZ_CORINTHIAN = REGISTRY.register("small_quartz_corinthian", () -> new SmallQuartzCorinthianBlock());
	public static final RegistryObject<Block> SMALL_QUARTZ_BASE = REGISTRY.register("small_quartz_base", () -> new SmallQuartzBaseBlock());
	public static final RegistryObject<Block> SMALL_GOLDEN_QUARTZ_DORIC = REGISTRY.register("small_golden_quartz_doric", () -> new SmallGoldenQuartzDoricBlock());
	public static final RegistryObject<Block> SMALL_GOLDEN_QUARTZ_IONIC = REGISTRY.register("small_golden_quartz_ionic", () -> new SmallGoldenQuartzIonicBlock());
	public static final RegistryObject<Block> SMALL_GOLDEN_QUARTZ_CORINTHIAN = REGISTRY.register("small_golden_quartz_corinthian", () -> new SmallGoldenQuartzCorinthianBlock());
	public static final RegistryObject<Block> SMALL_GOLDEN_QUARTZ_BASE = REGISTRY.register("small_golden_quartz_base", () -> new SmallGoldenQuartzBaseBlock());
	public static final RegistryObject<Block> SMALL_QUARTZ_SMOOTH_COLUMN = REGISTRY.register("small_quartz_smooth_column", () -> new SmallQuartzSmoothColumnBlock());
	public static final RegistryObject<Block> SMALL_SANDSTONE_DORIC = REGISTRY.register("small_sandstone_doric", () -> new SmallSandstoneDoricBlock());
	public static final RegistryObject<Block> SMALL_SANDSTONE_COLUMN = REGISTRY.register("small_sandstone_column", () -> new SmallSandstoneColumnBlock());
	public static final RegistryObject<Block> SMALL_SANDSTONE_IONIC = REGISTRY.register("small_sandstone_ionic", () -> new SmallSandstoneIonicBlock());
	public static final RegistryObject<Block> SMALL_SANDSTONE_CORINTHIAN = REGISTRY.register("small_sandstone_corinthian", () -> new SmallSandstoneCorinthianBlock());
	public static final RegistryObject<Block> SMALL_SANDSTONE_BASE = REGISTRY.register("small_sandstone_base", () -> new SmallSandstoneBaseBlock());
	public static final RegistryObject<Block> SMALL_SANDSTONE_SMOOTH_COLUMN = REGISTRY.register("small_sandstone_smooth_column", () -> new SmallSandstoneSmoothColumnBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
