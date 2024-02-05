package ho.artisan.tetinker.modifiers;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.nbt.IToolStackView;

public class PhotosynthesisModifier extends Modifier {

    @Override
    public void onInventoryTick(@NotNull IToolStackView tool,
                                int level,
                                Level world,
                                @NotNull LivingEntity holder,
                                int itemSlot,
                                boolean isSelected,
                                boolean isCorrectSlot,
                                @NotNull ItemStack stack) {
        if (!world.isClientSide && holder.tickCount % 20 == 0) {
            BlockPos pos = holder.blockPosition().above();
            if (RANDOM.nextFloat() < 0.15 * level) {
                if (world.isRainingAt(pos) || (world.isDay()) && world.canSeeSky(pos)){
                    if (tool.getDamage() > 0)
                        tool.setDamage(tool.getDamage() - 1);
                }
            }
        }
    }

}
