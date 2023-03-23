package c16Modules.mymodapp.appsrc.userfuncs.userfuncsimp.binaryfuncsimp;

// This is a provider for the AbsPlus function.

import c16Modules.mymodapp.appsrc.userfuncs.userfuncs.binaryfuncs.*;

public class AbsPlusProvider implements BinFuncProvider {

    // Provide an AbsPlus object.
    public BinaryFunc get() {
        return new AbsPlus();
    }
}
