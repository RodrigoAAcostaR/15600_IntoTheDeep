package org.firstinspires.ftc.teamcode.custom;

public class Twist2dUtil {
    /**
     * Linear "dx" component.
     */
    public double dx;

    /**
     * Linear "dy" component.
     */
    public double dy;

    /**
     * Angular "dtheta" component (radians).
     */
    public double dtheta;

    public Twist2dUtil() {
    }

    /**
     * Constructs a Twist2d with the given values.
     *
     * @param dx     Change in x direction relative to robot.
     * @param dy     Change in y direction relative to robot.
     * @param dtheta Change in angle relative to robot.
     */
    public Twist2dUtil(double dx, double dy, double dtheta) {
        this.dx = dx;
        this.dy = dy;
        this.dtheta = dtheta;
    }

    @Override
    public String toString() {
        return String.format("Twist2d(dX: %.2f, dY: %.2f, dTheta: %.2f)", dx, dy, dtheta);
    }

    /**
     * Checks equality between this Twist2d and another object.
     *
     * @param obj The other object.
     * @return Whether the two objects are equal or not.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof com.arcrobotics.ftclib.geometry.Twist2d) {
            return Math.abs(((com.arcrobotics.ftclib.geometry.Twist2d) obj).dx - dx) < 1E-9
                    && Math.abs(((com.arcrobotics.ftclib.geometry.Twist2d) obj).dy - dy) < 1E-9
                    && Math.abs(((com.arcrobotics.ftclib.geometry.Twist2d) obj).dtheta - dtheta) < 1E-9;
        }
        return false;
    }
}
