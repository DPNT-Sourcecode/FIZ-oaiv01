package befaster.solutions.FIZ;

//import java.util.function.Predicate;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
//    	if((number%3==0) && (number%5)==0) {
//    		return "fizz buzz";}
//    	else if(number%3==0) {
//    		return "fizz";
//    	}else if(number%5==0) {
//    		return "buzz";
//    	}else return number.toString();
//    	Predicate <Integer> hasIdenticalDigits=num->{
//    		String numberString =String.valueOf(num);
//    		char firstDigit=numberString.charAt(0);
//    		return numberString.chars().allMatch(digit->digit==firstDigit);
//    	};
    	if(((number%3==0) && number.toString().contains("3")) && ((number%5==0)&&number.toString().contains("5"))) {
			if(number%2==0) {
						return "fizz buzz deluxe";}
					else {
						return "fizz buzz fake deluxe";}
	  }else if(((number%3==0) || number.toString().contains("3")) && ((number%5==0)||number.toString().contains("5"))) {
				return "fizz buzz";}
       else if((number%3==0) && number.toString().contains("3")) {
			if(number%2==0) {
				return "fizz deluxe";}
			else {
				return "fizz fake deluxe";}
		}else if((number%3==0)|| number.toString().contains("3")) 
				return "fizz";
    	else if((number%5==0) && number.toString().contains("5")) {
			if(number%2==0) {
				return "buzz deluxe";}
			else {
				return "buzz fake deluxe";}
    	}else if(((number%5==0)||number.toString().contains("5"))) {
    		return "buzz";
    	} else  return number.toString();

//    	else if(number>10 && hasIdenticalDigits.test(number)) {
//    			if(number%2==0)
//    				return "deluxe";
//    			else
//    				return "fake deluxe";
//    	}
    		
       // throw new SolutionNotImplementedException();
    }
    public String fizz_buzz(Integer number) {
    	if((number%3==0) && number.toString().contains("3") && (number%5==0)&&number.toString().contains("5")) {
    		return "fizz buzz";}
    	else if((number%3==0) && number.toString().contains("3")) {
    		return "fizz";
    	}else if((number%5==0) && number.toString().contains("5")) {
    		return "buzz";
    	}else return "";
       // throw new SolutionNotImplementedException();
    }


}

