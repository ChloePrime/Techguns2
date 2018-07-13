package techguns.client.models.guns;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.entity.Entity;
import techguns.client.models.ModelMultipart;
import techguns.client.render.TGRenderHelper;

public class ModelTFG extends ModelMultipart {
	public ModelRenderer Glow01;
    public ModelRenderer Glow02;
    public ModelRenderer Glow03;
    public ModelRenderer Mid04;
    public ModelRenderer Mid08;
    public ModelRenderer Mid09;
    public ModelRenderer Mid10;
    public ModelRenderer Mid11;
    public ModelRenderer Mid12;
    public ModelRenderer Mid13;
    public ModelRenderer Mid14;
    public ModelRenderer Mid15;
    public ModelRenderer Mid16;
    public ModelRenderer Mid17;
    public ModelRenderer Mid18;
    public ModelRenderer Mid19;
    public ModelRenderer Mid20;
    public ModelRenderer Mid21;
    public ModelRenderer Mid06;
    public ModelRenderer Mid05;
    public ModelRenderer Mid01;
    public ModelRenderer Mid02;
    public ModelRenderer Mid07;
    public ModelRenderer Mid22;
    public ModelRenderer Stock09;
    public ModelRenderer Stock11;
    public ModelRenderer Stock16;
    public ModelRenderer Stock19;
    public ModelRenderer Stock20;
    public ModelRenderer Stock21;
    public ModelRenderer Stock26;
    public ModelRenderer Stock27;
    public ModelRenderer Stock28;
    public ModelRenderer Stock29;
    public ModelRenderer Stock30;
    public ModelRenderer Stock31;
    public ModelRenderer Stock32;
    public ModelRenderer Stock01;
    public ModelRenderer Stock02;
    public ModelRenderer Stock23;
    public ModelRenderer Stock04;
    public ModelRenderer Stock08;
    public ModelRenderer Stock07;
    public ModelRenderer Stock06;
    public ModelRenderer Stock05;
    public ModelRenderer Stock24;
    public ModelRenderer Stock25;
    public ModelRenderer Stock14;
    public ModelRenderer Stock18;
    public ModelRenderer Stock13;
    public ModelRenderer Stock10;
    public ModelRenderer Stock15;
    public ModelRenderer Stock12;
    public ModelRenderer Stock17;
    public ModelRenderer Stock22;
    public ModelRenderer Front01;
    public ModelRenderer Front02;
    public ModelRenderer Front03;
    public ModelRenderer Front04;
    public ModelRenderer Front05;
    public ModelRenderer Front06;
    public ModelRenderer Front07;
    public ModelRenderer Front08;
    public ModelRenderer Front09;
    public ModelRenderer Front10;
    public ModelRenderer Front11;
    public ModelRenderer Front12;
    public ModelRenderer Front13;
    public ModelRenderer Front14;
    public ModelRenderer Front15;
    public ModelRenderer Front16;
    public ModelRenderer Front17;
    public ModelRenderer Front18;
    public ModelRenderer Front19;
    public ModelRenderer Front20;
    public ModelRenderer Front21;
    public ModelRenderer Front22;
    public ModelRenderer Barrel01;
    public ModelRenderer Barrel02;
    public ModelRenderer Barrel03;
    public ModelRenderer Barrel04;
    public ModelRenderer Barrel05;
    public ModelRenderer Barrel06;
    public ModelRenderer L01;
    public ModelRenderer LU03;
    public ModelRenderer LU01;
    public ModelRenderer LU02;
    public ModelRenderer LL01;
    public ModelRenderer L03;
    public ModelRenderer LU04;
    public ModelRenderer LL02;
    public ModelRenderer LL03;
    public ModelRenderer LL04;
    public ModelRenderer L02;
    public ModelRenderer R03;
    public ModelRenderer RL01;
    public ModelRenderer RL02;
    public ModelRenderer RU01;
    public ModelRenderer RU02;
    public ModelRenderer RU03;
    public ModelRenderer RL03;
    public ModelRenderer RU04;
    public ModelRenderer RL05;
    public ModelRenderer R01;
    public ModelRenderer R02;
    public ModelRenderer Glow_Barrel;

