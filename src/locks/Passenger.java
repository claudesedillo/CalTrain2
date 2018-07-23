package locks;



public class Passenger implements Runnable{
   private Station inStation;
   private String outStation;
   private int count;
   private Thread thread = new Thread(this);
   
   
   
   public Passenger(int count, Station inStation, String outStation){
	this.count = count;
	this.inStation = inStation;
	this.outStation = outStation;
   }

   public int getCount(){
	return this.count;
   }
	
	
   public String getOutStation(){
	return this.outStation;
   }
	
   @Override
   public void run() {
       while(true){
           while(inStation.hasTrain()){
		try {
                   inStation.getTrain().waitTrain();
                   Thread.sleep(100);
		} 
		catch (InterruptedException e){
                   e.printStackTrace();
		}
		finally{
                   if(inStation.getTrain().getTrainSeats() > 0 && inStation.getPeople().size() > 0){
			CalTrain.getInstance().station_on_board(inStation);
			inStation.getTrain().signalTrain();
                   }
		}
           }
           try{
		Thread.sleep(7500);
           }
           catch(Exception e){
		e.printStackTrace();
           }	
	}
   }
}