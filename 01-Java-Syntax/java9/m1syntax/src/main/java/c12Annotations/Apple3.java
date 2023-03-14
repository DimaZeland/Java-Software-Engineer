package c12Annotations;

// Use an enum constructor.
enum Apple3 {
    Jonathan(10), GoldenDel(9), RedDel, Winesap(15), Cortland(8);

    private int price; // price of each apple

    // Constructor
    Apple3(int p) { price = p; }

    // Overloaded constructor
    Apple3() { price = -1; }

    int getPrice() { return price; }
}
