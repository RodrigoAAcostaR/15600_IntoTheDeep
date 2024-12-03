package org.firstinspires.ftc.teamcode.autonomousThings.Trajectories;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.acmerobotics.roadrunner.trajectory.Trajectory;

import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;

public class AzulLargo {

    public Trajectory azulMidLrg1(SampleMecanumDrive drive) {
        Pose2d firstPose = new Pose2d(-39, 66.17, Math.toRadians(90));
        drive.setPoseEstimate(firstPose);
        return drive.trajectoryBuilder(firstPose)
                .back(50)
                .build();
    }

    public Trajectory azulMidLrg2(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(-39, 16.17, Math.toRadians(90)))
                .splineToSplineHeading(new Pose2d(-75, 27, Math.toRadians(180)), Math.toRadians(180))
                .build();
    }

    public Trajectory azulMidLrg31(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(-74, 26, Math.toRadians(180)))
                .lineToLinearHeading(new Pose2d(0, 66, Math.toRadians(0)))
                .build();
    }

    public Trajectory azulMidLrg4(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(0, 66, Math.toRadians(0)))
                .splineToSplineHeading(new Pose2d(117, 33, Math.toRadians(0)), Math.toRadians(0))
                .build();
    }

    public Trajectory azulMidLrg5(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(117, 33))
                .back(10)
                .build();
    }

    public Trajectory azulMidLrg6(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(107, 35, Math.toRadians(0)))
                .lineToLinearHeading(new Pose2d(105, 70, Math.toRadians(180)))
                .build();
    }

    public Trajectory azulDerLrg1(SampleMecanumDrive drive) {
        Pose2d firstPose = new Pose2d(-39, 66.17, Math.toRadians(90));
        drive.setPoseEstimate(firstPose);
        return drive.trajectoryBuilder(firstPose)
                .lineTo(new Vector2d(-58, 15))
                .build();
    }

    public Trajectory azulDerLrg2(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(-58, 15, Math.toRadians(90)))
                .splineToSplineHeading(new Pose2d(-79, 25, Math.toRadians(180)), Math.toRadians(180))
                .build();
    }

    public Trajectory azulDerLrg3(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(-78, 25, Math.toRadians(180)))
                .lineToLinearHeading(new Pose2d(-2, 67, Math.toRadians(0)))
                .build();
    }

    public Trajectory azulDerLrg4(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(-2, 67, Math.toRadians(0)))
                .splineToSplineHeading(new Pose2d(117, 19, Math.toRadians(0)), Math.toRadians(0))
                .build();
    }

    public Trajectory azulDerLrg5(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(117, 20))
                .back(10)
                .build();
    }

    public Trajectory azulDerLrg6(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(107, 20, Math.toRadians(0)))
                .lineToLinearHeading(new Pose2d(105, 70, Math.toRadians(180)))
                .build();
    }

    public Trajectory azulDerLrg7(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(105, 70, Math.toRadians(180)))
                .back(40)
                .build();
    }

    public Trajectory azulIzqLrg1(SampleMecanumDrive drive) {
        Pose2d firstPose = new Pose2d(-39, 66.17, Math.toRadians(90));
        drive.setPoseEstimate(firstPose);
        return drive.trajectoryBuilder(firstPose)
                .lineToSplineHeading(new Pose2d(-30, 10, Math.toRadians(180)))
                .build();
    }

    public Trajectory azulIzqLrg2(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(-30, 10, Math.toRadians(180)))
                .splineToSplineHeading(new Pose2d(-75, 23, Math.toRadians(180)), Math.toRadians(180))
                .build();
    }

    public Trajectory azulIzqLrg3(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(-75, 22, Math.toRadians(180)))
                .lineToLinearHeading(new Pose2d(-2, 67, Math.toRadians(0)))
                .build();
    }

    public Trajectory azulIzqLrg4(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(-2, 67, Math.toRadians(0)))
                .splineToSplineHeading(new Pose2d(119, 43, Math.toRadians(0)), Math.toRadians(0))
                .build();
    }

    public Trajectory azulIzqLrg5(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(119, 45))
                .back(10)
                .build();
    }

    public Trajectory azulIzqLrg6(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(109, 45, Math.toRadians(0)))
                .lineToLinearHeading(new Pose2d(107, 67, Math.toRadians(180)))
                .build();
    }

}


