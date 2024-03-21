package befaster.solutions.FIZ;

import java.util.function.Predicate;

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
    	Predicate <Integer> hasIdenticalDigits=num->{
    		String numberString =String.valueOf(num);
    		char firstDigit=numberString.charAt(0);
    		return numberString.chars().allMatch(digit->digit==firstDigit);
    	};
    	if(((number%3==0) || number.toString().contains("3")) && ((number%5==0)||number.toString().contains("5"))) {
    		if(number>10 && hasIdenticalDigits.test(number)) {
    			return "fizz buzz deluxe";
    		}else {
    		return "fizz buzz";}
    }	else if((number%3==0) || number.toString().contains("3")) {
    		if(number>10 && hasIdenticalDigits.test(number)) {
    			return "fizz deluxe";
    		}else
    		return "fizz";
    	}else if((number%5==0) || number.toString().contains("5")) {
    		if(number>10&& hasIdenticalDigits.test(number)) {
    			return "buzz deluxe";
    		}else
    		return "buzz";
    	}else if(number>10 && hasIdenticalDigits.test(number)) {
    		return "deluxe";
    	}
    		
    		return number.toString();
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
