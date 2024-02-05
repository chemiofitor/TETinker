package ho.artisan.tetinker.init;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import slimeknights.mantle.registration.ModelFluidAttributes;
import slimeknights.mantle.registration.deferred.FluidDeferredRegister;
import slimeknights.mantle.registration.object.FluidObject;

import static ho.artisan.tetinker.TETinker.MOD_ID;

public class TETiFluids {
    public static final FluidDeferredRegister FLUIDS = new FluidDeferredRegister(MOD_ID);

    public static final FluidObject<ForgeFlowingFluid> MOLTEN_CHLORIUM =
            FLUIDS.register("molten_chlorium", hotBuilder().temperature(800), Material.LAVA, 15);

    public static final FluidObject<ForgeFlowingFluid> MOLTEN_POWERED_TIN =
            FLUIDS.register("molten_powered_tin", hotBuilder().temperature(300), Material.LAVA, 14);

    public static final FluidObject<ForgeFlowingFluid> DENSE_GLOWSTONE =
            FLUIDS.register("dense_glowstone", hotBuilder().temperature(200), Material.LAVA,  15);

    public static final FluidObject<ForgeFlowingFluid> DENSE_REDSTONE =
            FLUIDS.register("dense_redstone", hotBuilder().temperature(400), Material.LAVA,  10);

    private static FluidAttributes.Builder hotBuilder() {
        return ModelFluidAttributes.builder().density(2000).viscosity(10000).temperature(1000).sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA);
    }
}
