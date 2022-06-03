package DailyAssignments.FacadePattern.DoneByMe;

class Timer {
    long timer;

    public Timer() {
    }

    public void setTimer(long timer) {
        this.timer = timer;
    }

    public double getTimer() {
        long elapsedTime = System.currentTimeMillis() - timer;
        long elapsedSeconds = elapsedTime / 1000;
        long secondsDisplay = elapsedSeconds % 60;
        long elapsedMinutes = elapsedSeconds / 60;
        return secondsDisplay;
    }
}
