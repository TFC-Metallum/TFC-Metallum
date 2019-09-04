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
        @Config.Comment("Register Aluminium")
        @Config.Name("Aluminium")
        public boolean aluminium = true;

        @Config.Comment("Register Ardite")
        @Config.Name("Ardite")
        public boolean ardite = true;

        @Config.Comment("Register Cobalt")
        @Config.Name("Cobalt")
        public boolean cobalt = true;

        @Config.Comment("Register Cast Iron")
        @Config.Name("Cast Iron")
        public boolean castIron = true;

        @Config.Comment("Register Titanium")
        @Config.Name("Titanium")
        public boolean titanium = true;

        @Config.Comment("Register Tungsten")
        @Config.Name("Tungsten")
        public boolean tungsten = true;

        @Config.Comment("Register Uranium")
        @Config.Name("Uranium")
        public boolean uranium = true;

        @Config.Comment("Register Thorium")
        @Config.Name("Thorium")
        public boolean thorium = true;

        @Config.Comment("Register Osmium")
        @Config.Name("Osmium")
        public boolean osmium = true;

        @Config.Comment("Register Mithril")
        @Config.Name("Mithril")
        public boolean mithril = true;

        //todo add more metals
    }

    public static class AlloyAdditions
    {
        @Config.Comment("Register Invar")
        @Config.Name("Invar")
        public boolean invar = true;

        @Config.Comment("Register Manyullin")
        @Config.Name("Manyullin")
        public boolean manyullin = true;

        @Config.Comment("Register Constantan")
        @Config.Name("Constantan")
        public boolean constantan = true;

        @Config.Comment("Register Electrum")
        @Config.Name("Electrum")
        public boolean electrum = true;

        //todo add more alloys
    }

    public static class OreAdditions
    {
        @Config.Comment("Register Bauxite")
        @Config.Name("Bauxite")
        public boolean bauxite = true;

        @Config.Comment("Register Scheelite")
        @Config.Name("Scheelite")
        public boolean scheelite = true;

        @Config.Comment("Register Native Ardite")
        @Config.Name("Ardite")
        public boolean ardite = true;

        @Config.Comment("Register Cobaltite")
        @Config.Name("Cobaltite")
        public boolean cobaltite = true;

        @Config.Comment("Register Native Osmium")
        @Config.Name("Osmium")
        public boolean osmium = true;

        @Config.Comment("Register Mithril")
        @Config.Name("Mithril")
        public boolean mithril = true;

        //todo add more ores
    }
}
