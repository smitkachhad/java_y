package Basic;

public class ArithmeticOpe_3 {
    public static void main(String[] args) {

        int i=9;

        i++;  //post increment . fetch first and then add  i= i+1
        ++i;  //pre increment. add first than fetch   I= 1+i
        System.out.println(i);

        //relation
        int a= 10;
        int b=20;
        int c = 40;
        int d= 50;

        System.out.println(d>>1);

        boolean r1 = a < b;
        System.out.println(r1);

        //logical && || !
        boolean r2 = a < b || c< d ;
        System.out.println(!r2);


    }
}
