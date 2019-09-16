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
        @Config.Comment("Register Antimony")
        @Config.Name("Antimony")
        public boolean antimony = true;

        @Config.RequiresMcRestart
        @Config.Comment("Register Ardite")
        @Config.Name("Ardite")
        public boolean ardite = true;

        @Config.RequiresMcRestart
        @Config.Comment("Register Cobalt")
        @Config.Name("Cobalt")
        public boolean cobalt = true;

        @Config.RequiresMcRestart
        @Config.Comment("Register Titanium")
        @Config.Name("Titanium")
        public boolean titanium = true;

        @Config.RequiresMcRestart
        @Config.Comment("Register Tungsten")
        @Config.Name("Tungsten")
        public boolean tungsten = true;

        @Config.RequiresMcRestart
        @Config.Comment("Register Osmium")
        @Config.Name("Osmium")
        public boolean osmium = true;

        /* todo This is here so if TFC at some point removes it, we add it ourselves
        @Config.Comment("Register Platinum")
        @Config.Name("Platinum")
        public boolean platinum = false;

        @Config.Comment("Register Lead")
        @Config.Name("Lead")
        public boolean lead = false;*/
    }

    public static class AlloyAdditions
    {
        @Config.RequiresMcRestart
        @Config.Comment("Register Aluminium Brass")
        @Config.Name("Aluminium Brass")
        public boolean aluminiumBrass = true;

        @Config.RequiresMcRestart
        @Config.Comment("Register Invar")
        @Config.Name("Invar")
        public boolean invar = true;

        @Config.RequiresMcRestart
        @Config.Comment("Register Manyullin")
        @Config.Name("Manyullin")
        public boolean manyullin = true;

        @Config.RequiresMcRestart
        @Config.Comment("Register Mithril")
        @Config.Name("Mithril")
        public boolean mithril = true;

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

        @Config.Comment("Register Stibnite")
        @Config.Name("Stibnite")
        public boolean stibnite = true;

        /* todo This is here so if TFC at some point removes it, we add it ourselves
        @Config.Comment("Register Pitchblende")
        @Config.Name("Pitchblende")
        public boolean pitchblende = false;

        @Config.Comment("Register Native Platinum")
        @Config.Name("Platinum")
        public boolean platinum = false;

        @Config.Comment("Register Galena")
        @Config.Name("Galena")
        public boolean galena = false;*/

        //todo change to false after all textures have been provided (default not add this unless modpack author wants it)
        @Config.Comment("Register Thorianite")
        @Config.Name("Thorianite")
        public boolean thorianite = true;

        @Config.Comment("Register Chromite")
        @Config.Name("Chromite")
        public boolean chromite = true;

        @Config.Comment("Register Pyrolusite")
        @Config.Name("Pyrolusite")
        public boolean pyrolusite = true;

        @Config.Comment("Register Magnesite")
        @Config.Name("Magnesite")
        public boolean magnesite = true;

        @Config.Comment("Register Boron")
        @Config.Name("Boron")
        public boolean boron = true;
    }
}
