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
import tfcmetallum.objects.ModArmorMaterials;
import tfcmetallum.objects.ModToolMaterials;

import static net.dries007.tfc.types.DefaultMetals.*;
import static tfcmetallum.TFCMetallum.MODID;

@SuppressWarnings({"unused", "WeakerAccess"})
@Mod.EventBusSubscriber(modid = TFCMetallum.MODID)
public final class RegistryHandler
{
    //Metals
    public static final ResourceLocation ALUMINIUM = new ResourceLocation(MODID, "aluminium");
    public static final ResourceLocation ARDITE = new ResourceLocation(MODID, "ardite");
    public static final ResourceLocation CAST_IRON = new ResourceLocation(MODID, "cast_iron");
    public static final ResourceLocation COBALT = new ResourceLocation(MODID, "cobalt");
    public static final ResourceLocation CONSTANTAN = new ResourceLocation(MODID, "constantan");
    public static final ResourceLocation ELECTRUM = new ResourceLocation(MODID, "electrum");
    public static final ResourceLocation INVAR = new ResourceLocation(MODID, "invar");
    public static final ResourceLocation MANYULLIN = new ResourceLocation(MODID, "manyullin");
    public static final ResourceLocation MITHRIL = new ResourceLocation(MODID, "mithril");
    public static final ResourceLocation OSMIUM = new ResourceLocation(MODID, "osmium");
    public static final ResourceLocation TUNGSTEN = new ResourceLocation(MODID, "tungsten");
    public static final ResourceLocation URANIUM = new ResourceLocation(MODID, "uranium");

    //Ores
    public static final ResourceLocation NATIVE_MITHRIL = new ResourceLocation(MODID, "native_mithril");
    public static final ResourceLocation NATIVE_ARDITE = new ResourceLocation(MODID, "native_ardite");
    public static final ResourceLocation NATIVE_OSMIUM = new ResourceLocation(MODID, "native_osmium");
    public static final ResourceLocation BAUXITE = new ResourceLocation(MODID, "bauxite");
    public static final ResourceLocation SCHEELITE = new ResourceLocation(MODID, "scheelite");
    public static final ResourceLocation PITCHBLENDE = new ResourceLocation(MODID, "pitchblende");
    public static final ResourceLocation COBALTITE = new ResourceLocation(MODID, "cobaltite");


    @SubscribeEvent
    public static void onPreRegisterMetal(TFCRegistryEvent.RegisterPreBlock<Metal> event)
    {
        IForgeRegistry<Metal> r = event.getRegistry();
        if (ModConfig.ALLOY_ADDITIONS.constantan)
        {
            r.register(new Metal(CONSTANTAN, Metal.Tier.TIER_II, true, 0.5f, 1200, 0xFFD28874, null, null));
        }
        if (ModConfig.ALLOY_ADDITIONS.electrum)
        {
            r.register(new Metal(ELECTRUM, Metal.Tier.TIER_II, true, 0.5f, 1200, 0xFFDFB950, null, null));
        }
        if (ModConfig.METAL_ADDITIONS.castIron)
        {
            r.register(new Metal(CAST_IRON, Metal.Tier.TIER_III, true, 0.35f, 1150, 0xFF40444A, null, null));
        }
        if (ModConfig.ALLOY_ADDITIONS.invar)
        {
            r.register(new Metal(INVAR, Metal.Tier.TIER_III, true, 0.35f, 1450, 0xFF40444A, null, null));
        }
        if (ModConfig.METAL_ADDITIONS.aluminium)
        {
            r.register(new Metal(ALUMINIUM, Metal.Tier.TIER_IV, true, 0.3f, 660, 0xFFD9FBFC, ModToolMaterials.ALUMINIUM, ModArmorMaterials.ALUMINIUM));
        }
        if (ModConfig.METAL_ADDITIONS.ardite)
        {
            r.register(new Metal(ARDITE, Metal.Tier.TIER_IV, true, 0.3f, 1050, 0xFF40444A, null, null));
        }
        if (ModConfig.METAL_ADDITIONS.mithril)
        {
            r.register(new Metal(MITHRIL, Metal.Tier.TIER_IV, true, 0.22f, 1550, 0xFF8ADAF6, null, null));
        }
        if (ModConfig.METAL_ADDITIONS.cobalt)
        {
            r.register(new Metal(COBALT, Metal.Tier.TIER_VI, true, 0.3f, 1495, 0xFF6CA6E5, null, null));
        }
        if (ModConfig.ALLOY_ADDITIONS.manyullin)
        {
            r.register(new Metal(MANYULLIN, Metal.Tier.TIER_VI, true, 0.3f, 1550, 0xFF40444A, null, null));
        }
        if (ModConfig.METAL_ADDITIONS.osmium)
        {
            r.register(new Metal(OSMIUM, Metal.Tier.TIER_VI, true, 0.35f, 3025, 0xFFB8D8DE, null, null));
        }
        if (ModConfig.METAL_ADDITIONS.tungsten)
        {
            r.register(new Metal(TUNGSTEN, Metal.Tier.TIER_VI, true, 0.2f, 3400, 0xFF40444A, null, null));
        }
        if (ModConfig.METAL_ADDITIONS.uranium)
        {
            r.register(new Metal(URANIUM, Metal.Tier.TIER_VI, true, 0.35f, 1132, 0xFF7EA465, null, null));
        }
    }


