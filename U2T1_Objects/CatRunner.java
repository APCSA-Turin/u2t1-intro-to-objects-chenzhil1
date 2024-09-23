public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Meow Mi", 9, 12.2);
        cat1.introduce();
        cat1.printCatInfo();
        Cat cat2 = new Cat("Pentagon", 2, 20.1);
        cat2.printCatInfo();
        cat2.introduce();
    }
}
