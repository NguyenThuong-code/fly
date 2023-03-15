import java.util.List;

public class Airports {
    private String id;
    private String name;
    private long runwaySize;
    private int fixedWingParking;
    private List<String> fixedWingsId;
    private int rotatedWingParking;
    private List<Helicopter> helicoptersId;

    public Airports() {
    }

    public Airports(String id, String name, long runwaySize, int fixedWingParking, List<String> fixedWingsId, int rotatedWingParking, List<Helicopter> helicoptersId) {
        this.id = id;
        this.name = name;
        this.runwaySize = runwaySize;
        this.fixedWingParking = fixedWingParking;
        this.fixedWingsId = fixedWingsId;
        this.rotatedWingParking = rotatedWingParking;
        this.helicoptersId = helicoptersId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getRunwaySize() {
        return runwaySize;
    }

    public void setRunwaySize(long runwaySize) {
        this.runwaySize = runwaySize;
    }

    public int getFixedWingParking() {
        return fixedWingParking;
    }

    public void setFixedWingParking(int fixedWingParking) {
        this.fixedWingParking = fixedWingParking;
    }

    public List<String> getFixedWingsId() {
        return fixedWingsId;
    }

    public void setFixedWingsId(List<String> fixedWingsId) {
        this.fixedWingsId = fixedWingsId;
    }

    public int getRotatedWingParking() {
        return rotatedWingParking;
    }

    public void setRotatedWingParking(int rotatedWingParking) {
        this.rotatedWingParking = rotatedWingParking;
    }

    public List<Helicopter> getHelicoptersId() {
        return helicoptersId;
    }

    public void setHelicoptersId(List<Helicopter> helicoptersId) {
        this.helicoptersId = helicoptersId;
    }

    @Override
    public String toString() {
        return "Airports{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", runwaySize=" + runwaySize +
                ", fixedWingParking=" + fixedWingParking +
                ", fixedWingsId=" + fixedWingsId +
                ", rotatedWingParking=" + rotatedWingParking +
                ", helicoptersId=" + helicoptersId +
                '}';
    }
}
