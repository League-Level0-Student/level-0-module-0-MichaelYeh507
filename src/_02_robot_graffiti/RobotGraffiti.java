package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	
public static void main(String[] args) {
	Robot rob = new Robot();
	
	rob.penDown();
	rob.setSpeed(100);
		
	rob.move(200);
	rob.turn(90);
	rob.move(75);
	rob.turn(90);
	rob.move(150);
	rob.turn(-90);
	rob.move(75);
	rob.turn(-90);
	rob.move(150);
	rob.turn(90);
	rob.move(75);
	rob.turn(90);
	rob.move(200);
}


}
