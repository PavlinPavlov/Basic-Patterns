package builder;

public class BuilderTester {
    public static void main(String[] args) {
        Sandwich.SandwichMaker maker = new Sandwich.SandwichMaker("White");
        maker.addMeat("Ham").addVegetable("Olives").addVegetable("Tomato").addSauce("Mayo");

        Sandwich sandwich = maker.makeSandwich();

        System.out.println(sandwich.getBread());
        System.out.println(sandwich.getMeats());
        System.out.println(sandwich.getVegetables());
        System.out.println(sandwich.getSauces());
    }
}
