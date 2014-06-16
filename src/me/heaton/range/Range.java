package me.heaton.range;

import java.util.ArrayList;
import java.util.List;

public class Range {

	private final List<Integer> points;
	
	public Range(RangeStart start, RangeEnd end){
		points = new ArrayList<Integer>();
		for(int i = start.get(); i<=end.get(); i++){
			points.add(i);
		}
	}
	
	public List<Integer> allPoints(){
		return points;
	}

	public boolean contains(Range r){
		return contains(r.points);
	}

	public boolean contains(List<Integer> points){
		for(int i : points){
			if(!this.points.contains(i)){
				return false;
			}
		}
		return true;
	}

}
