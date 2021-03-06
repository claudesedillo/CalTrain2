package karl.semaphores;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Train implements Runnable{
    private Semaphore free;
    private Semaphore freeSeats;
    
    private String trainNumber;
    
    private Station inStation;
    private ArrayList<Passenger> passengers;
    
    private Thread thread = new Thread(this);
    
    public CalTrain caltrain;

    public Train(String trainNumber, int freeSeats, Station inStation, CalTrain caltrain) {
        this.free = new Semaphore(0);
        this.freeSeats = new Semaphore(freeSeats);
        this.trainNumber = trainNumber;
        this.inStation = inStation;
        this.passengers = new ArrayList<>();
        this.caltrain = caltrain;
        inStation.OccupiedBy(this);
    }

    public Semaphore getFreeSeats() {
        return freeSeats;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public int getPassengers() {
        return this.passengers.size();
    }
    
    public static void pauseTrainRun(){
    	try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public void startTrainRun(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Train.class.getName()).log(Level.SEVERE, null, ex);
        }
        thread.start();
    }
    
    public void loadTrain(Passenger passenger){
        try {
            freeSeats.acquire();
            passengers.add(passenger);
        } catch (InterruptedException ex) {
            Logger.getLogger(Train.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void getOffBoard(Passenger passenger){
        freeSeats.release();
        passengers.remove(passenger);
    }
    
    public void waitForTrain(){
        try {
            free.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(Train.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void signalTrain(){
        free.release();
    }
    
    public boolean checkTrain(){
	try{
            if(free.tryAcquire()){
		return true;
            }
	}
	catch(Exception e){
            e.printStackTrace();
	}
	return false;
    }
    

    @Override
    public void run() {
    	
    	long tStart = System.currentTimeMillis();
        do{
            inStation.waitStation();
            signalTrain();
            inStation.OccupiedBy(this);

            System.out.println(" ");
            System.out.println("Current Train: " + inStation.getTrain().getTrainNumber());		
            
            System.out.println(" ");
            System.out.println("Entering: " + inStation.getName());
            System.out.println(" ");
            System.out.println("Unloading Passengers:");
            System.out.println(" ");
            
            MainWindow.consoleLogTextArea.append("Current Train: " + inStation.getTrain().getTrainNumber() + "\n");
            MainWindow.consoleLogTextArea.append("Entering: " + inStation.getName() + "\n");
            MainWindow.consoleLogTextArea.append("Unloading Passengers:" + "\n");
            

            int l = 0;
            int counter = 0;

            while(l < passengers.size()){
                if(passengers.get(l).getOutStation().equals(this.inStation.getName())){
                	System.out.println("Passengers " + passengers.get(l).getCount() + ": Now Leaving Train");
                	MainWindow.consoleLogTextArea.append("Passengers " + passengers.get(l).getCount() + ": Now Leaving Train" + "\n");
                	getOffBoard(passengers.get(l));
                    caltrain.peopleCtr--;
                    counter++;
                }
                else{
                    l++;
                }
            }
            
            switch(inStation.getName()){
            case "Station 1":	
            					MainWindow.station1TextArea.append("\n" + this.getTrainNumber() + " departed " + counter + " passengers.");
				break;
			case "Station 2":	
								MainWindow.station2TextArea.append("\n" + this.getTrainNumber() + " departed " + counter + " passengers.");
				break;
			case "Station 3":	
								MainWindow.station3TextArea.append("\n" + this.getTrainNumber() + " departed " + counter + " passengers.");
				break;
			case "Station 4":	
								MainWindow.station4TextArea.append("\n" + this.getTrainNumber() + " departed " + counter + " passengers.");
				break;
			case "Station 5":	
								MainWindow.station5TextArea.append("\n" + this.getTrainNumber() + " departed " + counter + " passengers.");
				break;
			case "Station 6":	
								MainWindow.station6TextArea.append("\n" + this.getTrainNumber() + " departed " + counter + " passengers.");
				break;
			case "Station 7":	
								MainWindow.station7TextArea.append("\n" + this.getTrainNumber() + " departed " + counter + " passengers.");
				break;
			case "Station 8":	
								MainWindow.station8TextArea.append("\n" + this.getTrainNumber() + " departed " + counter + " passengers.");
				break;
            }
         

            try {
            Thread.sleep(2000);
            }
            catch (InterruptedException e1){
            e1.printStackTrace();
            }

            counter = 0;

            while(freeSeats.availablePermits() > 0 && inStation.getPeople().size() > 0){
                CalTrain.getInstance().station_on_board(inStation);
		counter++;
            }
            
            System.out.println(" ");
            System.out.println(counter + " passengers boarded the train.");
            System.out.println("Seats Free: " + this.getFreeSeats());
            System.out.println(" ");
            MainWindow.consoleLogTextArea.append(counter + " passengers boarded the train." + "\n");
            MainWindow.consoleLogTextArea.append("Seats Free: " + this.getFreeSeats().drainPermits() + "\n");


            switch(inStation.getName()){
            case "Station 1":	
            					MainWindow.station1TextArea.append("\n" + this.getTrainNumber() + " loaded " + counter + " passengers.");
				break;
			case "Station 2":	
								MainWindow.station2TextArea.append("\n" + this.getTrainNumber() + " loaded " + counter + " passengers.");
				break;
			case "Station 3":	
								MainWindow.station3TextArea.append("\n" + this.getTrainNumber() + " loaded " + counter + " passengers.");
				break;
			case "Station 4":	
								MainWindow.station4TextArea.append("\n" + this.getTrainNumber() + " loaded " + counter + " passengers.");
				break;
			case "Station 5":	
								MainWindow.station5TextArea.append("\n" + this.getTrainNumber() + " loaded " + counter + " passengers.");
				break;
			case "Station 6":	
								MainWindow.station6TextArea.append("\n" + this.getTrainNumber() + " loaded " + counter + " passengers.");
				break;
			case "Station 7":	
								MainWindow.station7TextArea.append("\n" + this.getTrainNumber() + " loaded " + counter + " passengers.");
				break;
			case "Station 8":	
								MainWindow.station8TextArea.append("\n" + this.getTrainNumber() + " loaded " + counter + " passengers.");
				break;
            }

            try {
                Thread.sleep(2000);
            } 
            catch (InterruptedException e1) {
                e1.printStackTrace();
            }

            waitForTrain();
            inStation.signalStation();

            if(inStation.getNextStation().hasTrain() == true){
                if(inStation.getTrainOnTrack() != null){
                    System.out.println("Train cannot move!");
                }
                else{
                    inStation.removeTrain();
                    inStation.setTrainOnTrack(this);
                    
                    switch(inStation.getName()){
                    case "Station 1":	MainWindow.station1TextArea.setText("");
                    					MainWindow.station1TextArea.setText(this.getTrainNumber());
    					break;
    				case "Station 2":	MainWindow.station2TextArea.setText("");
    									MainWindow.station2TextArea.setText(this.getTrainNumber());
    					break;
    				case "Station 3":	MainWindow.station3TextArea.setText("");
    									MainWindow.station3TextArea.setText(this.getTrainNumber());
    					break;
    				case "Station 4":	MainWindow.station4TextArea.setText("");
    									MainWindow.station4TextArea.setText(this.getTrainNumber());
    					break;
    				case "Station 5":	MainWindow.station5TextArea.setText("");
    									MainWindow.station5TextArea.setText(this.getTrainNumber());
    					break;
    				case "Station 6":	MainWindow.station6TextArea.setText("");
    									MainWindow.station6TextArea.setText(this.getTrainNumber());
    					break;
    				case "Station 7":	MainWindow.station7TextArea.setText("");
    									MainWindow.station7TextArea.setText(this.getTrainNumber());
    					break;
    				case "Station 8":	MainWindow.station8TextArea.setText("");
    									MainWindow.station8TextArea.setText(this.getTrainNumber());
    					break;
                    }
                }
            }
            else{
                inStation.removeTrain();
                inStation = inStation.getNextStation();
            }
            try {
                Thread.sleep(2000);
            } 
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            switch(this.getTrainNumber()){
			case "Train 1":	MainWindow.train1PassengerCount.setText(Integer.toString(this.getPassengers()));
					break;
			case "Train 2":	MainWindow.train2PassengerCount.setText(Integer.toString(this.getPassengers()));
				break;
			case "Train 3":	MainWindow.train3PassengerCount.setText(Integer.toString(this.getPassengers()));
				break;
			case "Train 4":	MainWindow.train4PassengerCount.setText(Integer.toString(this.getPassengers()));
				break;
			case "Train 5":	MainWindow.train5PassengerCount.setText(Integer.toString(this.getPassengers()));
				break;
			case "Train 6":	MainWindow.train6PassengerCount.setText(Integer.toString(this.getPassengers()));
				break;
			case "Train 7":	MainWindow.train7PassengerCount.setText(Integer.toString(this.getPassengers()));
				break;
			case "Train 8":	MainWindow.train8PassengerCount.setText(Integer.toString(this.getPassengers()));
				break;
			case "Train 9":	MainWindow.train9PassengerCount.setText(Integer.toString(this.getPassengers()));
				break;
			case "Train 10":	MainWindow.train10PassengerCount.setText(Integer.toString(this.getPassengers()));
				break;
			case "Train 11":	MainWindow.train11PassengerCount.setText(Integer.toString(this.getPassengers()));
				break;
			case "Train 12":	MainWindow.train12PassengerCount.setText(Integer.toString(this.getPassengers()));
				break;
			case "Train 13":	MainWindow.train13PassengerCount.setText(Integer.toString(this.getPassengers()));
				break;
			case "Train 14":	MainWindow.train14PassengerCount.setText(Integer.toString(this.getPassengers()));
				break;
			case "Train 15":	MainWindow.train15PassengerCount.setText(Integer.toString(this.getPassengers()));
				break;
			case "Train 16":	MainWindow.train16PassengerCount.setText(Integer.toString(this.getPassengers()));
				break;
	        }
            
            
            

    		switch(inStation.getName()){
    		case "Station 1":	MainWindow.station1PassengerQueue.setText(Integer.toString(inStation.getPeople().size()));	
    				break;
    		case "Station 2":	MainWindow.station2PassengerQueue.setText(Integer.toString(inStation.getPeople().size()));	
    			break;
    		case "Station 3":	MainWindow.station3PassengerQueue.setText(Integer.toString(inStation.getPeople().size()));	
    			break;
    		case "Station 4":	MainWindow.station4PassengerQueue.setText(Integer.toString(inStation.getPeople().size()));	
    			break;
    		case "Station 5":	MainWindow.station5PassengerQueue.setText(Integer.toString(inStation.getPeople().size()));	
    			break;
    		case "Station 6":	MainWindow.station6PassengerQueue.setText(Integer.toString(inStation.getPeople().size()));	
    			break;
    		case "Station 7":	MainWindow.station7PassengerQueue.setText(Integer.toString(inStation.getPeople().size()));	
    			break;
    		case "Station 8":	MainWindow.station8PassengerQueue.setText(Integer.toString(inStation.getPeople().size()));	
    			break;
            }
    		
    		MainWindow.station1TextArea.setText("");
    		MainWindow.station2TextArea.setText("");
    		MainWindow.station3TextArea.setText("");
    		MainWindow.station4TextArea.setText("");
    		MainWindow.station5TextArea.setText("");
    		MainWindow.station6TextArea.setText("");
    		MainWindow.station7TextArea.setText("");
    		MainWindow.station8TextArea.setText("");

	}while(caltrain.peopleCtr > 0);
        
        switch(this.getTrainNumber()){
		case "Train 1":	MainWindow.train1PassengerCount.setText(Integer.toString(this.getPassengers()));
				break;
		case "Train 2":	MainWindow.train2PassengerCount.setText(Integer.toString(this.getPassengers()));
			break;
		case "Train 3":	MainWindow.train3PassengerCount.setText(Integer.toString(this.getPassengers()));
			break;
		case "Train 4":	MainWindow.train4PassengerCount.setText(Integer.toString(this.getPassengers()));
			break;
		case "Train 5":	MainWindow.train5PassengerCount.setText(Integer.toString(this.getPassengers()));
			break;
		case "Train 6":	MainWindow.train6PassengerCount.setText(Integer.toString(this.getPassengers()));
			break;
		case "Train 7":	MainWindow.train7PassengerCount.setText(Integer.toString(this.getPassengers()));
			break;
		case "Train 8":	MainWindow.train8PassengerCount.setText(Integer.toString(this.getPassengers()));
			break;
		case "Train 9":	MainWindow.train9PassengerCount.setText(Integer.toString(this.getPassengers()));
			break;
		case "Train 10":	MainWindow.train10PassengerCount.setText(Integer.toString(this.getPassengers()));
			break;
		case "Train 11":	MainWindow.train11PassengerCount.setText(Integer.toString(this.getPassengers()));
			break;
		case "Train 12":	MainWindow.train12PassengerCount.setText(Integer.toString(this.getPassengers()));
			break;
		case "Train 13":	MainWindow.train13PassengerCount.setText(Integer.toString(this.getPassengers()));
			break;
		case "Train 14":	MainWindow.train14PassengerCount.setText(Integer.toString(this.getPassengers()));
			break;
		case "Train 15":	MainWindow.train15PassengerCount.setText(Integer.toString(this.getPassengers()));
			break;
		case "Train 16":	MainWindow.train16PassengerCount.setText(Integer.toString(this.getPassengers()));
			break;
        }
		
		switch(inStation.getName()){
		case "Station 1":	MainWindow.station1PassengerQueue.setText(Integer.toString(inStation.getPeople().size()));	
				break;
		case "Station 2":	MainWindow.station2PassengerQueue.setText(Integer.toString(inStation.getPeople().size()));	
			break;
		case "Station 3":	MainWindow.station3PassengerQueue.setText(Integer.toString(inStation.getPeople().size()));	
			break;
		case "Station 4":	MainWindow.station4PassengerQueue.setText(Integer.toString(inStation.getPeople().size()));	
			break;
		case "Station 5":	MainWindow.station5PassengerQueue.setText(Integer.toString(inStation.getPeople().size()));	
			break;
		case "Station 6":	MainWindow.station6PassengerQueue.setText(Integer.toString(inStation.getPeople().size()));	
			break;
		case "Station 7":	MainWindow.station7PassengerQueue.setText(Integer.toString(inStation.getPeople().size()));	
			break;
		case "Station 8":	MainWindow.station8PassengerQueue.setText(Integer.toString(inStation.getPeople().size()));	
			break;
        }
		
		long tEnd = System.currentTimeMillis();
		long tDelta = tEnd - tStart;
		double elapsedSeconds = tDelta / 1000.0;
		
		System.out.println("Simulation Finished!");
		MainWindow.indicatorLbl.setText("Simulation Finished! Time elapsed in milliseconds: " + elapsedSeconds);
    
    }
}

