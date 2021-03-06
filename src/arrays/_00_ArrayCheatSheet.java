package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] array = {"1","2","3","4","5"};
		//2. print the third element in the array
		System.out.println(array[3]);
		//3. set the third element to a different value
		array[3] = "Hello";
		//4. print the third element again.
		System.out.println(array[3]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(String n: array) {
			System.out.println(n);
		}
		
		//6. make an array of 50 integers
		int[] arrayI = new int[50];
		Random ran = new Random();
		//7. use a for loop to make every value of the integer array a random number
		for(int i = 0; i < arrayI.length; i++) {
			arrayI[i] = ran.nextInt(50);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int smallest = arrayI[0];
		//9 print the entire array to see if step 8 was correct
		for(int i: arrayI) {
			if(i < smallest) {
				smallest = i;
			}
		}
		System.out.println(smallest);
		//10. print the largest number in the array.
		int largest = arrayI[0];
		for(int i: arrayI) {
			if(i > largest) {
				largest = i;
			}
		}
		System.out.println(largest);
	}
}
