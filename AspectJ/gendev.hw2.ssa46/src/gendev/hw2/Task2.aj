package gendev.hw2;

import java.util.List;

import gendev.hw2.fm.Feature;

public aspect Task2 {
	
	
	pointcut setChild(Feature ch , Feature tgt): call(boolean add(..)) && args(ch) && this(tgt) && !(cflow(within(Task2)));
	
	
	after(Feature ch,Feature tgt)  :  setChild(ch,tgt){
	
		System.out.println("After setting child " + tgt.getChildren());
	} 
	

}
