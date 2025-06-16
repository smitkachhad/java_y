package Basic;

public class switch_5 {
    public static void main(String[] args) {

       /* int x=9;
        switch(x){
            case 8:
                System.out.println("8");
                break;
            case 7:
                System.out.println("7");
                break;
            default:
                System.out.println("No match found");*/



               /* int x=9;
                switch(x){
                    case 8 ->System.out.println("8");

                    case 7 ->
                        System.out.println("7");

                    default ->
                        System.out.println("No match found");*/

        int x=20;
        int y;
        y= switch(x){
            case 8 -> 8;

            case 7 -> 7;    // insead of -> if we want to use : we have use yield

            default -> 1000;
        };
        System.out.println(y);
    }
}
