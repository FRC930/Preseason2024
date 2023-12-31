package frc.robot.generated;

import com.ctre.phoenix6.configs.Slot0Configs;
import com.ctre.phoenix6.mechanisms.swerve.SwerveDrivetrainConstants;
import com.ctre.phoenix6.mechanisms.swerve.SwerveModuleConstants;
import com.ctre.phoenix6.mechanisms.swerve.SwerveModuleConstantsFactory;
import com.ctre.phoenix6.mechanisms.swerve.SwerveModule.ClosedLoopOutputType;
import com.ctre.phoenix6.mechanisms.swerve.SwerveModuleConstants.SteerFeedbackType;

import edu.wpi.first.math.util.Units;
import frc.robot.subsystems.SwerveDrivetrainSubsystem;

public class TunerConstants {
    // Both sets of gains need to be tuned to your individual robot.

    // The steer motor uses any SwerveModule.SteerRequestType control request with the
    // output type specified by SwerveModuleConstants.SteerMotorClosedLoopOutput
    private static final Slot0Configs steerGains = new Slot0Configs()
        .withKP(100).withKI(0).withKD(0.05)
        .withKS(0).withKV(1.5).withKA(0);
    // When using closed-loop control, the drive motor uses the control
    // output type specified by SwerveModuleConstants.DriveMotorClosedLoopOutput
    public static final Slot0Configs driveGains = new Slot0Configs()
        // with gains commented during characterization
        .withKP(0.078).withKI(0).withKD(0)
        .withKS(0.2125).withKV(0.11624).withKA(0.005648);
        // // With gains not commented
        // .withKP(0.027).withKI(0).withKD(0)
        // .withKS(0.15).withKV(0.11457).withKA(0.003);

        //SJW: TorqueCurrentFOC for Phoenix Pro version
    // The closed-loop output type to use for the steer motors;
    // This affects the PID/FF gains for the steer motors
    private static final ClosedLoopOutputType steerClosedLoopOutput = ClosedLoopOutputType.Voltage;
    // The closed-loop output type to use for the drive motors;
    // This affects the PID/FF gains for the drive motors
    private static final ClosedLoopOutputType driveClosedLoopOutput = ClosedLoopOutputType.Voltage;

    // The stator current at which the wheels start to slip;
    // This needs to be tuned to your individual robot
    private static final double kSlipCurrentA = 300.0;

    // Theoretical free speed (m/s) at 12v applied output;
    // This needs to be tuned to your individual robot
    private static final double kSpeedAt12VoltsMps = 6.0;

    // Every 1 rotation of the azimuth results in kCoupleRatio drive motor turns;
    // This may need to be tuned to your individual robot
    private static final double kCoupleRatio = 0.0;

    //https://www.swervedrivespecialties.com/products/mk3-swerve-module?variant=31575980703857
    // MK3 Falcon 13.6 ft/s 8.16:1 or 16.2 ft/s 6.86:1
    private static final double kDriveGearRatio = 6.86; // 8.16;  // 6.86
    private static final double kSteerGearRatio = 12.8;
    private static final double kWheelRadiusInches = 2;
    private static final boolean kSteerMotorReversed = false;
    private static final boolean kInvertLeftSide = false;
    private static final boolean kInvertRightSide = true;

    private static final String kCANbusName = "CANBUS";
    private static final int kPigeonId = 13;


    // These are only used for simulation
    private static double kSteerInertia = 0.00001;
    private static double kDriveInertia = 0.001;

    private static final SwerveDrivetrainConstants DrivetrainConstants = new SwerveDrivetrainConstants()
            .withPigeon2Id(kPigeonId)
            .withCANbusName(kCANbusName);        

