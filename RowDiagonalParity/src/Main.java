public class Main {
    public static void main(String[] args) {
// TODO make so that the user predines the number of disks
        Disk d1 = new Disk();
        Disk d2 = new Disk();
        Disk d3 = new Disk();
        Disk d4 = new Disk();

        d1.setValues(1, 2, 3, 4);
        d2.setValues(1, 2, 3, 4);
        d3.setValues(1, 2, 3, 4);
        d4.setValues(1, 2, 3, 4);
        RowDisk rd = new RowDisk(d1, d2, d3, d4);
        rd.calculate();
        System.out.println("Row disk values: " + rd.getValues());

        DiagonalDisk dg = new DiagonalDisk(d1, d2, d3, d4, rd);
        dg.diagonalParityCalculate();
        System.out.println("Diagonal Parity " + dg.getValues());


    }
}
