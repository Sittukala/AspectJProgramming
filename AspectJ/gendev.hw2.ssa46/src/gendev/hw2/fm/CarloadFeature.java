package gendev.hw2.fm;

public class CarloadFeature extends OrFeature {

	public CarloadFeature() {
		super("Carload");
		{ Feature ch = new JarFeature();
		
		
		getChildren().add(ch); }
		{ Feature ch = new MigrationFeature();
		getChildren().add(ch); }
		{ Feature ch = new SuburbFeature();
		getChildren().add(ch); }
		{ Feature ch = new MedicineFeature();
		getChildren().add(ch); }
	}

}
