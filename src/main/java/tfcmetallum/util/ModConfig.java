package tfcmetallum.util;

import net.minecraftforge.common.config.Config;

import static tfcmetallum.TFCMetallum.MODID;

@SuppressWarnings("WeakerAccess")
@Config(modid = MODID, category = "")
@Config.LangKey("config." + MODID)
public final class ModConfig
{
    @Config.Comment("Metal Additions")
    @Config.LangKey("config." + MODID + ".metal_additions")
    public static MetalAdditions METAL_ADDITIONS = new MetalAdditions();

    @Config.Comment("Alloy Additions")
    @Config.LangKey("config." + MODID + ".alloy_additions")
    public static AlloyAdditions ALLOY_ADDITIONS = new AlloyAdditions();

    @Config.Comment("Ore Additions")
    @Config.LangKey("config." + MODID + ".ore_additions")
    public static OreAdditions ORE_ADDITIONS = new OreAdditions();

    public static class MetalAdditions
    {
        @Config.RequiresMcRestart
        @Config.Comment("Register Aluminium")
        @Config.Name("Aluminium")
        public boolean aluminium = true;

        @Config.RequiresMcRestart
        @Config.Comment("Register Ardite")
        @Config.Name("Ardite")
        public boolean ardite = true;

        @Config.RequiresMcRestart
        @Config.Comment("Register Cobalt")
        @Config.Name("Cobalt")
        public boolean cobalt = true;

        /*
        @Config.RequiresMcRestart
        @Config.Comment("Register Cast Iron")
        @Config.Name("Cast Iron")
        public boolean castIron = true;*/

        @Config.RequiresMcRestart
        @Config.Comment("Register Titanium")
        @Config.Name("Titanium")
        public boolean titanium = true;

        @Config.RequiresMcRestart
        @Config.Comment("Register Tungsten")
        @Config.Name("Tungsten")
        public boolean tungsten = true;

        @Config.RequiresMcRestart
        @Config.Comment("Register Uranium")
        @Config.Name("Uranium")
        public boolean uranium = true;

        @Config.RequiresMcRestart
        @Config.Comment("Register Thorium")
        @Config.Name("Thorium")
        public boolean thorium = true;

        @Config.RequiresMcRestart
        @Config.Comment("Register Osmium")
        @Config.Name("Osmium")
        public boolean osmium = true;

        @Config.RequiresMcRestart
        @Config.Comment("Register Mithril")
        @Config.Name("Mithril")
        public boolean mithril = true;
    }

    public static class AlloyAdditions
    {
        @Config.RequiresMcRestart
        @Config.Comment("Register Invar")
        @Config.Name("Invar")
        public boolean invar = true;

        @Config.RequiresMcRestart
        @Config.Comment("Register Manyullin")
        @Config.Name("Manyullin")
        public boolean manyullin = true;

        @Config.RequiresMcRestart
        @Config.Comment("Register Constantan")
        @Config.Name("Constantan")
        public boolean constantan = true;

        @Config.RequiresMcRestart
        @Config.Comment("Register Electrum")
        @Config.Name("Electrum")
        public boolean electrum = true;

        @Config.RequiresMcRestart
        @Config.Comment("Register Tungsten Steel")
        @Config.Name("Tungsten Steel")
        public boolean tungstenSteel = true;
    }

    public static class OreAdditions
    {
        @Config.Comment("Register Bauxite")
        @Config.Name("Bauxite")
        public boolean bauxite = true;

        @Config.Comment("Register Wolframite")
        @Config.Name("Wolframite")
        public boolean wolframite = true;

        @Config.Comment("Register Native Ardite")
        @Config.Name("Ardite")
        public boolean ardite = true;

        @Config.Comment("Register Cobaltite")
        @Config.Name("Cobaltite")
        public boolean cobaltite = true;

        @Config.Comment("Register Native Osmium")
        @Config.Name("Osmium")
        public boolean osmium = true;
    }
}
