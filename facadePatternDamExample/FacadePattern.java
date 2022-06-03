package DailyAssignments.FacadePattern.DoneByMe;

import java.util.concurrent.TimeUnit;

public class FacadePattern {
    public static void main(String[] args) throws InterruptedException {
        Dam dam = new Dam();

        dam.systemStart(6);
        TimeUnit.SECONDS.sleep(5);
        dam.systemStatus();
        dam.systemStop();
    }
}

