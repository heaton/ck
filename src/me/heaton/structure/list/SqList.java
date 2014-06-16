package me.heaton.structure.list;

import java.util.Arrays;

public class SqList<T> implements IList<T> {

	private Object[] t;
	private int size;

	public SqList(){
		this(10);
	}
	
	public SqList(int size){
		t = new Object[size];
		this.size = 0;
	}
	
	@Override
	public boolean isEmpty() {
		return this.size == 0;
	}

	@Override
	public void clear() {
		for(int i=0;i<t.length;i++){
			t[i] = null;
		}
		this.size=0;
	}

	@Override
	public T get(int i) {
		if(i<0 || i>=this.size)return null;
		return (T) t[i];
	}

	@Override
	public int indexOf(T obj) {
		if (obj == null) {
			for (int i = 0; i < t.length; i++) {
				if (t[i] == null) return i;
			}
		}else{
			for (int i = 0; i < t.length; i++) {
				if(obj.equals(t[i]))return i;
			}
		}
		return -1;
	}

	@Override
	public void insert(int i, T obj) {
		if(i>this.size)i = this.size;
		if(i<0)i=0;
		if(this.size==t.length){
			t = Arrays.copyOf(t, t.length+10);
		}
		for (int j = size; j > i; j--) {
			t[j] = t[j-1];
		}
		t[i] = obj;
		size++;
	}

	@Override
	public T remove(int i) {
		if(i>=this.size || i<0)return null; 
		Object obj = t[i];
		for (int j = i; j < t.length-1; j++) {
			t[j] = t[j+1];
		}
		t[--size] = null;
		return (T) obj;
	}

	@Override
	public void add(T obj) {
		insert(this.size,obj);
	}

	@Override
	public int getSize() {
		return size;
	}

}
