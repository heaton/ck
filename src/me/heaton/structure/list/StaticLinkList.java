package me.heaton.structure.list;

public class StaticLinkList<T> implements IList<T>{

	protected Element<T>[] es;
	protected int maxSize = 999;
	
	public StaticLinkList() {
		es = new Element[maxSize];
		es[0] = new Element<T>(null,1);
		es[maxSize-1] = new Element<T>(null,0);
	}
	
	@Override
	public boolean isEmpty() {
		return es[maxSize-1].next==0;
	}

	@Override
	public void clear() {
		int i = es[maxSize - 1].next;
		while(i != 0){
			int j = es[i].next;
			es[i] = null;
			i = j;
		}
		es[0].next = 1;
		es[maxSize-1].next = 0;
	}

	@Override
	public T get(int i) {
		int k = es[maxSize - 1].next;
		int j = 0;
		while(k!=0 && j<i){
			j++;
			k = es[k].next;
		}
		return es[k].e;
	}

	@Override
	public int indexOf(T obj) {
		int i = es[maxSize-1].next;
		int p = 0;
		if(obj==null)
			while(i!=0){
				if(es[i].e == null)return p;
				i = es[i].next;
				p++;
			}
		else
			while(i!=0){
				if(obj.equals(es[i].e))return p;
				i = es[i].next;
				p++;
			}
		return -1;
	}

	@Override
	public void insert(int i, T obj) {
		int p = maxSize-1;
		int k = es[p].next;
		int j = 0;
		while(k!=0 && j<i){
			p = k;
			k = es[k].next;
			j++;
		}
		int c = es[0].next;
		int n;
		if(es[c]!=null)
			n = es[c].next;
		else
			n = c+1;
		es[c] = new Element<T>(obj,k);
		es[p].next = c;
		es[0].next = n;
	}

	@Override
	public T remove(int i) {
		int p = maxSize-1;
		int k = es[p].next;
		int j = 0;
		while(k!=0 && j<i){
			p = k;
			k = es[p].next;
			j++;
		}
		if(k==0)return null;
		es[p].next = es[k].next;
		es[k].next = es[0].next;
		es[0].next = k;
		T t = es[k].e;
		es[k].e = null;
		return t;
	}

	@Override
	public void add(T obj) {
		int p = maxSize-1;
		while(es[p].next!=0){
			p = es[p].next;
		}
		int c = es[0].next;
		int n;
		if(es[c]!=null)
			n = es[c].next;
		else
			n = c+1;
		es[c] = new Element<T>(obj,0);
		es[p].next = c;
		es[0].next = n;
	}

	@Override
	public int getSize() {
		int i = es[maxSize-1].next;
		int size = 0;
		while(i!=0){
			i = es[i].next;
			size++;
		}
		return size;
	}

	protected class Element<E>{
		protected int next;
		protected E e;
		protected Element(E e, int next){
			this.e = e;
			this.next = next;
		}
	}
}
