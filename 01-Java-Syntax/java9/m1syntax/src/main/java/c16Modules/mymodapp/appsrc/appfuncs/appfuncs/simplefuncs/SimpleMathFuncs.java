package c16Modules.mymodapp.appsrc.appfuncs.appfuncs.simplefuncs;

// Some simple math functions.

import c16Modules.mymodapp.appsrc.appsupport.appsupport.supportfuncs.SupportFuncs;

public class SimpleMathFuncs {

    // Return the smallest positive factor that a and b have in common.
    public static int lcf(int a, int b) {
        // Factor using positive values.
        a = Math.abs(a);
        b = Math.abs(b);

        int min = a < b ? a : b;

        for(int i = 2; i <= min/2; i++) {
            if(SupportFuncs.isFactor(i, a) && SupportFuncs.isFactor(i, b))
                return i;
        }

        return 1;
    }

    // Return the largest positive factor that a and b have in common.
    public static int gcf(int a, int b) {
        // Factor using positive values.
        a = Math.abs(a);
        b = Math.abs(b);

        int min = a < b ? a : b;

        for(int i = min/2; i >= 2; i--) {
            if(SupportFuncs.isFactor(i, a) && SupportFuncs.isFactor(i, b))
                return i;
        }

        return 1;
    }

    public static boolean isFactor(int i, int i1) {
        if((i%i1) == 0) return true;
        return false;
    }
}