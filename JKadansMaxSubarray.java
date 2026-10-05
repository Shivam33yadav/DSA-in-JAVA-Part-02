public class JKadansMaxSubarray {//this is the best method to find the MaxsubarraySum   because here only one loop comes and thatswhy the time complexity is O(n)
    public static void kadanes(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i = 0; i< numbers.length; i++){
            cs = cs + numbers[i];
            if(cs < 0){
                cs = 0;

            }
            ms = Math.max(cs, ms);//compare 
        }
        System.out.println("our max subarray sum is : " +ms);

    }
    public static void main(String[] args) {
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadanes(numbers);
    }

    
}
