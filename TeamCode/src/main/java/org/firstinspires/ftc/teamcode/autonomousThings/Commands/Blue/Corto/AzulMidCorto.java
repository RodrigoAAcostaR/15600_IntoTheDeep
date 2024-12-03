package org.firstinspires.ftc.teamcode.autonomousThings.Commands.Blue.Corto;

import com.arcrobotics.ftclib.command.InstantCommand;
import com.arcrobotics.ftclib.command.SequentialCommandGroup;
import com.arcrobotics.ftclib.command.WaitCommand;

import org.firstinspires.ftc.teamcode.autonomousThings.Trajectories.AzulCorto;
import org.firstinspires.ftc.teamcode.commands.TrajectoryFollowerCommand;
import org.firstinspires.ftc.teamcode.subsystems.Elevador;
import org.firstinspires.ftc.teamcode.subsystems.MecanumDriveSubsystem;

public class AzulMidCorto  extends SequentialCommandGroup {

    AzulCorto azulCorto = new AzulCorto();


    public AzulMidCorto(MecanumDriveSubsystem drive, Elevador elevador){
        addCommands(new TrajectoryFollowerCommand(drive, azulCorto.azulMid1(drive.getDrive())),
                new TrajectoryFollowerCommand(drive, azulCorto.azulMid2(drive.getDrive())),
                new InstantCommand(elevador::mid),
                new WaitCommand(500),
                new InstantCommand(elevador::leave),
                new WaitCommand(500),
                new TrajectoryFollowerCommand(drive, azulCorto.azulMid3(drive.getDrive())),
                new InstantCommand(elevador::recall),
                new TrajectoryFollowerCommand(drive, azulCorto.azulMid4(drive.getDrive())));
    }
}
