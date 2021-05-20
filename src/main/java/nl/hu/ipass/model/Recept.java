package nl.hu.ipass.model;

import java.util.ArrayList;

public class Recept {
    private String recepiName;
    private ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
    private int preperationTime;
    private int recepiID;

    public Recept(String recepiName, int preperationTime, int recepiID){

        this.preperationTime = preperationTime;
        this.recepiName = recepiName;
        this.recepiID = recepiID;
    }

    public Recept(){

    }

    public String getRecepiName() {
        return recepiName;
    }

    public int getPreperationTime() {
        return preperationTime;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public int getRecepiID(){
        return recepiID;
    }

    public void setRecepiName(String recepiName) {
        this.recepiName = recepiName;
    }

    public void setPreperationTime(int preperationTime) {
        this.preperationTime = preperationTime;
    }

    public void addIngredientByID(int ingredientId){
        for (Ingredient ingredient : ingredients) {
            if (ingredient.getIngredientID() == ingredientId){
                ingredients.add(ingredient);

            }
        }
    }

    public void removeIngredientByID(int ingredientId){
        for (Ingredient ingredient:ingredients) {
            if (ingredient.getIngredientID() == ingredientId){
                ingredients.remove(ingredient);
            }
        }
    }

    @Override
    public String toString() {
        return "Recept{" +
                "recepiName='" + recepiName + '\'' +
                ", ingredients=" + ingredients +
                ", preperationTime=" + preperationTime +
                ", recepiID=" + recepiID +
                '}';
    }
}
