package org.firstinspires.ftc.teamcode.util;

import com.arcrobotics.ftclib.geometry.Pose2d;
import com.arcrobotics.ftclib.geometry.Rotation2d;


import org.firstinspires.ftc.teamcode.custom.Pose2dUtil;
import org.firstinspires.ftc.teamcode.custom.Rotation2dUtil;
import org.firstinspires.ftc.teamcode.custom.Translation2dUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BezierUtil {
    /**
     * Create the bezier points necessary to create a path using a list of poses
     *
     * @param poses List of poses. Each pose represents one waypoint.
     * @return Bezier points
     */
    public static List<Translation2dUtil> bezierFromPoses(List<Pose2dUtil> poses) {
        if (poses.size() < 2) {
            throw new IllegalArgumentException("Not enough poses");
        }

        List<Translation2dUtil> bezierPoints = new ArrayList<>();

        // First pose
        bezierPoints.add(poses.get(0).getTranslation());
        bezierPoints.add(
                poses
                        .get(0)
                        .getTranslation()
                        .plus(
                                new Translation2dUtil(
                                        poses.get(0).getTranslation().getDistance(poses.get(1).getTranslation()) / 3.0,
                                        poses.get(0).getRotation())));

        // Middle poses
        for (int i = 1; i < poses.size() - 1; i++) {
            Translation2dUtil anchor = poses.get(i).getTranslation();

            // Prev control
            bezierPoints.add(
                    anchor.plus(
                            new Translation2dUtil(
                                    anchor.getDistance(poses.get(i - 1).getTranslation()) / 3.0,
                                    poses.get(i).getRotation().plus(Rotation2dUtil.fromDegrees(180)))));
            // Anchor
            bezierPoints.add(anchor);
            // Next control
            bezierPoints.add(
                    anchor.plus(
                            new Translation2dUtil(
                                    anchor.getDistance(poses.get(i + 1).getTranslation()) / 3.0,
                                    poses.get(i).getRotation())));
        }

        // Last pose
        bezierPoints.add(
                poses
                        .get(poses.size() - 1)
                        .getTranslation()
                        .plus(
                                new Translation2dUtil(
                                        poses
                                                .get(poses.size() - 1)
                                                .getTranslation()
                                                .getDistance(poses.get(poses.size() - 2).getTranslation())
                                                / 3.0,
                                        poses.get(poses.size() - 1).getRotation().plus(Rotation2dUtil.fromDegrees(180)))));
        bezierPoints.add(poses.get(poses.size() - 1).getTranslation());

        return bezierPoints;
    }

    /**
     * Create the bezier points necessary to create a path using a list of poses
     *
     * @param poses List of poses. Each pose represents one waypoint.
     * @return Bezier points
     */
    public static List<Translation2dUtil> bezierFromPoses(Pose2dUtil... poses) {
        return bezierFromPoses(Arrays.asList(poses));
    }
}
