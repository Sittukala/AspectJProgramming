package gendev.hw2.fm;

public class DenFeature extends OrFeature {

	public DenFeature() {
		super("Den");
		{ Feature ch = new HullFeature();
		getChildren().add(ch); }
		{ Feature ch = new ReferenceFeature();
		getChildren().add(ch); }
		{ Feature ch = new ExitFeature();
		getChildren().add(ch); }
	}

}
