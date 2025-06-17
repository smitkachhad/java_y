package Basic;

public class array_jaggad {
    public static void main(String[] args) {

        int n[][]= new int[3][];   //jagged --> don't mention the inner array sized

        n[0]= new int[4];
        n[1]= new int[5];
        n[2]= new int[2];


        for (int i=0;i<n.length;i++)
        {
            for (int j=0;j<n[i].length;j++)
            {
                n[i][j]=(int) (Math.random()*10);
                System.out.print(n[i][j]);

            }
            System.out.println();
        }

        for (int m[] : n)
        {
            for (int p: m)
            {
                System.out.print(p + " ");
            }
            System.out.println();
        }

    }
}
