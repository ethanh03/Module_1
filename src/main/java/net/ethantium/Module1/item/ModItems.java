package net.ethantium.Module1.item;

import net.ethantium.Module1.Module1;
import net.ethantium.Module1.item.custom.ChainsawItem;
import net.ethantium.Module1.item.custom.FuelItem;
import net.ethantium.Module1.item.custom.MagicOnionItem;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
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

    public static final RegistryObject<Item> AZURITE_SWORD = ITEMS.register("azurite_sword",
            () -> new SwordItem(ModToolTiers.AZURITE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.AZURITE, 100, 3f))));
    public static final RegistryObject<Item> AZURITE_PICKAXE = ITEMS.register("azurite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.AZURITE, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.AZURITE, 1.0F, -2.8F))));
    public static final RegistryObject<Item> AZURITE_SHOVEL = ITEMS.register("azurite_shovel",
            () -> new ShovelItem(ModToolTiers.AZURITE, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.AZURITE, 1.5F, -2.8F))));
    public static final RegistryObject<Item> AZURITE_AXE = ITEMS.register("azurite_axe",
            () -> new AxeItem(ModToolTiers.AZURITE, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.AZURITE, 6.0F, -3.2F))));
    public static final RegistryObject<Item> AZURITE_HOE = ITEMS.register("azurite_hoe",
            () -> new HoeItem(ModToolTiers.AZURITE, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.AZURITE, 0.0F, -3.0F))));

    // create register method
    public static void register(IEventBus eventBus) {

        ITEMS.register(eventBus);
    }

}
