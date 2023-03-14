package c08Inheritance;

// Using super to overcome name hiding.
class A2 {
    int i;
}

// Create a subclass by extending class A.
class B2 extends A2 {
    int i; // this i hides the i in A

    B2(int a, int b) {
        super.i = a; // i in A
        i = b; // i in B
    }

    void show() {
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in subclass: " + i);
    }
}

class UseSuper {
    public static void main(String args[]) {
        B2 subOb = new B2(1, 2);

        subOb.show();
    }
}
