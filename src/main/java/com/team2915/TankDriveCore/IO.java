package com.team2915.TankDriveCore;

import edu.wpi.first.wpilibj.Joystick;

/**
 * Created by Henry on 5/2/17.
 */
public class IO {

    private Joystick xbox = new Joystick(0);

//    private JoystickButton A = new JoystickButton(xbox, 0);
//    private JoystickButton B = new JoystickButton(xbox, 0);
//    private JoystickButton X = new JoystickButton(xbox, 0);
//    private JoystickButton Y = new JoystickButton(xbox, 0);


    public IO(){
        //A.whenPressed(new ExecuteTrajectory(Robot.trajectoryLibrary.getTrajectory("arc.traj"), 4));
    }

    public Joystick getXbox(){
        return xbox;
    }
}
