package com.org.tav.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//Objetcs to be ordered do not have a natural ordering defined by Comparabale interface , 
//you want to order element something diff way other natural ordering --in both th cases we specify Comparator Object 
//interface Comparator<T>
//Comparator interface methods => int compare(obj1 , obj2)  , boolean equals(obj)
//this interface provide sorting sequence i.e you can sort the elements on the basis of any data member 

public class UseOfComparator {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
    InputStreamReader isr =  new InputStreamReader(System.in);
    
    BufferedReader br = new BufferedReader(isr);
    
    System.out.println("How Many Element do you want to enter ?");
    int size = Integer.parseInt(br.readLine());//retrun string and with parseint() we are converting string into int 
    
    Integer arr[] = new Integer[size];
    
    for(int i=0 ; i<size ; i++) {
    	System.out.println("Enter your number ");
    	arr[i] =Integer.parseInt(br.readLine());
    	
    }
    Ascend as = new Ascend();
    Arrays.sort(arr,as);
    
    System.out.println("\n sorted in Ascending order ");
    display(arr);
    
	}
static void display(Integer arr[]) {
	for(Integer element : arr) {
		System.out.println(element +"\t");
	}
}
}
