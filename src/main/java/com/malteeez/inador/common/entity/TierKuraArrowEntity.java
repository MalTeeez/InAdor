package com.malteeez.inador.common.entity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.particle.IParticleRenderType;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class TierKuraArrowEntity extends ArrowEntity {

    private int ticksInGround;
    protected Particle arrowParticle;
    ClientWorld world;

    Vector3d vec = this.getMotion();
    double[] arr = new double[] {this.getPosX(), this.getPosY(), this.getPosZ(), vec.x, vec.y, vec.z};

    public TierKuraArrowEntity(EntityType<? extends ArrowEntity> type, World worldIn) {
        super(type, worldIn);
        this.world = (ClientWorld) worldIn;
        this.arrowParticle = particleGen(this.world);
    }

    public AbstractArrowEntity createArrow(World worldIn, ItemStack stack, LivingEntity shooter) {
        TierKuraArrowEntity arrowentity = new TierKuraArrowEntity(worldIn, shooter);
        arrowentity.setPotionEffect(stack);
        return arrowentity;
    }



    public TierKuraArrowEntity(World worldIn, LivingEntity shooter) {
        super(worldIn, shooter);
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void shoot(double x, double y, double z, float velocity, float inaccuracy) {
        super.shoot(x, y, z, velocity, inaccuracy);
        this.ticksInGround = 0;
    }

    @Override
    protected ItemStack getArrowStack() {
        return null;
    }

    private Particle particleGen(ClientWorld world) {
        Particle p = new Particle(world, arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]) {
            // todo wtf?
            @Override
            public void renderParticle(IVertexBuilder buffer, ActiveRenderInfo renderInfo, float partialTicks) {

            }

            @Override
            public IParticleRenderType getRenderType() {
                return null;
            }
        };
        return p;
    }
}
