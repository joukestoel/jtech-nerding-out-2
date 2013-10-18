package nl.ordina.nerdingout.tutorial.myrobots;

import robocode.AdvancedRobot;
import robocode.ScannedRobotEvent;

public class TutorialPositioning1 extends AdvancedRobot {

    private boolean turned;

    @Override
    public void run() {
        while (true) {
            turnRadarRight(Double.POSITIVE_INFINITY);
        }
    }

    @Override
    public void onScannedRobot(ScannedRobotEvent e) {
        // put code to turn perpendicular to your enemy here
    }

}
