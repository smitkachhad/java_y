package Basic;

public class arrayObject_8 {

    public static void main(String[] args) {

        Student s1=new Student();
        s1.name="smit";
        s1.rolln=6;
        s1.marks=90;

        Student s2 =new Student();
        s2.name="smit";
        s2.rolln=61;
        s2.marks=92;

        Student s3 =new Student();
        s3.name="smit";
        s3.rolln=62;
        s3.marks=78;

        Student ss[]= new Student[3];

        ss[0]=s1;
        ss[1]=s2;
        ss[2]=s3;

        for (int i=0;i<ss.length;i++)
        {
            System.out.println(ss[i].marks + " : " + ss[i].rolln);
        }


    }
}


class Student
{
   String name;
   int rolln;
   int marks;
}