package Basic;

public class MethodOverloading {
    public static void main(String[] args) {

        calu obj=new calu();

       int a1= obj.add(10,20);
       int a2= obj.add(20,30,20);
       double a3 = obj.add(219D,40,20);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);


    }
}

class calu
{

    public double add(double n1,int n2,int n3)
    {
        return n1+n2+n3;
    }

    public int add(int n1,int n2)
    {
        return n1+n2;
    }
    public int add(int n1,int n2,int n3)
    {
        return n1+n2+n3;
    }

}


// same name differrnt parameter (dirrent type of para menter)
