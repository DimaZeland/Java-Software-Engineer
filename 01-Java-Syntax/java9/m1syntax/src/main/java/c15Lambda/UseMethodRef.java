package c15Lambda;

// Use a method reference to help find the maximum value in a collection.
import java.util.*;

class MyClass {
    private int val;

    MyClass(int v) { val = v; }

    int getVal() { return val; }
}

class UseMethodRef {
    // A compare() method compatible with the one defined by Comparator<T>.
    static int compareMC(MyClass1 a, MyClass1 b) {
        return a.getVal() - b.getVal();
    }

    public static void main(String args[])
    {
        ArrayList<MyClass1> al = new ArrayList<MyClass1>();

        al.add(new MyClass1(1));
        al.add(new MyClass1(4));
        al.add(new MyClass1(2));
        al.add(new MyClass1(9));
        al.add(new MyClass1(3));
        al.add(new MyClass1(7));

        // Find the maximum value in al using the compareMC() method.
        MyClass1 maxValObj = Collections.max(al, UseMethodRef::compareMC);

        System.out.println("Maximum value is: " + maxValObj.getVal());
    }
}
