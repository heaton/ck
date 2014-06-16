package me.heaton.structure.list;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestList {

	private IList<Integer> list;
	
	@Test
	public void testSqList() {
		list = new SqList<Integer>();
		testList(list);
	}

	@Test
	public void testLinkList() {
		list = new LinkList<Integer>();
		testList(list);
	}
	
	@Test
	public void testStaticLinkList() {
		list = new StaticLinkList<Integer>();
		testList(list);
	}
	
	@Test
	public void testCircularLinkList() {
		list = new CircularLinkList<Integer>();
		testList(list);
	}
	
	@Test
	public void testDoubleLinkList() {
		list = new DoubleLinkList<Integer>();
		testList(list);
	}
	
	protected void testList(IList<Integer> list){
		assertTrue(list.isEmpty());
		list.add(10);
		assertEquals(1, list.getSize());
		list.insert(0, 5);
		assertEquals(5, list.get(0).intValue());
		list.add(15);
		list.remove(1);
		assertEquals(15, list.get(1).intValue());
		assertEquals(2, list.getSize());
		assertEquals(-1, list.indexOf(10));
		list.add(20);
		assertEquals(2, list.indexOf(20));
		list.insert(1,21);
		list.add(25);
		assertEquals(5, list.getSize());
		assertEquals(21, list.get(1).intValue());
		assertEquals(25, list.remove(4).intValue());
		assertEquals(20, list.remove(3).intValue());
		assertFalse(list.isEmpty());
		list.clear();
		assertTrue(list.isEmpty());
		assertEquals(0, list.getSize());
	}
}