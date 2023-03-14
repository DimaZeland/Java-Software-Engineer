package c08Inheritance;

class A5 {
    int i, j;

    A5(int a, int b) {
        i = a;
        j = b;
    }
    void show() {
        System.out.println("i: " + i);
        System.out.println("j: " + j);
    }
}
class B5 extends A5 {
    int k;

    B5(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show() {
        super.show(); // this calls A's show()
        System.out.println("k: " + k);
    }
}