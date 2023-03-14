package c14Generics;

// A subclass can add its own type parameters.
class GenBasic<T> {
    T ob; // declare an object of type T

    // Pass the constructor a reference to
    // an object of type T.
    GenBasic(T o) {
        ob = o;
    }

    // Return ob.
    T getob() {
        return ob;
    }
}

// A subclass of Gen that defines a second
// type parameter, called V.
class Gen4<T, V> extends GenBasic<T> {
    V ob2;

    Gen4(T o, V o2) {
        super(o);
        ob2 = o2;
    }

    V getob2() {
        return ob2;
    }
}

// Create an object of type Gen2.
class HierDemo {
    public static void main(String args[]) {

        // Create a Gen2 object for String and Integer.
        Gen4<String, Integer> x =
                new Gen4<String, Integer>("Value is: ", 99);

        System.out.print(x.getob());
        System.out.println(x.getob2());
    }
}
