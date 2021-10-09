import java.util.ArrayList;
import java.util.List;
public class Sunblock {
    String name;
    List<String> ingredients = new ArrayList();

    void addIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    void prepare() {
        System.out.println("Prepare " + name);

        System.out.println("Adding Ingredients: ");
		for (String ingredient : ingredients) {
			System.out.println("   " + ingredient);
		}
    }
    void mix() {
        System.out.println("Mixing ingredients");
    }

    void fill() {
        System.out.println("Filling cream in bottles");
    }

    void seal() {
        System.out.println("Seal the bottles");
    }

    void setName(String Name){
        this.name = Name;
    }

    String getName() {
        return name;
    }

    public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("---- " + this.name + " ----\n");
		for (String ingredient : ingredients) {
			display.append(ingredient + "\n");
		}
		return display.toString();
	}

}
