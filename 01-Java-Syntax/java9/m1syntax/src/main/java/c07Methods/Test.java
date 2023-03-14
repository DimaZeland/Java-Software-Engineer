package c07Methods;

// Objects may be passed to methods.
class Test {
    int a, b;

    Test() {}

    Test(int i, int j) {
        a = i;
        b = j;
    }

    Test(int i) {
        a = i;
    }

    // return true if o is equal to the invoking object
    boolean equalTo(Test o) {
        if (o.a == a && o.b == b) return true;
        else return false;
    }

    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }

    // pass an object
    void meth(Test o) {
        o.a *=  2;
        o.b /= 2;
    }

    Test incrByTen() {
        Test temp = new Test(a+10);
        return temp;
    }
}
