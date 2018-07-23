package karl.semaphores;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;

/**
 *
 * @author paolo
 */
public class Station {
    private Semaphore stationSemaphore;
    private Station nextStation;
    private String name;
    
    private Train currentTrain;
    private Track trainOnTrack;
    private ArrayList<Passenger> waitingPassengers;

    public Station(String name){
        this.stationSemaphore = new Semaphore(1, true);
        this.waitingPassengers = new ArrayList<>();
        this.name = name;
        this.nextStation = null;
        this.currentTrain = null;
        this.trainOnTrack = new Track();
    }
	
    public String getName(){
        return this.name;
    }
	
    public void setNextStation(Station s){
	this.nextStation = s;
    }
	
    public Station getNextStation(){
        return this.nextStation;
    }
	
    public void setTrainOnTrack(Train t){
	this.trainOnTrack.setRunningTrain(t);
    }
	
    public Train getTrainOnTrack(){
	return this.trainOnTrack.getRunningTrain();
    }
	
    public void addNewPassenger(int ctr, int destnum){
	waitingPassengers.add(new Passenger(ctr, this, ("Station " + destnum)));
    }
	
    public Passenger removePassenger(){
	return(waitingPassengers.remove(0));
    }
	
    public ArrayList<Passenger> getPeople(){
	return this.waitingPassengers;
    }
	
    public Train getTrain(){
	return this.currentTrain;
    }

    public void removeTrain(){
	this.currentTrain = null;
    }
	
    public boolean hasTrain(){
	if(this.currentTrain == null)
            return false;
	return true;
    }

    public void waitStation(){
	try {
            this.stationSemaphore.acquire();
	}
        catch (Exception e) {
            e.printStackTrace();
	}
	}
	
    public void signalStation(){
	try {
            this.stationSemaphore.release();
	} 
	catch (Exception e) {
            e.printStackTrace();
	}
    }
    
    public boolean OccupiedBy(Train t){
	if(!this.hasTrain()){
            this.currentTrain = t;
            return true;
	}
	return false;
    }
}

