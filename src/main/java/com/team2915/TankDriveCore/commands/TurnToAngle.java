package com.team2915.TankDriveCore.commands;

import edu.wpi.first.wpilibj.command.Command;
import jaci.pathfinder.Pathfinder;
import jaci.pathfinder.Trajectory;
import jaci.pathfinder.Waypoint;

/**
 * Created by Henry on 5/12/17.
 */
public class TurnToAngle extends Command {

    double max_velocity = 0;
    double max_acceleration = 0;
    double max_jerk = 0;

    Trajectory traj;

    public TurnToAngle(double angle){
        Waypoint[] trajPoints = new Waypoint[]{
          new Waypoint(0,0,angle)
        };
        Trajectory.Config trajConfig = new Trajectory.Config(Trajectory.FitMethod.HERMITE_CUBIC, Trajectory.Config.SAMPLES_FAST, 0.05, max_velocity, max_acceleration, max_jerk);

        traj = Pathfinder.generate(trajPoints, trajConfig);
    }

    @Override
    protected void execute() {
        super.execute();
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    @Override
    protected void interrupted() {
        super.interrupted();
        end();
    }

    @Override
    protected void end() {
        super.end();
    }
}
