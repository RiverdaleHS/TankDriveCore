package com.team2915.TankDriveCore;

import com.team2915.TankDriveCore.subsystems.DriveTrain;
import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;

/**
 * Created by Henry on 5/2/17.
 */
public class Robot extends IterativeRobot {

    //Human Intface
    public static final IO io = new IO(); //IO manages the xbox controllers and joysticks
    public static final SmartDashboardManager smartDashboardManager = new SmartDashboardManager(); //This is used to manage comunications with the Smart Dashboard

    //Subsystems
    public static final DriveTrain driveTrain = new DriveTrain(); //THE WHEELS THAT MAKE THE ROBOT DRIVE

    @Override
    public void robotInit() {
        super.robotInit();
        CameraServer.getInstance().startAutomaticCapture();
    }

    @Override
    public void disabledPeriodic() {
        super.disabledPeriodic();
        Scheduler.getInstance().run();
        smartDashboardManager.updateSmartDashboard();
    }

    @Override
    public void teleopInit() {
        super.teleopInit();
    }

    @Override
    public void teleopPeriodic() {
        super.teleopPeriodic();
        Scheduler.getInstance().run();
        smartDashboardManager.updateSmartDashboard();
    }


    @Override
    public void autonomousInit() {
        super.autonomousInit();
    }

    @Override
    public void autonomousPeriodic() {
        super.autonomousPeriodic();
        Scheduler.getInstance().run();
        smartDashboardManager.updateSmartDashboard();
    }
}
