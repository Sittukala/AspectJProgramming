package gendev.hw2;

import java.util.ArrayList;
import java.util.List;

import gendev.hw2.fm.*;

public aspect Task4 {
	boolean flag=true;
	List<String> features=new ArrayList<String>();
	pointcut checkConstraints(FeatureModel f): execution(boolean FeatureModel.isProduct(..)) && target(f) && !(cflow(within(Task4)));
	
	boolean around(FeatureModel f): checkConstraints(f) {
		features.add(f.toString());
		System.out.println("feature string is " +features.toString());
		if(features.contains("Player")) {
			if(features.contains("Weird")) {
				proceed(f);
			}
			else {
				flag=false;
				
			}
		if(features.contains("Camper")) {
			if(features.contains("Migration")) {
				flag=false;
			}
			else {
				proceed(f);
			}
		}
			
		}
		return flag;
		
		
	}

}
