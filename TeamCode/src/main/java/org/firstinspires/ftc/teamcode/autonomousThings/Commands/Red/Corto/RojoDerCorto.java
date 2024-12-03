package org.firstinspires.ftc.teamcode.autonomousThings.Commands.Red.Corto;

import com.arcrobotics.ftclib.command.InstantCommand;
import com.arcrobotics.ftclib.command.SequentialCommandGroup;
import com.arcrobotics.ftclib.command.WaitCommand;

import org.firstinspires.ftc.teamcode.autonomousThings.Trajectories.RedShort;
import org.firstinspires.ftc.teamcode.commands.TrajectoryFollowerCommand;
import org.firstinspires.ftc.teamcode.subsystems.Elevador;
import org.firstinspires.ftc.teamcode.subsystems.MecanumDriveSubsystem;

public class RojoDerCorto extends SequentialCommandGroup {
    RedShort redShort = new RedShort();

    public RojoDerCorto(MecanumDriveSubsystem drive, Elevador elevador){
        addCommands(
                new TrajectoryFollowerCommand(drive, redShort.redDerShort1(drive.getDrive())),
                new TrajectoryFollowerCommand(drive, redShort.redDerShort2(drive.getDrive())),
                new InstantCommand(elevador::mid),
                new WaitCommand(500),
                new InstantCommand(elevador::leave),
                new WaitCommand(500),
                new TrajectoryFollowerCommand(drive, redShort.redDerShort3(drive.getDrive())),
                new InstantCommand(elevador::recall),
                new TrajectoryFollowerCommand(drive, redShort.redDerShort4(drive.getDrive()))

        );
    }
}
