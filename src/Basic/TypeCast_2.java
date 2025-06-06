package Basic;

public class TypeCast_2 {
    public static void main(String[] args) {

        int a=20;
        float f=a;
        System.out.println(f); //inplicit casting

        float f1=30.4f;
        int a1= (int) f1;
        System.out.println(a1); //explicit casting

        int i=258;
        byte b= (byte) i;
        System.out.println(b); //moduler  divide by byte size 257 and module will print

        byte b1=10;
        byte b2=30;
        int i1=b1*b2;
        System.out.println(i1); // type promotion


    }
}
