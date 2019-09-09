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
    public static final ResourceLocation ANTIMONY = new ResourceLocation(MODID, "antimony");
    public static final ResourceLocation ARDITE = new ResourceLocation(MODID, "ardite");
    public static final ResourceLocation COBALT = new ResourceLocation(MODID, "cobalt");
    public static final ResourceLocation CONSTANTAN = new ResourceLocation(MODID, "constantan");
    public static final ResourceLocation ELECTRUM = new ResourceLocation(MODID, "electrum");
    public static final ResourceLocation INVAR = new ResourceLocation(MODID, "invar");
    //public static final ResourceLocation LEAD = new ResourceLocation(MODID, "lead");
    public static final ResourceLocation MANYULLIN = new ResourceLocation(MODID, "manyullin");
    public static final ResourceLocation MITHRIL = new ResourceLocation(MODID, "mithril");
    public static final ResourceLocation OSMIUM = new ResourceLocation(MODID, "osmium");
    //public static final ResourceLocation PLATINUM = new ResourceLocation(MODID, "platinum");
    public static final ResourceLocation TITANIUM = new ResourceLocation(MODID, "titanium");
    public static final ResourceLocation TUNGSTEN = new ResourceLocation(MODID, "tungsten");
    public static final ResourceLocation TUNGSTEN_STEEL = new ResourceLocation(MODID, "tungsten_steel");

    //Ores
    public static final ResourceLocation NATIVE_ARDITE = new ResourceLocation(MODID, "native_ardite");
    public static final ResourceLocation NATIVE_OSMIUM = new ResourceLocation(MODID, "native_osmium");
    //public static final ResourceLocation NATIVE_PLATINUM = new ResourceLocation(MODID, "native_platinum");
    public static final ResourceLocation BAUXITE = new ResourceLocation(MODID, "bauxite");
    public static final ResourceLocation WOLFRAMITE = new ResourceLocation(MODID, "wolframite");
    public static final ResourceLocation COBALTITE = new ResourceLocation(MODID, "cobaltite");
    public static final ResourceLocation STIBNITE = new ResourceLocation(MODID, "stibnite");
    //public static final ResourceLocation GALENA = new ResourceLocation(MODID, "galena");

    //Ore without TFC-M metals
    //public static final ResourceLocation PITCHBLENDE = new ResourceLocation(MODID, "pitchblende");
    public static final ResourceLocation THORIANITE = new ResourceLocation(MODID, "thorianite");
    public static final ResourceLocation CHROMITE = new ResourceLocation(MODID, "chromite");
    public static final ResourceLocation PYROLUSITE = new ResourceLocation(MODID, "pyrolusite");
    public static final ResourceLocation MAGNESITE = new ResourceLocation(MODID, "magnesite");
    public static final ResourceLocation BORON = new ResourceLocation(MODID, "boron");


    @SubscribeEvent
    public static void onPreRegisterMetal(TFCRegistryEvent.RegisterPreBlock<Metal> event)
    {
        IForgeRegistry<Metal> r = event.getRegistry();
        if (ModConfig.METAL_ADDITIONS.antimony)
        {
            r.register(new Metal(ANTIMONY, Metal.Tier.TIER_I, true, 0.25f, 630, 0xFFE7E7F5, null, null));
        }
        if (ModConfig.ALLOY_ADDITIONS.constantan)
        {
            r.register(new Metal(CONSTANTAN, Metal.Tier.TIER_II, true, 0.5f, 1200, 0xFFD28874, null, null));
        }
        if (ModConfig.ALLOY_ADDITIONS.electrum)
        {
            r.register(new Metal(ELECTRUM, Metal.Tier.TIER_II, true, 0.5f, 1200, 0xFFDFB950, null, null));
        }
        /*if (ModConfig.METAL_ADDITIONS.lead)
        {
            r.register(new Metal(LEAD, Metal.Tier.TIER_I, true, 0.25f, 630, 0xFFE7E7F5, null, null)); // todo change these values accordingly if added
        }*/
        if (ModConfig.ALLOY_ADDITIONS.mithril)
        {
            r.register(new Metal(MITHRIL, Metal.Tier.TIER_II, true, 0.35f, 940, 0xFF8ADAF6, ModToolMaterials.MITHRIL, ModArmorMaterials.MITHRIL));
        }
        if (ModConfig.ALLOY_ADDITIONS.invar)
        {
            r.register(new Metal(INVAR, Metal.Tier.TIER_III, true, 0.35f, 1450, 0xFF40444A, ModToolMaterials.INVAR, ModArmorMaterials.INVAR));
        }
        if (ModConfig.METAL_ADDITIONS.aluminium)
        {
            r.register(new Metal(ALUMINIUM, Metal.Tier.TIER_IV, true, 0.3f, 660, 0xFFD9FBFC, ModToolMaterials.ALUMINIUM, ModArmorMaterials.ALUMINIUM));
        }
        if (ModConfig.METAL_ADDITIONS.ardite)
        {
            r.register(new Metal(ARDITE, Metal.Tier.TIER_IV, true, 0.3f, 1050, 0xFF40444A, null, null));
        }
        if (ModConfig.METAL_ADDITIONS.cobalt)
        {
            r.register(new Metal(COBALT, Metal.Tier.TIER_VI, true, 0.3f, 1495, 0xFF6CA6E5, ModToolMaterials.COBALT, ModArmorMaterials.COBALT));
        }
        if (ModConfig.ALLOY_ADDITIONS.manyullin)
        {
            r.register(new Metal(MANYULLIN, Metal.Tier.TIER_VI, true, 0.3f, 1550, 0xFF40444A, ModToolMaterials.MANYULLIN, ModArmorMaterials.MANYULLIN));
        }
        if (ModConfig.METAL_ADDITIONS.osmium)
        {
            r.register(new Metal(OSMIUM, Metal.Tier.TIER_VI, true, 0.35f, 3025, 0xFFB8D8DE, ModToolMaterials.OSMIUM, ModArmorMaterials.OSMIUM));
        }
        if (ModConfig.METAL_ADDITIONS.titanium)
        {
            r.register(new Metal(TITANIUM, Metal.Tier.TIER_VI, true, 0.3f, 1700, 0xFFC2C4CC, ModToolMaterials.TITANIUM, ModArmorMaterials.TITANIUM));
        }
        if (ModConfig.METAL_ADDITIONS.tungsten)
        {
            r.register(new Metal(TUNGSTEN, Metal.Tier.TIER_VI, true, 0.2f, 3400, 0xFF40444A, ModToolMaterials.TUNGSTEN, ModArmorMaterials.TUNGSTEN));
        }
        if (ModConfig.ALLOY_ADDITIONS.tungstenSteel)
        {
            r.register(new Metal(TUNGSTEN_STEEL, Metal.Tier.TIER_VI, true, 0.2f, 3695, 0xFF565F6E, ModToolMaterials.TUNGSTEN_STEEL, ModArmorMaterials.TUNGSTEN_STEEL));
        }
    }


    @SubscribeEvent
    public static void onPreRegisterOre(TFCRegistryEvent.RegisterPreBlock<Ore> event)
    {
        IForgeRegistry<Ore> r = event.getRegistry();
        //  Ores which *could* be melted directly if it's temperature is met
        if (ModConfig.ORE_ADDITIONS.ardite)
        {
            r.register(new Ore(NATIVE_ARDITE, ARDITE, true));
        }
        if (ModConfig.ORE_ADDITIONS.osmium)
        {
            r.register(new Ore(NATIVE_OSMIUM, OSMIUM, true));
        }
        if (ModConfig.ORE_ADDITIONS.stibnite)
        {
            r.register(new Ore(STIBNITE, ANTIMONY, true));
        }
        /*if (ModConfig.ORE_ADDITIONS.platinum)
        {
            r.register(new Ore(NATIVE_PLATINUM, PLATINUM, true));
        }*/
        /*if (ModConfig.ORE_ADDITIONS.galena)
        {
            r.register(new Ore(GALENA, LEAD, true));
        }*/

        // Ores which we add tools, armor and textures inside TFC realm, but can't be melted directly (processing by other mods required)
        if (ModConfig.ORE_ADDITIONS.bauxite)
        {
            r.register(new Ore(BAUXITE, ALUMINIUM, false));
        }
        if (ModConfig.ORE_ADDITIONS.wolframite)
        {
            r.register(new Ore(WOLFRAMITE, TUNGSTEN, false));
        }
        if (ModConfig.ORE_ADDITIONS.cobaltite)
        {
            r.register(new Ore(COBALTITE, COBALT, false));
        }

        // Ores without metals registered inside TFC
        // (since they would be ingot only and needs processing machines to get, which is provided by other technical mods)
        /*if (ModConfig.ORE_ADDITIONS.pitchblende)
        {
            r.register(new Ore(PITCHBLENDE));
        }*/
        if (ModConfig.ORE_ADDITIONS.thorianite)
        {
            r.register(new Ore(THORIANITE));
        }
        if (ModConfig.ORE_ADDITIONS.chromite)
        {
            r.register(new Ore(CHROMITE));
        }
        if (ModConfig.ORE_ADDITIONS.pyrolusite)
        {
            r.register(new Ore(PYROLUSITE));
        }
        if (ModConfig.ORE_ADDITIONS.magnesite)
        {
            r.register(new Ore(MAGNESITE));
        }
        if (ModConfig.ORE_ADDITIONS.boron)
        {
            r.register(new Ore(BORON));
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
        if (ModConfig.ALLOY_ADDITIONS.mithril && ModConfig.METAL_ADDITIONS.antimony)
        {
            r.register(new AlloyRecipe.Builder(MITHRIL).add(COPPER, 0.88, 0.92).add(ANTIMONY, 0.08, 0.12).build());
        }
        if (ModConfig.ALLOY_ADDITIONS.invar)
        {
            r.register(new AlloyRecipe.Builder(INVAR).add(WROUGHT_IRON, 0.6, 0.7).add(NICKEL, 0.3, 0.4).build());
        }
        if (ModConfig.ALLOY_ADDITIONS.manyullin && ModConfig.METAL_ADDITIONS.cobalt && ModConfig.METAL_ADDITIONS.ardite)
        {
            r.register(new AlloyRecipe.Builder(MANYULLIN).add(COBALT, 0.4, 0.6).add(ARDITE, 0.4, 0.6).build());
        }
        if (ModConfig.ALLOY_ADDITIONS.tungstenSteel && ModConfig.METAL_ADDITIONS.tungsten)
        {
            r.register(new AlloyRecipe.Builder(TUNGSTEN_STEEL).add(TUNGSTEN, 0.4, 0.6).add(STEEL, 0.4, 0.6).build());
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
