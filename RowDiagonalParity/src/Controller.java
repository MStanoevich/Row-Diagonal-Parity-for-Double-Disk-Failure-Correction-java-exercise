import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<Disk> disks = new ArrayList<>();

    public Controller(Disk d1, Disk d2, Disk d3, Disk d4){
        disks.add(d1);
        disks.add(d2);
        disks.add(d3);
        disks.add(d4);
    }

    // TODO refactor
    public void update(Disk d1, Disk d2, Disk d3, Disk d4){
        if(!d1.getStatus()){
            disks.set(0, d1);
        }
        if(!d2.getStatus()){
            disks.set(1, d2);
        }
        if(!d3.getStatus()){
            disks.set(2, d3);
        }
        if(!d4.getStatus()){
            disks.set(3, d4);
        }
    }

    public int getDownDisks(){
        int downDisks = 0;
        for(Disk disk : disks){
            if(!disk.getStatus()){
                downDisks++;
            }
        }
        return downDisks;
    }

    public int getNumberOfDownBlocks(Integer b1, Integer b2, Integer b3, Integer b4){
        int downBlocks = 0;
        if(b1 == null){
            downBlocks++;
        }
        if(b2 == null){
            downBlocks++;
        }
        if(b3 == null){
            downBlocks++;
        }
        if(b4 == null){
            downBlocks++;
        }
        return downBlocks;
    }

    /*
    public int[] recoverDownBlock(int[] blocks){

    }

    //2. Check which disks are down


    // - Recovery row parity block
    // - Recover diagonal parity block

    // 3. Write single disk recovery method
    // 4. Write two disk recovery method

    //STEP 1 : Find which diagonals have only 1 missing block
    //STEP 2: Calculate those diagonal missing blocks
    //STEP 3: Find which rows have only 1 missing block
    //STEP 4: Calculate those missing row blocks
    //STEP 5: Repeat for missing blocks

     */
}
