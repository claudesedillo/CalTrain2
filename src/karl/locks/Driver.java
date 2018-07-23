package karl.locks;


import java.util.Scanner;


public class Driver {
	

	static CalTrain system = new CalTrain();
	static MainWindow mw = new MainWindow();
	static MainWindowReceiver mwReceiver = new MainWindowReceiver(mw);
	
	

	
    public static void main(String[] args){
    	
			
    	boolean runTime = true;
    	Thread thread = new Thread();
    	Scanner sc = new Scanner(System.in);
    	
    	//show gui
    	mw.setVisible(true);
		
    }
    
    
    public static void addPassenger(){
    	
    	int ininput1 = MainWindow.getStationSelectComboBox();
    	System.out.println("ComboBox = " + ininput1);
    	
    	Scanner sc = new Scanner(System.in);
    	
    	//Add 1 passenger whose destination is Station n
        system.station_wait_for_train(system.getStations().get(ininput1-1), 1);

    	system.showStatus();
    }
    
    public static void addTrain(){
    	
    	if(system.getTrains().size() >= 16){
            System.out.println("There are now 16 trains! No more can be accomodated");
		}
		else{
            int ininput3 = MainWindow.getTrainSeatsField();
            int ininput4 = MainWindow.getStationSelectComboBox();

            if(system.getStations().get(ininput4-1).hasTrain() == true){
                system.getStations().get(ininput4-1).setTrainOnTrack(new Train("Train " + (system.trainCtr), ininput3, null, system));//creates train on train track
            }
            else{
                system.station_create_train(system.getStations().get(ininput4-1), ininput3);
            }
		}
    	system.showStatus();
    }
    
    public static void startSimulation(){
    	
    	
    	MainWindow.indicatorLbl.setText("Simulation Ongoing...");
    	for(int i = 0; i < system.getTrains().size(); i++)
		{
			system.station_load_train(i);
		}
    }
    
}

