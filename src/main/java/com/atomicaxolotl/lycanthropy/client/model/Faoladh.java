package com.atomicaxolotl.lycanthropy.client.model;
// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


import com.atomicaxolotl.lycanthropy.entities.FaoladhEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;


public class Faoladh extends EntityModel<FaoladhEntity> {
	public final ModelRenderer head;
	public final ModelRenderer ear1;
	public final ModelRenderer ear2;
	public final ModelRenderer snout;
	public final ModelRenderer nosebridge;
	public final ModelRenderer torso;
	public final ModelRenderer body2;
	public final ModelRenderer body1;
	public final ModelRenderer leg;
	public final ModelRenderer foot;
	public final ModelRenderer paw;
	public final ModelRenderer shin;
	public final ModelRenderer thigh1;
	public final ModelRenderer leg2;
	public final ModelRenderer foot2;
	public final ModelRenderer paw2;
	public final ModelRenderer shin2;
	public final ModelRenderer thigh2;
	public final ModelRenderer arm1;
	public final ModelRenderer shoulder;
	public final ModelRenderer forearm1;
	public final ModelRenderer pawhand;
	public final ModelRenderer arm2;
	public final ModelRenderer shoulder2;
	public final ModelRenderer forearm2;
	public final ModelRenderer pawhand2;
	public final ModelRenderer tail;
	public final ModelRenderer tail1;
	public final ModelRenderer tail2;

	public Faoladh() {
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

		paw = new ModelRenderer(this);
		paw.setRotationPoint(-2.473F, -1.2577F, -0.2867F);
		foot.addChild(paw);
		paw.setTextureOffset(53, 36).addBox(-1.527F, -0.7423F, -0.2133F, 3.0F, 2.0F, 3.0F, 0.0F, false);

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

		paw2 = new ModelRenderer(this);
		paw2.setRotationPoint(2.473F, -1.2577F, -0.2867F);
		foot2.addChild(paw2);
		paw2.setTextureOffset(24, 18).addBox(-1.473F, -0.7423F, -0.2133F, 3.0F, 2.0F, 3.0F, 0.0F, false);

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
		forearm1.setRotationPoint(2.5287F, 6.0F, -0.6851F);
		arm1.addChild(forearm1);
		setRotationAngle(forearm1, 0.2618F, -0.0873F, 0.0F);
		forearm1.setTextureOffset(29, 0).addBox(-2.1014F, -0.5745F, -0.6752F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		pawhand = new ModelRenderer(this);
		pawhand.setRotationPoint(0.3986F, 7.3915F, 0.066F);
		forearm1.addChild(pawhand);
		setRotationAngle(pawhand, -0.0873F, 0.1309F, 0.1309F);
		pawhand.setTextureOffset(42, 21).addBox(-2.5F, -1.0F, -0.1627F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		arm2 = new ModelRenderer(this);
		arm2.setRotationPoint(-3.0F, -1.0F, 3.0F);
		setRotationAngle(arm2, 0.0F, -0.3927F, 0.0F);
		

		shoulder2 = new ModelRenderer(this);
		shoulder2.setRotationPoint(-0.7633F, 3.0F, -1.8373F);
		arm2.addChild(shoulder2);
		setRotationAngle(shoulder2, 0.0F, 0.0F, 0.3054F);
		shoulder2.setTextureOffset(46, 21).addBox(-1.3007F, -3.9537F, 0.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);

		forearm2 = new ModelRenderer(this);
		forearm2.setRotationPoint(-2.146F, 6.0F, 0.2388F);
		arm2.addChild(forearm2);
		setRotationAngle(forearm2, 0.2618F, 0.0873F, 0.0F);
		forearm2.setTextureOffset(0, 0).addBox(-0.1993F, -0.8213F, -1.5964F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		pawhand2 = new ModelRenderer(this);
		pawhand2.setRotationPoint(-0.6993F, 7.1446F, -0.8552F);
		forearm2.addChild(pawhand2);
		setRotationAngle(pawhand2, -0.0873F, -0.1309F, -0.1309F);
		pawhand2.setTextureOffset(0, 40).addBox(0.5F, -1.0F, -0.1627F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 12.0F, -1.0F);
		

		tail1 = new ModelRenderer(this);
		tail1.setRotationPoint(0.0F, 4.2696F, -2.1134F);
		tail.addChild(tail1);
		setRotationAngle(tail1, -0.2618F, 0.0F, 0.0F);
		tail1.setTextureOffset(38, 0).addBox(-1.5F, -5.0F, -0.6F, 3.0F, 8.0F, 3.0F, 0.0F, false);

		tail2 = new ModelRenderer(this);
		tail2.setRotationPoint(0.0F, 5.2696F, -2.1134F);
		tail.addChild(tail2);
		setRotationAngle(tail2, -0.0873F, -0.0436F, 0.0F);
		tail2.setTextureOffset(14, 30).addBox(-1.0F, 2.0F, -0.5F, 2.0F, 4.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(FaoladhEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
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