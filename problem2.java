package Belc;

import java.util.Scanner;
import java.util.Arrays;

public class problem2 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] stringSplits = input.split(" ");
        int [] nums = new int[stringSplits.length];
        for(int i = 0; i < stringSplits.length; i++){
            nums[i] = Integer.parseInt(stringSplits[i]);
        }
        arrangeZero(nums);
        System.out.println(Arrays.toString(nums));
        sc.close();
    }

    public static void arrangeZero( int [] nums){
        while (hasZero(nums)){
            for (int limit = nums.length - 1 ; limit > 0 ; limit--){
                for (int i=0 ; i<limit ; i++){
                    if(nums[i]==0){
                        int temp = nums[i];
                        nums[i] = nums[i+1];
                        nums[i+1] = temp;
                    }
                }
            }
            break;
        }
    }  
    static boolean hasZero(int [] nums){
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 0){
                return true; 
            }
        }
        return false;
    }
}

