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
        //System.out.println(dp1);
        if(positions.size() == 5){

            for (int i = 3, j = 1, cnt = 0; cnt < 4;  i--, j++, cnt++) {
                if( j == 3){
                    j = 0;
                    i= abs(i - 2);
                }
                dp1 += positions.get(j).getValues().get(i);
            }
            for (int i = 3, j = 2, cnt = 0; cnt < 4;  i--, j++, cnt++) {
                if( j == 3){
                    j = 0;
                    i= abs(i - 2);
                }
                dp2 += positions.get(j).getValues().get(i);
            }
            for (int i = 3, j = 3, cnt = 0; cnt < 4;  i--, j++, cnt++) {
                if( j == 3){
                    j = 0;
                    i= abs(i - 2);
                }
                dp3 += positions.get(j).getValues().get(i);
            }
            for (int i = 3, j = 4, cnt = 0; cnt < 4;  i--, j++, cnt++) {
                if( j == 3){
                    j = 0;
                    i= abs(i - 2);
                }
                dp4 += positions.get(j).getValues().get(i);
            }
        }
        setValues(dp1, dp2, dp3, dp4);
    }


}
