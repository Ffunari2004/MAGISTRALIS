
package net.mcreator.magistralis.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class QuartzEntablatureBlock extends Block implements SimpleWaterloggedBlock {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
	public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

	public QuartzEntablatureBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(0.8f, 10f).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(WATERLOGGED, false));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return state.getFluidState().isEmpty();
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(0, 4, 0, 16, 5, 1), box(0, 14, 0, 16, 15, 1), box(15, 5, 0, 16, 14, 1), box(12, 5, 0, 14, 14, 1), box(2, 5, 0, 4, 14, 1), box(0, 5, 0, 1, 14, 1));
			case NORTH -> Shapes.or(box(0, 4, 15, 16, 5, 16), box(0, 14, 15, 16, 15, 16), box(0, 5, 15, 1, 14, 16), box(2, 5, 15, 4, 14, 16), box(12, 5, 15, 14, 14, 16), box(15, 5, 15, 16, 14, 16));
			case EAST -> Shapes.or(box(0, 4, 0, 1, 5, 16), box(0, 14, 0, 1, 15, 16), box(0, 5, 0, 1, 14, 1), box(0, 5, 2, 1, 14, 4), box(0, 5, 12, 1, 14, 14), box(0, 5, 15, 1, 14, 16));
			case WEST -> Shapes.or(box(15, 4, 0, 16, 5, 16), box(15, 14, 0, 16, 15, 16), box(15, 5, 15, 16, 14, 16), box(15, 5, 12, 16, 14, 14), box(15, 5, 2, 16, 14, 4), box(15, 5, 0, 16, 14, 1));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(FACING, WATERLOGGED);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		boolean flag = context.getLevel().getFluidState(context.getClickedPos()).getType() == Fluids.WATER;
		if (context.getClickedFace().getAxis() == Direction.Axis.Y)
			return super.getStateForPlacement(context).setValue(FACING, Direction.NORTH).setValue(WATERLOGGED, flag);
		return super.getStateForPlacement(context).setValue(FACING, context.getClickedFace()).setValue(WATERLOGGED, flag);
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public FluidState getFluidState(BlockState state) {
		return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
	}

	@Override
	public BlockState updateShape(BlockState state, Direction facing, BlockState facingState, LevelAccessor world, BlockPos currentPos, BlockPos facingPos) {
		if (state.getValue(WATERLOGGED)) {
			world.scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(world));
		}
		return super.updateShape(state, facing, facingState, world, currentPos, facingPos);
	}
}
