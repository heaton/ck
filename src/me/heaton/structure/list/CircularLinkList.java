package me.heaton.structure.list;

public class CircularLinkList<T> extends LinkList<T> implements IList<T> {

	public CircularLinkList() {
		super();
		endTag = head;
		head.next = endTag;
	}

}
