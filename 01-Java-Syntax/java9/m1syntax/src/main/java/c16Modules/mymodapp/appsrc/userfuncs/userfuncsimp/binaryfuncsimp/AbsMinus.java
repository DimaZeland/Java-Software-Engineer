package c16Modules.mymodapp.appsrc.userfuncs.userfuncsimp.binaryfuncsimp;

// AbsMinus provides a concrete implementation of
// BinaryFunc. It returns the result of abs(a) - abs(b).

import c16Modules.mymodapp.appsrc.userfuncs.userfuncs.binaryfuncs.BinaryFunc;

public class AbsMinus implements BinaryFunc {

    // Return name of this function.
    public String getName() {
        return "absMinus";
    }

    // Implement the AbsMinus function.
    public int func(int a, int b) {
        return Math.abs(a) - Math.abs(b);
    }
}
