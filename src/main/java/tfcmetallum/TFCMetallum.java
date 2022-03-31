package tfcmetallum;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import tfcmetallum.util.IsObtainable;
import tfcmetallum.util.VeinLoader;

@SuppressWarnings("WeakerAccess")
@Mod(modid = TFCMetallum.MODID, name = TFCMetallum.NAME, version = TFCMetallum.VERSION, dependencies = "required-after:tfc", certificateFingerprint = TFCMetallum.SIGNING_KEY)
public class TFCMetallum
{
    public static final String MODID = "tfcmetallum";
    public static final String NAME = "TFC Metallum";
    public static final String VERSION = "@VERSION@";
    public static final String SIGNING_KEY = "@FINGERPRINT@";

    @Instance
	private static TFCMetallum INSTANCE;
    
    private final Logger log = LogManager.getLogger(MODID);
    
    public static Logger getLog()
	{
		return INSTANCE.log;
	}
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	IsObtainable.checkObtanability();
        VeinLoader.INSTANCE.preInit(event.getModConfigurationDirectory());
    }
}
