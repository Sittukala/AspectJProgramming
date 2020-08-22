package gendev.hw2.fm;

public class ExitFeature extends XorFeature {

	public ExitFeature() {
		super("Exit");
		{ Feature ch = new DugoutFeature();
		getChildren().add(ch); }
		{ Feature ch = new WeirdFeature();
		getChildren().add(ch); }
		{ Feature ch = new ValueFeature();
		getChildren().add(ch); }
	}

}
