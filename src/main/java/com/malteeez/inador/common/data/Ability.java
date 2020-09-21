package com.malteeez.inador.common.data;

import javax.annotation.Nonnull;

public class Ability {

    protected byte type;
    private static byte ICE = 0;
    private static byte FIRE = 1;

    public static Ability NONE = new Ability();

    public Ability() {

    }

    /**
     *
     * @param type - type of ability, in form of tiny number (byte)
     * nonnull - because: fuck you
     *
     */

    @Nonnull
    public Ability(byte type) {
        this.type = type;
        getType();
    }

    private void getType() {
        check(this.type);
    }

    private static void iceAbility() {
        // allow %chance to freeze / slow enemy on contact
        // todo should be able to be injected via @CapabilityInject?
    }

    private static void fireAbility() {

    }

    private void check(int toCheck) {
        switch (this.type) {
            case 0:
                iceAbility();
            case 1:
                fireAbility();
        }
    }
}
