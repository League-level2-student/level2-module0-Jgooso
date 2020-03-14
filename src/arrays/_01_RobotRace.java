package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	//2. create an array of 5 robots.
	Robot[] array = new Robot[5];
	Random ran = new Random();
	boolean reach = false;
	//3. use a for loop to initialize the robots.
		for(int i = 0; i < array.length; i++) {
		//4. make each robot start at the bottom of the screen, side by side, facing up
			array[i] = new Robot();
			array[i].setX(500);
			array[i].setY((i*100)+100);
			array[i].setSpeed(10);
			array[i].setAngle(90);
		}
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
	while(reach == false) {
		for(int i = 0; i < array.length; i++) {
			for(int x = 0; x <ran.nextInt(50);x++ ) {
				array[i].move(1+i*100);
				array[i].turn(1);
			}
			
			if(array[i].getY() <= 0) {
				reach = true;
				System.out.print("Robot " + (i+1) + " has won.");
			}
		}
	}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
			
	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
}
