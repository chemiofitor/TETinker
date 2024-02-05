package ho.artisan.tetinker;

import com.mojang.logging.LogUtils;
import ho.artisan.tetinker.init.TETiFluids;
import ho.artisan.tetinker.init.TETiModifiers;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;


@Mod("tetinker")
public class TETinker {
    public static final String MOD_ID = "tetinker";
    private static final Logger LOGGER = LogUtils.getLogger();

    public TETinker() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        TETiModifiers.MODIFIERS.register(eventBus);
        TETiFluids.FLUIDS.register(eventBus);

        MinecraftForge.EVENT_BUS.register(this);

        LOGGER.info("TETinker has setup!");
    }
}
