package c14Generics;

// Can't create an instance of T.
class GenWrong<T> {
    T ob;
    GenWrong() {
        //ob = new T(); // Illegal!!!
    }
}
