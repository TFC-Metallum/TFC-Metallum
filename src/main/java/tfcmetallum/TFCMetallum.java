package tfcmetallum;

import org.apache.logging.log4j.Logger;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import net.dries007.tfc.api.util.TFCConstants;

@SuppressWarnings("WeakerAccess")
@Mod(modid = TFCMetallum.MODID, name = TFCMetallum.NAME, version = TFCMetallum.VERSION, dependencies = "required-after:" + TFCConstants.MOD_ID)
public class TFCMetallum
{
    public static final String MODID = "tfcmetallum";
    public static final String NAME = "TFC Metallum";
    public static final String VERSION = "@VERSION@";

    private static Logger logger;

    public static Logger getLog()
    {
        return logger;
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
