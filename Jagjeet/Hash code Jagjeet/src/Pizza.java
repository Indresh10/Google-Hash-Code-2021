import java.util.ArrayList;
import java.util.Collections;

public class Pizza {     //Class For pizzas//
    int pizzaindex;// for pizza indexing
    int ingredientcount;//for no. of ingredients
    public ArrayList<String> ingredients;//for ingredients
    public  Pizza(int ind,int count,String[] list) {
        pizzaindex=ind;
        ingredientcount = count;
        ingredients = new ArrayList<>();
        int i;
        for (i = 0; i <= list.length; i++) {
            ingredients.add(list[i]);
        }
        Collections.sort(ingredients);
    }
}
