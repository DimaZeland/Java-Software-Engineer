package c08Inheritance;

// Demonstrate when constructors are called.

// Create a super class.
class A3 {
    A3() {
        System.out.println("Inside A's constructor.");
    }
}

// Create a subclass by extending class A.
class B3 extends A3 {
    B3() {
        System.out.println("Inside B's constructor.");
    }
}

// Create another subclass by extending B.
class C extends B3 {
    C() {
        System.out.println("Inside C's constructor.");
    }
}

class CallingCons {
    public static void main(String args[]) {
        C c = new C();
    }
}
