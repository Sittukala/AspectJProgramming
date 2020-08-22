package gendev.hw2;

public aspect Task1 {
	pointcut calltoString() : execution(* toString(..));
	
	after(): calltoString(){
		System.out.println("After call of " + thisJoinPoint.getSignature());
	}

}
