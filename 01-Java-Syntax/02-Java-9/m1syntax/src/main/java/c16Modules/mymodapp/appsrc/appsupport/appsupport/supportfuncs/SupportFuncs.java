package c16Modules.mymodapp.appsrc.appsupport.appsupport.supportfuncs;

// Support functions.

public class SupportFuncs {

    // Determine if a is a factor of b.
    public static boolean isFactor(int a, int b) {
        if ((b % a) == 0) return true;
        return false;
    }
}
