
class HCFFinder {
    private int a;
    private int b;

//    HCFFinder(int a, int b) {
//        this.a = a;
//        this.b = b;
//    }

    protected void setAB(int a,int b){ this.a = a; this.b = b; }

    protected void HCFFinding() {


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

