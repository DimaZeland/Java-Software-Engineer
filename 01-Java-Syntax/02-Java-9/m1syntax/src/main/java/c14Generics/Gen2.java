package c14Generics;

// A simple generic class hierarchy.
class Gen0<T> {
    T ob;

    Gen0(T o) {
        ob = o;
    }

    // Return ob.
    T getob() {
        return ob;
    }
}

// A subclass of Gen.
class Gen2<T> extends Gen0<T> {
    Gen2(T o) {
        super(o);
    }
}
