package tfcmetallum.util;

import net.minecraftforge.common.config.Config;

import static tfcmetallum.TFCMetallum.MODID;

@Config(modid = MODID, category = "")
@Config.LangKey("config." + MODID)
public final class ModConfig
{
    @Config.Comment("Metal Additions")
    @Config.LangKey("config." + MODID + ".metaladditions")
    public static MetalAdditions metalAdditions = new MetalAdditions();

    @Config.Comment("Ore Additions")
    @Config.LangKey("config." + MODID + ".oreadditions")
    public static OreAdditions oreAdditions = new OreAdditions();

    public static class MetalAdditions
    {
        @Config.Comment("Register Aluminium")
        @Config.Name("Aluminium")
        public boolean Aluminium = true;

        @Config.Comment("Register Ardite")
        @Config.Name("Ardite")
        public boolean Ardite = true;

        @Config.Comment("Register Cobalt")
        @Config.Name("Cobalt")
        public boolean Cobalt = true;

        @Config.Comment("Register Iron")
        @Config.Name("Iron")
        public boolean Iron = true;

        @Config.Comment("Register Titanium")
        @Config.Name("Titanium")
        public boolean Titanium = true;

        @Config.Comment("Register Tungsten")
        @Config.Name("Tungsten")
        public boolean Tungsten = true;

        @Config.Comment("Register Uranium")
        @Config.Name("Uranium")
        public boolean Uranium = true;

        @Config.Comment("Register Invar")
        @Config.Name("Invar")
        public boolean Invar = true;

        @Config.Comment("Register Thorium")
        @Config.Name("Thorium")
        public boolean Thorium = true;

        @Config.Comment("Register Osmium")
        @Config.Name("Osmium")
        public boolean Osmium = true;

        //todo add more metals
    }

    public static class OreAdditions
    {
        @Config.Comment("Register Bauxite")
        @Config.Name("Bauxite")
        public boolean Bauxite = true;

        @Config.Comment("Register Scheelite")
        @Config.Name("Scheelite")
        public boolean Scheelite = true;

        @Config.Comment("Register Native Ardite")
        @Config.Name("Ardite")
        public boolean Ardite = true;

        @Config.Comment("Register Cobaltite")
        @Config.Name("Cobaltite")
        public boolean Cobaltite = true;

        @Config.Comment("Register Native Osmium")
        @Config.Name("Osmium")
        public boolean Osmium = true;

        @Config.Comment("Register Pitchblende")
        @Config.Name("Pitchblende")
        public boolean Pitchblende = true;

        //todo add more ores
    }
}
