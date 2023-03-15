public class Fixedwings {
    private String id;
    private String model;
    private AirPlaneType airPlaneType;
    private int cruiseSpeed;
    private int emptyWeight;
    private int maxTakeoffWeight;
    private int minNeededRunWaySize;
    private static String flyMethod="Fixed wing";

    public Fixedwings() {
    }

    public Fixedwings(String id, String model, AirPlaneType airPlaneType, int cruiseSpeed, int emptyWeight, int maxTakeoffWeight, int minNeededRunWaySize) {
        this.id = id;
        this.model = model;
        this.airPlaneType = airPlaneType;
        this.cruiseSpeed = cruiseSpeed;
        this.emptyWeight = emptyWeight;
        this.maxTakeoffWeight = maxTakeoffWeight;
        this.minNeededRunWaySize = minNeededRunWaySize;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public AirPlaneType getAirPlaneType() {
        return airPlaneType;
    }

    public void setAirPlaneType(AirPlaneType airPlaneType) {
        this.airPlaneType = airPlaneType;
    }

    public int getCruiseSpeed() {
        return cruiseSpeed;
    }

    public void setCruiseSpeed(int cruiseSpeed) {
        this.cruiseSpeed = cruiseSpeed;
    }

    public int getEmptyWeight() {
        return emptyWeight;
    }

    public void setEmptyWeight(int emptyWeight) {
        this.emptyWeight = emptyWeight;
    }

    public int getMaxTakeoffWeight() {
        return maxTakeoffWeight;
    }

    public void setMaxTakeoffWeight(int maxTakeoffWeight) {
        this.maxTakeoffWeight = maxTakeoffWeight;
    }

    public int getMinNeededRunWaySize() {
        return minNeededRunWaySize;
    }

    public void setMinNeededRunWaySize(int minNeededRunWaySize) {
        this.minNeededRunWaySize = minNeededRunWaySize;
    }



    @Override
    public String toString() {
        return "Fixedwings{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", airPlaneType=" + airPlaneType +
                ", cruiseSpeed=" + cruiseSpeed +
                ", emptyWeight=" + emptyWeight +
                ", maxTakeoffWeight=" + maxTakeoffWeight +
                ", minNeededRunWaySize=" + minNeededRunWaySize +
                ", Fly method=" + flyMethod +
                '}';
    }
}
