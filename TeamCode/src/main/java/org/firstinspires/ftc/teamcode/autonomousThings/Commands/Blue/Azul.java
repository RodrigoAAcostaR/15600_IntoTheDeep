package org.firstinspires.ftc.teamcode.autonomousThings.Commands.Blue;

import com.arcrobotics.ftclib.command.CommandOpMode;

import org.firstinspires.ftc.teamcode.autonomousThings.Commands.Blue.Largo.AzulDerLrg;
import org.firstinspires.ftc.teamcode.autonomousThings.Commands.Blue.Largo.AzulIzqLrg;
import org.firstinspires.ftc.teamcode.autonomousThings.Commands.Blue.Largo.AzulMidLrg;
import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;
import org.firstinspires.ftc.teamcode.subsystems.Elevador;
import org.firstinspires.ftc.teamcode.subsystems.Intake;
import org.firstinspires.ftc.teamcode.subsystems.MecanumDriveSubsystem;


public class Azul extends CommandOpMode {

    AzulMidLrg azulMidLargo;
    AzulDerLrg azulDerLrg;
    AzulIzqLrg azulIzqLrg;
    Elevador elevador;
    SampleMecanumDrive drive;
    MecanumDriveSubsystem driveSubsystem;
    Intake intake;

    @Override
    public void initialize() {
        drive = new SampleMecanumDrive(hardwareMap);
        intake = new Intake(hardwareMap, telemetry);
        elevador = new Elevador(hardwareMap, telemetry);
        driveSubsystem = new MecanumDriveSubsystem(drive, false, false);
        //azulMidLargo = new AzulMidLargo(driveSubsystem, intake, elevador);
        //azulDerLrg = new AzulDerLrg(driveSubsystem, intake, elevador);
        azulIzqLrg = new AzulIzqLrg(driveSubsystem, intake, elevador);

        schedule(azulIzqLrg);
    }
}
