package me.heaton.range;

public class RangeStart extends RangePoint{

	public RangeStart(int point, boolean hasSelf) {
		super(point + (hasSelf?0:1));
	}

}
