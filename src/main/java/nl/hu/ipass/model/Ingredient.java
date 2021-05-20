package nl.hu.ipass.model;

public class Ingredient {
    private String ingredientName;
    private int weightInGrams;
    private int ingredientID;


    public Ingredient(String ingredientName, int weightInGrams, int ingredientId){
        this.ingredientName = ingredientName;
        this.weightInGrams = weightInGrams;
        this.ingredientID = ingredientId;
    }

    public Ingredient(String ingredientName){
        this.ingredientName = ingredientName;
    }

    public int getIngredientID() {
        return ingredientID;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public int getWeightInGrams() {
        return weightInGrams;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public void setWeightInGrams(int weightInGrams) {
        this.weightInGrams = weightInGrams;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "ingredientName='" + ingredientName + '\'' +
                ", weightInGrams=" + weightInGrams +
                ", ingredientId=" + ingredientID +
                '}';
    }
}
