package tfcmetallum;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
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

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        VeinLoader.INSTANCE.preInit(event.getModConfigurationDirectory());
    }
}
