package locks;


/**
*
* @author paolo
*/
public class Track {
   public Train train;
	
   public Track(){
	this.train = null;
   }
	
   public Train getTrain(){
	return this.train;
   }
	
   public void setTrain(Train train){
	this.train = train;
   }
	
   public boolean hasTrain(){
	if(this.getTrain() == null){
           return false;
	}
	else{
           return true;
	}
   }
}