    @SubscribeEvent
    public static void onPreRegisterOre(TFCRegistryEvent.RegisterPreBlock<Ore> event)
    {
        IForgeRegistry<Ore> r = event.getRegistry();
        if (ModConfig.ORE_ADDITIONS.ardite)
        {
            r.register(new Ore(NATIVE_ARDITE, ARDITE, true));
        }
        if (ModConfig.ORE_ADDITIONS.osmium)
        {
            r.register(new Ore(NATIVE_OSMIUM, OSMIUM, true));
        }
        if (ModConfig.ORE_ADDITIONS.mithril)
        {
            r.register(new Ore(NATIVE_MITHRIL, MITHRIL, true));
        }
        if (ModConfig.ORE_ADDITIONS.bauxite)
        {
            r.register(new Ore(BAUXITE, ALUMINIUM, false));
        }
        if (ModConfig.ORE_ADDITIONS.scheelite)
        {
            r.register(new Ore(SCHEELITE, TUNGSTEN, false));
        }
        if (ModConfig.ORE_ADDITIONS.pitchblende)
        {
            r.register(new Ore(PITCHBLENDE, URANIUM, false));
        }
        if (ModConfig.ORE_ADDITIONS.cobaltite)
        {
            r.register(new Ore(COBALTITE, COBALT, false));
        }
    }

    @SubscribeEvent
    public static void onRegisterAlloyRecipe(RegistryEvent.Register<AlloyRecipe> event)
    {
        IForgeRegistry<AlloyRecipe> r = event.getRegistry();
        if (ModConfig.ALLOY_ADDITIONS.constantan)
        {
            r.register(new AlloyRecipe.Builder(CONSTANTAN).add(COPPER, 0.4, 0.6).add(NICKEL, 0.4, 0.6).build());
        }
        if (ModConfig.ALLOY_ADDITIONS.electrum)
        {
            r.register(new AlloyRecipe.Builder(ELECTRUM).add(GOLD, 0.4, 0.6).add(SILVER, 0.4, 0.6).build());
        }
        if (ModConfig.ALLOY_ADDITIONS.invar)
        {
            r.register(new AlloyRecipe.Builder(INVAR).add(WROUGHT_IRON, 0.6, 0.7).add(NICKEL, 0.3, 0.4).build());
        }
        if (ModConfig.ALLOY_ADDITIONS.manyullin && ModConfig.METAL_ADDITIONS.cobalt && ModConfig.METAL_ADDITIONS.ardite)
        {
            r.register(new AlloyRecipe.Builder(MANYULLIN).add(COBALT, 0.4, 0.6).add(ARDITE, 0.4, 0.6).build());
        }
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
