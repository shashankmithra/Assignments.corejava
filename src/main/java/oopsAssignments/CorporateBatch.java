package oopsAssignments;

public class CorporateBatch extends Assignment_1{

public double calculateFee(String course){
	double fee= 0;
	double corporateFee=15000;
	if(course.equals("java")){
		fee = 15000;
	}
	else if(course.equals("ui")){
		fee =12000;
	}
	else if(course.equals("testing")){
		fee = 10000;
	}

	return fee+corporateFee;
	}

}
