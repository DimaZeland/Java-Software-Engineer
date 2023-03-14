package c07Methods;

class Overload {
    public static void main(String args[]) {
        OverloadDemo ob = new OverloadDemo();
        double result;
        int i = 88;

        // call all versions of test()
        ob.test();
        ob.test(10);
        ob.test(10, 20);
        ob.test(i); // this will invoke test(double)
        result = ob.test(123.25);
        System.out.println("Result of ob.test(123.25): " + result);
    }
}
