//package flurcie.fevo.mixin;

//import net.minecraft.client.resource.SplashTextResourceSupplier;
import net.minecraft.util.Identifier;
import org.objectweb.asm.Opcodes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.util.Calendar;
import java.util.Date;

//Replaces the call for the vanilla list of splash texts with our custom one.

//@Mixin (SplashTextResourceSupplier.class)
//public abstract class FoodComponentsMixin {

//  @Redirect(
//          method = "prepare(Lnet/minecraft/resource/ResourceManager;Lnet/minecraft/util/profiler/Profiler;)Ljava/util/List;",
//          at = @At(
//                  value = "FIELD",
//                  target = "Lnet/minecraft/client/resource/SplashTextResourceSupplier;RESOURCE_ID:Lnet/minecraft/util/Identifier;",
//                  opcode = Opcodes.GETSTATIC
//          )
//  )
//  private Identifier redirectResourceId() {
//      Calendar calendar = Calendar.getInstance();
//      calendar.setTime(new Date());
//
//      // Checks if it's my birthday
//      if (calendar.get(Calendar.MONTH) == Calendar.JULY && calendar.get(Calendar.DAY_OF_MONTH) == 9) {
//          System.out.println("Happy Birthday to Mum!");
//          return Identifier.of("fevo:splashtext/birthdaysplash.txt");
//      }
//
//      // If it's not my birthday :(
//      return Identifier.of("fevo:splashtext/splashes.txt");
//  }
//}
//Thank you to Grok, the Ogre AI, who made my twenty-hour time commitment useless, helping me do this mixin in five minutes.