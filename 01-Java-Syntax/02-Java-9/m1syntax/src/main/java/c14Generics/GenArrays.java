package c14Generics;

// Generics and arrays.
class Gen8<T extends Number> {
    T ob;

    T vals[]; // OK

    Gen8(T o, T[] nums) {
        ob = o;

        // This statement is illegal.
        // vals = new T[10]; // can't create an array of T

        // But, this statement is OK.
        vals = nums; // OK to assign reference to existent array
    }
}

class GenArrays {
    public static void main(String args[]) {
        Integer n[] = {1, 2, 3, 4, 5};

        Gen8<Integer> iOb = new Gen8<Integer>(50, n);

        // Can't create an array of type-specific generic references.
        // Gen<Integer> gens[] = new Gen<Integer>[10]; // Wrong!

        // This is OK.
        Gen8<?> gens[] = new Gen8<?>[10]; // OK
    }
}
