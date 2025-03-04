package flurcie.fevo.entity.client;

//import flurcie.fevo.entity.custom.BoarfishEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;


//public class BoarfishModel<T extends BoarfishEntity> extends EntityModel {
//  private final ModelPart head;
// private final ModelPart body_front;
// private final ModelPart body_back;
// private final ModelPart fin_left;
// private final ModelPart fin_right;
//  private final ModelPart fin_back_1;
//  private final ModelPart fin_back_2;
//   private final ModelPart tail;

//  public BoarfishModel(ModelPart root) {
//   super(root);

// this.head = root.getChild("head");
//   this.body_front = root.getChild("body_front");
//   this.body_back = root.getChild("body_back");
//   this.fin_left = root.getChild("fin_left");
//   this.fin_right = root.getChild("fin_right");
//   this.fin_back_1 = root.getChild("fin_back_1");
//   this.fin_back_2 = root.getChild("fin_back_2");
//   this.tail = root.getChild("tail");
// }

//public static TexturedModelData getTexturedModelData() {
//    ModelData modelData = new ModelData();
//     ModelPartData modelPartData = modelData.getRoot();
//      ModelPartData head = modelPartData.addChild("head", ModelPartBuilder.create().uv(22, 0).cuboid(-1.0F, -2.0F, -3.0F, 2.0F, 4.0F, 3.0F, new Dilation(0.0F))
//             .uv(2, 18).cuboid(-1.0F, 0.0F, -4.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F))
//              .uv(19, 23).cuboid(1.0F, 1.0F, -4.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
//              .uv(19, 23).cuboid(-2.0F, 1.0F, -4.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 21.5F, -8.0F));
//
//      ModelPartData body_front = modelPartData.addChild("body_front", ModelPartBuilder.create().uv(0, 0).cuboid(-1.5F, -2.5F, 0.0F, 3.0F, 5.0F, 8.0F, new Dilation(0.0F))
//              .uv(14, 14).cuboid(-1.5F, -2.5F, 8.0F, 3.0F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 21.5F, -8.0F));
//
//      ModelPartData body_back = modelPartData.addChild("body_back", ModelPartBuilder.create().uv(1, 13).cuboid(-1.0F, -2.0F, 0.0F, 2.0F, 4.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 21.5F, 0.0F));
//
//      ModelPartData fin_left = modelPartData.addChild("fin_left", ModelPartBuilder.create().uv(0, 0).cuboid(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(1.5F, 23.0F, -8.0F, 0.0F, 0.0F, 0.7854F));
//
//     ModelPartData fin_right = modelPartData.addChild("fin_right", ModelPartBuilder.create().uv(-4, 0).cuboid(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-1.5F, 23.0F, -8.0F, 0.0F, 0.0F, -0.7854F));
//
//      ModelPartData fin_back_1 = modelPartData.addChild("fin_back_1", ModelPartBuilder.create().uv(2, 1).cuboid(0.0F, 0.0F, -5.0F, 0.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 17.0F, -3.0F));
//
//     ModelPartData fin_back_2 = modelPartData.addChild("fin_back_2", ModelPartBuilder.create().uv(0, 2).cuboid(0.0F, 0.0F, -5.0F, 0.0F, 2.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 17.0F, -1.0F));
//
//     ModelPartData tail = modelPartData.addChild("tail", ModelPartBuilder.create().uv(20, 10).cuboid(0.0F, -2.5F, 0.0F, 0.0F, 5.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 21.5F, 8.0F));
        //       return TexturedModelData.of(modelData, 32, 32);
//   }
//   @Override
//  public void setAngles(BoarfishEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
//  }
//   @Override
//  public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color) {
//      head.render(matrices, vertexConsumer, light, overlay, color);
//        body_front.render(matrices, vertexConsumer, light, overlay, color);
//      body_back.render(matrices, vertexConsumer, light, overlay, color);
//       fin_left.render(matrices, vertexConsumer, light, overlay, color);
//     fin_right.render(matrices, vertexConsumer, light, overlay, color);
//      fin_back_1.render(matrices, vertexConsumer, light, overlay, color);
//      fin_back_2.render(matrices, vertexConsumer, light, overlay, color);
//      tail.render(matrices, vertexConsumer, light, overlay, color);
//}}
