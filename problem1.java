package Belc;

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String [] stringSplits = input.trim().split("\\s+");
        int [] nums = new int[stringSplits.length];
        for(int i=0;i<stringSplits.length;i++){
            nums[i] = Integer.parseInt(stringSplits[i]);
        }
    Boolean hasDuplicate = duplicateCheck(nums);
    System.out.println(hasDuplicate);
    sc.close();
    
}

public static boolean duplicateCheck(int [] nums) {
    for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]==nums[j]){
                return true;
            }
        }
    }
    return false;
    }
}

