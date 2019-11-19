package tfcmetallum.util;

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
import tfcmetallum.objects.ArmorMaterialsTFCM;
import tfcmetallum.objects.ToolMaterialsTFCM;

import static net.dries007.tfc.api.util.TFCConstants.MOD_ID;
import static net.dries007.tfc.types.DefaultMetals.*;

@SuppressWarnings({"unused", "WeakerAccess"})
@Mod.EventBusSubscriber(modid = TFCMetallum.MODID)
public final class RegistryHandler
{
    //Metals
    public static final ResourceLocation ALUMINIUM = new ResourceLocation(MOD_ID, "aluminium");
    public static final ResourceLocation ALUMINIUM_BRASS = new ResourceLocation(MOD_ID, "aluminium_brass");
    public static final ResourceLocation ANTIMONY = new ResourceLocation(MOD_ID, "antimony");
    public static final ResourceLocation ARDITE = new ResourceLocation(MOD_ID, "ardite");
    public static final ResourceLocation COBALT = new ResourceLocation(MOD_ID, "cobalt");
    public static final ResourceLocation CONSTANTAN = new ResourceLocation(MOD_ID, "constantan");
    public static final ResourceLocation ELECTRUM = new ResourceLocation(MOD_ID, "electrum");
    public static final ResourceLocation INVAR = new ResourceLocation(MOD_ID, "invar");
    //public static final ResourceLocation LEAD = new ResourceLocation(MOD_ID, "lead");
    public static final ResourceLocation MANYULLYN = new ResourceLocation(MOD_ID, "manyullyn");
    public static final ResourceLocation MITHRIL = new ResourceLocation(MOD_ID, "mithril");
    public static final ResourceLocation OSMIUM = new ResourceLocation(MOD_ID, "osmium");
    //public static final ResourceLocation PLATINUM = new ResourceLocation(MOD_ID, "platinum");
    public static final ResourceLocation TITANIUM = new ResourceLocation(MOD_ID, "titanium");
    public static final ResourceLocation TUNGSTEN = new ResourceLocation(MOD_ID, "tungsten");
    public static final ResourceLocation TUNGSTEN_STEEL = new ResourceLocation(MOD_ID, "tungsten_steel");

    //Ores
    public static final ResourceLocation NATIVE_ARDITE = new ResourceLocation(MOD_ID, "native_ardite");
    public static final ResourceLocation NATIVE_OSMIUM = new ResourceLocation(MOD_ID, "native_osmium");
    //public static final ResourceLocation NATIVE_PLATINUM = new ResourceLocation(MOD_ID, "native_platinum");
    public static final ResourceLocation BAUXITE = new ResourceLocation(MOD_ID, "bauxite");
    public static final ResourceLocation WOLFRAMITE = new ResourceLocation(MOD_ID, "wolframite");
    public static final ResourceLocation COBALTITE = new ResourceLocation(MOD_ID, "cobaltite");
    public static final ResourceLocation STIBNITE = new ResourceLocation(MOD_ID, "stibnite");
    //public static final ResourceLocation GALENA = new ResourceLocation(MOD_ID, "galena");

    //Ore without TFC-M metals
    //public static final ResourceLocation PITCHBLENDE = new ResourceLocation(MOD_ID, "pitchblende");
    public static final ResourceLocation THORIANITE = new ResourceLocation(MOD_ID, "thorianite");
    public static final ResourceLocation CHROMITE = new ResourceLocation(MOD_ID, "chromite");
    public static final ResourceLocation PYROLUSITE = new ResourceLocation(MOD_ID, "pyrolusite");
    public static final ResourceLocation MAGNESITE = new ResourceLocation(MOD_ID, "magnesite");
    public static final ResourceLocation BORON = new ResourceLocation(MOD_ID, "boron");


