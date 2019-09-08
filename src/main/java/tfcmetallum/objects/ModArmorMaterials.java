package tfcmetallum.objects;

import net.minecraft.init.SoundEvents;
import net.minecraftforge.common.util.EnumHelper;

import net.dries007.tfc.api.types.IArmorMaterialTFC;
import net.dries007.tfc.api.util.TFCConstants;
import net.dries007.tfc.objects.ArmorMaterialTFC;

public final class ModArmorMaterials
{
    public static final IArmorMaterialTFC ALUMINIUM = new ArmorMaterialTFC(EnumHelper.addArmorMaterial("tfcm_aluminium", TFCConstants.MOD_ID + ":aluminium", 12, new int[] {1, 3, 4, 1}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F), 10, 13, 6.25f);
    public static final IArmorMaterialTFC MITHRIL = new ArmorMaterialTFC(EnumHelper.addArmorMaterial("tfcm_mithril", TFCConstants.MOD_ID + ":mithril", 24, new int[] {1, 4, 5, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F), 14, 15, 10);
    public static final IArmorMaterialTFC INVAR = new ArmorMaterialTFC(EnumHelper.addArmorMaterial("tfcm_invar", TFCConstants.MOD_ID + ":invar", 40, new int[] {2, 4, 5, 3}, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.0F), 15, 20, 20);
    public static final IArmorMaterialTFC COBALT = new ArmorMaterialTFC(EnumHelper.addArmorMaterial("tfcm_cobalt", TFCConstants.MOD_ID + ":cobalt", 40, new int[] {2, 5, 6, 2}, 14, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F), 25, 30, 16.5f);
    public static final IArmorMaterialTFC MANYULLIN = new ArmorMaterialTFC(EnumHelper.addArmorMaterial("tfcm_manyullin", TFCConstants.MOD_ID + ":manyullin", 55, new int[] {2, 6, 6, 3}, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.0F), 40, 42, 35);
    public static final IArmorMaterialTFC TITANIUM = new ArmorMaterialTFC(EnumHelper.addArmorMaterial("tfcm_titanium", TFCConstants.MOD_ID + ":titanium", 78, new int[] {3, 6, 8, 3}, 17, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F), 65, 57, 60);
    public static final IArmorMaterialTFC OSMIUM = new ArmorMaterialTFC(EnumHelper.addArmorMaterial("tfcm_osmium", TFCConstants.MOD_ID + ":osmium", 102, new int[] {3, 6, 8, 3}, 20, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F), 55, 57, 62);
    public static final IArmorMaterialTFC TUNGSTEN = new ArmorMaterialTFC(EnumHelper.addArmorMaterial("tfcm_tungsten", TFCConstants.MOD_ID + ":tungsten", 100, new int[] {3, 6, 8, 3}, 20, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F), 65, 65, 65);
    public static final IArmorMaterialTFC TUNGSTEN_STEEL = new ArmorMaterialTFC(EnumHelper.addArmorMaterial("tfcm_tungsten_steel", TFCConstants.MOD_ID + ":tungsten_steel", 120, new int[] {3, 6, 8, 3}, 22, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 8.0F), 70, 70, 70);

}
