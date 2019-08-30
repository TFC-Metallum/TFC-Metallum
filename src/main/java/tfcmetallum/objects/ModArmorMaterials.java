package tfcmetallum.objects;

import net.minecraft.init.SoundEvents;
import net.minecraftforge.common.util.EnumHelper;

import net.dries007.tfc.api.types.IArmorMaterialTFC;
import net.dries007.tfc.api.util.TFCConstants;
import net.dries007.tfc.objects.ArmorMaterialTFC;

public final class ModArmorMaterials
{
    public static final IArmorMaterialTFC ALUMINIUM = new ArmorMaterialTFC(EnumHelper.addArmorMaterial("aluminium", TFCConstants.MOD_ID + ":aluminium", 14, new int[] {1, 3, 4, 1}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F), 10, 10, 6.25f);
    //todo add more armor materials here
}
