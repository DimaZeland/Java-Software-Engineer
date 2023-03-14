package c16Modules.mymodapp.appsrc.userfuncs.userfuncsimp.binaryfuncsimp;

// This is a provider for the AbsMinus function.

import c16Modules.mymodapp.appsrc.userfuncs.userfuncs.binaryfuncs.*;

public class AbsMinusProvider implements BinFuncProvider {

    // Provide an AbsMinus object.
    public BinaryFunc get() { return new AbsMinus(); }
}
