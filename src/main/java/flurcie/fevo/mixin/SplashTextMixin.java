package flurcie.fevo.mixin;

import net.minecraft.client.resource.SplashTextResourceSupplier;
import net.minecraft.util.Identifier;
import org.objectweb.asm.Opcodes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;


@Mixin (SplashTextResourceSupplier.class)
public abstract class SplashTextMixin {

    @Redirect(
            method = "prepare(Lnet/minecraft/resource/ResourceManager;Lnet/minecraft/util/profiler/Profiler;)Ljava/util/List;",
            at = @At(
                    value = "FIELD",
                    target = "Lnet/minecraft/client/resource/SplashTextResourceSupplier;RESOURCE_ID:Lnet/minecraft/util/Identifier;",
                    opcode = Opcodes.GETSTATIC
            )
    )
    private Identifier redirectResourceId() {
        return Identifier.of("fevo:splashtext/splashes.txt");
    }
}
//Thank you to Grok, the Ogre AI.