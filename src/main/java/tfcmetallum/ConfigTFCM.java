package tfcmetallum;

import static tfcmetallum.TFCMetallum.MODID;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.RangeInt;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@SuppressWarnings("unused")
@Config(modid = MODID, category = "")
@Config.LangKey("config." + MODID)
@Mod.EventBusSubscriber(modid = MODID)
public class ConfigTFCM {
    @Config.Comment("Recipe configuration")
    @Config.LangKey("config." + MODID + ".recipes")
    public static Recipes RECIPES = new Recipes();
    
    @Config.Comment({"Configuration for melting temperatures. Values higher than around 2000 are not reachable in base TFC.",
    	"Warming starts at 1, ends at 80", 
    	"Hot starts at 80, ends at 210", 
    	"Very Hot starts at 210, ends at 480", 
    	"Faint Red starts at 480, ends at 580", 
    	"Dark Red starts at 580, ends at 730", 
    	"Bright Red starts at 730, ends at 930", 
    	"Orange starts at 930, ends at 1100", 
    	"Yellow starts at 1100, ends at 1300", 
    	"Yellow White starts at 1300, ends at 1400", 
    	"White starts at 1400, ends at 1500", 
    	"Brilliant White starts at 1500"})
    @Config.LangKey("config." + MODID + ".melt_temps")
    public static MeltTemps MELT_TEMP = new MeltTemps();
    
    @Config.Comment({"Metals configuration. Alloys will be dissabled if any of the metals included are dissabled"})
    @Config.LangKey("config." + MODID + ".metals")
    public static Metals METALS = new Metals();
    
    @Config.Comment({"Non-Metals configuration"})
    @Config.LangKey("config." + MODID + ".non-metals")
    public static NonMetals NON_METALS = new NonMetals();

    @Config.Comment({"Vein config"})
    @Config.LangKey("config." + MODID + ".veins")
    public static Veins VEINS = new Veins();

