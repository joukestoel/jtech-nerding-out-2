package nl.ordina.nerdingout.tutorial.myrobots;

import robocode.AdvancedRobot;
import robocode.ScannedRobotEvent;

public class PasBot extends AdvancedRobot {

    @Override
    public void run() {
        turnRadarRight(Double.POSITIVE_INFINITY);
    }

    @Override
    public void onScannedRobot(ScannedRobotEvent e) {
        // turn towards duck and ram him...
    	
    }

}
