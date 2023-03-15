import javax.swing.*;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FactoryAir {
    private static  final String ID_FIXED_WINGS="^FW[0-9]{5}$";
    private static  final String ID_ROTATED_WINGS="^RW[0-9]{5}$";
    private static  final String ID_AIRPLANE="^AP[0-9]{5}$";

    public static  boolean validateIdFixed(String fixed){
        Pattern pattern=Pattern.compile(ID_FIXED_WINGS);
        Matcher matcher= pattern.matcher(fixed);
        return matcher.matches();
    }
    public static  boolean validateIdRotated(String rotated){
        Pattern pattern=Pattern.compile(ID_ROTATED_WINGS);
        Matcher matcher= pattern.matcher(rotated);
        return matcher.matches();
    }
    public static  boolean validateIdAirplane(String airplane){
        Pattern pattern=Pattern.compile(ID_AIRPLANE);
        Matcher matcher= pattern.matcher(airplane);
        return matcher.matches();
    }
    public static boolean lengthModelSize(String model){
        return model.length()<=40;
    }
    public  static  boolean lengMinRunWay(int minLength, Airports airports){
        return minLength<airports.getRunwaySize();
    }
    public static  boolean maxTakeoffWeight(int maxTakeOff, int emptyWeight){
        return 1.5*maxTakeOff<emptyWeight;
    }
    public static Fixedwings getFixedWings(String id, String model, AirPlaneType airPlaneType, int cruiseSpeed, int emptyWeight, int maxTakeoffWeight, int minNeededRunWaySize){
        Fixedwings fixedwings=null;
        if (validateIdFixed(id)){
            fixedwings.setId(id);
        }else {
            throw new IllegalArgumentException("The Id Fixed not match with Customer!");
        }
        if (lengthModelSize(model)){
            JOptionPane.showMessageDialog(null,"Valid");
            fixedwings.setModel(model);
        }else {
            JOptionPane.showMessageDialog(null,"InValid");
        }

        fixedwings.setAirPlaneType(airPlaneType);
        fixedwings.setCruiseSpeed(cruiseSpeed);
        fixedwings.setCruiseSpeed(cruiseSpeed);
        fixedwings.setEmptyWeight(emptyWeight);
        fixedwings.setMaxTakeoffWeight(maxTakeoffWeight);
        if (lengMinRunWay(minNeededRunWaySize,new Airports())){
            JOptionPane.showMessageDialog(null,"Valid");
            fixedwings.setMinNeededRunWaySize(minNeededRunWaySize);
        }else {
            JOptionPane.showMessageDialog(null,"InValid");
        }
        fixedwings.setMinNeededRunWaySize(minNeededRunWaySize);
        return fixedwings;
    }
    public static Helicopter getRotatedWings(String id, String model, int cruiseSpeed, int emptyWeight, int maxTakeoffWeight, int range){
        Helicopter helicopter= null;
        if (validateIdRotated(id)){
            helicopter.setId(id);
        }else {
            throw new IllegalArgumentException("The Id Rotated not match with Customer!");
        }
        if (lengthModelSize(model)){
            JOptionPane.showMessageDialog(null,"Valid");
           helicopter.setModel(model);
        }else {
            JOptionPane.showMessageDialog(null,"InValid");
        }
        helicopter.setCruiseSpeed(cruiseSpeed);
        helicopter.setEmptyWeight(emptyWeight);
        if (maxTakeoffWeight(maxTakeoffWeight,emptyWeight)){
            JOptionPane.showMessageDialog(null,"Valid");
            helicopter.setMaxTakeoffWeight(maxTakeoffWeight);
        }else {
            JOptionPane.showMessageDialog(null,"InValid");
        }

        helicopter.setRange(range);
        return helicopter;
    }
    public static Airports getAirPort(String id, String name, long runwaySize, int fixedWingParking, List<String> fixedWingsId, int rotatedWingParking, List<Helicopter> helicoptersId){
        Airports airports=null;
        if (validateIdAirplane(id)){
            airports.setId(id);
        }else {
            throw new IllegalArgumentException("The Id Rotated not match with Customer!");
        }
airports.setName(name);
        airports.setRunwaySize(runwaySize);
        airports.setFixedWingParking(fixedWingParking);
        airports.setFixedWingsId(fixedWingsId);
        airports.setRotatedWingParking(rotatedWingParking);
        airports.setHelicoptersId(helicoptersId);
        return airports;
    }
}
