package com.greatlearning.bst;

public class skewbinary {

	// Binary tree node
	static class Node
	{
		Node left,right;
		int data;
	};

	// Function to create a new Binary node
	static Node newNode(int data)
	{
		Node temp = new Node();

		temp.data = data;
		temp.left =temp.right = null;
		
		return temp;
	}
	static Node node;
	static Node prevNode = null;
	static  Node headNode = null;
   
   
    // Function to to flatten the binary search tree into a skewed tree 
   
    static void skewed(Node root, int order)
    {
       
        // Base Case
        if(root == null)
        {
            return;
        }
        if(order > 0)
        {
        	skewed(root.right, order);
        }
        else
        {
        	skewed(root.left, order);
        }
        Node rightNode = root.right;
        Node leftNode = root.left;
        if(headNode == null)
        {
            headNode = root;
            root.left = null;
            prevNode = root;
        }
        else
        {
            prevNode.right = root;
            root.left = null;
            prevNode = root;
        }
       
        // Similarly recurse for the left / right
        // subtree on the basis of the order required
        if (order > 0)
        {
           skewed(leftNode, order);
        	
        }
        else
        {
        	skewed(rightNode, order);
        	
        }
    }
        
        static void traverseRightSkewed(Node root)
        {
            if(root == null)
            {
                return;
            }
           
            System.out.print(root.data + " ");
           
            traverseRightSkewed(root.right);    
            
        }
      
 
	// Driver Code
	public static void main(String[] args)
	{
		//Construct binary tree 
		
		Node root = newNode(50);
		root.left = newNode(30);
		root.left.left = newNode(10);
		root.right = newNode(60);
		root.right.left= newNode(40);
	
		
		 int order = 0;
	        skewed(root, order);
	        traverseRightSkewed(headNode);
	       
	       
	     
	}
}
