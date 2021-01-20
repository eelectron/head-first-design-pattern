package template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook{

	@Override
	void brew() {
		// TODO Auto-generated method stub
		System.out.println("Dripping coffee out of filter");
	}

	@Override
	void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("Add milk and sugar");
	}
	
	boolean customerWantsCondiments() {
		// TODO Auto-generated method stub
		String answer = getUserInput();
		if(answer.toLowerCase().startsWith("y")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	String getUserInput() {
		String answer = null;
		System.out.println("Would you like milk and sugar with your coffee (y/n)");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		}catch(IOException ex) {
			System.out.println("IO error");
		}
		
		if(answer == null) {
			answer = "no";
		}
		return answer;
	}
}
