package ho.artisan.tetinker;

import ho.artisan.tetinker.init.TETiFluids;
import ho.artisan.tetinker.init.TETiModifiers;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod("tetinker")
public class TETinker {
    public static final String MOD_ID = "tetinker";

    public TETinker() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        TETiModifiers.MODIFIERS.register(eventBus);
        TETiFluids.FLUIDS.register(eventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}
