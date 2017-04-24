package com.interview.basics;

public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println(" Is a prime number? "+isPrimeNumber(13));
	}
		
	static void primechk(){
		int i,m=0,flag=0,number=7;
		m=number/2;
		System.out.println(m);
		for(i=2;i<=m;i++){
			if(number%i==0){
				flag=0;
				break;
			}
		}
		if(flag==1)
			System.out.println("Prime number");
		else
				System.out.println("Not a prime number");
	}
	
	public static boolean isPrimeNumber(int number){        
		System.out.print(number);
        for(int i=2; i<=number/2; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
