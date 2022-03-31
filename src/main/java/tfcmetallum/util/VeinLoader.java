package tfcmetallum.util;

import static net.dries007.tfc.TerraFirmaCraft.MOD_ID;

import java.io.File;

import tfcmetallum.ConfigTFCM;
import tfcmetallum.TFCMetallum;

public enum VeinLoader
{
    INSTANCE;
	
    public void preInit(File dir)
    {
        File tfcDir = new File(dir, MOD_ID);
        if (!tfcDir.exists() && !tfcDir.mkdir())
        {
            throw new Error("Unable to find the TFC directory.");
        }
        File oldWorldGenFile = new File(tfcDir, "tfc_metallum_ores.json");
        if (oldWorldGenFile.exists())
        {
        	TFCMetallum.getLog().info("Deleted the old vein json");
        	oldWorldGenFile.delete();
        }
        if (ConfigTFCM.VEINS.manage)
        {
        	VeinDataManager.doVeinList();
        	for (String veinFileName : VeinDataManager.getOnList())
        	{
        		File metallumGenFile = new File(tfcDir, "/metallum_ores/" + veinFileName + ".json");
        		VeinDataManager.copyVeinFile(veinFileName, metallumGenFile);
        	}
        	for (String veinFileName : VeinDataManager.getOffList())
        	{
        		File metallumGenFile = new File(tfcDir, "/metallum_ores/" + veinFileName + ".json");
        		VeinDataManager.removeVein(veinFileName, metallumGenFile);
        	}
        }
    }
}
