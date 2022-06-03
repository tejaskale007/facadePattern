package DailyAssignments.FacadePattern.DoneByMe;

class Dam {
    waterLevel waterLevel;
    Door door;
    TriggerCircuit triggerCircuit;
    Timer timer;

    public Dam() {
        waterLevel = new waterLevel();
        door = new Door();
        triggerCircuit = new TriggerCircuit();
        timer = new Timer();
    }

    public void systemStart(int noOfDoors) {
        triggerCircuit.setStatus(1);
        door.setNoOfDoors(noOfDoors);
        timer.setTimer(System.currentTimeMillis());
        System.out.println("System Started with no Error.");
    }

    public void systemStatus() {
        if (triggerCircuit.getStatus() == 1) {
            System.out.println("*************\nSYSTEM STATUS\n*************");
            System.out.println("Trigger circuit: ON");
            System.out.println("No. of water door open: " + door.getNoOfDoors());
            System.out.println("Timer: " + timer.getTimer());
            System.out.println("Current Water Level in Cusecs: " + waterLevel.getWaterInCusecs((long) timer.getTimer()));
        } else {
            System.out.println("Trigger circuit: OFF\nSystem not started correctly.");
        }
    }

    public void systemStop() {
        triggerCircuit.setStatus(0);
        System.out.println("System Execution Stopped.");
    }
}
