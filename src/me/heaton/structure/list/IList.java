package me.heaton.structure.list;

public interface IList<T> {

	public boolean isEmpty();
	public void clear();
	public T get(int i);
	public int indexOf(T obj);
	public void insert(int i,T obj);
	public T remove(int i);
	public void add(T obj);
	public int getSize();

}
