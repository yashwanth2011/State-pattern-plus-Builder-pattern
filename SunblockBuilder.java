

import java.util.ArrayList;
import java.util.List;

public abstract class SunblockBuilder {
	String name;
	List<String> ingredients = new ArrayList();;

	public abstract SunblockBuilder addOils();
	public abstract SunblockBuilder addMinerals();
	public abstract SunblockBuilder addChemicals();

	public Sunblock build() {
		Sunblock sunblock = new Sunblock();
		sunblock.setName(this.name);
		sunblock.addIngredients(ingredients);
		return sunblock;
	}
}
