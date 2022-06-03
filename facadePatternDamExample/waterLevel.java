package DailyAssignments.FacadePattern.DoneByMe;

class waterLevel {
    int levelOfWater;
    double waterInCusecs;//cubic feet per second

    public waterLevel() {
    }

    public waterLevel(int levelOfWater, double waterInCusecs) {
        this.levelOfWater = levelOfWater;
        this.waterInCusecs = waterInCusecs;
    }

    public void setLevelOfWater(int levelOfWater) {
        this.levelOfWater = levelOfWater;
    }

    public void setWaterInCusecs(double waterInCusecs) {
        this.waterInCusecs = waterInCusecs;
    }

    public int getLevelOfWater() {
        this.levelOfWater = (int) (waterInCusecs / 2);
        return this.levelOfWater;
    }

    public double getWaterInCusecs(long timer) {
        this.waterInCusecs += timer * 200;
        return this.waterInCusecs;
    }
}
