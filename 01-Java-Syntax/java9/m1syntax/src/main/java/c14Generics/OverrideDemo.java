package c14Generics;

// Overriding a generic method in a generic class.
class GenBase1<T> {
    T ob; // declare an object of type T

    // Pass the constructor a reference to
    // an object of type T.
    GenBase1(T o) {
        ob = o;
    }

    // Return ob.
    T getob() {
        System.out.print("Gen's getob(): " );
        return ob;
    }
}

// A subclass of Gen that overrides getob().
class Gen6<T> extends GenBase1<T> {

    Gen6(T o) {
        super(o);
    }

    // Override getob().
    T getob() {
        System.out.print("Gen2's getob(): ");
        return ob;
    }
}

// Demonstrate generic method override.
class OverrideDemo {
    public static void main(String args[]) {

        // Create a Gen object for Integers.
        GenBase1<Integer> iOb = new GenBase1<Integer>(88);

        // Create a Gen2 object for Integers.
        Gen6<Integer> iOb2 = new Gen6<Integer>(99);

        // Create a Gen2 object for Strings.
        Gen6<String> strOb2 = new Gen6<String>("Generics Test");

        System.out.println(iOb.getob());
        System.out.println(iOb2.getob());
        System.out.println(strOb2.getob());
    }
}
