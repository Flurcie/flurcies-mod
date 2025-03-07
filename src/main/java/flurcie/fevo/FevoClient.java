package flurcie.fevo;

//import flurcie.fevo.entity.ModEntities;
//import flurcie.fevo.entity.client.BoarfishModel;
//import flurcie.fevo.entity.client.BoarfishRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class FevoClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        //EntityRendererRegistry.register(ModEntities.BOARFISH, BoarfishRenderer::new);
        //EntityModelLayerRegistry.registerModelLayer(BoarfishModel.LAYER, BoarfishModel::getTexturedModelData);
    }
}