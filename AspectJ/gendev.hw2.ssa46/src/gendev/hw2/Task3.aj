package gendev.hw2;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import gendev.hw2.fm.*;

public aspect Task3 {
	Set<Float> tracker=new HashSet<Float>();
	
	pointcut dataTracker(Feature weight) : cflow(execution(boolean FeatureModel.isProduct(..))) && args(weight) && !(cflow(within(Task3)));
	
	before(Feature weight): dataTracker(weight){
		
		tracker=null;
		
	}
	
	pointcut dataFunctionTracker(Feature weight1) : execution(boolean Feature.isProduct(..)) && target(weight1) && !(cflow(within(Task3)));
	after(Feature weight1) : dataFunctionTracker(weight1){
		tracker.add(InventorySystem.getWeight(weight1));
	
		System.out.println(" Maximum weight is " + Collections.max(tracker));
	}
	

}





