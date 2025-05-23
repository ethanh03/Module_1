package net.ethantium.Module1.item.custom;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;

public class MagicOnionItem extends Item {

    public MagicOnionItem(Properties pProperties) {
        super(pProperties.food(new FoodProperties.Builder()
                .nutrition(3)
                .saturationModifier(3)
                .effect(new MobEffectInstance(MobEffects.LEVITATION, 300), 1)
                .usingConvertsTo(Blocks.DIAMOND_BLOCK)
                .alwaysEdible()
                .build()));
    }

    @Override
    public ItemStack finishUsingItem(ItemStack pStack, Level pLevel, LivingEntity pLivingEntity) {
        pLevel.playSound(pLivingEntity, pLivingEntity.blockPosition(), SoundEvents.LIGHTNING_BOLT_THUNDER, SoundSource.BLOCKS, 5f, 1f);

        return super.finishUsingItem(pStack, pLevel, pLivingEntity);
    }
}
