package org.firstinspires.ftc.teamcode.autonomousThings.Commands.Red;

import com.arcrobotics.ftclib.command.CommandOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.autonomousThings.Commands.Red.Corto.RojoDerCorto;
import org.firstinspires.ftc.teamcode.autonomousThings.Commands.Red.Corto.RojoMidCorto;
import org.firstinspires.ftc.teamcode.autonomousThings.Commands.Red.Largo.RojoDerLrg;
import org.firstinspires.ftc.teamcode.autonomousThings.Commands.Red.Largo.RojoIzqLrg;
import org.firstinspires.ftc.teamcode.autonomousThings.Commands.Red.Largo.RojoMidLrg;
import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;
import org.firstinspires.ftc.teamcode.subsystems.Elevador;
import org.firstinspires.ftc.teamcode.subsystems.Intake;
import org.firstinspires.ftc.teamcode.subsystems.MecanumDriveSubsystem;

@Autonomous
public class Rojo extends CommandOpMode {
    RojoMidLrg rojoMidLrg;
    RojoMidCorto rojoMidCorto;
    RojoDerLrg rojoDerLrg;
    RojoIzqLrg rojoIzqLrg;
    RojoDerCorto rojoDerCorto;
    SampleMecanumDrive sampleMecanumDrive;
    MecanumDriveSubsystem drive;
    Intake intake;
    Elevador elevador;

    public void initialize() {
        sampleMecanumDrive = new SampleMecanumDrive(hardwareMap);
        drive = new MecanumDriveSubsystem(sampleMecanumDrive, false, false);
        intake = new Intake(hardwareMap, telemetry);
        elevador = new Elevador(hardwareMap, telemetry);
        //rojoMidLrg = new RojoMidLrg(drive, intake, elevador);
        //rojoMidCorto = new RojoMidCorto(drive, elevador);
        //rojoDerLrg = new RojoDerLrg(drive, intake, elevador);
        //rojoIzqLrg = new RojoIzqLrg(drive, intake, elevador);
        rojoDerCorto = new RojoDerCorto(drive, elevador);

        schedule(rojoDerCorto);
    }
}
