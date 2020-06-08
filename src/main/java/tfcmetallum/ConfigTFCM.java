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
    @Config.Comment("Recipes configuration")
    @Config.LangKey("config." + MODID + ".recipes")
    public static Recipes RECIPES = new Recipes();


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
}
