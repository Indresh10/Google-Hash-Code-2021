import java.util.ArrayList;
import java.util.Collections;

//Class For pizza
public class Pizza {     
    int pizzaindex;// for pizza indexing
    int ingredientcount;//for no. of ingredients
    public ArrayList<String> ingredients;//for ingredients
    public  Pizza(int ind,int count,String[] list) {
        pizzaindex=ind;
        ingredientcount = count;
        ingredients = new ArrayList<String>();
        int i;
        for (i = 0; i <= list.length; i++) {
            ingredients.add(list[i]);
        }
        Collections.sort(ingredients);
    }
}
