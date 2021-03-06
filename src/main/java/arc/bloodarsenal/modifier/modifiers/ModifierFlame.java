package arc.bloodarsenal.modifier.modifiers;

import arc.bloodarsenal.modifier.EnumModifierType;
import arc.bloodarsenal.modifier.Modifier;
import arc.bloodarsenal.registry.Constants;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;

public class ModifierFlame extends Modifier
{
    public ModifierFlame(int level)
    {
        super(Constants.Modifiers.FLAME, Constants.Modifiers.FLAME_COUNTER.length, level, EnumModifierType.HEAD);
    }

    @Override
    public void hitEntity(ItemStack itemStack, EntityLivingBase target, EntityLivingBase attacker)
    {
        target.attackEntityFrom(DamageSource.ON_FIRE, (getLevel() + 1));
        target.setFire((getLevel() + 1) * 2);
    }
}
