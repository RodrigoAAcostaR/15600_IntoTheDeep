package org.firstinspires.ftc.teamcode.autonomousThings.Trajectories;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.acmerobotics.roadrunner.trajectory.Trajectory;

import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;

public class RedShort {

    public Trajectory redMidShort1(SampleMecanumDrive drive){
        Pose2d firstPose = new Pose2d(13, -70, Math.toRadians(270));
        drive.setPoseEstimate(firstPose);
        return drive.trajectoryBuilder(firstPose)
                .back(50)
                .build();
    }

    public Trajectory redMidShort2(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(13, -20, Math.toRadians(270)))
                .splineToSplineHeading(new Pose2d(80, -16, Math.toRadians(0)), Math.toRadians(0))
                .build();
    }

    public Trajectory redMidShort3(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(80, -16))
                .back(10)
                .build();
    }

    public Trajectory redMidShort4(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(70, -16))
                .lineToLinearHeading(new Pose2d(80, 15))
                .build();
    }

    public Trajectory redDerShort1(SampleMecanumDrive drive){
        Pose2d firstPose = new Pose2d(13, -70, Math.toRadians(270));
        drive.setPoseEstimate(firstPose);
        return drive.trajectoryBuilder(firstPose)
                .lineTo(new Vector2d(32, -20))
                .build();
    }

    public Trajectory redDerShort2(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(32, -20, Math.toRadians(270)))
                .splineToSplineHeading(new Pose2d(82, -24, Math.toRadians(0)), Math.toRadians(0))
                .build();
    }
     public Trajectory redDerShort3(SampleMecanumDrive drive){
         return drive.trajectoryBuilder(new Pose2d(82, -24))
                 .back(10)
                 .build();
     }

    public Trajectory redDerShort4(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(70, -24))
                .lineToLinearHeading(new Pose2d(80, 20))
                .build();
    }

    public Trajectory redIzqShort1(SampleMecanumDrive drive){
        Pose2d firstPose = new Pose2d(13, -70, Math.toRadians(270));
        drive.setPoseEstimate(firstPose);
        return drive.trajectoryBuilder(firstPose)
                .lineToSplineHeading(new Pose2d(6, -25, Math.toRadians(0)))
                .build();
    }

    public Trajectory redIzqShort2(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(6,-25, Math.toRadians(0)))
                .splineToSplineHeading(new Pose2d(58, -22, Math.toRadians(0)), Math.toRadians(0))
                .build();
    }
}
