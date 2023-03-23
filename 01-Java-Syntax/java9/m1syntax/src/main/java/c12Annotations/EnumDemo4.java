package c12Annotations;

// Demonstrate ordinal(), compareTo(), and equals().

// An enumeration of apple varieties.
enum Apple5 {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

class EnumDemo4 {
    public static void main(String args[]) {
        Apple5 ap, ap2, ap3;

        // Obtain all ordinal values using ordinal().
        System.out.println("Here are all apple constants" +
                " and their ordinal values: ");
        for (Apple5 a : Apple5.values())
            System.out.println(a + " " + a.ordinal());

        ap = Apple5.RedDel;
        ap2 = Apple5.GoldenDel;
        ap3 = Apple5.RedDel;

        System.out.println();

        // Demonstrate compareTo() and equals()
        if (ap.compareTo(ap2) < 0)
            System.out.println(ap + " comes before " + ap2);

        if (ap.compareTo(ap2) > 0)
            System.out.println(ap2 + " comes before " + ap);

        if (ap.compareTo(ap3) == 0)
            System.out.println(ap + " equals " + ap3);

        System.out.println();

        if (ap.equals(ap2))
            System.out.println("Error!");

        if (ap.equals(ap3))
            System.out.println(ap + " equals " + ap3);

        if (ap == ap3)
            System.out.println(ap + " == " + ap3);

    }
}
