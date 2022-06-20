package frc.robot.hardware;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import frc.robot.Constants;

public class Drivetrain {

    //Make Hardware Objects
    private static TalonSRX m_leftFrontDrive;
    private static TalonSRX m_leftBackDrive;
    private static TalonSRX m_rightFrontDrive;
    private static TalonSRX m_rightBackDrive;

    //Create drivetrain variables
    public double[] motorspeeds;

    //Create motor objects
    public Drivetrain() {
        m_leftFrontDrive = new TalonSRX(Constants.LeftFrontDrive);
        m_leftBackDrive = new TalonSRX(Constants.LeftBackDrive);
        m_rightFrontDrive = new TalonSRX(Constants.RightFrontDrive);
        m_rightBackDrive = new TalonSRX(Constants.RightBackDrive);

        //Set motor inversions
        m_rightBackDrive.setInverted(true);
        m_rightFrontDrive.setInverted(true);

        motorspeeds = new double[4];
    }
//Code here for mechanum drive.
//Code here for tank drive.
//Code here for Arcade drive.
//Code here foe WCD. 