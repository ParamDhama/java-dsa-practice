## Problem: Two Sum [[Link](https://leetcode.com/problems/two-sum/description/?envType=problem-list-v2&envId=array)]

**Description:**

> Given an Array and a Target, return indices of two numbers that sum to target.
>

### **Approach 1:** Brute Force

**Intuition:**

> Take an element from array then check with other array using loops.
>

**Algorithm:**

1. Loop i from 0 to n-2.
2. Loop j from i+1 to n-1.
3. if numbs[i] + numbs[j] == target → return [i,j]

**Time Complexity:** O($n^2$).

**Space Complexity:** O(1)

**Code:**

```java
class Solution {
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
}
```

### Approach 2: Optimized Approach (Hash Table)

**Intuition:**

> Check every element in array where it exists in Hasp Table or not. If it’s now exist in table then add it in table.


**Algorithm:**

1. Declare a hash table with a pair of two Integer.
2. Loop i from 0 to n-1.
3. Compliment = Target - Numbs[i]
4. If Compliment in hash table → return [i, Hash Table Value]
5. Else → Insert i and Numbs[i] in Hash table

**Code:**
```java
class Solution {
    public static int[] approachTwo(int[] numbs, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < numbs.length; i++) {
            int comp = target - numbs[i];
            if (numMap.containsKey(comp)) {
                return new int[]{i, numMap.get(comp)};
            }
            numMap.put(numbs[i], i);
        }
        return new int[]{};
    }
}
```