    @SubscribeEvent
    public static void onConfigChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.getModID().equals(MODID)) {
            ConfigManager.sync(MODID, Config.Type.INSTANCE);
        }
    }
    
    public static class Veins {
    	
        @Config.Comment({"Dissable this if you are doing custom vein data", "(make sure to remove the ones you no longer need)"})
        @Config.LangKey("config." + MODID + ".manage")
        @Config.RequiresMcRestart
        public boolean manage = true;
    }
    
    public static class Recipes {
    	
        @Config.Comment({"Register ardite recipe via bloomery?"})
        @Config.LangKey("config." + MODID + ".recipes.ardite")
        @Config.RequiresMcRestart
        public boolean ardite = true;

        @Config.Comment({"Register aluminium recipe via bloomery?"})
        @Config.LangKey("config." + MODID + ".recipes.aluminium")
        @Config.RequiresMcRestart
        public boolean aluminium = true;

        @Config.Comment({"Register cobalt recipe via bloomery?"})
        @Config.LangKey("config." + MODID + ".recipes.cobalt")
        @Config.RequiresMcRestart
        public boolean cobalt = true;

        @Config.Comment({"Register thorium recipe via bloomery?"})
        @Config.LangKey("config." + MODID + ".recipes.thorium")
        @Config.RequiresMcRestart
        public boolean thorium = true;

        @Config.Comment({"Register manganese recipe via bloomery?"})
        @Config.LangKey("config." + MODID + ".recipes.manganese")
        @Config.RequiresMcRestart
        public boolean manganese = true;

        @Config.Comment({"Register magnesium recipe via bloomery?"})
        @Config.LangKey("config." + MODID + ".recipes.magnesium")
        @Config.RequiresMcRestart
        public boolean magnesium = true;

        @Config.Comment({"Register osmium recipe via blast furnace?"})
        @Config.LangKey("config." + MODID + ".recipes.osmium")
        @Config.RequiresMcRestart
        public boolean osmium = true;

        @Config.Comment({"Register titanium recipe via blast furnace?"})
        @Config.LangKey("config." + MODID + ".recipes.titanium")
        @Config.RequiresMcRestart
        public boolean titanium = true;

        @Config.Comment({"Register tungsten recipe via blast furnace?"})
        @Config.LangKey("config." + MODID + ".recipes.tungsten")
        @Config.RequiresMcRestart
        public boolean tungsten = true;

        @Config.Comment({"Register beryllium recipe via blast furnace?"})
        @Config.LangKey("config." + MODID + ".recipes.beryllium")
        @Config.RequiresMcRestart
        public boolean beryllium = true;

        @Config.Comment({"Register zirconium recipe via blast furnace?"})
        @Config.LangKey("config." + MODID + ".recipes.zirconium")
        @Config.RequiresMcRestart
        public boolean zirconium = true;
        
        @Config.Comment({"Register uranium dust recipe via quern?"})
        @Config.LangKey("config." + MODID + ".recipes.uranium")
        @Config.RequiresMcRestart
        public boolean uranium_dust = true;

        @Config.Comment({"Register boron dust recipe via quern?"})
        @Config.LangKey("config." + MODID + ".recipes.boron")
        @Config.RequiresMcRestart
        public boolean boron_dust = true;
    }
    
    public static class MeltTemps {
    	
    	@RangeInt(min = 0)
    	@Config.RequiresMcRestart
    	@Config.Comment({"Melting temp for lithium"})
        @Config.LangKey("config." + MODID + ".melt_temp.lithium")
        public float lithium = 630;

    	@RangeInt(min = 0)
    	@Config.RequiresMcRestart
    	@Config.Comment({"Melting temp for constantan"})
        @Config.LangKey("config." + MODID + ".melt_temp.constantan")
        public float constantan = 1200;

    	@RangeInt(min = 0)
    	@Config.RequiresMcRestart
    	@Config.Comment({"Melting temp for electrum"})
        @Config.LangKey("config." + MODID + ".melt_temp.electrum")
        public float electrum = 1200;

    	@RangeInt(min = 0)
    	@Config.RequiresMcRestart
    	@Config.Comment({"Melting temp for nickel_silver"})
        @Config.LangKey("config." + MODID + ".melt_temp.nickel_silver")
        public float nickel_silver = 1450;

    	@RangeInt(min = 0)
    	@Config.RequiresMcRestart
    	@Config.Comment({"Melting temp for red_alloy"})
        @Config.LangKey("config." + MODID + ".melt_temp.red_alloy")
        public float red_alloy = 1080;

    	@RangeInt(min = 0)
    	@Config.RequiresMcRestart
    	@Config.Comment({"Melting temp for invar"})
        @Config.LangKey("config." + MODID + ".melt_temp.invar")
        public float invar = 1450;

    	@RangeInt(min = 0)
    	@Config.RequiresMcRestart
    	@Config.Comment({"Melting temp for thorium"})
        @Config.LangKey("config." + MODID + ".melt_temp.thorium")
        public float thorium = 630;

    	@RangeInt(min = 0)
    	@Config.RequiresMcRestart
    	@Config.Comment({"Melting temp for uranium"})
        @Config.LangKey("config." + MODID + ".melt_temp.uranium")
        public float uranium = 3000;

    	@RangeInt(min = 0)
    	@Config.RequiresMcRestart
    	@Config.Comment({"Melting temp for osmium"})
        @Config.LangKey("config." + MODID + ".melt_temp.osmium")
        public float osmium = 3025;

    	@RangeInt(min = 0)
    	@Config.RequiresMcRestart
    	@Config.Comment({"Melting temp for titanum"})
        @Config.LangKey("config." + MODID + ".melt_temp.titanum")
        public float titanum = 1700;

    	@RangeInt(min = 0)
    	@Config.RequiresMcRestart
    	@Config.Comment({"Melting temp for ardite"})
        @Config.LangKey("config." + MODID + ".melt_temp.ardite")
        public float ardite = 1050;

    	@RangeInt(min = 0)
    	@Config.RequiresMcRestart
    	@Config.Comment({"Melting temp for cobalt"})
        @Config.LangKey("config." + MODID + ".melt_temp.cobalt")
        public float cobalt = 1495;

    	@RangeInt(min = 0)
    	@Config.RequiresMcRestart
    	@Config.Comment({"Melting temp for manyullyn"})
        @Config.LangKey("config." + MODID + ".melt_temp.manyullyn")
        public float manyullyn = 1550;

    	@RangeInt(min = 0)
    	@Config.RequiresMcRestart
    	@Config.Comment({"Melting temp for mithril"})
        @Config.LangKey("config." + MODID + ".melt_temp.mithril")
        public float mithril = 940;

    	@RangeInt(min = 0)
    	@Config.RequiresMcRestart
    	@Config.Comment({"Melting temp for antimony"})
        @Config.LangKey("config." + MODID + ".melt_temp.antimony")
        public float antimony = 630;

    	@RangeInt(min = 0)
    	@Config.RequiresMcRestart
    	@Config.Comment({"Melting temp for magnesium"})
        @Config.LangKey("config." + MODID + ".melt_temp.magnesium")
        public float magnesium = 630;

    	@RangeInt(min = 0)
    	@Config.RequiresMcRestart
    	@Config.Comment({"Melting temp for magnesium_diboride"})
        @Config.LangKey("config." + MODID + ".melt_temp.magnesium_diboride")
        public float magnesium_diboride = 2000;

    	@RangeInt(min = 0)
    	@Config.RequiresMcRestart
    	@Config.Comment({"Melting temp for manganese"})
        @Config.LangKey("config." + MODID + ".melt_temp.manganese")
        public float manganese = 1250;

    	@RangeInt(min = 0)
    	@Config.RequiresMcRestart
    	@Config.Comment({"Melting temp for hsla_steel"})
        @Config.LangKey("config." + MODID + ".melt_temp.hsla_steel")
        public float hsla_steel = 2000;

    	@RangeInt(min = 0)
    	@Config.RequiresMcRestart
    	@Config.Comment({"Melting temp for tungsten"})
        @Config.LangKey("config." + MODID + ".melt_temp.tungsten")
        public float tungsten = 3400;

    	@RangeInt(min = 0)
    	@Config.RequiresMcRestart
    	@Config.Comment({"Melting temp for tungsten_steel"})
        @Config.LangKey("config." + MODID + ".melt_temp.tungsten_steel")
        public float tungsten_steel = 3695;

    	@RangeInt(min = 0)
    	@Config.RequiresMcRestart
    	@Config.Comment({"Melting temp for zirconium"})
        @Config.LangKey("config." + MODID + ".melt_temp.zirconium")
        public float zirconium = 1500;

    	@RangeInt(min = 0)
    	@Config.RequiresMcRestart
    	@Config.Comment({"Melting temp for zircaloy"})
        @Config.LangKey("config." + MODID + ".melt_temp.zircaloy")
        public float zircaloy = 1500;

    	@RangeInt(min = 0)
    	@Config.RequiresMcRestart
    	@Config.Comment({"Melting temp for aluminium"})
        @Config.LangKey("config." + MODID + ".melt_temp.aluminium")
        public float aluminium = 660;

    	@RangeInt(min = 0)
    	@Config.RequiresMcRestart
    	@Config.Comment({"Melting temp for beryllim"})
        @Config.LangKey("config." + MODID + ".melt_temp.beryllim")
        public float beryllim = 1300;

    	@RangeInt(min = 0)
    	@Config.RequiresMcRestart
    	@Config.Comment({"Melting temp for aluminium_brass"})
        @Config.LangKey("config." + MODID + ".melt_temp.aluminium_brass")
        public float aluminium_brass = 630;

    	@RangeInt(min = 0)
    	@Config.RequiresMcRestart
    	@Config.Comment({"Melting temp for beryllim_copper"})
        @Config.LangKey("config." + MODID + ".melt_temp.beryllim_copper")
        public float beryllim_copper = 1500;

    	@RangeInt(min = 0)
    	@Config.RequiresMcRestart
    	@Config.Comment({"Melting temp for boron"})
        @Config.LangKey("config." + MODID + ".melt_temp.boron")
        public float boron = 630;

    	@RangeInt(min = 0)
    	@Config.RequiresMcRestart
    	@Config.Comment({"Melting temp for ferroboron"})
        @Config.LangKey("config." + MODID + ".melt_temp.ferroboron")
        public float ferroboron = 3000;

    	@RangeInt(min = 0)
    	@Config.RequiresMcRestart
    	@Config.Comment({"Melting temp for tough"})
        @Config.LangKey("config." + MODID + ".melt_temp.tough")
        public float tough = 3000;
    }
    
    public static class Metals {
    	
    	@Config.Comment({"Enable antimony metal?"})
        @Config.LangKey("config." + MODID + ".metals.antimony")
        @Config.RequiresMcRestart
        public boolean antimony = true;
    	
    	@Config.Comment({"Enable lithuium metal?"})
        @Config.LangKey("config." + MODID + ".metals.lithium")
        @Config.RequiresMcRestart
        public boolean lithium = true;
    	
    	@Config.Comment({"Enable constantan alloy?"})
        @Config.LangKey("config." + MODID + ".metals.constantan")
        @Config.RequiresMcRestart
        public boolean constantan = true;
    	
    	@Config.Comment({"Enable electrum alloy?"})
        @Config.LangKey("config." + MODID + ".metals.electrum")
        @Config.RequiresMcRestart
        public boolean electrum = true;
    	
    	@Config.Comment({"Enable nickel silver alloy?"})
        @Config.LangKey("config." + MODID + ".metals.nickel_silver")
        @Config.RequiresMcRestart
        public boolean nickel_silver = true;
    	
    	@Config.Comment({"Enable red alloy?"})
        @Config.LangKey("config." + MODID + ".metals.red_alloy")
        @Config.RequiresMcRestart
        public boolean red_alloy = true;
    	
    	@Config.Comment({"Enable mithril alloy?"})
        @Config.LangKey("config." + MODID + ".metals.mithril")
        @Config.RequiresMcRestart
        public boolean mithril = true;
    	
    	@Config.Comment({"Enable invar alloy?"})
        @Config.LangKey("config." + MODID + ".metals.invar")
        @Config.RequiresMcRestart
        public boolean invar = true;
    	
    	@Config.Comment({"Enable aluminium metal?"})
        @Config.LangKey("config." + MODID + ".metals.aluminium")
        @Config.RequiresMcRestart
        public boolean aluminium = true;
    	
    	@Config.Comment({"Enable aluminium brass alloy?"})
        @Config.LangKey("config." + MODID + ".metals.aluminium_brass")
        @Config.RequiresMcRestart
        public boolean aluminium_brass = true;
    	
    	@Config.Comment({"Enable magnesium metal?"})
        @Config.LangKey("config." + MODID + ".metals.magnesium")
        @Config.RequiresMcRestart
        public boolean magnesium = true;
    	
    	@Config.Comment({"Enable manganese metal?"})
        @Config.LangKey("config." + MODID + ".metals.manganese")
        @Config.RequiresMcRestart
        public boolean manganese = true;
    	
    	@Config.Comment({"Enable boron metal?"})
        @Config.LangKey("config." + MODID + ".metals.boron")
        @Config.RequiresMcRestart
        public boolean boron = true;
    	
    	@Config.Comment({"Enable magnesium diboride alloy?"})
        @Config.LangKey("config." + MODID + ".metals.magnesium_diboride")
        @Config.RequiresMcRestart
        public boolean magnesium_diboride = true;
    	
    	@Config.Comment({"Enable thorium metal?"})
        @Config.LangKey("config." + MODID + ".metals.thorium")
        @Config.RequiresMcRestart
        public boolean thorium = true;
    	
    	@Config.Comment({"Enable uranium metal?"})
        @Config.LangKey("config." + MODID + ".metals.uranium")
        @Config.RequiresMcRestart
        public boolean uranium = true;
    	
    	@Config.Comment({"Enable ardite metal?"})
        @Config.LangKey("config." + MODID + ".metals.ardite")
        @Config.RequiresMcRestart
        public boolean ardite = true;
    	
    	@Config.Comment({"Enable cobalt metal?"})
        @Config.LangKey("config." + MODID + ".metals.cobalt")
        @Config.RequiresMcRestart
        public boolean cobalt = true;
    	
    	@Config.Comment({"Enable manyullyn alloy?"})
        @Config.LangKey("config." + MODID + ".metals.manyullyn")
        @Config.RequiresMcRestart
        public boolean manyullyn = true;
    	
    	@Config.Comment({"Enable hsla steel alloy?"})
        @Config.LangKey("config." + MODID + ".metals.hsla_steel")
        @Config.RequiresMcRestart
        public boolean hsla_steel = true;
    	
    	@Config.Comment({"Enable ferroboron alloy?"})
        @Config.LangKey("config." + MODID + ".metals.ferroboron")
        @Config.RequiresMcRestart
        public boolean ferroboron = true;
    	
    	@Config.Comment({"Enable beryllim metal?"})
        @Config.LangKey("config." + MODID + ".metals.beryllim")
        @Config.RequiresMcRestart
        public boolean beryllim = true;
    	
    	@Config.Comment({"Enable beryllim copper alloy?"})
        @Config.LangKey("config." + MODID + ".metals.beryllim_copper")
        @Config.RequiresMcRestart
        public boolean beryllim_copper = true;
    	
    	@Config.Comment({"Enable osmium metal?"})
        @Config.LangKey("config." + MODID + ".metals.osmium")
        @Config.RequiresMcRestart
        public boolean osmium = true;
    	
    	@Config.Comment({"Enable titanum metal?"})
        @Config.LangKey("config." + MODID + ".metals.titanum")
        @Config.RequiresMcRestart
        public boolean titanum = true;
    	
    	@Config.Comment({"Enable tungsten metal?"})
        @Config.LangKey("config." + MODID + ".metals.tungsten")
        @Config.RequiresMcRestart
        public boolean tungsten = true;
    	
    	@Config.Comment({"Enable tungsten steel alloy?"})
        @Config.LangKey("config." + MODID + ".metals.tungsten_steel")
        @Config.RequiresMcRestart
        public boolean tungsten_steel = true;
    	
    	@Config.Comment({"Enable zirconium metal?"})
        @Config.LangKey("config." + MODID + ".metals.zirconium")
        @Config.RequiresMcRestart
        public boolean zirconium = true;
    	
    	@Config.Comment({"Enable zircaloy metal?"})
        @Config.LangKey("config." + MODID + ".metals.zircaloy")
        @Config.RequiresMcRestart
        public boolean zircaloy = true;
    	
    	@Config.Comment({"Enable tough alloy?"})
        @Config.LangKey("config." + MODID + ".metals.tough")
        @Config.RequiresMcRestart
        public boolean tough_alloy = true;
    }
    
    public static class NonMetals {
    	
    	@Config.Comment({"Enable chromite?"})
        @Config.LangKey("config." + MODID + ".non-metals.chromite")
        @Config.RequiresMcRestart
        public boolean chromite = true;
    	
    	@Config.Comment({"Enable villiaumite?"})
        @Config.LangKey("config." + MODID + ".non-metals.villiaumite")
        @Config.RequiresMcRestart
        public boolean villiaumite = true;
    	
    	@Config.Comment({"Enable rhodochrosite?"})
        @Config.LangKey("config." + MODID + ".non-metals.rhodochrosite")
        @Config.RequiresMcRestart
        public boolean rhodochrosite = true;
    	
    	@Config.Comment({"Enable fluorite?"})
        @Config.LangKey("config." + MODID + ".non-metals.fluorite")
        @Config.RequiresMcRestart
        public boolean fluorite = true;
    	
    	@Config.Comment({"Enable carobbiite?"})
        @Config.LangKey("config." + MODID + ".non-metals.carobbiite")
        @Config.RequiresMcRestart
        public boolean carobbiite = true;
    	
    	@Config.Comment({"Enable arsenic?"})
        @Config.LangKey("config." + MODID + ".non-metals.arsenic")
        @Config.RequiresMcRestart
        public boolean arsenic = true;
    }
}
