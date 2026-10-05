import java.util.*;
public class AArrays{
    public static void main(String[] args) {
        int marks[] = new int[100]; //means 100 size ka arry...maximum hum kitna bhi utilize kr skte hh
        
        Scanner sc = new Scanner(System.in);


        marks[0] = sc.nextInt();//phy
        marks[1] = sc.nextInt();//chem
        marks[2] = sc.nextInt();//math


        System.out.println("phy :" +marks[0]);
        System.out.println("chem: "+marks[1]);
        System.out.println("math :"+marks[2]);
    //}
//}
//if we want to update the marks is there is an error of printing the marks
marks[2] = 100;
System.out.println("math: "+marks[2]);
  //  }
//}
//we can also increment by 1 or 2 marks if the updating marks is low
//marks[2] = marks[2] + 1;
//sout("math: "+marks[2]);


//for percentage
int percentage = (marks[0] + marks[1] + marks[2])/3;
System.out.println("percentage ="+percentage + "%");
    }
}

// we can also find the length of an array by using .length operator

//sout("length of an array = " + marks.length);