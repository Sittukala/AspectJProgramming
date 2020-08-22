package gendev.hw2.fm;

public class ReferenceFeature extends OrFeature {

	public ReferenceFeature() {
		super("Reference");
		{ Feature ch = new CarloadFeature();
		getChildren().add(ch); }
		{ Feature ch = new PresidencyFeature();
		getChildren().add(ch); }
	}

}
