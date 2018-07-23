package karl.semaphores;

public class Track {
    public Train runningTrain;

    public Track() {
        this.runningTrain = null;
    }

    public Train getRunningTrain() {
        return runningTrain;
    }

    public void setRunningTrain(Train runningTrain) {
        this.runningTrain = runningTrain;
    }
    
    public boolean hasTrain(){
        if(this.runningTrain != null)
            return true;
        return false;
    }
    
}

