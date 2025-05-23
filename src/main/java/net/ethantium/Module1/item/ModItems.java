package net.ethantium.Module1.item;

import net.ethantium.Module1.Module1;
import net.ethantium.Module1.item.custom.ChainsawItem;
import net.ethantium.Module1.item.custom.FuelItem;
import net.ethantium.Module1.item.custom.MagicOnionItem;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModItems {

    // create deferred register to hold items
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Module1.MOD_ID);

    // create azurite item
    public static final RegistryObject<Item> AZURITE = ITEMS.register("azurite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_AZURITE = ITEMS.register("raw_azurite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHAINSAW = ITEMS.register("chainsaw",
            () -> new ChainsawItem(new Item.Properties().durability(150000)));

    public static final RegistryObject<Item> ONION = ITEMS.register("onion",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ONION)) {
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    pTooltipComponents.add(Component.translatable("tooltip.module1.onion.tooltip.1"));

                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });

    public static final RegistryObject<Item> MAGIC_ONION = ITEMS.register("magic_onion",
            () -> new MagicOnionItem(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    pTooltipComponents.add(Component.translatable("tooltip.module1.magic_onion.tooltip.1"));

                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });

    public static final RegistryObject<Item> AURORA_ASHES = ITEMS.register("aurora_ashes",
            () -> new FuelItem(new Item.Properties(), 10));

    // create register method
    public static void register(IEventBus eventBus) {

        ITEMS.register(eventBus);
    }

}
