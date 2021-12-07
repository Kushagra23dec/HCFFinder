import java.util.Scanner;

class Main {
    public static void main(String args[]) {
//        HCFFinder h = new HCFFinder(48, 30);
        HCFFinder h = new HCFFinder();

        Scanner io = new Scanner(System.in);

        System.out.print("Enter Two Numbers: ");
        int a = io.nextInt(),b = io.nextInt();

        h.setAB(a,b);

        h.HCFFinding();
    }
}
