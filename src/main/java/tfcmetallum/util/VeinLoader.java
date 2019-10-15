package tfcmetallum.util;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.Objects;

import com.google.common.base.Strings;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.io.FileUtils;

import net.dries007.tfc.world.classic.worldgen.vein.VeinRegistry;
import net.dries007.tfc.world.classic.worldgen.vein.VeinType;
import tfcmetallum.TFCMetallum;

import static net.dries007.tfc.Constants.GSON;
import static tfcmetallum.TFCMetallum.MODID;

public enum VeinLoader
{
    INSTANCE;

    private static final String DEFAULT_ORE_SPAWN_LOCATION = "assets/tfcmetallum/config/ore_spawn_data.json";
    private File worldGenFile;

    public void preInit(File dir)
    {
        File tfcDir = new File(dir, MODID);
        if (!tfcDir.exists() && !tfcDir.mkdir())
        {
            throw new Error("Problem creating TFC Metallum extra config directory.");
        }
        worldGenFile = new File(tfcDir, "ore_spawn_data.json");
        try
        {
            if (worldGenFile.createNewFile())
            {
                FileUtils.copyInputStreamToFile(Objects.requireNonNull(VeinRegistry.class.getClassLoader().getResourceAsStream(DEFAULT_ORE_SPAWN_LOCATION)), worldGenFile);
            }
        }
        catch (IOException e)
        {
            throw new Error("Problem creating default ore vein config file.", e);
        }
    }

    public void postInit()
    {
        String worldGenData;
        try
        {
            worldGenData = FileUtils.readFileToString(worldGenFile, Charset.defaultCharset());
        }
        catch (IOException e)
        {
            throw new Error("Error reading ore vein config file.", e);
        }

        if (!Strings.isNullOrEmpty(worldGenData))
        {
            try
            {
                Map<String, VeinType> values = GSON.fromJson(worldGenData, new TypeToken<Map<String, VeinType>>() {}.getType());
                values.forEach((name, abc) -> abc.getLooseRockItem());
                values.forEach(VeinRegistry.INSTANCE::registerVein);
            }
            catch (JsonParseException e)
            {
                TFCMetallum.getLog().warn("Could not load TFC-Metallum ore generation config! TFC will not generate any TFC-Metallum ores!", e);
            }
        }
    }
}
