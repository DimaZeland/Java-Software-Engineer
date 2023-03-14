package c14Generics;

class Wrong<T> {
    // Wrong, no static variables of type T.
   // static T ob;

    // Wrong, no static method can use T.
   /* static T getob() {
        return ob;
    }*/
}
