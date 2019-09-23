import java.util.*;

import static java.lang.Math.*;


public class DiagonalDisk extends Disk {

    private List<Disk> positions = new ArrayList<>();


    public DiagonalDisk(Disk d1, Disk d2, Disk d3, Disk d4, RowDisk rw) {
        positions.add(d1);
        positions.add(d2);
        positions.add(d3);
        positions.add(d4);
        positions.add(rw);
    }

    public void diagonalParityCalculate() {
        int dp1 = 0;
        int dp2 = 0;
        int dp3 = 0;
        int dp4 = 0;
        setValues(0, 0, 0, 0);

        if(positions.size() == 5){

            // TODO optimise the block bellow
            for (int y = 1, x = 4, cnt = 0; cnt < 4; cnt++) {
                dp1 += positions.get(x).getValues().get(y);
                if(y == 3){
                    y = 0;
                    x = abs(x - 2);
                }else{
                    x--;
                    y++;
                }
            }
            for (int y = 2, x = 4, cnt = 0; cnt < 4; cnt++) {
                dp2 += positions.get(x).getValues().get(y);
                if(y == 3){
                    y = 0;
                    x = abs(x - 2);
                }else{
                    x--;
                    y++;
                }
            }
            for (int y = 3, x = 4, cnt = 0; cnt < 4; cnt++) {
                dp3 += positions.get(x).getValues().get(y);
                if(y == 3){
                    y = 0;
                    x = abs(x - 2);
                }else{
                    x--;
                    y++;
                }
            }
            for (int y = 0, x = 4, cnt = 0; cnt < 4; cnt++) {
                dp4 += positions.get(x).getValues().get(y);
                if(y == 3){
                    y = 0;
                    x = abs(x - 2);
                }else{
                    x--;
                    y++;
                }
            }
        }
        setValues(dp1, dp2, dp3, dp4);
    }


}
