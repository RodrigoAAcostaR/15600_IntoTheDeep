package org.firstinspires.ftc.teamcode.autonomousThings.Commands.Blue.Largo;

import com.arcrobotics.ftclib.command.InstantCommand;
import com.arcrobotics.ftclib.command.SequentialCommandGroup;
import com.arcrobotics.ftclib.command.WaitCommand;

import org.firstinspires.ftc.teamcode.autonomousThings.Trajectories.AzulLargo;
import org.firstinspires.ftc.teamcode.commands.IntakeCommand;
import org.firstinspires.ftc.teamcode.commands.TrajectoryFollowerCommand;
import org.firstinspires.ftc.teamcode.subsystems.Elevador;
import org.firstinspires.ftc.teamcode.subsystems.Intake;
import org.firstinspires.ftc.teamcode.subsystems.MecanumDriveSubsystem;

import java.util.function.BooleanSupplier;

public class AzulIzqLrg extends SequentialCommandGroup {
    AzulLargo azulLargo = new AzulLargo();

    BooleanSupplier sup = new BooleanSupplier() {
        @Override
        public boolean getAsBoolean() {
            return AzulIzqLrg.super.isScheduled();
        }
    };

    public AzulIzqLrg(MecanumDriveSubsystem drive, Intake intake, Elevador elevador){
        addCommands(
                new TrajectoryFollowerCommand(drive, azulLargo.azulIzqLrg1(drive.getDrive())),
                new TrajectoryFollowerCommand(drive, azulLargo.azulIzqLrg2(drive.getDrive())),
                new InstantCommand(intake::dejar),
                new IntakeCommand(intake, 1),
                new TrajectoryFollowerCommand(drive, azulLargo.azulIzqLrg3(drive.getDrive())),
                new InstantCommand(intake::servoB),
                new TrajectoryFollowerCommand(drive, azulLargo.azulIzqLrg4(drive.getDrive())),
                new InstantCommand(elevador::mid),
                new WaitCommand(500),
                new InstantCommand(elevador::leave),
                new WaitCommand(500),
                new TrajectoryFollowerCommand(drive, azulLargo.azulIzqLrg5(drive.getDrive())),
                new InstantCommand(elevador::recall),
                new IntakeCommand(intake, -1),
                new TrajectoryFollowerCommand(drive, azulLargo.azulIzqLrg6(drive.getDrive()))
        );
    }
}
