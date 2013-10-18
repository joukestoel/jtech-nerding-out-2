package nl.ordina.nerdingout.tutorial.myrobots;

import robocode.AdvancedRobot;
import robocode.ScannedRobotEvent;

public class TutorialFiring1 extends AdvancedRobot {

    @Override
    public void run() {
        turnGunRight(Double.POSITIVE_INFINITY);
    }

    @Override
    public void onScannedRobot(ScannedRobotEvent e) {
        // put code to fire relative to enemy distance here
    }

}
