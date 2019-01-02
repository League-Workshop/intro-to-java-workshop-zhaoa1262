package section2;

import org.jointheleague.graphical.robot.Robot;

public class DrawSquare {
public static void main(String[] args) {
	
	Robot r2d2 = new Robot();
	
	r2d2.setSpeed(30);
	
	r2d2.penDown();
	r2d2.setRandomPenColor();
	
	for(int i=0;i<4;i++) {
		r2d2.move(200);
		r2d2.turn(90);
		
	
	}
	
	
	
}
}
