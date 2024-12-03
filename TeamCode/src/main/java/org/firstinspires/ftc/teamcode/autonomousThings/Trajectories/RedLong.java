package org.firstinspires.ftc.teamcode.autonomousThings.Trajectories;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.trajectory.Trajectory;

import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;

public class RedLong {

    public Trajectory redMidLong1(SampleMecanumDrive drive){
        Pose2d firstPose = new Pose2d(-36, -71, Math.toRadians(270));
        drive.setPoseEstimate(firstPose);
        return drive.trajectoryBuilder(firstPose)
                .back(50)
                .build();
    }

    public Trajectory redMidLong2(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(-36, -21, Math.toRadians(270)))
                .splineToSplineHeading(new Pose2d(-73, -32, Math.toRadians(180)), Math.toRadians(180))
                .build();
    }

    public Trajectory redMidLong3(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(-73, -34, Math.toRadians(180)))
                .lineToLinearHeading(new Pose2d(-6, -72, Math.toRadians(0)))
                .build();
    }


    public Trajectory redMidLong4(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(-6, -72, Math.toRadians(0)))
                .forward(40)
                .build();
    }


/*
    public Trajectory redMidLong4(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(-6, -72, Math.toRadians(0)))
                .splineToSplineHeading(new Pose2d(120, -20, Math.toRadians(0)), Math.toRadians(0))
                .build();
    }

 */

    public Trajectory redMidLong5(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(34, -72, Math.toRadians(0)))
                .splineToSplineHeading(new Pose2d(126, -24, Math.toRadians(0)), Math.toRadians(0))
                .build();
    }

    public Trajectory redMidLrg6(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(126, -26, Math.toRadians(0)))
                .back(10)
                .build();
    }

    public Trajectory redMidLrg7(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(116, -26, Math.toRadians(0)))
                .lineToLinearHeading(new Pose2d(120, -80, Math.toRadians(0)))
                .build();
    }


    public Trajectory redDerLrg1(SampleMecanumDrive drive){
        Pose2d firstPose = new Pose2d(-36, -71, Math.toRadians(270));
        drive.setPoseEstimate(firstPose);
        return drive.trajectoryBuilder(firstPose)
                .lineToSplineHeading(new Pose2d(-30, -15, Math.toRadians(180)))
                .build();
    }

    public Trajectory redDerLrg2(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(-30, -15, Math.toRadians(180)))
                .splineToSplineHeading(new Pose2d(-76, -26, Math.toRadians(180)), Math.toRadians(180))
                .build();
    }

    public Trajectory redDerLrg3(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(-76, -26, Math.toRadians(180)))
                .lineToLinearHeading(new Pose2d(-6, -67, Math.toRadians(0)))
                .build();
    }

    public Trajectory redDerLrg4(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(-6, -67, Math.toRadians(0)))
                .forward(40)
                .build();
    }

    public Trajectory redDerLrg5(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(36, -69, Math.toRadians(0)))
                .splineToSplineHeading(new Pose2d(115, -34, Math.toRadians(0)), Math.toRadians(0))
                .build();
    }

    public Trajectory redDerLrg6(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(115, -34, Math.toRadians(0)))
                .back(10)
                .build();
    }

    public Trajectory redDerLrg7(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(105, -34, Math.toRadians(0)))
                .lineToLinearHeading(new Pose2d(120, -80, Math.toRadians(0)))
                .build();
    }

    public Trajectory redDerLrg8(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(120, -80, Math.toRadians(180)))
                .forward(5)
                .build();
    }

    public Trajectory redIzqLrg1(SampleMecanumDrive drive){
        Pose2d firstPose = new Pose2d(-36, -71, Math.toRadians(270));
        drive.setPoseEstimate(firstPose);
        return drive.trajectoryBuilder(firstPose)
                .lineToLinearHeading(new Pose2d(-52, -24, Math.toRadians(270)))
                .build();
    }

    public Trajectory redIzqLrg2(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(-52, -24, Math.toRadians(270)))
                .splineToSplineHeading(new Pose2d(-77, -32, Math.toRadians(180)), Math.toRadians(180))
                .build();
    }

    public Trajectory redIzqLrg3(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(-75, -32, Math.toRadians(180)))
                .lineToLinearHeading(new Pose2d(-6, -72, Math.toRadians(0)))
                .build();
    }

    public Trajectory redIzqLrg4(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(-6, -72, Math.toRadians(0)))
                .forward(40)
                .build();
    }


    public Trajectory redIzqLrg5(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(36, -72, Math.toRadians(0)))
                .splineToSplineHeading(new Pose2d(120, -14, Math.toRadians(0)), Math.toRadians(0))
                .build();
    }

    public Trajectory redIzqLrg6(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(120, -14, Math.toRadians(0)))
                .back(12)
                .build();
    }

    public Trajectory redIzqLrg7(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(108, -14, Math.toRadians(0)))
                .lineToLinearHeading(new Pose2d(120, -84, Math.toRadians(0)))
                .build();
    }



}
