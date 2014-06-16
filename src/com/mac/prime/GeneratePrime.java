package com.mac.prime;

import java.util.ArrayList;
import java.util.List;

public class GeneratePrime {

	public static List<Integer> getPrimes(int max) {
		List<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		primes.add(3);
		for (int i = 5; i <= max; i += 2) {
			int t = (int) Math.sqrt(i);
			boolean isPrime = true;
			for (int j = 1; j < primes.size() && primes.get(j) <= t; j++) {
				if (i % primes.get(j) == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime)
				primes.add(i);
		}
		return primes;
	}

	public static int[] generatePrimes(int max){
		if(max<2)
			return new int[0];
		int s = max+1;
		boolean[] f = new boolean[s];
		int i;
		for(i=0;i<s;i++)
			f[i]=true;
		f[0] = f[1] = false;
		int j;
		for(i=2;i<=Math.sqrt(s); i++){
			if(f[i]){
				for(j=2*i;j<s;j+=i){
					f[j] = false;
				}
			}
		}
		int count = 0;
		for(i=0;i<s;i++){
			if(f[i])
				count++;
		}
		int[] primes = new int[count];
		
		for(i=0,j=0;i<s; i++){
			if(f[i])
				primes[j++]=i;
		}
		return primes;
	}
	
	public static final void main(String[] args){
		int max = 10000000;
		long time = System.currentTimeMillis();
		List<Integer> primes1 = getPrimes(max);
		long time1 = System.currentTimeMillis() - time;
		time = System.currentTimeMillis();
		int[] primes2 = generatePrimes(max);
		long time2 = System.currentTimeMillis() - time;
		System.out.println("getPrime: "+time1 + "; size: " + primes1.size());
		System.out.println("generatePrime: " + time2 + "; size: " + primes2.length);
	}
}
