package locks;


import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Station {
    private Lock lock;
    private Condition state;
    private int stationNumber;
    
    private Train currentTrain;
    private Track trainOnTrack;
    private ArrayList<Passenger> waitingPassengers;

    public Station(int stationNumber){
        this.waitingPassengers = new ArrayList<>();
        this.lock = new ReentrantLock();
        this.stationNumber = stationNumber;
        this.state = lock.newCondition();
        this.currentTrain = null;
        this.trainOnTrack = new Track();
    }
	
    public int getStationNumber(){
        return this.stationNumber;
    }
	
    public void setTrainOnTrack(Train t){
	this.trainOnTrack.setTrain(t);
    }
	
    public Train getTrainOnTrack(){
	return this.trainOnTrack.getTrain();
    }
	
    public void addNewPassenger(int ctr, int destnum){
	waitingPassengers.add(new Passenger(ctr, this, ("Station " + destnum)));
    }
	
    public Passenger removePassenger(){
	return(waitingPassengers.remove(0));
    }
	
    public Lock getLock(){
        return this.lock;
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

    public boolean OccupiedBy(Train t){
	if(!this.hasTrain()){
            this.currentTrain = t;
            return true;
	}
	return false;
    }
    
}
