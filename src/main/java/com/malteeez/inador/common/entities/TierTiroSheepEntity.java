package com.malteeez.inador.common.entities;

import com.malteeez.inador.util.EntityRegister;
import com.malteeez.inador.util.ItemRegister;
import com.malteeez.inador.util.SoundRegister;
import net.minecraft.block.BlockState;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;

public class TierTiroSheepEntity extends AnimalEntity {

    public static final Ingredient TEMPTATION_ITEMS = Ingredient.fromItems(ItemRegister.TIER_TIRO_INGOT.get());
    private EatGrassGoal eatGrassGoal;
    private int grassTimer;
    private World worldIn;

    /**
     *
     * @param type - EntityType
     * @param worldIn - world the entity is in
     */

    public TierTiroSheepEntity(EntityType<? extends AnimalEntity> type, World worldIn) {
        super(type, worldIn);
        this.worldIn = worldIn;
    }

    // obfuscated func = registerAttribute();
    public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
        return MobEntity.func_233666_p_()
                .func_233815_a_(Attributes.field_233818_a_, 80.0D)
                .func_233815_a_(Attributes.field_233821_d_, 0.30D);
    }

    protected void RegisterGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(0, new SwimGoal(this));
        this.goalSelector.addGoal(1, new PanicGoal(this, 2.0D));
        this.goalSelector.addGoal(2, new BreedGoal(this, 1.0D));
        this.goalSelector.addGoal(3, new TemptGoal(this, 1.1D, TEMPTATION_ITEMS, true));
        this.goalSelector.addGoal(4, new FollowParentGoal(this, 1.1D));
        this.goalSelector.addGoal(5, this.eatGrassGoal);
        this.goalSelector.addGoal(6, new WaterAvoidingRandomWalkingGoal(this, 1.0D));
        this.goalSelector.addGoal(7, new LookAtGoal(this, PlayerEntity.class, 6.0F));
        this.goalSelector.addGoal(8, new LookRandomlyGoal(this));
    }

    @Override
    protected int getExperiencePoints(PlayerEntity player) {
        return 1 + this.world.rand.nextInt(4);
    }

    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.ENTITY_SHEEP_AMBIENT;
    }

    @Nullable
    @Override
    protected SoundEvent getDeathSound() {
        return SoundRegister.FROST_SHARD_SPAWN.get();
    }

    @Nullable
    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return SoundEvents.ENTITY_IRON_GOLEM_HURT;
    }

    @Override
    protected void playStepSound(BlockPos pos, BlockState blockIn) {
        this.playSound(SoundEvents.ENTITY_SHEEP_STEP, 0.15F, 1.8F);
    }

    @Nullable
    @Override
    public AgeableEntity createChild(AgeableEntity ageable) {
        return EntityRegister.TIRO_SHEEP.get().create(this.world);
    }

    @Override
    protected void updateAITasks() {
        this.grassTimer = this.eatGrassGoal.getEatingGrassTimer();
        super.updateAITasks();
    }

    @Override
    public void livingTick() {
        if (this.world.isRemote) {
            this.grassTimer = Math.max(0, grassTimer-1);
        }

        super.livingTick();
    }

    @OnlyIn(Dist.CLIENT)
    public void handleStatusUpdate(byte id) {
        if (id == 10) {
            grassTimer = 40;
        } else {
            super.handleStatusUpdate(id);
        }
    }

}
