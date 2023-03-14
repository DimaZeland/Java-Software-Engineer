package c08Inheritance;

// Method overriding.
class A4 {
    int i, j;

    A4 (int a, int b) {
        i = a;
        j = b;
    }

    // display i and j
    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class B4 extends A4 {
    int k;

    B4(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // display k -- this overrides show() in A
    void show() {
        System.out.println("k: " + k);
    }
}

class Override {
    public static void main(String args[]) {
        B4 subOb = new B4(1, 2, 3);

        subOb.show(); // this calls show() in B
    }
}
