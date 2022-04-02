package tfcmetallum.util;

import tfcmetallum.ConfigTFCM;

public class IsObtainable {

public static boolean manyullyn;
public static boolean mithril;
public static boolean magnesium_diboride;
public static boolean hsla_steel;
public static boolean tungsten_steel;
public static boolean zircaloy;
public static boolean aluminium_brass;
public static boolean beryllim_copper;
public static boolean ferroboron;
public static boolean tough_alloy;

	public static void checkObtanability() {
		
		if (ConfigTFCM.METALS.ardite && ConfigTFCM.RECIPES.ardite && ConfigTFCM.METALS.cobalt && ConfigTFCM.RECIPES.cobalt && ConfigTFCM.METALS.manyullyn) {
			manyullyn = true;
		}
		
		if (ConfigTFCM.METALS.antimony && ConfigTFCM.METALS.mithril) {
			mithril = true;
		}
		
		if (ConfigTFCM.METALS.magnesium && ConfigTFCM.METALS.magnesium_diboride) {
			magnesium_diboride = true;
		}
		
		if (ConfigTFCM.METALS.manganese && ConfigTFCM.METALS.hsla_steel) {
			hsla_steel = true;
		}
		
		if (ConfigTFCM.METALS.tungsten && ConfigTFCM.RECIPES.tungsten && ConfigTFCM.METALS.tungsten_steel) {
			tungsten_steel = true;
		}
		
		if ( ConfigTFCM.METALS.zirconium && ConfigTFCM.RECIPES.zirconium && ConfigTFCM.METALS.zircaloy) {
			zircaloy = true;
		}
		
		if (ConfigTFCM.METALS.aluminium && ConfigTFCM.METALS.aluminium_brass) {
			aluminium_brass = true;
		}
		
		if (ConfigTFCM.METALS.aluminium && ConfigTFCM.RECIPES.aluminium && ConfigTFCM.METALS.beryllim && ConfigTFCM.METALS.beryllim_copper) {
			beryllim_copper = true;
		}
		
		if (ConfigTFCM.METALS.boron && ConfigTFCM.METALS.ferroboron) {
			ferroboron = true;
		}
		
		if (IsObtainable.ferroboron && ConfigTFCM.METALS.lithium && ConfigTFCM.METALS.tough_alloy) {
			tough_alloy = true;
		}
	}
}
