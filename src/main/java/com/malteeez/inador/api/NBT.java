package com.malteeez.inador.api;

import net.minecraft.nbt.INBT;
import net.minecraft.nbt.INBTType;
import net.minecraft.nbt.NBTSizeTracker;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class NBT implements INBT {

    private static String indentation;
    private static int indentDepth;
    private static DataOutput output;
    public static final NBT INSTANCE = new NBT();

    // needed for INSTANCE
    private NBT() {

    }

    /**
     *
     * @param output - what will be written to tag
     * @param indentatation - self fucking explanatory
     * @param indentDepth - see above
     * @param type - define by calling var NBT.TYPE
     * @throws IOException - what did you expect?
     */
    public NBT(DataOutput output, String indentatation, int indentDepth, INBTType type) {
        // set vars
        this.indentation = indentatation;
        this.indentDepth = indentDepth;
        this.output = output;
        this.TYPE = type;
    }

    public static DataInput newInput(String string) {
        DataInput d = (DataInput) (string != null ? new StringTextComponent(string) : StringTextComponent.field_240750_d_);
        return d;
    }

    public static DataOutput newOutput(String string) {
        DataOutput d = (DataOutput) (string != null ? new StringTextComponent(string) : StringTextComponent.field_240750_d_);
        return d;
    }

    /**
     *
     * @param output - what its going to write
     * @throws IOException - yeah
     */
    @Override
    public void write(DataOutput output) throws IOException {

    }

    @Override
    public String toString() {
        return this.toString();
    }

    @Override
    public byte getId() {
        return 0;
    }

    @Override
    public INBTType<?> getType() {
        return this.TYPE;
    }

    @Override
    public INBT copy() {
        try {
            return (INBT) this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     *
     * @param indentation - as said, typically by space # : "  "
     * @param indentDepth - int defining the depth of the indent
     * @return - formatted text component with both values
     *
     */
    @Override
    public ITextComponent toFormattedComponent(String indentation, int indentDepth) {
        return this.toFormattedComponent(this.indentation, this.indentDepth);
    }


    // new INBTType, needed for instantiation
    public static INBTType TYPE = new INBTType<NBT>() {
        @Override
        public NBT func_225649_b_(DataInput in, int p225, NBTSizeTracker sizeTracker) throws IOException {
            sizeTracker.read(64L);
            return NBT.INSTANCE;
        }
        @Override
        public String func_225648_a_() {
            return "INADOR";
        }

        @Override
        public String func_225650_b_() {
            return "TAG_INADOR";
        }

        public boolean func_225651_c_() {
            return true;
        }
    };
}
