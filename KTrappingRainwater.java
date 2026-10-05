import java.util.*;
 public class KTrappingRainwater {
    public static int trappedRainwater(int height[]){// time complexity O(n) directly proportional to bars height 
        int n = height.length;
        //calculate left max boundary - array(these are my helper or auxiliary arrays )
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i =1; i<n;i++ ){
            leftMax[i] = Math.max(height[i], leftMax[i -1]);//  started from front side of array

        }
        //calculate right max boundary - array 
        int rightMax[] = new int[height.length];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);// started from last side of array
        }

     int trappedWater =0;

    //loop run
    for(int i = 0; i<n; i++){
         // in loop we calculate waterlevel = min(leftmax boundary, right max boundary)
        int waterlevel = Math.min(leftMax[i], rightMax[i]); //we have find water level from here ...now trapped water
         //trapped water = waterLevel - height[i]
        trappedWater += waterlevel - height[i];


    }
    return trappedWater;

}

    public static void main(String args[]){
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappedRainwater(height));

    }

    
}
