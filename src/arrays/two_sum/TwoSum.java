package arrays.two_sum;

import java.util.*;

public class TwoSum {
    public static void main(String[] args){
        int[] numbs = {2,7,11,15};
        int target = 9;

        int[] result;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Which you wanna watch\n1. Simple Brute Force\n2. Using HashMap");
        int choice = sc.nextInt();
        result = switch (choice) {
            case 1 -> approachOne(numbs, target);
            case 2 -> approachTwo(numbs, target);
            default -> throw new IllegalStateException("Unexpected value: " + choice);
        };
        if (result.length == 2) System.out.println(result[0]+" "+result[1]);
        else System.out.println(-1);
    }

//    Brute force
//    Take an element from array then check with other array using loops.
    public static int[] approachOne(int[] numbs, int target){

        for(int i = 0; i< numbs.length -1; i++)
        {
            for(int j = i+1; j < numbs.length; j++)
            {
                if(numbs[i]+numbs[j] == target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }

//    Using HashTable
//    Insert all element of array inside Hash Table then using loop check each element weather that include in hash table. If that element exists in hash table then check is it same index number or not.
    public static int[] approachTwo(int[] numbs, int target){
        Map<Integer, Integer> numMap = new HashMap<>();

        for(int i = 0 ; i < numbs.length; i++)
        {
            int comp = target-numbs[i];
            if(numMap.containsKey(comp))
            {
                return new int[]{i,numMap.get(comp)};
            }
            numMap.put(numbs[i],i);
        }
        return new int[]{};
    }

}


