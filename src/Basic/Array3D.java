package Basic;

public class Array3D {
    public static void main(String[] args) {
        int a[][][]=new int[3][4][5];



        for (int i=0;i<3;i++)     // generate random value
        {
            for (int j=0;j<4;j++)
            {
                for (int k=0;k<5;k++)
                {
                    a[i][j][k] = (int) (Math.random() * 10);
                    System.out.print(a[i][j][k]);
                }

            }
            System.out.println();
        }


//        for (int i=0;i<3;i++) {                     //give output
//            for (int j = 0; j < 4; j++) {
//                System.out.print(a[i][j]+ " ");
//            }
//            System.out.println();
//        }

        System.out.println("enhansed for");
        //enhansed for loop

        for (int n[][] : a)
        {
            for (int m[]: n)
            {
                for (int o: m)
                {
                    System.out.print(o + " ");
                }

            }
            System.out.println();
        }

    }
}
