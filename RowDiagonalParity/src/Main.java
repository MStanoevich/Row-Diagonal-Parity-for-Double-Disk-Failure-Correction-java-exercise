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

        System.out.println(d4.getStatus());
        d4.kill();
        System.out.println(d4.getStatus());
        d4.setValues(1, 2, 3, 4);
        System.out.println(d4.getValues());
        System.out.println(d4.getStatus());
        d4.recoverDiskIfBlocksAreRecovered();
        System.out.println(d4.getStatus());


    }
}
