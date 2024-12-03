package org.firstinspires.ftc.teamcode.autonomousThings.Commands.Red.Corto;

import com.arcrobotics.ftclib.command.InstantCommand;
import com.arcrobotics.ftclib.command.SequentialCommandGroup;
import com.arcrobotics.ftclib.command.WaitCommand;

import org.firstinspires.ftc.teamcode.autonomousThings.Trajectories.RedShort;
import org.firstinspires.ftc.teamcode.commands.TrajectoryFollowerCommand;
import org.firstinspires.ftc.teamcode.subsystems.Elevador;
import org.firstinspires.ftc.teamcode.subsystems.MecanumDriveSubsystem;

public class RojoMidCorto extends SequentialCommandGroup {
    RedShort redShort = new RedShort();

    public RojoMidCorto(MecanumDriveSubsystem drive, Elevador elevador){

        addCommands(
                new TrajectoryFollowerCommand(drive, redShort.redMidShort1(drive.getDrive())),
                new TrajectoryFollowerCommand(drive, redShort.redMidShort2(drive.getDrive())),
                new InstantCommand(elevador::mid),
                new WaitCommand(500),
                new InstantCommand(elevador::leave),
                new WaitCommand(500),
                new TrajectoryFollowerCommand(drive, redShort.redMidShort3(drive.getDrive())),
                new InstantCommand(elevador::recall),
                new TrajectoryFollowerCommand(drive, redShort.redMidShort4(drive.getDrive()))
        );
    }
}
