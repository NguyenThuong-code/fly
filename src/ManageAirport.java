import java.util.ArrayList;
import java.util.List;

public class ManageAirport {
 public static List<Airports> airportsList= new ArrayList<>();
 public static List<Fixedwings> fixedwingsList=new ArrayList<>();
 public static List<Helicopter> helicopterList=new ArrayList<>();
 public void createAirPort(Airports airports){
  airportsList.add(airports);
 }
 public void removeAirPort(int i){
  for (int j = 0; j < airportsList.size(); j++) {
   if (i == j) {
    airportsList.remove(j);
   }
  }
 }
 public void addFixedWing(Fixedwings fixedwings){
  fixedwingsList.add(fixedwings);
 }
 public void removeHelicopterInAirport(String name, int position){
  for (int i = 0; i < airportsList.size(); i++) {
   if (airportsList.get(i).getName().equalsIgnoreCase(name)){
  airportsList.get(i).getHelicoptersId().remove(position);
   }
  }
 }
  public void addHelicopterToAirPort( String name, Helicopter helicopter){
   for (int i = 0; i < airportsList.size(); i++) {
    if (airportsList.get(i).getName().equalsIgnoreCase(name)){
     airportsList.get(i).getHelicoptersId().add(helicopter);
    }
   }
  }

}
