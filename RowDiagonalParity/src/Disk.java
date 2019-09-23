
import java.util.ArrayList;
import java.util.List;

public class Disk {
    private boolean isRunning = true;
    private List<Integer> values = new ArrayList<>(); //4 values

    public Disk(){
    }

    public Disk(int v1, int v2, int v3, int v4){
        values.add(v1);
        values.add(v2);
        values.add(v3);
        values.add(v4);
    }

    public void kill(){
        if(isRunning){
            isRunning = false;
            System.out.println("Disk is killed");
            values.set(0, null);
            values.set(1, null);
            values.set(2, null);
            values.set(3, null);
        }else{
            System.out.println("Disk is already down");
        }
    }

    public void recoverDiskIfBlocksAreRecovered(){
        if(!isRunning){
            if(values.stream().allMatch())
        }
    }

    public void start(){
        if(!isRunning){
            isRunning = true;
            System.out.println("Disk is started");
        }else{
            System.out.println("Disk is already running");
        }
    }

    public List<Integer> getValues() {
        return values;
    }

    public boolean getStatus() {
        return isRunning;
    }

    public void setValues(int v1, int v2, int v3, int v4) {
        values.add(v1);
        values.add(v2);
        values.add(v3);
        values.add(v4);
    }
}
