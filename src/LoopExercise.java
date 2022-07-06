
public class LoopExercise {

	public static void main(String[] args) {
		//create a variable named age and assign it a value of 14
		int age = 18;
		//print the boolean expression age >= 16 to the console and note the results.
		System.out.println(age >= 16);
		//change the value of age to 18 and run again.
		int ages = 18;
		System.out.println(ages >= 18);
		//using a conditional, print "You can drive" if age is greater than or equal to 16
		boolean hasLicense = true;
		if (age >= 16 && hasLicense) {
			System.out.println("You can drive");
		} else {
			System.out.println("You cannot drive");
		}
		//and "You cannot drive" otherwise
		//change the value of age and rerun to see the result
		//add a new variable called hasLicense before the conditional
		
		//change the boolean expression in the conditional to additionally include the need for hasLicense to be true
		//try changing the values of age and hasLicense and note the different results	
		//create two new variables - costOfMilk and thirstLevel
		double costOfMilk = 4.50;
		double thirstLevel = 7;
		if (costOfMilk < 2.50 || thirstLevel > 6) {
			System.out.println("Milk Please");
		} else {
			System.out.println("No Thanks");
		}
		
		//create a new conditional that prints "Milk Please" if costOfMilk is less than 2.50 
		//or if thirstLevel is greater than 6 and prints "No Thanks" otherwise
		//change the values and note the different results
		//create two variables called numberOfCookies and numberOfChildren
		int numberOfCookies = 32;
		int numberOfChildren = 3;
		int cookiesPerChild = numberOfCookies / numberOfChildren;
		System.out.println(cookiesPerChild);
		double cookiesForDad = numberOfCookies % numberOfChildren;
		System.out.println(cookiesForDad);
		
		
		//you will evenly distribute all of the cookies to the children and as the adult
		//you get to keep the remaining cookies to yourself
		//use a conditional to print the following based on the following conditions:
		if (cookiesForDad == 0) {
			System.out.println("Sad Face");
		} else if (cookiesForDad < 2) {
			System.out.println("Yes!");
		} else if (cookiesForDad < 5) {
			System.out.println("Whoohooo!");
		} else if (cookiesForDad > 5) {
			System.out.println("Jackpot!");
		}
		//if there are 0 cookies remaining, print "Sad Face"
		//if there are less than 2 cookies, print "Yes!"
		//if there are less than 5 cookies, print "Whoohoooo!"
		//if there are 5 or more cookies, print "Jackpot!"
		
		String loyaltyMemberStatus = "Silver";
		double loyaltyMemberDiscount = 0.0;
		switch (loyaltyMemberStatus) {
		case "Silver": {
			System.out.println(0.0);
		}
		break;
		case "Gold": {
			System.out.println(0.15);
		}
		break;
		case "Platinum": {
			System.out.println(0.25);
		}
		break;
		}
		
		//create a variable called loyaltyMemberStatus and assign the value "SILVER"
		//create a variable called loyaltyMemberDiscount and assign the value 0.0
		//using a switch, set the value of loyaltyMemberDiscount based on the following loylatyMemberStatus scale
		//"SILVER" is 0.10, "GOLD" is 0.15, and "PLATINUM" is 0.25
		
		double billTotal = 250.50;
		double adjustedTotal = billTotal - (loyaltyMemberDiscount * billTotal);
		if (adjustedTotal > 500 & loyaltyMemberStatus == "Silver") {
			loyaltyMemberStatus = "Gold";
			} else if (adjustedTotal > 500 && loyaltyMemberStatus == "Gold") {
				loyaltyMemberStatus = "Platinum";
			}
		
		
		
		//create a variable called billTotal and assign a value
		//create a variable called adjustedTotal and assign it the billTotal minus the loyaltyMemberDiscount percent of the billTotal
		//if the adjustedBillTotal is greater than $500 upgrade the loyaltyMemberStatus from SILVER to GOLD or GOLD to PLATINUM
		String username = "something";
		String password = "1234";
		
		if (username == "Tommy123" & password == "12345") {
			System.out.println("login successful");
		} else {
			System.out.println("access denied");
		}
		
		//create two variables, username and password
		//create a conditional that prints "login successful" if the username is "Tommy123" and the password is "12345"
		//otherwise, print "access denied"
		
		for (int i = 0; i < 9; i++) {
		System.out.println(i);	
		}
		for (int j = 10; j >= 0; j--) {
			System.out.println(j);
		}
		for (int k = 0; k < 100; k++ ) {
			if (k % 2 == 0) {
				System.out.println(k);
			}
		}
		for (int w = 0; w < 100; w++) {
			if (w % 2 == 0) {
				System.out.println("EVEN");
			}
			if (w % 2 != 0) {
				System.out.println("ODD");
			}
		}
		int last = 100;
		while (last >= 0) {
			last--;
			System.out.println(last % 3);
		}
		//write a for loop that prints each number from 0 to 9
		//write a for loop that prints each number from 10 to 0 backwards
		//write a for loop that prints every other number from 0 to 100
		//write a for loop that iterates from 0 to 100 and prints "EVEN" if the number is even and "ODD" if it's odd
		//write a while loop that starts at 100 and iterates backwards by 1 until it reaches 0
		//divide each number by 3 and print the remainder to the console
		
		
		
	}

}
