import static org.junit.Assert.*;

import org.junit.Test;

public class LCATest {
	
	@Test
	public void test0() {
		LCA tree = new LCA(); 
		
		System.out.println("Test 0 LCA(4, 5): " + tree.findLCA(4,5)); 
		System.out.println("Test 0 LCA(4, 6): " + tree.findLCA(4,6)); 
		System.out.println("Test 0 LCA(8, 4): " + tree.findLCA(8,4)); 
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

		System.out.println("Test 1a LCA(4, 5): " + tree.findLCA(4,5)); 
		System.out.println("Test 1b LCA(4, 9): " + tree.findLCA(4,9));  
		System.out.println("Test 1c LCA(8, 7): " + tree.findLCA(8,7)); 
		System.out.println("Test 1d LCA(8, 9): " + tree.findLCA(8,9)); 		
	}
	
	@Test
	public void test2() {
		LCA tree = new LCA(); 
		tree.root = new Node(1); 
		tree.root.left = new Node(2); 
		tree.root.left.left = new Node(3);  
		tree.root.left.left.left = new Node(4);
		tree.root.left.left.left.left= new Node(5); 

		System.out.println("Test 2a LCA(4, 5): " + tree.findLCA(4,5)); 
		System.out.println("Test 2b LCA(4, 6): " + tree.findLCA(4,6)); 
		System.out.println("Test 2c LCA(8, 4): " + tree.findLCA(8,4)); 
	}
	
	@Test
	public void test3() {
		LCA tree = new LCA(); 
		tree.root = new Node(1); 
		tree.root.right = new Node(2); 
		tree.root.right.right = new Node(3);  
		tree.root.right.right.right = new Node(4);
		tree.root.right.right.right.right= new Node(5); 

		System.out.println("Test 3a LCA(4, 5): " + tree.findLCA(4,5)); 
		System.out.println("Test 3b LCA(4, 6): " + tree.findLCA(4,6)); 
		System.out.println("Test 3c LCA(8, 4): " + tree.findLCA(8,4)); 
	}

}
