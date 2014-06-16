package me.heaton.structure.list;

public class LinkList<T> implements IList<T> {

	protected LinkObj head;
	protected LinkObj endTag;

	public LinkList(){
		head = new LinkObj(null);
	}

	@Override
	public boolean isEmpty() {
		return head.next==endTag;
	}

	@Override
	public void clear() {
		head.next=endTag;
	}

	@Override
	public T get(int i) {
		LinkObj l = head;
		if(i<0)i=0;
		for (int j = 0; j <= i && !isEnd(l); j++) {
			l = l.next;
		}
		return l.t;
	}

	@Override
	public int indexOf(T obj) {
		LinkObj l = head;
		int i = 0;
		if(obj==null){
			while(!isEnd(l)){
				if(l.next.t==null)return i;
				l = l.next;
				i++;
			}
		}else{
			while(!isEnd(l)){
				if(obj.equals(l.next.t))return i;
				l = l.next;
				i++;
			}
		}
		return -1;
	}

	@Override
	public void insert(int i, T obj) {
		LinkObj l = getLinkObj(i);
		LinkObj n = new LinkObj(obj);
		n.next = l.next;
		l.next = n;
	}

	@Override
	public T remove(int i) {
		LinkObj l = getLinkObj(i);
		if(isEnd(l))return null;
		LinkObj r = l.next;
		l.next = r.next;
		return r.t;
	}

	protected LinkObj getLinkObj(int i){
		LinkObj l = head;
		for (int j = 0; j < i && !isEnd(l); j++) {
			l = l.next;
		}
		return l;
	}
	
	@Override
	public void add(T obj) {
		LinkObj l = head;
		while(!isEnd(l)){
			l = l.next;
		}
		LinkObj n = new LinkObj(obj);
		l.next = n;
		n.next = endTag;
	}

	@Override
	public int getSize() {
		LinkObj l = head;
		int size = 0;
		while(!isEnd(l)){
			l = l.next;
			size++;
		}
		return size;
	}

	protected boolean isEnd(LinkObj l){
		return l.next==endTag;
	}
	
	protected class LinkObj{
		protected T t;
		protected LinkObj next;
		protected LinkObj(T t){
			this.t = t;
		}
	}
}
