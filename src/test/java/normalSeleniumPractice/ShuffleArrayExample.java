package normalSeleniumPractice;

import java.util.Arrays;

public class ShuffleArrayExample {

	public static void main(String[] args) {
		
		String animals[] = {"Tiger","Lion","Goat","Monkey","Buffalo","Pig"};
		
		for(int i=0; i<animals.length; i++) {
			
			int index =(int) (Math.random() * animals.length);
			
			String temp = animals[i];
			animals[i] = animals[index];
			animals[index] = temp;
			
		}
		
		System.out.println(Arrays.toString(animals));
	}
}