    public ModelTFG() {
        this.textureWidth = 256;
        this.textureHeight = 128;
        this.Front19 = new ModelRenderer(this, 130, 10);
        this.Front19.setRotationPoint(36.0F, -3.0F, 7.0F);
        this.Front19.addBox(0.0F, 0.0F, 0.0F, 3, 7, 2, 0.0F);
        this.Stock11 = new ModelRenderer(this, 88, 84);
        this.Stock11.setRotationPoint(-20.0F, 5.0F, -1.5F);
        this.Stock11.addBox(0.0F, 0.0F, 0.0F, 4, 3, 5, 0.0F);
        this.Front05 = new ModelRenderer(this, 0, 10);
        this.Front05.setRotationPoint(14.0F, 6.0F, -4.5F);
        this.Front05.addBox(0.0F, 0.0F, 0.0F, 22, 6, 11, 0.0F);
        this.Stock32 = new ModelRenderer(this, 145, 69);
        this.Stock32.setRotationPoint(-13.0F, -5.0F, -1.0F);
        this.Stock32.addBox(0.0F, 0.0F, 0.0F, 12, 1, 4, 0.0F);
        this.Mid01 = new ModelRenderer(this, 122, 95);
        this.Mid01.setRotationPoint(-1.0F, 1.0F, -2.0F);
        this.Mid01.addBox(0.0F, 0.0F, 0.0F, 5, 1, 6, 0.0F);
        this.Mid07 = new ModelRenderer(this, 162, 93);
        this.Mid07.setRotationPoint(6.0F, 1.0F, -2.0F);
        this.Mid07.addBox(0.0F, 0.0F, 0.0F, 8, 13, 6, 0.0F);
        this.Mid09 = new ModelRenderer(this, 0, 88);
        this.Mid09.setRotationPoint(10.0F, -3.0F, 9.0F);
        this.Mid09.addBox(-6.0F, 0.0F, -3.0F, 6, 3, 3, 0.0F);
        this.setRotation(Mid09, 0.0F, -0.5235987755982988F, 0.0F);
        this.Stock27 = new ModelRenderer(this, 102, 58);
        this.Stock27.setRotationPoint(-21.0F, -3.0F, -2.0F);
        this.Stock27.addBox(0.0F, 0.0F, 0.0F, 6, 1, 6, 0.0F);
        this.Front14 = new ModelRenderer(this, 140, 10);
        this.Front14.setRotationPoint(36.0F, -3.0F, -7.0F);
        this.Front14.addBox(0.0F, 0.0F, 0.0F, 3, 7, 2, 0.0F);
        this.RU04 = new ModelRenderer(this, 134, 50);
        this.RU04.setRotationPoint(32.0F, -2.5F, -10.0F);
        this.RU04.addBox(0.0F, 0.0F, 0.0F, 4, 2, 2, 0.0F);
        this.Barrel05 = new ModelRenderer(this, 191, 25);
        this.Barrel05.setRotationPoint(14.0F, -4.5F, -0.5F);
        this.Barrel05.addBox(0.0F, 0.0F, 0.0F, 23, 1, 3, 0.0F);
        this.Mid22 = new ModelRenderer(this, 127, 102);
        this.Mid22.setRotationPoint(5.0F, 11.0F, -2.0F);
        this.Mid22.addBox(0.0F, 0.0F, 0.0F, 1, 3, 6, 0.0F);
        this.L01 = new ModelRenderer(this, 139, 44);
        this.L01.setRotationPoint(35.0F, -1.5F, 8.0F);
        this.L01.addBox(0.0F, 0.0F, 0.0F, 1, 4, 2, 0.0F);
        this.Front04 = new ModelRenderer(this, 0, 27);
        this.Front04.setRotationPoint(14.0F, 12.0F, -2.5F);
        this.Front04.addBox(0.0F, 0.0F, 0.0F, 22, 3, 7, 0.0F);
        this.Stock08 = new ModelRenderer(this, 211, 111);
        this.Stock08.setRotationPoint(-3.0F, 5.0F, 0.0F);
        this.Stock08.addBox(0.0F, 0.0F, 0.0F, 3, 0, 2, 0.0F);
        this.Stock10 = new ModelRenderer(this, 154, 112);
        this.Stock10.setRotationPoint(-11.0F, 1.0F, -0.5F);
        this.Stock10.addBox(0.0F, 0.0F, 0.0F, 8, 1, 3, 0.0F);
        this.Barrel04 = new ModelRenderer(this, 191, 16);
        this.Barrel04.setRotationPoint(14.0F, -3.0F, -2.5F);
        this.Barrel04.addBox(0.0F, 0.0F, 0.0F, 25, 8, 1, 0.0F);
        this.Stock18 = new ModelRenderer(this, 176, 114);
        this.Stock18.setRotationPoint(-16.0F, 5.0F, -0.5F);
        this.Stock18.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
        this.Mid15 = new ModelRenderer(this, 39, 68);
        this.Mid15.setRotationPoint(-1.0F, -4.0F, -3.0F);
        this.Mid15.addBox(0.0F, 0.0F, 0.0F, 10, 1, 2, 0.0F);
        this.Stock22 = new ModelRenderer(this, 133, 112);
        this.Stock22.setRotationPoint(-3.0F, 0.0F, -2.0F);
        this.Stock22.addBox(0.0F, 0.0F, 0.0F, 2, 2, 6, 0.0F);
        this.Front21 = new ModelRenderer(this, 84, 7);
        this.Front21.setRotationPoint(20.0F, 3.0F, 8.0F);
        this.Front21.addBox(0.0F, 0.0F, 0.0F, 16, 1, 1, 0.0F);
        this.RL05 = new ModelRenderer(this, 146, 53);
        this.RL05.setRotationPoint(24.0F, 2.5F, -10.0F);
        this.RL05.addBox(0.0F, 0.0F, 0.0F, 8, 1, 2, 0.0F);
        this.Stock29 = new ModelRenderer(this, 122, 62);
        this.Stock29.setRotationPoint(-15.0F, -3.0F, -2.5F);
        this.Stock29.addBox(0.0F, 0.0F, 0.0F, 6, 3, 7, 0.0F);
        this.Front15 = new ModelRenderer(this, 84, 9);
        this.Front15.setRotationPoint(14.0F, -3.0F, 5.0F);
        this.Front15.addBox(0.0F, 0.0F, 0.0F, 6, 7, 4, 0.0F);
        this.Front06 = new ModelRenderer(this, 60, 21);
        this.Front06.setRotationPoint(36.0F, 6.5F, -2.5F);
        this.Front06.addBox(0.0F, 0.0F, 0.0F, 2, 6, 7, 0.0F);
        this.RL03 = new ModelRenderer(this, 134, 54);
        this.RL03.setRotationPoint(32.0F, 1.5F, -10.0F);
        this.RL03.addBox(0.0F, 0.0F, 0.0F, 4, 2, 2, 0.0F);
        this.LU01 = new ModelRenderer(this, 122, 50);
        this.LU01.setRotationPoint(20.0F, -2.5F, 10.0F);
        this.LU01.addBox(0.0F, 0.0F, 0.0F, 4, 2, 2, 0.0F);
        this.RU02 = new ModelRenderer(this, 146, 53);
        this.RU02.setRotationPoint(24.0F, -2.5F, -10.0F);
        this.RU02.addBox(0.0F, 0.0F, 0.0F, 8, 1, 2, 0.0F);
        this.R01 = new ModelRenderer(this, 139, 44);
        this.R01.setRotationPoint(35.0F, -1.5F, -8.0F);
        this.R01.addBox(0.0F, 0.0F, 0.0F, 1, 4, 2, 0.0F);
        this.Mid20 = new ModelRenderer(this, 23, 47);
        this.Mid20.setRotationPoint(11.0F, -4.0F, -6.0F);
        this.Mid20.addBox(0.0F, 0.0F, 0.0F, 3, 2, 5, 0.0F);
        this.setRotation(Mid20, 0.2617993877991494F, 0.0F, 0.0F);
        this.Barrel01 = new ModelRenderer(this, 191, 1);
        this.Barrel01.setRotationPoint(14.0F, -4.0F, -1.5F);
        this.Barrel01.addBox(0.0F, 0.0F, 0.0F, 25, 10, 5, 0.0F);
        this.Front17 = new ModelRenderer(this, 122, 9);
        this.Front17.setRotationPoint(36.0F, -3.0F, 5.0F);
        this.Front17.addBox(0.0F, 0.0F, 0.0F, 2, 8, 2, 0.0F);
        this.R02 = new ModelRenderer(this, 139, 44);
        this.R02.setRotationPoint(20.0F, -1.5F, -8.0F);
        this.R02.addBox(0.0F, 0.0F, 0.0F, 1, 4, 2, 0.0F);
        this.Front02 = new ModelRenderer(this, 21, 42);
        this.Front02.setRotationPoint(14.0F, 12.0F, 6.5F);
        this.Front02.addBox(0.0F, 0.0F, -2.0F, 22, 3, 2, 0.0F);
        this.setRotation(Front02, -0.7853981633974483F, 0.0F, 0.0F);
        this.Stock07 = new ModelRenderer(this, 217, 111);
        this.Stock07.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.Stock07.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        this.LL04 = new ModelRenderer(this, 146, 53);
        this.LL04.setRotationPoint(24.0F, 2.5F, 10.0F);
        this.LL04.addBox(0.0F, 0.0F, 0.0F, 8, 1, 2, 0.0F);
        this.Stock20 = new ModelRenderer(this, 105, 76);
        this.Stock20.setRotationPoint(-20.0F, 2.0F, -1.5F);
        this.Stock20.addBox(0.0F, 0.0F, 0.0F, 6, 3, 5, 0.0F);
        this.Front10 = new ModelRenderer(this, 84, 36);
        this.Front10.setRotationPoint(14.0F, 4.0F, 9.0F);
        this.Front10.addBox(0.0F, 0.0F, -2.0F, 25, 4, 2, 0.0F);
        this.setRotation(Front10, -0.7853981633974483F, 0.0F, 0.0F);
        this.Stock30 = new ModelRenderer(this, 142, 57);
        this.Stock30.setRotationPoint(-9.0F, -3.0F, -3.0F);
        this.Stock30.addBox(0.0F, 0.0F, 0.0F, 8, 3, 8, 0.0F);
        this.Stock17 = new ModelRenderer(this, 178, 120);
        this.Stock17.setRotationPoint(-21.0F, 2.0F, -1.0F);
        this.Stock17.addBox(0.0F, 0.0F, 0.0F, 1, 4, 4, 0.0F);
        this.Mid04 = new ModelRenderer(this, 0, 78);
        this.Mid04.setRotationPoint(-1.0F, 0.0F, -3.0F);
        this.Mid04.addBox(0.0F, 0.0F, 0.0F, 10, 1, 8, 0.0F);
        this.Front07 = new ModelRenderer(this, 55, 14);
        this.Front07.setRotationPoint(36.0F, 5.0F, 4.0F);
        this.Front07.addBox(0.0F, 0.0F, 0.0F, 1, 5, 2, 0.0F);
        this.LL01 = new ModelRenderer(this, 122, 54);
        this.LL01.setRotationPoint(20.0F, 1.5F, 10.0F);
        this.LL01.addBox(0.0F, 0.0F, 0.0F, 4, 2, 2, 0.0F);
        this.Mid05 = new ModelRenderer(this, 203, 97);
        this.Mid05.setRotationPoint(3.0F, 6.0F, -0.5F);
        this.Mid05.addBox(0.0F, 0.0F, 0.0F, 3, 5, 3, 0.0F);
        this.Stock12 = new ModelRenderer(this, 144, 111);
        this.Stock12.setRotationPoint(-21.0F, 6.0F, -0.5F);
        this.Stock12.addBox(0.0F, 0.0F, 0.0F, 1, 3, 3, 0.0F);
        this.Front22 = new ModelRenderer(this, 84, 7);
        this.Front22.setRotationPoint(20.0F, 3.0F, -7.0F);
        this.Front22.addBox(0.0F, 0.0F, 0.0F, 16, 1, 1, 0.0F);
        this.Front18 = new ModelRenderer(this, 122, 9);
        this.Front18.setRotationPoint(36.0F, -3.0F, -5.0F);
        this.Front18.addBox(0.0F, 0.0F, 0.0F, 2, 8, 2, 0.0F);
        this.Stock13 = new ModelRenderer(this, 149, 121);
        this.Stock13.setRotationPoint(-14.0F, 1.0F, -0.5F);
        this.Stock13.addBox(0.0F, 0.0F, 0.0F, 3, 4, 3, 0.0F);
        this.Barrel03 = new ModelRenderer(this, 243, 16);
        this.Barrel03.setRotationPoint(36.0F, 6.0F, -0.5F);
        this.Barrel03.addBox(0.0F, 0.0F, 0.0F, 3, 1, 3, 0.0F);
        this.LU04 = new ModelRenderer(this, 134, 50);
        this.LU04.setRotationPoint(32.0F, -2.5F, 10.0F);
        this.LU04.addBox(0.0F, 0.0F, 0.0F, 4, 2, 2, 0.0F);
        this.Stock06 = new ModelRenderer(this, 201, 112);
        this.Stock06.setRotationPoint(-3.0F, 2.0F, 0.0F);
        this.Stock06.addBox(0.0F, 0.0F, 0.0F, 5, 1, 2, 0.0F);
        this.R03 = new ModelRenderer(this, 146, 44);
        this.R03.setRotationPoint(21.0F, -1.5F, -9.5F);
        this.R03.addBox(0.0F, 0.0F, 0.0F, 14, 4, 3, 0.0F);
        this.LU02 = new ModelRenderer(this, 146, 53);
        this.LU02.setRotationPoint(24.0F, -2.5F, 10.0F);
        this.LU02.addBox(0.0F, 0.0F, 0.0F, 8, 1, 2, 0.0F);
        this.RU01 = new ModelRenderer(this, 122, 50);
        this.RU01.setRotationPoint(20.0F, -2.5F, -10.0F);
        this.RU01.addBox(0.0F, 0.0F, 0.0F, 4, 2, 2, 0.0F);
        this.Front03 = new ModelRenderer(this, 20, 37);
        this.Front03.setRotationPoint(14.0F, 12.0F, -4.5F);
        this.Front03.addBox(0.0F, 0.0F, 0.0F, 22, 3, 2, 0.0F);
        this.setRotation(Front03, 0.7853981633974483F, 0.0F, 0.0F);
        this.Front20 = new ModelRenderer(this, 84, 4);
        this.Front20.setRotationPoint(20.0F, -3.0F, 7.0F);
        this.Front20.addBox(0.0F, 0.0F, 0.0F, 16, 1, 2, 0.0F);
        this.Glow02 = new ModelRenderer(this, 1, 108);
        this.Glow02.setRotationPoint(14.0F, -2.0F, -6.5F);
        this.Glow02.addBox(0.0F, 0.0F, 0.0F, 22, 5, 15, 0.0F);
        this.Front12 = new ModelRenderer(this, 84, 25);
        this.Front12.setRotationPoint(14.0F, -4.0F, -6.0F);
        this.Front12.addBox(0.0F, 0.0F, 0.0F, 25, 2, 3, 0.0F);
        this.setRotation(Front12, 0.2617993877991494F, 0.0F, 0.0F);
        this.L03 = new ModelRenderer(this, 146, 44);
        this.L03.setRotationPoint(21.0F, -1.5F, 8.5F);
        this.L03.addBox(0.0F, 0.0F, 0.0F, 14, 4, 3, 0.0F);
        this.Mid21 = new ModelRenderer(this, 23, 47);
        this.Mid21.setRotationPoint(11.0F, -4.0F, 8.0F);
        this.Mid21.addBox(0.0F, 0.0F, -5.0F, 3, 2, 5, 0.0F);
        this.setRotation(Mid21, -0.2617993877991494F, 0.0F, 0.0F);
        this.Stock14 = new ModelRenderer(this, 161, 122);
        this.Stock14.setRotationPoint(-11.0F, 5.0F, -0.5F);
        this.Stock14.addBox(-2.0F, 0.0F, 0.0F, 2, 3, 3, 0.0F);
        this.setRotation(Stock14, 0.0F, 0.0F, 0.7853981633974483F);
        this.Stock02 = new ModelRenderer(this, 191, 120);
        this.Stock02.setRotationPoint(-10.0F, 2.0F, 0.0F);
        this.Stock02.addBox(0.0F, 0.0F, 0.0F, 4, 1, 2, 0.0F);
        this.Stock31 = new ModelRenderer(this, 138, 75);
        this.Stock31.setRotationPoint(-15.0F, -4.0F, -2.0F);
        this.Stock31.addBox(0.0F, 0.0F, 0.0F, 14, 1, 6, 0.0F);
        this.Glow01 = new ModelRenderer(this, 0, 102);
        this.Glow01.setRotationPoint(-1.0F, -2.7F, 1.0F);
        this.Glow01.addBox(0.0F, -1.5F, -1.5F, 10, 3, 3, 0.0F);
        this.setRotation(Glow01, 0.7853981633974483F, 0.0F, 0.0F);
        this.L02 = new ModelRenderer(this, 139, 44);
        this.L02.setRotationPoint(20.0F, -1.5F, 8.0F);
        this.L02.addBox(0.0F, 0.0F, 0.0F, 1, 4, 2, 0.0F);
        this.Mid19 = new ModelRenderer(this, 51, 64);
        this.Mid19.setRotationPoint(-1.0F, -4.0F, 3.0F);
        this.Mid19.addBox(0.0F, 0.0F, 0.0F, 10, 1, 2, 0.0F);
        this.LL02 = new ModelRenderer(this, 134, 54);
        this.LL02.setRotationPoint(32.0F, 1.5F, 10.0F);
        this.LL02.addBox(0.0F, 0.0F, 0.0F, 4, 2, 2, 0.0F);
        this.Stock16 = new ModelRenderer(this, 40, 73);
        this.Stock16.setRotationPoint(-15.0F, 0.0F, -1.5F);
        this.Stock16.addBox(0.0F, 0.0F, 0.0F, 12, 1, 5, 0.0F);
        this.Mid06 = new ModelRenderer(this, 192, 103);
        this.Mid06.setRotationPoint(2.0F, 2.0F, -0.5F);
        this.Mid06.addBox(0.0F, 0.0F, 0.0F, 4, 4, 3, 0.0F);
        this.Mid16 = new ModelRenderer(this, 59, 64);
        this.Mid16.setRotationPoint(10.0F, -3.0F, -7.0F);
        this.Mid16.addBox(0.0F, 0.0F, 0.0F, 4, 3, 16, 0.0F);
        this.Stock26 = new ModelRenderer(this, 46, 81);
        this.Stock26.setRotationPoint(-16.0F, 1.0F, -1.5F);
        this.Stock26.addBox(0.0F, 0.0F, 0.0F, 2, 1, 5, 0.0F);
        this.Front01 = new ModelRenderer(this, 0, 38);
        this.Front01.setRotationPoint(38.0F, 12.5F, -2.5F);
        this.Front01.addBox(-3.0F, -2.0F, 0.0F, 3, 2, 7, 0.0F);
        this.setRotation(Front01, 0.0F, 0.0F, -0.7853981633974483F);
        this.RL02 = new ModelRenderer(this, 122, 54);
        this.RL02.setRotationPoint(20.0F, 1.5F, -10.0F);
        this.RL02.addBox(0.0F, 0.0F, 0.0F, 4, 2, 2, 0.0F);
        this.Stock21 = new ModelRenderer(this, 104, 66);
        this.Stock21.setRotationPoint(-21.0F, 1.0F, -2.5F);
        this.Stock21.addBox(0.0F, 0.0F, 0.0F, 5, 1, 7, 0.0F);
        this.Front13 = new ModelRenderer(this, 84, 20);
        this.Front13.setRotationPoint(14.0F, -4.0F, 8.0F);
        this.Front13.addBox(0.0F, 0.0F, -3.0F, 25, 2, 3, 0.0F);
        this.setRotation(Front13, -0.2617993877991494F, 0.0F, 0.0F);
        this.Barrel06 = new ModelRenderer(this, 243, 20);
        this.Barrel06.setRotationPoint(37.0F, -5.0F, -0.5F);
        this.Barrel06.addBox(0.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F);
        this.Mid02 = new ModelRenderer(this, 139, 98);
        this.Mid02.setRotationPoint(3.0F, 2.0F, -2.0F);
        this.Mid02.addBox(0.0F, -3.0F, 0.0F, 5, 3, 6, 0.0F);
        this.setRotation(Mid02, 0.0F, 0.0F, 0.7853981633974483F);
        this.Front09 = new ModelRenderer(this, 84, 9);
        this.Front09.setRotationPoint(14.0F, -3.0F, -7.0F);
        this.Front09.addBox(0.0F, 0.0F, 0.0F, 7, 7, 4, 0.0F);
        this.Stock09 = new ModelRenderer(this, 106, 85);
        this.Stock09.setRotationPoint(-14.0F, 5.0F, -1.5F);
        this.Stock09.addBox(-2.0F, 0.0F, 0.0F, 2, 3, 5, 0.0F);
        this.setRotation(Stock09, 0.0F, 0.0F, 0.7853981633974483F);
        this.Stock23 = new ModelRenderer(this, 221, 119);
        this.Stock23.setRotationPoint(-6.0F, 4.0F, 0.0F);
        this.Stock23.addBox(0.0F, 0.0F, 0.0F, 3, 6, 2, 0.0F);
        this.setRotation(Stock23, 0.0F, 0.0F, 0.3141592653589793F);
        this.Stock24 = new ModelRenderer(this, 191, 98);
        this.Stock24.setRotationPoint(-6.5F, 10.0F, -0.5F);
        this.Stock24.addBox(0.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F);
        this.Mid08 = new ModelRenderer(this, 0, 54);
        this.Mid08.setRotationPoint(9.0F, 2.0F, -4.5F);
        this.Mid08.addBox(0.0F, -4.0F, 0.0F, 8, 4, 11, 0.0F);
        this.setRotation(Mid08, 0.0F, 0.0F, 0.7853981633974483F);
        this.Mid18 = new ModelRenderer(this, 17, 72);
        this.Mid18.setRotationPoint(9.0F, -5.0F, -1.0F);
        this.Mid18.addBox(0.0F, 0.0F, 0.0F, 5, 1, 4, 0.0F);
        this.Glow03 = new ModelRenderer(this, 0, 109);
        this.Glow03.setRotationPoint(35.0F, 3.0F, -3.5F);
        this.Glow03.addBox(0.0F, 0.0F, 0.0F, 1, 3, 9, 0.0F);
        this.RU03 = new ModelRenderer(this, 146, 51);
        this.RU03.setRotationPoint(20.0F, -2.5F, -10.0F);
        this.RU03.addBox(0.0F, -1.0F, 0.0F, 16, 1, 1, 0.0F);
        this.setRotation(RU03, -1.0471975511965976F, 0.0F, 0.0F);
        this.Mid17 = new ModelRenderer(this, 83, 63);
        this.Mid17.setRotationPoint(9.0F, -4.0F, -4.5F);
        this.Mid17.addBox(0.0F, 0.0F, 0.0F, 2, 6, 11, 0.0F);
        this.Stock25 = new ModelRenderer(this, 216, 99);
        this.Stock25.setRotationPoint(-8.5F, 9.0F, -0.5F);
        this.Stock25.addBox(0.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F);
        this.Stock28 = new ModelRenderer(this, 123, 75);
        this.Stock28.setRotationPoint(-21.0F, -4.0F, -1.0F);
        this.Stock28.addBox(0.0F, 0.0F, 0.0F, 6, 1, 4, 0.0F);
        this.LL03 = new ModelRenderer(this, 146, 51);
        this.LL03.setRotationPoint(20.0F, 3.5F, 12.0F);
        this.LL03.addBox(0.0F, 0.0F, -1.0F, 16, 1, 1, 0.0F);
        this.setRotation(LL03, -1.0471975511965976F, 0.0F, 0.0F);
        this.LU03 = new ModelRenderer(this, 146, 51);
        this.LU03.setRotationPoint(20.0F, -2.5F, 12.0F);
        this.LU03.addBox(0.0F, 0.0F, -1.0F, 16, 1, 1, 0.0F);
        this.setRotation(LU03, -0.5235987755982988F, 0.0F, 0.0F);
        this.Front11 = new ModelRenderer(this, 84, 30);
        this.Front11.setRotationPoint(14.0F, 4.0F, -7.0F);
        this.Front11.addBox(0.0F, 0.0F, 0.0F, 25, 4, 2, 0.0F);
        this.setRotation(Front11, 0.7853981633974483F, 0.0F, 0.0F);
        this.Mid11 = new ModelRenderer(this, 29, 50);
        this.Mid11.setRotationPoint(-1.0F, -3.0F, -4.0F);
        this.Mid11.addBox(0.0F, 0.0F, 0.0F, 10, 3, 10, 0.0F);
        this.Mid13 = new ModelRenderer(this, 53, 47);
        this.Mid13.setRotationPoint(12.0F, 1.0F, -7.0F);
        this.Mid13.addBox(0.0F, 0.0F, 0.0F, 2, 1, 16, 0.0F);
        this.Barrel02 = new ModelRenderer(this, 191, 16);
        this.Barrel02.setRotationPoint(14.0F, -3.0F, 3.5F);
        this.Barrel02.addBox(0.0F, 0.0F, 0.0F, 25, 8, 1, 0.0F);
        this.Front16 = new ModelRenderer(this, 84, 1);
        this.Front16.setRotationPoint(20.0F, -3.0F, -7.0F);
        this.Front16.addBox(0.0F, 0.0F, 0.0F, 16, 1, 2, 0.0F);
        this.Stock04 = new ModelRenderer(this, 228, 111);
        this.Stock04.setRotationPoint(-11.0F, 2.0F, 0.0F);
        this.Stock04.addBox(0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F);
        this.RL01 = new ModelRenderer(this, 146, 51);
        this.RL01.setRotationPoint(20.0F, 3.5F, -10.0F);
        this.RL01.addBox(0.0F, -1.0F, 0.0F, 16, 1, 1, 0.0F);
        this.setRotation(RL01, -0.5235987755982988F, 0.0F, 0.0F);
        this.Mid12 = new ModelRenderer(this, 53, 47);
        this.Mid12.setRotationPoint(11.0F, 0.0F, -7.0F);
        this.Mid12.addBox(0.0F, 0.0F, 0.0F, 3, 1, 16, 0.0F);
        this.Stock15 = new ModelRenderer(this, 158, 118);
        this.Stock15.setRotationPoint(-20.0F, 8.0F, -0.5F);
        this.Stock15.addBox(0.0F, 0.0F, 0.0F, 7, 1, 3, 0.0F);
        this.Stock01 = new ModelRenderer(this, 192, 115);
        this.Stock01.setRotationPoint(-6.0F, 2.0F, 0.0F);
        this.Stock01.addBox(0.0F, 0.0F, 0.0F, 3, 3, 2, 0.0F);
        this.Mid14 = new ModelRenderer(this, 19, 88);
        this.Mid14.setRotationPoint(10.0F, -3.0F, -7.0F);
        this.Mid14.addBox(-6.0F, 0.0F, 0.0F, 6, 3, 3, 0.0F);
        this.setRotation(Mid14, 0.0F, 0.5235987755982988F, 0.0F);
        this.Stock05 = new ModelRenderer(this, 207, 105);
        this.Stock05.setRotationPoint(-8.0F, 11.0F, -0.5F);
        this.Stock05.addBox(0.0F, 0.0F, 0.0F, 13, 2, 3, 0.0F);
        this.Stock19 = new ModelRenderer(this, 61, 83);
        this.Stock19.setRotationPoint(-21.0F, -2.0F, -2.5F);
        this.Stock19.addBox(0.0F, 0.0F, 0.0F, 6, 3, 7, 0.0F);
        this.Front08 = new ModelRenderer(this, 55, 14);
        this.Front08.setRotationPoint(36.0F, 5.0F, -4.0F);
        this.Front08.addBox(0.0F, 0.0F, 0.0F, 1, 5, 2, 0.0F);
        this.Mid10 = new ModelRenderer(this, 53, 47);
        this.Mid10.setRotationPoint(13.0F, 2.0F, -7.0F);
        this.Mid10.addBox(0.0F, 0.0F, 0.0F, 1, 1, 16, 0.0F);
        this.Glow_Barrel = new ModelRenderer(this, 221, 25);
        this.Glow_Barrel.setRotationPoint(39.1F, -4.0F, -1.5F);
        this.Glow_Barrel.addBox(0.0F, 0.0F, 0.0F, 0, 10, 5, 0.0F);
    }

