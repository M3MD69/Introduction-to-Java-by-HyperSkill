class Cat {
    // Instance variables
    String name;
    int age;

    // Static variable
    static int counter = 0;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        counter++; // Increment static counter when a new Cat is created
        if (counter > 5) {
            System.out.println("You have too many cats");
        }
    }

    public static int getNumberOfCats() {
        return counter;
    }
}
