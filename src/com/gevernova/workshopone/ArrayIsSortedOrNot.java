package com.gevernova.workshopone;

import java.util.*;
public class ArrayIsSortedOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int a[]=new int[size];
        String ans="Sorted";
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<size-1;i++){
            if(a[i]>a[i+1]){
                ans="Not Sorted";
                break;
            }
        }
        System.out.print(ans);
    }
}