package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int[] nums = new int[]{2,7,11,15};
        System.out.println("Original array");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the target");
        int target = scanner.nextInt();
        boolean found = false;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    found = true;
                    System.out.println(nums[i] + " + " + nums[j] + " = " + target);
                    break;
                }
            }
        }
        if(!found){
            System.out.println("Cant find");
        }

    }
}
