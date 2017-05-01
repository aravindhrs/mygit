package com.interview.problemsolving;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SumAverage {
    /*public static void main(String[] args) 
    {
        int n, sum = 0;
        float average;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n ; i++)
        {
            a[i] = s.nextInt();
            sum = sum + a[i];
        }
        s.close();
        System.out.println("Sum:"+sum);
        average = (float)sum / n;
        System.out.println("Average:"+average);
    }*/
	
	static int summation(int[] number) {
        int n = 0, sum = 0;
        //Scanner s = new Scanner(System.in);        
        //n = s.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n ; i++)
        {
            a[i] = number[i];
            sum = sum + a[i];
        }
        //s.close();
        return sum;
    }
	 @SuppressWarnings("resource")
	public static void main(String[] args) throws IOException{
	        Scanner in = new Scanner(System.in);
	        final String fileName = System.getenv("OUTPUT_PATH");
	        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
	        int res;
	        
	        int _numbers_size = 0;
	        _numbers_size = Integer.parseInt(in.nextLine().trim());
	        int[] _numbers = new int[_numbers_size];
	        int _numbers_item;
	        for(int _numbers_i = 0; _numbers_i < _numbers_size; _numbers_i++) {
	            _numbers_item = Integer.parseInt(in.nextLine().trim());
	            _numbers[_numbers_i] = _numbers_item;
	        }
	        
	        res = summation(_numbers);
	        bw.write(String.valueOf(res));
	        bw.newLine();
	        
	        bw.close();
	    }
}