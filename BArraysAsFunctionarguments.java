import java.util.*;
public class BArraysAsFunctionarguments {
    /*  public static void update(int marks[]){
        for(int i =0; i<marks.length; i++){
            marks[i] = marks[i] + 1;

        }
   }
    public static void main(String[] args) {
        int marks[] = {97, 98, 96};
        update(marks);


        // print our marks
        for(int i = 0;i<marks.length;i++){        
        System.out.print(marks[i] + " ");

    }
      System.out.println();

    
}
} */
public static void update(int marks[], int nonChangeable){
    nonChangeable = 10;
    for(int i =0; i<marks.length; i++){
        marks[i] = marks[i] + 1;

    }

}
public static void main(String[] args) {
    int marks[] = {97, 98,96};
    int nonChangeable = 5;
    update(marks, nonChangeable);
    System.out.println(nonChangeable);

     for(int i = 0;i<marks.length;i++){

        
        System.out.print(marks[i] + " ");

    }
      System.out.println();

    
}
} 
//arrays ki value chnage hogi pr jahn non chaneable wah wahi same value rehgi



