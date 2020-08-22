package gendev.hw2.fm;

public class HullFeature extends OrFeature {

	public HullFeature() {
		super("Hull");
		{ Feature ch = new SolicitorFeature();
		getChildren().add(ch); }
		{ Feature ch = new CamperFeature();
		getChildren().add(ch); }
		{ Feature ch = new UpwardFeature();
		getChildren().add(ch); }
		{ Feature ch = new PlayerFeature();
		getChildren().add(ch); }
	}

}