    private static final SwerveModuleConstantsFactory ConstantCreator = new SwerveModuleConstantsFactory()
            .withDriveMotorGearRatio(kDriveGearRatio)
            .withSteerMotorGearRatio(kSteerGearRatio)
            .withWheelRadius(kWheelRadiusInches)
            .withSlipCurrent(kSlipCurrentA)
            .withSteerMotorGains(steerGains)
            // TODO CHARACTERIZATION comment out
            .withDriveMotorGains(driveGains)
            .withSteerMotorClosedLoopOutput(steerClosedLoopOutput)
            .withDriveMotorClosedLoopOutput(driveClosedLoopOutput)
            .withSpeedAt12VoltsMps(kSpeedAt12VoltsMps)
            .withSteerInertia(kSteerInertia)
            .withDriveInertia(kDriveInertia)
            .withFeedbackSource(SteerFeedbackType.FusedCANcoder)
            .withCouplingGearRatio(kCoupleRatio)
            .withSteerMotorInverted(kSteerMotorReversed);


    // Front Left
    private static final int kFrontLeftDriveMotorId = 9;
    private static final int kFrontLeftSteerMotorId = 8;
    private static final int kFrontLeftEncoderId = 8;
    private static final double kFrontLeftEncoderOffset = -0.722900390625;

    private static final double kFrontLeftXPosInches = 11;
    private static final double kFrontLeftYPosInches = 11.25;

    // Front Right
    private static final int kFrontRightDriveMotorId = 11;
    private static final int kFrontRightSteerMotorId = 10;
    private static final int kFrontRightEncoderId = 10;
    private static final double kFrontRightEncoderOffset = -0.15283203125;

    private static final double kFrontRightXPosInches = 11;
    private static final double kFrontRightYPosInches = -11.25;

    // Back Left
    private static final int kBackLeftDriveMotorId = 2;
    private static final int kBackLeftSteerMotorId = 1;
    private static final int kBackLeftEncoderId = 1;
    private static final double kBackLeftEncoderOffset = -0.20654296875;

    private static final double kBackLeftXPosInches = -11;
    private static final double kBackLeftYPosInches = 11.25;

    // Back Right
    private static final int kBackRightDriveMotorId = 18;
    private static final int kBackRightSteerMotorId = 17;
    private static final int kBackRightEncoderId = 17;
    private static final double kBackRightEncoderOffset = -0.2958984375;

    private static final double kBackRightXPosInches = -11;
    private static final double kBackRightYPosInches = -11.25;


    private static final SwerveModuleConstants FrontLeft = ConstantCreator.createModuleConstants(
            kFrontLeftSteerMotorId, kFrontLeftDriveMotorId, kFrontLeftEncoderId, kFrontLeftEncoderOffset, Units.inchesToMeters(kFrontLeftXPosInches), Units.inchesToMeters(kFrontLeftYPosInches), kInvertLeftSide);
    private static final SwerveModuleConstants FrontRight = ConstantCreator.createModuleConstants(
            kFrontRightSteerMotorId, kFrontRightDriveMotorId, kFrontRightEncoderId, kFrontRightEncoderOffset, Units.inchesToMeters(kFrontRightXPosInches), Units.inchesToMeters(kFrontRightYPosInches), kInvertRightSide);
    private static final SwerveModuleConstants BackLeft = ConstantCreator.createModuleConstants(
            kBackLeftSteerMotorId, kBackLeftDriveMotorId, kBackLeftEncoderId, kBackLeftEncoderOffset, Units.inchesToMeters(kBackLeftXPosInches), Units.inchesToMeters(kBackLeftYPosInches), kInvertLeftSide);
    private static final SwerveModuleConstants BackRight = ConstantCreator.createModuleConstants(
            kBackRightSteerMotorId, kBackRightDriveMotorId, kBackRightEncoderId, kBackRightEncoderOffset, Units.inchesToMeters(kBackRightXPosInches), Units.inchesToMeters(kBackRightYPosInches), kInvertRightSide);

    public static final SwerveDrivetrainSubsystem DriveTrain = new SwerveDrivetrainSubsystem(DrivetrainConstants, FrontLeft,
            FrontRight, BackLeft, BackRight);
}
