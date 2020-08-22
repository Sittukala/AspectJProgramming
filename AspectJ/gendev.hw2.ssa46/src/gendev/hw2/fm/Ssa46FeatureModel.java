package gendev.hw2.fm;

public class Ssa46FeatureModel extends FeatureModel {

	public Ssa46FeatureModel() {
		super(new DenFeature());
	}
	
	public void init() {
		getRoot().setFeatureModel(this);
	}

}
