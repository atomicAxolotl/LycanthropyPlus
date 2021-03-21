package com.atomicaxolotl.lycanthropy.client.model;
// Made with Blockbench 3.8.2
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


import com.atomicaxolotl.lycanthropy.entities.FaoladhMobEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class FaoladhModel extends EntityModel<FaoladhMobEntity> {
	private final ModelRenderer head;
	private final ModelRenderer ear1;
	private final ModelRenderer ear2;
	private final ModelRenderer snout;
	private final ModelRenderer nosebridge;
	private final ModelRenderer torso;
	private final ModelRenderer body2;
	private final ModelRenderer body1;
	private final ModelRenderer leg;
	private final ModelRenderer foot;
	private final ModelRenderer shin;
	private final ModelRenderer thigh1;
	private final ModelRenderer leg2;
	private final ModelRenderer foot2;
	private final ModelRenderer shin2;
	private final ModelRenderer thigh2;
	private final ModelRenderer arm1;
	private final ModelRenderer shoulder;
	private final ModelRenderer forearm1;
	private final ModelRenderer pawhand;
	private final ModelRenderer arm2;
	private final ModelRenderer shoulder2;
	private final ModelRenderer forearm2;
	private final ModelRenderer pawhand2;
	private final ModelRenderer tail;
	private final ModelRenderer tail1;
	private final ModelRenderer tail2;

	public FaoladhModel() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -4.0F, 4.0F);
		head.setTextureOffset(0, 37).addBox(-3.5F, -5.0F, -3.0F, 7.0F, 6.0F, 6.0F, 0.0F, false);

		ear1 = new ModelRenderer(this);
		ear1.setRotationPoint(3.0F, 1.0F, -1.0F);
		head.addChild(ear1);
		ear1.setTextureOffset(36, 21).addBox(-6.5F, -8.0F, -1.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		ear2 = new ModelRenderer(this);
		ear2.setRotationPoint(-2.0F, 1.0F, -1.0F);
		head.addChild(ear2);
		ear2.setTextureOffset(0, 36).addBox(3.5F, -8.0F, -1.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		snout = new ModelRenderer(this);
		snout.setRotationPoint(0.0F, 6.0F, 2.0F);
		head.addChild(snout);
		snout.setTextureOffset(53, 31).addBox(-2.0F, -7.5F, 0.5F, 4.0F, 2.0F, 3.0F, 0.0F, false);

		nosebridge = new ModelRenderer(this);
		nosebridge.setRotationPoint(0.0F, -2.0F, -0.5F);
		snout.addChild(nosebridge);
		setRotationAngle(nosebridge, -0.2182F, 0.0F, 0.0F);
		nosebridge.setTextureOffset(0, 30).addBox(-1.5F, -6.5F, -1.2164F, 3.0F, 2.0F, 4.0F, 0.0F, false);

		torso = new ModelRenderer(this);
		torso.setRotationPoint(0.0F, 6.0F, 0.0F);
		

		body2 = new ModelRenderer(this);
		body2.setRotationPoint(0.0F, 0.0F, 0.0F);
		torso.addChild(body2);
		setRotationAngle(body2, -0.1745F, 0.0F, 0.0F);
		body2.setTextureOffset(0, 16).addBox(-4.0F, -9.9088F, -3.0419F, 8.0F, 6.0F, 8.0F, 0.0F, false);

		body1 = new ModelRenderer(this);
		body1.setRotationPoint(0.0F, 4.0F, -2.0F);
		torso.addChild(body1);
		body1.setTextureOffset(25, 25).addBox(-3.5F, -9.0F, 0.0F, 7.0F, 11.0F, 7.0F, 0.0F, false);

		leg = new ModelRenderer(this);
		leg.setRotationPoint(3.0F, 12.0F, 3.0F);
		setRotationAngle(leg, 0.0F, 0.1309F, 0.0F);
		

		foot = new ModelRenderer(this);
		foot.setRotationPoint(2.3745F, 12.0F, -2.7133F);
		leg.addChild(foot);
		foot.setTextureOffset(22, 55).addBox(-3.5F, -7.0F, -0.5F, 2.0F, 6.0F, 2.0F, 0.0F, false);
		foot.setTextureOffset(53, 36).addBox(-4.0F, -2.0F, -0.5F, 3.0F, 2.0F, 3.0F, 0.0F, false);

		shin = new ModelRenderer(this);
		shin.setRotationPoint(0.3745F, 5.0F, -1.7133F);
		leg.addChild(shin);
		setRotationAngle(shin, -0.48F, 0.0F, 0.0F);
		shin.setTextureOffset(50, 0).addBox(-1.5F, -2.887F, -1.9617F, 2.0F, 4.0F, 4.0F, 0.0F, false);

		thigh1 = new ModelRenderer(this);
		thigh1.setRotationPoint(0.3745F, 2.0F, -1.7133F);
		leg.addChild(thigh1);
		setRotationAngle(thigh1, -0.1745F, 0.0F, 0.0F);
		thigh1.setTextureOffset(42, 43).addBox(-2.0F, -5.0F, -1.5F, 3.0F, 7.0F, 5.0F, 0.0F, false);

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(-3.0F, 12.0F, 3.0F);
		setRotationAngle(leg2, 0.0F, -0.1309F, 0.0F);
		

		foot2 = new ModelRenderer(this);
		foot2.setRotationPoint(-2.3745F, 12.0F, -2.7133F);
		leg2.addChild(foot2);
		foot2.setTextureOffset(0, 16).addBox(1.5F, -7.0F, -0.5F, 2.0F, 6.0F, 2.0F, 0.0F, false);
		foot2.setTextureOffset(24, 18).addBox(1.0F, -2.0F, -0.5F, 3.0F, 2.0F, 3.0F, 0.0F, false);

		shin2 = new ModelRenderer(this);
		shin2.setRotationPoint(-0.3745F, 5.0F, -1.7133F);
		leg2.addChild(shin2);
		setRotationAngle(shin2, -0.48F, 0.0F, 0.0F);
		shin2.setTextureOffset(12, 49).addBox(-0.5F, -2.887F, -1.9617F, 2.0F, 4.0F, 4.0F, 0.0F, false);

		thigh2 = new ModelRenderer(this);
		thigh2.setRotationPoint(-0.3745F, 2.0F, -1.7133F);
		leg2.addChild(thigh2);
		setRotationAngle(thigh2, -0.1745F, 0.0F, 0.0F);
		thigh2.setTextureOffset(26, 43).addBox(-1.0F, -5.0F, -1.5F, 3.0F, 7.0F, 5.0F, 0.0F, false);

		arm1 = new ModelRenderer(this);
		arm1.setRotationPoint(3.0F, -1.0F, 3.0F);
		setRotationAngle(arm1, 0.0F, 0.3927F, 0.0F);
		

		shoulder = new ModelRenderer(this);
		shoulder.setRotationPoint(0.7633F, 3.0F, -1.8373F);
		arm1.addChild(shoulder);
		setRotationAngle(shoulder, 0.0F, 0.0F, -0.3054F);
		shoulder.setTextureOffset(0, 49).addBox(-1.6993F, -3.9537F, 0.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);

		forearm1 = new ModelRenderer(this);
		forearm1.setRotationPoint(1.7633F, 9.0F, 1.1627F);
		arm1.addChild(forearm1);
		setRotationAngle(forearm1, 0.2618F, -0.0873F, 0.0F);
		forearm1.setTextureOffset(29, 0).addBox(-1.5F, -3.9659F, -1.7412F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		pawhand = new ModelRenderer(this);
		pawhand.setRotationPoint(2.7633F, 13.0F, 0.1627F);
		arm1.addChild(pawhand);
		setRotationAngle(pawhand, -0.0873F, 0.0F, 0.1309F);
		pawhand.setTextureOffset(42, 21).addBox(-2.5F, -1.0F, 0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		arm2 = new ModelRenderer(this);
		arm2.setRotationPoint(-3.0F, -1.0F, 3.0F);
		setRotationAngle(arm2, 0.0F, -0.3927F, 0.0F);
		

		shoulder2 = new ModelRenderer(this);
		shoulder2.setRotationPoint(-0.7633F, 3.0F, -1.8373F);
		arm2.addChild(shoulder2);
		setRotationAngle(shoulder2, 0.0F, 0.0F, 0.3054F);
		shoulder2.setTextureOffset(46, 21).addBox(-1.3007F, -3.9537F, 0.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);

		forearm2 = new ModelRenderer(this);
		forearm2.setRotationPoint(-1.7633F, 9.0F, 1.1627F);
		arm2.addChild(forearm2);
		setRotationAngle(forearm2, 0.2618F, 0.0873F, 0.0F);
		forearm2.setTextureOffset(0, 0).addBox(-0.5F, -3.9659F, -1.7412F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		pawhand2 = new ModelRenderer(this);
		pawhand2.setRotationPoint(-2.7633F, 13.0F, 0.1627F);
		arm2.addChild(pawhand2);
		setRotationAngle(pawhand2, -0.0873F, 0.0F, -0.1309F);
		pawhand2.setTextureOffset(0, 40).addBox(0.5F, -1.0F, 0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 11.0F, -4.0F);
		

		tail1 = new ModelRenderer(this);
		tail1.setRotationPoint(0.0F, 5.0F, 1.0F);
		tail.addChild(tail1);
		setRotationAngle(tail1, -0.2618F, 0.0F, 0.0F);
		tail1.setTextureOffset(38, 0).addBox(-1.5F, -5.0F, -0.6F, 3.0F, 8.0F, 3.0F, 0.0F, false);

		tail2 = new ModelRenderer(this);
		tail2.setRotationPoint(0.0F, 6.0F, 1.0F);
		tail.addChild(tail2);
		setRotationAngle(tail2, -0.0873F, -0.0436F, 0.0F);
		tail2.setTextureOffset(14, 30).addBox(-1.0F, 2.0F, -0.5F, 2.0F, 4.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(FaoladhMobEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		torso.render(matrixStack, buffer, packedLight, packedOverlay);
		leg.render(matrixStack, buffer, packedLight, packedOverlay);
		leg2.render(matrixStack, buffer, packedLight, packedOverlay);
		arm1.render(matrixStack, buffer, packedLight, packedOverlay);
		arm2.render(matrixStack, buffer, packedLight, packedOverlay);
		tail.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}