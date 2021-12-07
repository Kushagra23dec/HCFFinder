import java.util.Scanner;


class HCFFinder {
    private int a;
    private int b;

//    HCFFinder(int a, int b) {
//        this.a = a;
//        this.b = b;
//    }

    public void setAB(int a,int b){ this.a = a; this.b = b; }

    public void HCFFinding() {


        int i,j=1,c;

        System.out.println("Finding HCF of " + a +" and "+ b);

        if(a>b){ c=b; }

        else { c = a;}

        for(i=2;i<=c;i++){

            if(b%i==0 && a%i==0){
                j= i;
            }
        }
        System.out.println("HCF of "+ a +" and "+ b + " is: " + j);


    }

}
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

