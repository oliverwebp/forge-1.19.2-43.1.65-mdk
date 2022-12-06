package net.oliver.tutorialmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.oliver.tutorialmod.TutorialMod;
import net.oliver.tutorialmod.block.ModBlocks;
import net.oliver.tutorialmod.item.custom.EightBallItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> ZIRCON = ITEMS.register("zircon",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));
    public static final RegistryObject<Item> ELFBAR = ITEMS.register("elfbar",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB).food(ModFood.ELFBAR)));

    public static final RegistryObject<Item> EIGHT_BALL = ITEMS.register("eight_ball",
            ()-> new EightBallItem(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB).stacksTo(1)));

    public static final RegistryObject<Item> ZAZA_SEED = ITEMS.register("zaza_seed",
            ()-> new ItemNameBlockItem(ModBlocks.ZAZA_BLOCK.get(),new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));
    public static final RegistryObject<Item> ZAZA = ITEMS.register("zaza",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)
                    .food(new FoodProperties.Builder().alwaysEat().build())));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