    @SubscribeEvent
    public static void onPreRegisterMetal(TFCRegistryEvent.RegisterPreBlock<Metal> event)
    {
        IForgeRegistry<Metal> r = event.getRegistry();
        r.register(new Metal(ANTIMONY, Metal.Tier.TIER_I, true, 0.25f, 630, 0xFFE7E7F5, null, null));
        r.register(new Metal(CONSTANTAN, Metal.Tier.TIER_II, true, 0.5f, 1200, 0xFFD28874, null, null));
        r.register(new Metal(ELECTRUM, Metal.Tier.TIER_II, true, 0.5f, 1200, 0xFFDFB950, null, null));
        /*if (ModConfig.METAL_ADDITIONS.lead)
        {
            r.register(new Metal(LEAD, Metal.Tier.TIER_I, true, 0.25f, 630, 0xFFE7E7F5, null, null)); // todo change these values accordingly if added
        }*/
        r.register(new Metal(MITHRIL, Metal.Tier.TIER_II, true, 0.35f, 940, 0xFF8ADAF6, ToolMaterialsTFCM.MITHRIL, ArmorMaterialsTFCM.MITHRIL));
        r.register(new Metal(INVAR, Metal.Tier.TIER_III, true, 0.35f, 1450, 0xFF40444A, ToolMaterialsTFCM.INVAR, ArmorMaterialsTFCM.INVAR));
        r.register(new Metal(ALUMINIUM, Metal.Tier.TIER_IV, true, 0.3f, 660, 0xFFD9FBFC, ToolMaterialsTFCM.ALUMINIUM, ArmorMaterialsTFCM.ALUMINIUM));
        r.register(new Metal(ALUMINIUM_BRASS, Metal.Tier.TIER_IV, true, 0.3f, 630, 0xFFDCDABE, null, null));
        r.register(new Metal(ARDITE, Metal.Tier.TIER_IV, true, 0.3f, 1050, 0xFF40444A, null, null));
        r.register(new Metal(COBALT, Metal.Tier.TIER_VI, true, 0.3f, 1495, 0xFF6CA6E5, ToolMaterialsTFCM.COBALT, ArmorMaterialsTFCM.COBALT));
        r.register(new Metal(MANYULLYN, Metal.Tier.TIER_VI, true, 0.3f, 1550, 0xFF40444A, ToolMaterialsTFCM.MANYULLYN, ArmorMaterialsTFCM.MANYULLYN));
        r.register(new Metal(OSMIUM, Metal.Tier.TIER_VI, true, 0.35f, 3025, 0xFFB8D8DE, ToolMaterialsTFCM.OSMIUM, ArmorMaterialsTFCM.OSMIUM));
        r.register(new Metal(TITANIUM, Metal.Tier.TIER_VI, true, 0.3f, 1700, 0xFFC2C4CC, ToolMaterialsTFCM.TITANIUM, ArmorMaterialsTFCM.TITANIUM));
        r.register(new Metal(TUNGSTEN, Metal.Tier.TIER_VI, true, 0.2f, 3400, 0xFF40444A, ToolMaterialsTFCM.TUNGSTEN, ArmorMaterialsTFCM.TUNGSTEN));
        r.register(new Metal(TUNGSTEN_STEEL, Metal.Tier.TIER_VI, true, 0.2f, 3695, 0xFF565F6E, ToolMaterialsTFCM.TUNGSTEN_STEEL, ArmorMaterialsTFCM.TUNGSTEN_STEEL));
    }


    @SubscribeEvent
    public static void onPreRegisterOre(TFCRegistryEvent.RegisterPreBlock<Ore> event)
    {
        IForgeRegistry<Ore> r = event.getRegistry();
        //  Ores which *could* be melted directly if it's temperature is met
        r.register(new Ore(NATIVE_ARDITE, ARDITE, true));
        r.register(new Ore(NATIVE_OSMIUM, OSMIUM, true));
        r.register(new Ore(STIBNITE, ANTIMONY, true));
        /*if (ModConfig.ORE_ADDITIONS.platinum) //todo add these if base TFC removes them
        {
            r.register(new Ore(NATIVE_PLATINUM, PLATINUM, true));
        }*/
        /*if (ModConfig.ORE_ADDITIONS.galena)
        {
            r.register(new Ore(GALENA, LEAD, true));
        }*/

        // Ores which we add tools, armor and textures inside TFC realm, but can't be melted directly (processing by other mods required)
        r.register(new Ore(BAUXITE, ALUMINIUM, false));
        r.register(new Ore(WOLFRAMITE, TUNGSTEN, false));
        r.register(new Ore(COBALTITE, COBALT, false));

        // Ores without metals registered inside TFC
        // (since they would be ingot only and needs processing machines to get, which is provided by other technical mods)
        /*if (ModConfig.ORE_ADDITIONS.pitchblende) //todo only if base TFC removes it
        {
            r.register(new Ore(PITCHBLENDE));
        }*/
        r.register(new Ore(THORIANITE));
        r.register(new Ore(CHROMITE));
        r.register(new Ore(PYROLUSITE));
        r.register(new Ore(MAGNESITE));
        r.register(new Ore(BORON));
    }

    @SubscribeEvent
    public static void onRegisterAlloyRecipe(RegistryEvent.Register<AlloyRecipe> event)
    {
        IForgeRegistry<AlloyRecipe> r = event.getRegistry();
        r.register(new AlloyRecipe.Builder(CONSTANTAN).add(COPPER, 0.4, 0.6).add(NICKEL, 0.4, 0.6).build());
        r.register(new AlloyRecipe.Builder(ELECTRUM).add(GOLD, 0.4, 0.6).add(SILVER, 0.4, 0.6).build());
        r.register(new AlloyRecipe.Builder(MITHRIL).add(COPPER, 0.88, 0.92).add(ANTIMONY, 0.08, 0.12).build());
        r.register(new AlloyRecipe.Builder(INVAR).add(WROUGHT_IRON, 0.6, 0.7).add(NICKEL, 0.3, 0.4).build());
        r.register(new AlloyRecipe.Builder(ALUMINIUM_BRASS).add(ALUMINIUM, 0.65, 0.85).add(COPPER, 0.15, 0.35).build());
        r.register(new AlloyRecipe.Builder(MANYULLYN).add(COBALT, 0.4, 0.6).add(ARDITE, 0.4, 0.6).build());
        r.register(new AlloyRecipe.Builder(TUNGSTEN_STEEL).add(TUNGSTEN, 0.02, 0.18).add(STEEL, 0.72, 0.98).build());
    }
}
