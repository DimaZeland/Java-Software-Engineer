package c16Modules.mymodapp.appsrc.userfuncs.userfuncsimp.binaryfuncsimp;

// AbsPlus provides a concrete implementation of
// BinaryFunc. It returns the result of abs(a) + abs(b).

import c16Modules.mymodapp.appsrc.userfuncs.userfuncs.binaryfuncs.BinaryFunc;

public class AbsPlus implements BinaryFunc {

    // Return name of this function.
    public String getName() {
        return "absPlus";
    }

    // Implement the AbsPlus function.
    public int func(int a, int b) { return Math.abs(a) + Math.abs(b); }
}
