public class IntegerTreeNode{
	private int value;
	private IntegerTreeNode left;
	private IntegerTreeNode right;
	
	public IntegerTreeNode ( int value){
		this.value = value;
		this.left = null;
		this.right = null;
	}
	
	
	public void add(int newNumber){
		if (newNumber > this.value){ //Q) why does sergio use 'this.' here but not for right or left?
			if (right == null){
				right = new IntegerTreeNode(newNumber); 
			}
			else right.add(newNumber);
		}
		else{
			if (left == null){
				left = new IntegerTreeNode(newNumber);
			}
			else left.add(newNumber);
		}
	}
	
	
	//note that this node cannot be null, else we wouldn't be calling the method from it
	public boolean contains(int n){
		if(n == this.value){
			return true;
		}
		else if (n > this.value){
			if (this.right == null){
				return false;
			}
			else{
				return right.contains(n);
			}
			}
			else {
				if(this.left == null){
					return false;
				}
				else{
					return left.contains(n);
				}
			}
			
	}
	
	public boolean containsVerbose(int n){
		System.out.println(this.value); // this should print each value checked
		if(n == this.value){
			return true;
		}
		else if (n > this.value){
			if (this.right == null){
				return false;
			}
			else{
				return right.containsVerbose(n);
			}
			}
			else {
				if(this.left == null){
					return false;
				}
				else{
					return left.containsVerbose(n);
				}
			}
			
	}
	
	public String setToString(){
		String str = "[ " + this.value;
		if ((this.left == null) && (this.right ==null)){
			str +=  " ]";
			return str;
		}
		else if (this.left == null){
			str +=  " , " + right.setToString();
		}
		else if (this.right == null){
			return " , " + left.setToString();
		}
		else{
		str += " , " + left.setToString() + ", " + right.setToString();
		}
		str += " ]";
		return str;
	}
	//error: need to get rid of the brackets 
	//and also too many commas after first element
	
			 	
	//getMax returns max int in tree - this needs to be  a method in another class surely!
	//for now, I will make getMax so it returns the max number on that branch. Same for get min.
	//this is fine, because every node is also the root of a tree
	public int getMax(){
		if (this.right == null){
			return this.value;
		}
		else{
			return right.getMax();
		}
	}
	
	
	public int getMin(){
		if (this.left == null){
			return this.value;
		}
		else{
			return left.getMin();
		}
	}
	
	public String toString(){
		if ((this.left == null) && (this.right ==null)){
			return "[" + this.value + " L[] R[] ]";
		}
		else if (this.left == null){
			return "[" + this.value +  "L[] R"+ right.toString() + "]";
		}
		else if (this.right == null){
			return "[" + this.value + " L" + left.toString() + " R[] ]";
		}
		else{
		return "[" + this.value + " L" + left.toString() + " R" + right.toString() + "]";
		}
	}
	
	//why giving no space between 11 and L ie 11L instead of 11 L??
	
	public int depth(){
		if ((left == null)&&(right == null)){
			return 0;
		}
		else {
			int leftDepth = 0; 
			int rightDepth = 0;
			if (left != null)
				leftDepth = left.depth(); // null pointer
			if (right != null)
				rightDepth = right.depth(); //null pointer
			
			if (leftDepth > rightDepth)
				return leftDepth + 1;
			else
				return rightDepth + 1;
		}
	}
	//public String setToString(){
	//	IntegerTreeNode currentNode = 
	//}	
	public int getValue(){
		return this.value;	
	}
	
	/*public void delete(int n){
		// this will not work for root node
		//if (value == n){
			
		//}
		find node With n temp.right
		when temp.right.value = n              or temp.left.value = n    //we have found the node before the one to delete.
			nodeToDelete = temp.right          or temp.left
		if ((nodeToDelete.right == null)&&(nodeToDelete.left == null)){
			nodeToDelete = null;
			return;
		}
		if (nodeToDelete.right != null){
			//need to deal with potential left branch
			IntegerTreeNode tempLeft = nodeToDelete.left;
			nodeToDelete = nodeToDelete.right;
			nodeToDelete.getNodeWithMin().left = tempLeft;
			
		}
		else{
			IntegerTreeNode tempLeft = nodeToDelete.left;
			nodeToDelete = nodeToDelete.left.getNodeWithMax();
			nodeToDelete = getNodeWithMin().left = tempLeft; 
			
		}
		
		
		(while right.right !null){
			this.right = right.right;
		}
	}
		
	public IntegerTreeNode getNodeWithMax(){
		IntegerTreeNode maxSoFar = this.right;
		(While this.right.right != null){
			maxSoFar = maxSoFar.right;
		}
		return maxSoFar;
	}	
		public IntegerTreeNode getNodeWithMin(){
		IntegerTreeNode minSoFar = this.left;
		(While this.left.left != null){
			minSoFar = minSoFar.left;
		}
		return minSoFar;
	}
		
	*/

	
	/*	
	public void rebalance(){
		//finds the median element and makes a new tree with that as the root.
		
	}
	*/
	
	
}