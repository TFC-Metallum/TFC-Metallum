package tfcmetallum;

import org.apache.logging.log4j.Logger;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLFingerprintViolationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import tfcmetallum.util.VeinLoader;

@SuppressWarnings("WeakerAccess")
@Mod(modid = TFCMetallum.MODID, name = TFCMetallum.NAME, version = TFCMetallum.VERSION, dependencies = "required-after:tfc", certificateFingerprint = TFCMetallum.SIGNING_KEY)
public class TFCMetallum
{
    public static final String MODID = "tfcmetallum";
    public static final String NAME = "TFC Metallum";
    public static final String VERSION = "@VERSION@";
    public static final String SIGNING_KEY = "@FINGERPRINT@";

    private static Logger logger;
    private static boolean signedBuild = true;

    public static Logger getLog()
    {
        return logger;
    }

    @EventHandler
    public void onFingerprintViolation(FMLFingerprintViolationEvent event)
    {
        /*if (!event.isDirectory())
        {
            signedBuild = false; // todo disabled for the time being
        }*/
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        VeinLoader.INSTANCE.preInit(event.getModConfigurationDirectory());
        if (!signedBuild)
        {
            logger.error("INVALID FINGERPRINT DETECTED! This means this jar file has been compromised and are not supported.");
        }
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    }
}
