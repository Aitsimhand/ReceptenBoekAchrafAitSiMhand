package nl.hu.ipass.model;

public class Main {
    public static void main(String[] args) {
        Ingredient t1 = new Ingredient("Tomaat", 200, 001);
        Ingredient t2 = new Ingredient("Tonijn", 300, 002);

        Recept r1 = new Recept("Spaghetti", 30, 001);
        r1.addIngredientByID(001);
        r1.addIngredientByID(002);

        System.out.println(r1);
    }
}
