package nl.ordina.nerdingout.tutorial.myrobots;

import robocode.AdvancedRobot;
import robocode.ScannedRobotEvent;

public class TutorialScanning1 extends AdvancedRobot {

    @Override
    public void run() {
        while (true) {
            scan();
        }
    }

    @Override
    public void onScannedRobot(ScannedRobotEvent e) {
        // put code to keep the radar lock here
    }

}
