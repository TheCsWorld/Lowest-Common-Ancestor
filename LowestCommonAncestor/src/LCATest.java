import static org.junit.Assert.*;

import org.junit.Test;

public class LCATest {
	
	@Test
	public void test0() {
		LCA tree = new LCA(); 
		
		assertEquals("Empty tree test", -1, tree.findLCA(4,5)); 
	}

	@Test
	public void test1() {
		LCA tree = new LCA(); 
		tree.root = new Node(1); 
		tree.root.left = new Node(2); 
		tree.root.right = new Node(3); 
		tree.root.left.left = new Node(4); 
		tree.root.left.right = new Node(5); 
		tree.root.right.left = new Node(6); 
		tree.root.right.right = new Node(7);  

		//System.out.println("Test 1a LCA(4, 5): " + tree.findLCA(4,5)); 
		assertEquals("Test 1a LCA(4,5):", 2, tree.findLCA(4,5));
		//System.out.println("Test 1b LCA(4, 9): " + tree.findLCA(4,9)); 
		assertEquals("Test 1b, Missing node", -1, tree.findLCA(4,9));   
		//System.out.println("Test 1c LCA(8, 7): " + tree.findLCA(8,7));
		assertEquals("Test 1c, Missing node", -1, tree.findLCA(8,7)); 
		//System.out.println("Test 1d LCA(8, 9): " + tree.findLCA(8,9)); 	
		assertEquals("Test 1d LCA(8,9) missing Nodes", -1, tree.findLCA(8,9));
	}
	
	@Test
	public void test2() {
		LCA tree = new LCA(); 
		tree.root = new Node(1); 
		tree.root.left = new Node(2); 
		tree.root.left.left = new Node(3);  
		tree.root.left.left.left = new Node(4);
		tree.root.left.left.left.left= new Node(5); 

//		System.out.println("Test 2a LCA(4, 5): " + tree.findLCA(4,5)); 
		assertEquals("Test 2a LCA(4,5)", 4, tree.findLCA(4,5));
//		System.out.println("Test 2b LCA(4, 6): " + tree.findLCA(4,6)); 
		assertEquals("Test 2b missing node", -1, tree.findLCA(4, 6));
//		System.out.println("Test 2c LCA(8, 4): " + tree.findLCA(8,4)); 
		assertEquals("Test 2c missing node", -1, tree.findLCA(8, 4));
		
	}
	
	@Test
	public void test3() {
		LCA tree = new LCA(); 
		tree.root = new Node(1); 
		tree.root.right = new Node(2); 
		tree.root.right.right = new Node(3);  
		tree.root.right.right.right = new Node(4);
		tree.root.right.right.right.right= new Node(5); 

//		System.out.println("Test 3a LCA(4, 5): " + tree.findLCA(4,5)); 
		assertEquals("Test 3a LCA(4,5)", 4, tree.findLCA(4, 5));
//		System.out.println("Test 3b LCA(4, 6): " + tree.findLCA(4,6)); 
		assertEquals("Test 3b missing node", -1, tree.findLCA(4, 6));
//		System.out.println("Test 3c LCA(8, 4): " + tree.findLCA(8,4));
		assertEquals("Test 3c missing node", -1, tree.findLCA(8, 4));
	}
	
	@Test
	public void test4() {
		LCA tree = new LCA(); 
		tree.root = new Node(1); 
		tree.root.left = new Node(2); 
		tree.root.right = new Node(3); 
		tree.root.left.left = new Node(4); 
		tree.root.left.right = new Node(5); 
		tree.root.right.left = new Node(6); 
		tree.root.right.right = new Node(7); 
		tree.root.right.right.right = new Node(8);
		tree.root.right.right.left = new Node(9);
		tree.root.right.left.right = new Node(10);
		tree.root.right.left.left = new Node(11);
		tree.root.right.right.right.right = new Node(12);
		tree.root.left.left.left = new Node(13);

//		System.out.println("Test 4a LCA(4, 5): " + tree.findLCA(4,5)); 
		assertEquals("Test 4a LCA(4,5)", 2, tree.findLCA(4, 5));
//		System.out.println("Test 4b LCA(4, 11): " + tree.findLCA(4,11)); 
		assertEquals("Test 4b LCA(4, 11)", 1, tree.findLCA(4, 11));
//		System.out.println("Test 4c LCA(12, 7): " + tree.findLCA(12,7)); 
		assertEquals("Test 4c LCA(12,7)", 7, tree.findLCA(12, 7));
//		System.out.println("Test 4d LCA(13, 9): " + tree.findLCA(13,9)); 
		assertEquals("Test 4d LCA(13,9)", 1, tree.findLCA(13, 9));
//		System.out.println("Test 4e LCA(5, 13): " + tree.findLCA(5,13)); 
		assertEquals("Test 4e LCA(5,13)", 2, tree.findLCA(5, 13));
	} 
}
