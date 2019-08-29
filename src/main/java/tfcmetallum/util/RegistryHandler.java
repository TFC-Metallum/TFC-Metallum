package tfcmetallum.util;

import java.util.function.Function;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

import net.dries007.tfc.api.recipes.AlloyRecipe;
import net.dries007.tfc.api.registries.TFCRegistryEvent;
import net.dries007.tfc.api.types.Metal;
import net.dries007.tfc.api.types.Ore;
import tfcmetallum.TFCMetallum;

import static tfcmetallum.TFCMetallum.MODID;

@SuppressWarnings({"unused", "WeakerAccess"})
@Mod.EventBusSubscriber(modid = TFCMetallum.MODID)
public final class RegistryHandler
{

    public static final ResourceLocation ALUMINIUM = new ResourceLocation(MODID, "aluminium");
    public static final ResourceLocation BAUXITE = new ResourceLocation(MODID, "bauxite");

    @SubscribeEvent
    public static void onPreRegisterMetal(TFCRegistryEvent.RegisterPreBlock<Metal> event)
    {
        //todo add a config based registration
        event.getRegistry().registerAll(
                new Metal(ALUMINIUM, Metal.Tier.TIER_IV, true, 0.14f, 660, 0xFFFFFFFF, null, null)
        );
    }


    @SubscribeEvent
    public static void onPreRegisterOre(TFCRegistryEvent.RegisterPreBlock<Ore> event)
    {
        //todo add a config based registration
        event.getRegistry().registerAll(
                new Ore(BAUXITE, ALUMINIUM)
        );
    }

    @SubscribeEvent
    public static void onRegisterAlloyRecipe(RegistryEvent.Register<AlloyRecipe> event)
    {
        /* todo add alloys here, config based
        event.getRegistry().registerAll(
                new AlloyRecipe.Builder(BISMUTH_BRONZE).add(ZINC, 0.2, 0.3).add(COPPER, 0.5, 0.65).add(BISMUTH, 0.1, 0.2).build(),
                new AlloyRecipe.Builder(BLACK_BRONZE).add(COPPER, 0.5, 0.7).add(SILVER, 0.1, 0.25).add(GOLD, 0.1, 0.25).build(),
                new AlloyRecipe.Builder(BRONZE).add(COPPER, 0.88, 0.92).add(TIN, 0.08, 0.12).build(),
                new AlloyRecipe.Builder(BRASS).add(COPPER, 0.88, 0.92).add(ZINC, 0.08, 0.12).build(),
                new AlloyRecipe.Builder(ROSE_GOLD).add(COPPER, 0.15, 0.3).add(GOLD, 0.7, 0.85).build(),
                new AlloyRecipe.Builder(STERLING_SILVER).add(COPPER, 0.2, 0.4).add(SILVER, 0.6, 0.8).build(),
                new AlloyRecipe.Builder(WEAK_STEEL).add(STEEL, 0.5, 0.7).add(NICKEL, 0.15, 0.25).add(BLACK_BRONZE, 0.15, 0.25).build(),
                new AlloyRecipe.Builder(WEAK_BLUE_STEEL).add(BLACK_STEEL, 0.5, 0.55).add(STEEL, 0.2, 0.25).add(BISMUTH_BRONZE, 0.1, 0.15).add(STERLING_SILVER, 0.1, 0.15).build(),
                new AlloyRecipe.Builder(WEAK_RED_STEEL).add(BLACK_STEEL, 0.5, 0.55).add(STEEL, 0.2, 0.25).add(BRASS, 0.1, 0.15).add(ROSE_GOLD, 0.1, 0.15).build()
        );*/
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        IForgeRegistry<Block> registry = event.getRegistry();

        //todo register blocks
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
        IForgeRegistry<Item> registry = event.getRegistry();

        //todo register items
    }

    private static <T extends Block> ItemBlock createItemBlock(T block, Function<T, ItemBlock> producer)
    {
        ItemBlock itemBlock = producer.apply(block);
        //noinspection ConstantConditions
        itemBlock.setRegistryName(block.getRegistryName());
        return itemBlock;
    }
}
