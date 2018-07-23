package locks;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class CalTrain {
    public static CalTrain singleton = null;

    ArrayList<Station> stations = new ArrayList<Station>();
    ArrayList<Train> trains = new ArrayList<Train>();
	
    public int peopleCtr;
    public int trainCtr;
    public int passCnt;

	public CalTrain(){
		peopleCtr = 0;
		trainCtr = 1;
		passCnt = 0;
		stations = new ArrayList<>();
		station_init();
	}

	public static CalTrain getInstance(){
		if(singleton == null){
			//singleton = new CalTrain(null);
			singleton = new CalTrain(); //TODO fix this line if ever
		}
		return singleton;
	}
	
	public void station_create_train(Station inStation, int count){
	    if(inStation.hasTrain() == false){
			Train newTrain = new Train("Train " + (this.trainCtr), count, inStation, this);
			trains.add(newTrain);
			int stationNumber = inStation.getStationNumber();
			
			GUI.list_train_status.get(stationNumber).setText("<html>" + 
															  StaticTexts.train_deployed_status + "<br>" +
															  StaticTexts.train_default_location + "<br>" + 
															  StaticTexts.train_passenger_count + count + "<br>" +
															  StaticTexts.train_passenger_count + "0 </html>");
			trainCtr++;
	    }
	    else{
	    }
	}
	
    public void station_load_train(int trainCtr){
        boolean trainExists = false;
        if(trains.get(trainCtr) != null){
            trainExists = true;
        }
        if(trainExists){
            trains.get(trainCtr).startTrainRun();
        }
        else{
        }
    }
        

    
    
    public void station_wait_for_train(Station station, int numPassengers){
        Random r = new Random();
        boolean validDestination = false;
        int destination = 0,
        	passengerOrigin = station.getStationNumber();
        //since passenger destination is random, we want their destination to be not the same as their origin
        while(validDestination == false){
        	destination =  r.nextInt(8 - 1 + 1) + 1;
        	if(passengerOrigin != destination){
        		station.addNewPassenger(peopleCtr+1, destination);
        		validDestination = true;
        	}
        }
        

        String currentQueueText = GUI.queue_info_list.get(passengerOrigin).getText();
        GUI.queue_info_list.get(passengerOrigin).setText(currentQueueText + "Passenger" + peopleCtr + "\n   Destination: " + destination);
        
        peopleCtr++;  
    }

    public void station_on_board(Station station){
        Passenger passenger = station.removePassenger();		
        passCnt--;
        station.getTrain().getOnBoard(passenger);
    }

    public void station_init(){
        for(int i = 0; i < 8; i++){
            stations.add(new Station(i));
        }	
    }
	
    public ArrayList<Station> getStations(){
        return this.stations;
    }

    public ArrayList<Train> getTrains(){
        return this.trains;
    }
	
    public void showStatus(){
    for(int i = 0; i < stations.size(); i++){
        Station station = stations.get(i);
        
        
        System.out.println(" ");
        
        int stationNumber = station.getStationNumber();
		
        GUI.queue_total_list.get(stationNumber).setText(Integer.toString(station.getPeople().size()));
        

    }
    
    System.out.println("==================================================");

    }
}
