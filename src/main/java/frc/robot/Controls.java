package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;

public class Controls {
    private static Controls instance;

    public static Controls getInstance() {
        if(instance ==null) {
            return instance = new Controls();
        }
        else {
            return instance;
        }
    }

    public final Joystick leftJoy = new Joystick(0);
    public final Joystick rightJoy = new Joystick(1);
    public final XboxController controller = new XboxController(2);
}
