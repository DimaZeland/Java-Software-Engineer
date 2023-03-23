package c14Generics;

// A nongeneric class can be the superclass
// of a generic subclass.

// A nongeneric class.
class NonGen1 {
    int num;

    NonGen1(int i) {
        num = i;
    }

    int getnum() {
        return num;
    }
}

// A generic subclass.
class GenBas<T> extends NonGen1 {
    T ob; // declare an object of type T

    // Pass the constructor a reference to
    // an object of type T.
    GenBas(T o, int i) {
        super(i);
        ob = o;
    }

    // Return ob.
    T getob() {
        return ob;
    }
}

// Create a Gen object.
class HierDemo2 {
    public static void main(String args[]) {

        // Create a Gen object for String.
        GenBas<String> w = new GenBas<String>("Hello", 47);

        System.out.print(w.getob() + " ");
        System.out.println(w.getnum());
    }
}
