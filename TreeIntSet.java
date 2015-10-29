public class TreeIntSet implements IntSet{
	
	private IntegerTreeNode firstNode;
	
	public TreeIntSet(){
		firstNode = null;
	}
	// note this constructor will be called from the launch method. 
	//It cannot be called from within itself, so the issue of it being an 
	//extra method doesn't mean we have to declare the intSet 
	// object as being of the class TreeIntSet instead of IntSet.
	
	public void add(int n){
		if (firstNode == null)
			firstNode = new IntegerTreeNode(n); //error: identifier expected
		else
			firstNode.add(n);
	}
	public boolean contains(int n){
		return firstNode.contains(n);
	}
	
	public boolean containsVerbose(int n){
		return firstNode.containsVerbose(n);
	}
	
	public String toString(){
		return firstNode.setToString();
	}
}