package org.firstinspires.ftc.teamcode.autonomousThings.Commands.Red.Largo;

import com.arcrobotics.ftclib.command.InstantCommand;
import com.arcrobotics.ftclib.command.SequentialCommandGroup;
import com.arcrobotics.ftclib.command.WaitCommand;

import org.firstinspires.ftc.teamcode.autonomousThings.Trajectories.RedLong;
import org.firstinspires.ftc.teamcode.commands.IntakeCommand;
import org.firstinspires.ftc.teamcode.commands.TrajectoryFollowerCommand;
import org.firstinspires.ftc.teamcode.subsystems.Elevador;
import org.firstinspires.ftc.teamcode.subsystems.Intake;
import org.firstinspires.ftc.teamcode.subsystems.MecanumDriveSubsystem;

import java.util.function.BooleanSupplier;

public class RojoMidLrg extends SequentialCommandGroup {
    RedLong redLong = new RedLong();

    public RojoMidLrg(MecanumDriveSubsystem drive, Intake intake, Elevador elevador){
        BooleanSupplier sup = new BooleanSupplier() {
            @Override
            public boolean getAsBoolean() {
                return RojoMidLrg.super.isScheduled();
            }
        };

        addCommands(
                new TrajectoryFollowerCommand(drive, redLong.redMidLong1(drive.getDrive())),
                new TrajectoryFollowerCommand(drive, redLong.redMidLong2(drive.getDrive())),
                new InstantCommand(intake::dejar),
                new IntakeCommand(intake, 1),
                new TrajectoryFollowerCommand(drive, redLong.redMidLong3(drive.getDrive())),
                new TrajectoryFollowerCommand(drive, redLong.redMidLong4(drive.getDrive())),
                new TrajectoryFollowerCommand(drive, redLong.redMidLong5(drive.getDrive())),
                new InstantCommand(elevador::mid),
                new WaitCommand(500),
                new InstantCommand(elevador::leave),
                new WaitCommand(500),
                new TrajectoryFollowerCommand(drive, redLong.redMidLrg6(drive.getDrive())),
                new InstantCommand(elevador::recall),
                new TrajectoryFollowerCommand(drive, redLong.redMidLrg7(drive.getDrive())),
                new IntakeCommand(intake, -1)
        );

    }
}
