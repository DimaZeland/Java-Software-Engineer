package c14Generics;

// A simple generic class hierarchy.
class GenBase<T> {
    T ob;

    GenBase(T o) {
        ob = o;
    }

    // Return ob.
    T getob() {
        return ob;
    }
}

// A subclass of Gen.
class Gen3<T> extends GenBase<T> {
    Gen3(T o) {
        super(o);
    }
}
