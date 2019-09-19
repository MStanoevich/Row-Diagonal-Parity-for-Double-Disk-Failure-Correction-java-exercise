import java.util.ArrayList;
import java.util.List;

public class RowDisk extends Disk {

    private List<Disk> positions = new ArrayList<>();

    public RowDisk(Disk d1, Disk d2, Disk d3, Disk d4) {
        positions.add(d1);
        positions.add(d2);
        positions.add(d3);
        positions.add(d4);
    }

    //TODO Optimize with nested loops
    public void calculate() {
        if(positions.size() == 4){
            int v1 = 0;
            int v2 = 0;
            int v3 = 0;
            int v4 = 0;
            for (int i = 0; i < positions.size(); i++) {
                v1 += positions.get(i).getValues().get(0);
            }
            for (int i = 0; i < positions.size(); i++) {
                v2 += positions.get(i).getValues().get(0);
            }
            for (int i = 0; i < positions.size(); i++) {
                v3 += positions.get(i).getValues().get(0);
            }
            for (int i = 0; i < positions.size(); i++) {
                v4 += positions.get(i).getValues().get(0);
            }
            setValues(v1, v2, v3, v4);
        }

    }

}
