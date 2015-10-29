public class IntegerTreeScript{
	public static void main(String[] args){
		IntegerTreeScript script = new IntegerTreeScript();
		script.launch();
	}
	
	
	public void launch(){
		IntegerTreeNode firstNode = new IntegerTreeNode(6);
		System.out.println("The depth is " + firstNode.depth());
		System.out.println(firstNode.toString());
		addAndCheck(9 , firstNode);
		addAndCheck(5 , firstNode);
		addAndCheck(3 , firstNode);
		addAndCheck(11 , firstNode);
		addAndCheck(12 , firstNode);
		addAndCheck(8 , firstNode);
		addAndCheck(1 , firstNode);
		//firstNode.delete(-1);
		System.out.println(firstNode.toString());
		System.out.println(firstNode.contains(7));
		System.out.println(firstNode.contains(11));
		System.out.println(firstNode.getMax());
		System.out.println(firstNode.getMin());
		System.out.println(firstNode.toString());
	}
	private void addAndCheck(int n , IntegerTreeNode node){
		System.out.println("You are going to add " + n +".");
		System.out.println("Here is the tree before the addition:");
		System.out.println(node.toString());
		System.out.println("The depth is " + node.depth() +".");
		node.add(n);
		System.out.println("Here is the tree after the addition:");
		System.out.println(node.toString());
		System.out.println("The depth is now " + node.depth() +".");
		System.out.println();
	}
	
	
}