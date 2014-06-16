package me.heaton.range;

public class RangeEnd extends RangePoint {

	public RangeEnd(int point, boolean hasSelf) {
		super(point - (hasSelf?0:1));
	}

}
