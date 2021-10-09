public class NaturalSunblockBuilder extends SunblockBuilder {
	public NaturalSunblockBuilder() {
		this.name = "Natural Sunblock";
	}
	public SunblockBuilder addOils() {

		this.ingredients.add("saffron oil");
		return this;
	}

	public SunblockBuilder addMinerals() {
		this.ingredients.add("Turmeric");
		return this;
	}

	public SunblockBuilder addChemicals() {
		// never EVER add chemicals to natural sunblock
		return this;
	}

}
