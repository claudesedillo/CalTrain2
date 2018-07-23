package karl.semaphores;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author paolo
 */
public class CalTrain {
    public static CalTrain singleton = null;

    ArrayList<Station> stations = new ArrayList<>();
    ArrayList<Train> trains = new ArrayList<>();
	
    public int peopleCtr;
    public int trainCtr;
    public int passCnt;

    public CalTrain(){
        peopleCtr = 0;
        trainCtr = 1;
        passCnt = 0;
        stations = new ArrayList<>();
        station_init(8);
    }
		
    public static CalTrain getInstance(){
        if(singleton == null){
            singleton = new CalTrain();
        }
            return singleton;
    }

    public void station_create_train(Station inStation, int count){
        if(inStation.hasTrain() == false){
            Train newTrain = new Train("Train " + (this.trainCtr), count, inStation, this);
            trains.add(newTrain);
            

			String stationName = inStation.getName();
            switch(stationName){
			case "Station 1":	MainWindow.station1TextArea.append(newTrain.getTrainNumber() + " has a total of " + count + " seats");
					break;
			case "Station 2":	MainWindow.station2TextArea.append(newTrain.getTrainNumber() + " has a total of " + count + " seats");
				break;
			case "Station 3":	MainWindow.station3TextArea.append(newTrain.getTrainNumber() + " has a total of " + count + " seats");
				break;
			case "Station 4":	MainWindow.station4TextArea.append(newTrain.getTrainNumber() + " has a total of " + count + " seats");
				break;
			case "Station 5":	MainWindow.station5TextArea.append(newTrain.getTrainNumber() + " has a total of " + count + " seats");
				break;
			case "Station 6":	MainWindow.station6TextArea.append(newTrain.getTrainNumber() + " has a total of " + count + " seats");
				break;
			case "Station 7":	MainWindow.station7TextArea.append(newTrain.getTrainNumber() + " has a total of " + count + " seats");
				break;
			case "Station 8":	MainWindow.station8TextArea.append(newTrain.getTrainNumber() + " has a total of " + count + " seats");
				break;
		}
            
            trainCtr++;
        }
        else{
            System.out.println("This station has a train docked!");	
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
            System.out.println("There are no trains onboard this station right now!");
        }
    }
	
    public void station_wait_for_train(Station station, int numPassengers){
        Scanner sc = new Scanner(System.in);
        int destination = MainWindow.getPassengerDestSelectComboBox();
        
        station.addNewPassenger(peopleCtr+1, destination);
        System.out.println("Passenger " + station.getPeople().get(station.getPeople().size()-1).getCount() + " awaiting transportation");
        MainWindow.consoleLogTextArea.append("Passenger " + station.getPeople().get(station.getPeople().size()-1).getCount() + " awaiting transportation" + "\n");
        
        peopleCtr++;
    }

    public void station_on_board(Station station){
        Passenger passenger = station.removePassenger();		
        System.out.println("Passenger " + passenger.getCount() + ": Now Leaving Current Station");
        passCnt--;
        station.getTrain().loadTrain(passenger);
    }

    public void station_init(int numStations){
        for(int i = 0; i < numStations; i++){
            stations.add(new Station("Station " + (i+1)));
        }
        for(int j = 0; j < numStations; j++){
            if(j == 7){
                stations.get(j).setNextStation(stations.get(0));
            }
            else{
                stations.get(j).setNextStation(stations.get(j+1));
            }
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

    	String stationName = station.getName();
		
		switch(stationName){
			case "Station 1":	MainWindow.station1PassengerQueue.setText(Integer.toString(station.getPeople().size()));	
					break;
			case "Station 2":	MainWindow.station2PassengerQueue.setText(Integer.toString(station.getPeople().size()));	
				break;
			case "Station 3":	MainWindow.station3PassengerQueue.setText(Integer.toString(station.getPeople().size()));	
				break;
			case "Station 4":	MainWindow.station4PassengerQueue.setText(Integer.toString(station.getPeople().size()));	
				break;
			case "Station 5":	MainWindow.station5PassengerQueue.setText(Integer.toString(station.getPeople().size()));	
				break;
			case "Station 6":	MainWindow.station6PassengerQueue.setText(Integer.toString(station.getPeople().size()));	
				break;
			case "Station 7":	MainWindow.station7PassengerQueue.setText(Integer.toString(station.getPeople().size()));	
				break;
			case "Station 8":	MainWindow.station8PassengerQueue.setText(Integer.toString(station.getPeople().size()));	
				break;
		}
		for(int j = 0; j < station.getPeople().size(); j++){
            if(j == 0){
            	System.out.println("Passengers currently in " + station.getName());
            	MainWindow.consoleLogTextArea.append("Passengers currently in " + station.getName() + "\n");
	        }
	            
	        System.out.println("Passenger " + station.getPeople().get(j).getCount());
	        MainWindow.consoleLogTextArea.append("Passenger " + station.getPeople().get(j).getCount() + "\n");
	        
	        
			
	
        }

    }
    
    System.out.println("==================================================");

    }
}