    @Override
    public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale, int ammoLeft, float reloadProgress,
    		TransformType transformType, int part, float fireProgress, float chargeProgress) {
        this.Front19.render(scale);
        this.Stock11.render(scale);
        this.Front05.render(scale);
        this.Stock32.render(scale);
        this.Mid01.render(scale);
        this.Mid07.render(scale);
        this.Mid09.render(scale);
        this.Stock27.render(scale);
        this.Front14.render(scale);
        this.Barrel05.render(scale);
        this.Mid22.render(scale);
        this.Front04.render(scale);
        this.Stock08.render(scale);
        this.Stock10.render(scale);
        this.Barrel04.render(scale);
        this.Stock18.render(scale);
        this.Mid15.render(scale);
        this.Stock22.render(scale);
        this.Front21.render(scale);
        this.Stock29.render(scale);
        this.Front15.render(scale);
        this.Front06.render(scale);
        this.Mid20.render(scale);
        this.Barrel01.render(scale);
        this.Front17.render(scale);       
        this.Front02.render(scale);
        this.Stock07.render(scale);     
        this.Stock20.render(scale);
        this.Front10.render(scale);
        this.Stock30.render(scale);
        this.Stock17.render(scale);
        this.Mid04.render(scale);
        this.Front07.render(scale);       
        this.Mid05.render(scale);
        this.Stock12.render(scale);
        this.Front22.render(scale);
        this.Front18.render(scale);
        this.Stock13.render(scale);
        this.Barrel03.render(scale);       
        this.Stock06.render(scale); 
        this.Front03.render(scale);
        this.Front20.render(scale);
        this.Front12.render(scale);
        this.Mid21.render(scale);
        this.Stock14.render(scale);
        this.Stock02.render(scale);
        this.Stock31.render(scale);
        this.Mid19.render(scale);
        this.Stock16.render(scale);
        this.Mid06.render(scale);
        this.Mid16.render(scale);
        this.Stock26.render(scale);
        this.Front01.render(scale);
        this.Stock21.render(scale);
        this.Front13.render(scale);
        this.Barrel06.render(scale);
        this.Mid02.render(scale);
        this.Front09.render(scale);
        this.Stock09.render(scale);
        this.Stock23.render(scale);
        this.Stock24.render(scale);
        this.Mid08.render(scale);
        this.Mid18.render(scale);
        this.Mid17.render(scale);
        this.Stock25.render(scale);
        this.Stock28.render(scale);
        this.Front11.render(scale);
        this.Mid11.render(scale);
        this.Mid13.render(scale);
        this.Barrel02.render(scale);
        this.Front16.render(scale);
        this.Stock04.render(scale);      
        this.Mid12.render(scale);
        this.Stock15.render(scale);
        this.Stock01.render(scale);
        this.Mid14.render(scale);
        this.Stock05.render(scale);
        this.Stock19.render(scale);
        this.Front08.render(scale);
        this.Mid10.render(scale);    
        
//        if (fireProgress > 0 && chargeProgress > 0.0) {
//        	chargeProgress = 1f-Math.min((1f-chargeProgress)*5.0f, 1.0f);
//        }
        
        float f1 = 1f-Math.min(0.1f, chargeProgress) * 10.0f;
        float f2 = 1f-Math.max(0.1f, Math.min(1.0f, (chargeProgress-0.1f) * 10.0f));
        
      
        
        f1*=scale;
        f2*=scale;

		//1.0 up/down, 2.0 left/right
        GlStateManager.pushMatrix();   
        GlStateManager.translate(0.0f, 0 , 2.0f * f1);       
        this.R01.render(scale);
        this.R02.render(scale);
        TGRenderHelper.enableFXLighting();
        this.R03.render(scale);
        TGRenderHelper.disableFXLighting();
        
        GlStateManager.pushMatrix();
        GlStateManager.translate(0.0f, -1.0f * f2 , 0);       
        this.RL01.render(scale);
        this.RL02.render(scale);
        this.RL03.render(scale);
        this.RL05.render(scale);
        GlStateManager.popMatrix();
        
        GlStateManager.pushMatrix();
        GlStateManager.translate(0.0f, 1.0f * f2 , 0);   
        this.RU01.render(scale);
        this.RU02.render(scale);
        this.RU03.render(scale);
        this.RU04.render(scale);
        GlStateManager.popMatrix();   
        
		GlStateManager.popMatrix();
        
		
		GlStateManager.pushMatrix();   
	    GlStateManager.translate(0.0f, 0 , -2.0f * f1);       
        this.L01.render(scale);
        this.L02.render(scale);
        TGRenderHelper.enableFXLighting();
        this.L03.render(scale);
        TGRenderHelper.disableFXLighting();
        
        GlStateManager.pushMatrix();
        GlStateManager.translate(0.0f, -1.0f * f2 , 0);       
        this.LL01.render(scale);
        this.LL02.render(scale);
        this.LL03.render(scale);
        this.LL04.render(scale);
        GlStateManager.popMatrix();
        
        GlStateManager.pushMatrix();
        GlStateManager.translate(0.0f, 1.0f * f2 , 0);           
        this.LU01.render(scale);
        this.LU02.render(scale);
        this.LU03.render(scale);
        this.LU04.render(scale);
        GlStateManager.popMatrix();
        
        GlStateManager.popMatrix();
        
        TGRenderHelper.enableFXLighting();
        this.Glow02.render(scale);
        this.Glow01.render(scale);
        this.Glow03.render(scale);
        this.Glow_Barrel.render(scale);
        TGRenderHelper.disableFXLighting();

  }
 
}
