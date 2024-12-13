package org.firstinspires.ftc.teamcode.autonomousThings.Trajectories;

import com.arcrobotics.ftclib.command.CommandOpMode;
import com.arcrobotics.ftclib.geometry.Pose2d;
import com.arcrobotics.ftclib.trajectory.Trajectory;
import com.arcrobotics.ftclib.trajectory.TrajectoryConfig;
import com.arcrobotics.ftclib.trajectory.TrajectoryGenerator;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.custom.Pose2dUtil;
import org.firstinspires.ftc.teamcode.custom.Rotation2dUtil;
import org.firstinspires.ftc.teamcode.custom.Translation2dUtil;
import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;
import org.firstinspires.ftc.teamcode.subsystems.MecanumDriveSubsystem;
import org.firstinspires.ftc.teamcode.util.BezierUtil;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Pruebas extends CommandOpMode {

    SampleMecanumDrive drive = new SampleMecanumDrive(hardwareMap);
    MecanumDriveSubsystem driveSubsystem = new MecanumDriveSubsystem(drive, false, false);
    List<Translation2dUtil> translationPoints = BezierUtil.bezierFromPoses(
            new Pose2dUtil(
                    driveSubsystem.getPoseEstimate()
                            .getX(),
                    driveSubsystem.getPoseEstimate().getY(),
                    new Rotation2dUtil(driveSubsystem.getPoseEstimate().getHeading())), new Pose2dUtil(24, 24,new Rotation2dUtil() )); //RobotPosition, TargetPosition
    List<Pose2d> bezierPoints = translationPoints.stream().map(translation -> new Pose2dUtil(translation, new Rotation2dUtil())).collect(Collectors.toList());
    public void pruebaTrajectory(){
        Trajectory Forward = TrajectoryGenerator.generateTrajectory(bezierPoints, new TrajectoryConfig(.25, .25));
    }

    @Override
    public void initialize() {

    }
}
