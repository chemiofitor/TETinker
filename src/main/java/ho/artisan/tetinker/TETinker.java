package ho.artisan.tetinker;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;


@Mod("tetinker")
public class TETinker {
    private static final Logger LOGGER = LogUtils.getLogger();

    public TETinker() {
        MinecraftForge.EVENT_BUS.register(this);

        LOGGER.info("TETinker has setup!");
    }
}
