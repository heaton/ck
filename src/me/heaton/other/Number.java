package me.heaton.other;

import java.util.ArrayList;
import java.util.List;

public class Number {

	public final int i;
	
	public Number(int i){
		this.i = i;
	}

	public List<Integer> factors(){
		List<Integer> re = new ArrayList<Integer>();
		int c = 2;
		int t = i;
		while(t > 1){
			if(t % c == 0){
				re.add(c);
				t = t/c;
			}else{
				c++;
			}
		}
		return re;
	}

}
