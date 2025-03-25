class Chemicals {
    String name;
    String formula;
    double molecularWeight;
    String state;
    boolean isToxic;
    double boilingPoint;

    Chemicals() {
        this("Water");
        System.out.println("Chemicals no-argument constructor is invoked");
    }

    Chemicals(String name) {
        this(18.015, "H2O");
		this.name=name;
        System.out.println("Chemicals constructor with String name is invoked");
    }

    Chemicals(double molecularWeight, String formula) {
        this("Liquid", 100.0);
        this.formula = formula;
        this.molecularWeight = molecularWeight;
        System.out.println("Chemicals constructor with String name, String formula, and double molecularWeight is invoked");
    }
    Chemicals(String state, double boilingPoint) 
	{
        this(false);
        this.state = state;
        this.boilingPoint = boilingPoint;
        System.out.println("Chemicals constructor with String state and double boilingPoint is invoked");
    }

    Chemicals(boolean isToxic) 
	{
        this(18.015, 100.0);
        this.isToxic = isToxic;
        System.out.println("Chemicals constructor with boolean isToxic is invoked");
    }

    Chemicals(double molecularWeight, double boilingPoint) 
	{
        this.molecularWeight = molecularWeight;
        this.boilingPoint = boilingPoint;
        System.out.println("Chemicals constructor with String name, String formula, double molecularWeight, String state, and double boilingPoint is invoked");
    }

    public void displayChemicalInfo() {
        System.out.println("The name of the chemical is: " + name);
        System.out.println("The chemical formula is: " + formula);
        System.out.println("The molecular weight of the chemical is: " + molecularWeight);
        System.out.println("The state of the chemical is: " + state);
        System.out.println("Is the chemical toxic? " + isToxic);
        System.out.println("The boiling point of the chemical is: " + boilingPoint + " °C");
    }
}
