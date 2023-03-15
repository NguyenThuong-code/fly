public class Helicopter {
    private String id;
    private String model;
    private int cruiseSpeed;
    private int emptyWeight;
    private int maxTakeoffWeight;
    private int range;
    private static String flyMethod="rotated wing";

    public Helicopter() {
    }

    public Helicopter(String id, String model, int cruiseSpeed, int emptyWeight, int maxTakeoffWeight, int range) {
        this.id = id;
        this.model = model;
        this.cruiseSpeed = cruiseSpeed;
        this.emptyWeight = emptyWeight;
        this.maxTakeoffWeight = maxTakeoffWeight;
        this.range = range;
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

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public static String getFlyMethod() {
        return flyMethod;
    }

    public static void setFlyMethod(String flyMethod) {
        Helicopter.flyMethod = flyMethod;
    }

    @Override
    public String toString() {
        return "Helicopter{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", cruiseSpeed=" + cruiseSpeed +
                ", emptyWeight=" + emptyWeight +
                ", maxTakeoffWeight=" + maxTakeoffWeight +
                ", range=" + range +
                ", flyMethod=" + flyMethod +
                '}';
    }
}
