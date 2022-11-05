/**
public class Solution {
public int[] searchRange(int[] nums, int target) {
    int[] result = new int[2];
    result[0] = findFirst(nums, target);
    result[1] = findLast(nums, target);
    return result;
}

private int findFirst(int[] nums, int target){
    int idx = -1;
    int start = 0;
    int end = nums.length - 1;
    while(start <= end){
        int mid = (start + end) / 2;
        if(nums[mid] >= target){
            end = mid - 1;
        }else{
            start = mid + 1;
        }
        if(nums[mid] == target) idx = mid;
    }
    return idx;
}

private int findLast(int[] nums, int target){
    int idx = -1;
    int start = 0;
    int end = nums.length - 1;
    while(start <= end){
        int mid = (start + end) / 2;
        if(nums[mid] <= target){
            start = mid + 1;
        }else{
            end = mid - 1;
        }
        if(nums[mid] == target) idx = mid;
    }
    return idx;
}
**/



//-------------------**-------------------

/**
// If the target exists, returns its leftmost index.
// Else, returns the index of where it should be.

// If the target exists, returns its leftmost index.
// Else, returns the index of where it should be.
int binarySearch(int[] nums, int target) {
    int l = 0, r = nums.length;
    while (l < r) {
        int m = (l + r) / 2;
        if (nums[m] < target) l = m + 1;
        else r = m;
    }
    return l;
}


//. ----------------**-----------------------

public int[] searchRange(int[] nums, int target) {
    int l = binarySearch(nums, target);
    // target does not exist. No need to look for the last position.
    if (l == nums.length || nums[l] != target) return new int[] { -1, -1 };
    // look for the index of target + 1
    int r = binarySearch(nums, target + 1);
    // last position is r - 1.
    return new int[] { l, r - 1 };
}
private int binarySearch(int[] nums, int target) {
    int l = 0, r = nums.length;
    while (l < r) {
        int m = (l + r) / 2;
        if (nums[m] < target) l = m + 1;
        else r = m ;
    }
    return l;
}

**/


