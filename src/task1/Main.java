package task1;

public class Main {

    public static void main(String[] args) {

        var cats = Cat.makeCats(10);
        Printer.print(cats);

        System.out.println("Sort by breed");
        cats.sort(Cat::byBreed);
        Printer.print(cats);

        System.out.println("Sort by name");
        cats.sort(Cat::byName);
        Printer.print(cats);

        System.out.println("Sort by age");
        cats.sort(Cat::byAge);
        Printer.print(cats);

        String color = String.valueOf(Cat.Color.SILVER);
        System.out.println("Remove by " + color + " color");
        cats.removeIf(cat -> cat.removeByColor(Cat.Color.valueOf(color)));
        Printer.print(cats);

        System.out.println("Remove by name length is equals - 5");
        cats.removeIf(Cat::removeByNameLength);
        Printer.print(cats);
    }


}
