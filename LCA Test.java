import static org.junit.Assert.*;

import org.junit.Test;


public class LCATest {
 	
	@Test
	public void nodeConstructorTest(){
		
		Node singleNode = new Node(1);
		assertNotNull("Testing node constructor: ", singleNode);
	}
	
	@Test 
	public void emptyTreeTest(){
		LCA isTreeEmpty = new LCA();
		assertEquals("Find LCA for empty tree: ", -1 ,isTreeEmpty.findLCA(0, 0));

	}
	
	@Test
	public void testTwoNodes(){

		LCA tree = new LCA();
		tree.root = new Node(2);
		tree.root.left = new Node(4);

		assertEquals("Find LCA of tree with 2 nodes: ", 2, tree.findLCA(2, 4));	
	}
	
	@Test 
	public void testOddTree () { 
		LCA oddTree = new LCA();
		oddTree.root = new Node(1);
		oddTree.root.right = new Node(2);
		oddTree.root.right.right = new Node(3);
		oddTree.root.right.right.right = new Node(4);
		oddTree.root.right.right.right.right = new Node(5);
	
		assertEquals("Odd tree with five nodes: ", 1, oddTree.findLCA(3, 1));
		assertEquals("Odd tree with five nodes: ", 4, oddTree.findLCA(5, 4));

	}
	
	@Test 
	public void testEvenTree () { 
		LCA evenTree = new LCA();
		evenTree.root = new Node(1);
		evenTree.root.right = new Node(2);
		evenTree.root.right.right = new Node(3);
		evenTree.root.right.right.right = new Node(4);
	
		assertEquals("Even tree with four nodes: ", 3, evenTree.findLCA(3,4));	
		assertEquals("Even tree with four nodes: ", 1, evenTree.findLCA(2, 1));
	
	}
