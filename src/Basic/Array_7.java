package Basic;

import static java.lang.Math.random;


public class Array_7 {
    public static void main(String[] args) {



        int num[]={3,3,7,8};

        int num2[] = new int[4];

        int a[][]=new int[3][4];



        for (int i=0;i<3;i++)     // generate random value
        {
            for (int j=0;j<4;j++)
            {
               a[i][j]=(int) (Math.random()*10);
                System.out.print(a[i][j]);

            }
            System.out.println();
        }


        for (int i=0;i<3;i++) {                     //give output
            for (int j = 0; j < 4; j++) {
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println("enhansed for");
        //enhansed for loop

        for (int n[] : a)
        {
            for (int m: n)
            {
                System.out.print(m + " ");
            }
            System.out.println();
        }

    }
}
