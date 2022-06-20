package frc.robot.hardware;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import frc.robot.hardware.constants;

public class drivetrain {

    //Make Hardware Objects
    private static TalonSRX m_leftFrontDrive;
    private static TalonSRX m_leftBackDrive;
    private static TalonSRX m_rightFrontDrive;
    private static TalonSRX m_rightBackDrive;

    //Create drivetrain variables
    public double[] motorspeeds;

    //Create motor objects
    public drivetrain() {
        m_leftFrontDrive = new TalonSRX(constants.LeftFrontDrive);
        m_leftBackDrive = new TalonSRX(constants.LeftBackDrive);
        m_rightFrontDrive = new TalonSRX(constants.RightFrontDrive);
        m_rightBackDrive = new TalonSRX(constants.RightBackDrive);

        //Set motor inversions
        m_rightBackDrive.setInverted(true);
        m_rightFrontDrive.setInverted(true);

        motorspeeds = new double[4];
    }
}
//Code here for mechanum drive.
//Code here for tank drive.
//Code here for Arcade drive.
//Code here foe WCD. 