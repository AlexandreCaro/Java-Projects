import java.util.ArrayList;
import java.util.List;

public class WeatherStation extends Observable{

    protected List<Pair<String, Integer>> zones = new ArrayList<>();

    protected List<Observer> subscribers = new ArrayList<>();

    /*
     * Returns an array containing all the observers of the station
     */
    public Observer[] getSubscribers(){
        Observer[] arraySubscribers = new Observer[subscribers.size()];
        subscribers.toArray(arraySubscribers);

        return arraySubscribers;
    }

    /*
     * Sends a message to APPROPRIATE subscribers.
     */
    public void broadcast(Pair<String, Integer> pair){
        for(int i=0; i < subscribers.size(); i++){
            if(subscribers.get(i).getZone() == pair.getZone()){
                subscribers.get(i).update(pair);
            }
        }
    }

    /*
     * Adds an observer to the subscribers of the station
     */
    public void addObserver(Observer sub){
        subscribers.add(sub);
    }

    /*
     * Removes an observer from the subscribers of the station
     */
    public boolean removeObserver(Observer sub){
        // https://www.geeksforgeeks.org/remove-element-arraylist-java/
        for(int i=0; i < subscribers.size(); i++){
            if(subscribers.get(i) == sub){
                subscribers.remove(i);
                return true;
            }
        }

        return false;
    }

    /*
     * Sets the current alert for a given zone. Note that
     * there must be AT MOST one alert for each zone and
     * when an alert is set, subscribers of the zone must
     * receive a message
     */
    public void setAlert(String alert, int zone){

        Pair p = new Pair(alert, zone);

        for(int i=0; i < subscribers.size(); i++){
            if(subscribers.get(i).getZone()==zone){
                subscribers.get(i).update(p);
            }
        }
    }
}
