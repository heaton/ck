package com.mac.prime;

import java.util.ArrayList;
import java.util.List;

public class Prime {

	public static List<Integer> getPrimes(int max){
		List<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		primes.add(3);
		for(int i=5;i<=max;i+=2){
			int t = (int) Math.sqrt(i);
			boolean isPrime = true;
			for(int j=1;j<primes.size()&&primes.get(j)<=t;j++){
				if(i%primes.get(j)==0){
					isPrime = false;
					break;
				}
			}
			if(isPrime)primes.add(i);
		}
		return primes;
	}

	public static boolean isPrime(int p){
		List<Integer> primes = getPrimes((int)Math.sqrt(p));
		for(int i:primes){
			if(p % i == 0)return false;
		}
		return true;

//		if(p%2==0)return false;
//		int t = (int)Math.sqrt(p);
//		for(int i=3;i<=t;i+=2){
//			if(p%i==0)return false;
//		}
//		return true;
	}

	/**
	 * <p>Description:main</p>
	 * <p>Create Date:2011-4-26</p>
	 * @param args
	 * @author HeatoN
	 */
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		List<Integer> primes = getPrimes(1000000);
		long end = System.currentTimeMillis();
		System.out.println("use time:"+(end-start));
		System.out.println("primes size:"+primes.size());
//		for(Integer i:primes){
//			System.out.print(i+",");
//		}

//		long start = System.currentTimeMillis();
//		boolean re = isPrime(999979);
//		long end = System.currentTimeMillis();
//		System.out.println("use time:"+(end-start));
//		System.out.println("result:"+re);
	}

}
