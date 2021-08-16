package tfcmetallum;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import static tfcmetallum.TFCMetallum.MODID;

@SuppressWarnings("unused")
@Config(modid = MODID, category = "")
@Config.LangKey("config." + MODID)
@Mod.EventBusSubscriber(modid = MODID)
public class ConfigTFCM
{
    @Config.Comment("Recipe configuration")
    @Config.LangKey("config." + MODID + ".recipes")
    public static Recipes RECIPES = new Recipes();
    
    @Config.Comment("Metals configuration. Alloys will be dissabled if any of the metals included are dissabled")
    @Config.LangKey("config." + MODID + ".metals")
    public static Metals METALS = new Metals();
    
    @Config.Comment("Non-Metals configuration")
    @Config.LangKey("config." + MODID + ".non-metals")
    public static NonMetals NON_METALS = new NonMetals();


    @SubscribeEvent
    public static void onConfigChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.getModID().equals(MODID))
        {
            ConfigManager.sync(MODID, Config.Type.INSTANCE);
        }
    }

    public static class Recipes
    {
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
    }
    
    public static class Metals
    {
    	
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
        public boolean tough = true;
    }
    public static class NonMetals
    {
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
