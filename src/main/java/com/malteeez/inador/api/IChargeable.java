package com.malteeez.inador.api;

import net.minecraft.item.ItemStack;
import net.minecraftforge.energy.CapabilityEnergy;

// im sure you wanted this to be a tech mod so here's an interface :P

public interface IChargeable {
    /* is chargeable
      how to implement energy? */
    // todo
    public boolean usesEnergy();
    public boolean isChargeable();
}
