package section2;

import org.jointheleague.graphical.robot.Robot;

public class RandomShape {
public static void main(String[] args) {
	Robot E = new Robot ("mini");
	E.penDown();
	
	E.setSpeed(10);
	int s = 10;
	int a = 1080/8;
	for(int i=0;i<16;i++) {
		E.setPenColor(255, 238, 119);
		E.move(100);
			E.turn(a);
			E.turn(1);
			
}
	for(int i=0;i<16;i++) {
		E.setPenColor(255, 204, 221);
		E.move(100);
			E.turn(a);
			E.turn(3);
	
	
}

	for(int i=0;i<16;i++) {
		E.setPenColor(255, 102, 255);
		E.move(100);
			E.turn(a);
			E.turn(3);
			
	
}
	for(int i=0;i<16;i++) {
		E.setPenColor(221, 017, 119);
		E.move(100);
			E.turn(a);
			E.turn(3);
			
	
}
	for(int i=0;i<16;i++) {
		E.setPenColor(255, 153, 170);
		E.move(100);
			E.turn(a);
			E.turn(3);
}

}

}