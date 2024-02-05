package ho.artisan.tetinker.init;

import ho.artisan.tetinker.modifiers.PhotosynthesisModifier;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.modifiers.util.ModifierDeferredRegister;
import slimeknights.tconstruct.library.modifiers.util.StaticModifier;

import static ho.artisan.tetinker.TETinker.MOD_ID;

public class TETiModifiers {
    public static final ModifierDeferredRegister MODIFIERS = ModifierDeferredRegister.create(MOD_ID);

    public static final StaticModifier<Modifier> PHOTOSYNTHESIS = MODIFIERS.register("photosynthesis", PhotosynthesisModifier::new);
}
