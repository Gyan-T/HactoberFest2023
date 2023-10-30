package com.gyaneshwar.Recursion_array;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] a = {5,6,7,8,9,1,2,3};
        System.out.println(RBS(a,1,0,a.length-1));
    }

    private static int RBS(int[] a, int target, int s, int e) {
        if (s>e)
            return -1;
        int m = s+(e-s)/2;
        if (a[m]==target)
            return m;
        if(a[s]<=a[m]){
            if(target>=a[s]&&target<a[m])
                return RBS(a,target,s,m-1);
            return RBS(a,target,m+1,e);
        }
        if(target>=a[m]&&target<=a[e])
            return RBS(a,target,m+1,e);
        return RBS(a,target,s,m-1);
    }
}
