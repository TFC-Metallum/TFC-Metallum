package tfcmetallum.objects.recipes;

import java.util.function.BooleanSupplier;

import com.google.gson.JsonObject;

import net.dries007.tfc.ConfigTFC;
import net.minecraft.util.JsonUtils;
import net.minecraftforge.common.crafting.IConditionFactory;
import net.minecraftforge.common.crafting.JsonContext;
import tfcmetallum.ConfigTFCM;
import tfcmetallum.TFCMetallum;
import tfcmetallum.util.IsObtainable;


public class ConditionalFactory implements IConditionFactory {
	@Override
	public BooleanSupplier parse(JsonContext context, JsonObject json) {
		
		String type = JsonUtils.getString(json, "config");
		
		if (type == "aluminium") 
		{
			return () -> ConfigTFCM.METALS.aluminium;
		}
		if (type.toString() == "beryllium_copper")
		{
			return () -> IsObtainable.beryllim_copper;
		}
		if (type == "boron")
		{
			return () -> ConfigTFCM.METALS.boron;
		}
		if (type == "cobalt")
		{
			return () -> ConfigTFCM.METALS.cobalt;
		}
		if (type == "invar")
		{
			return () -> ConfigTFCM.METALS.invar;
		}
		if (type == "manyullyn")
		{
			return () -> IsObtainable.manyullyn;
		}
		if (type == "mithril")
		{
			return () -> IsObtainable.mithril;
		}
		if (type == "nickel_silver")
		{
			return () -> ConfigTFCM.METALS.nickel_silver;
		}
		if (type == "osmium")
		{
			return () -> ConfigTFCM.METALS.osmium;
		}
		if (type == "titanium")
		{
			return () -> ConfigTFCM.METALS.titanum;
		}
		if (type == "tungsten")
		{
			return () -> ConfigTFCM.METALS.tungsten;
		}
		if (type == "tungsten_steel")
		{
			return () -> IsObtainable.tungsten_steel;
		}
		if (type == "zircaloy")
		{
			return () -> IsObtainable.zircaloy;
		} 
		else 
		{
			return () -> false;
		}
	}
}
