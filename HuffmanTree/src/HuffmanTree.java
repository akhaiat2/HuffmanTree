
import java.util.*;
import java.io.*;
public class HuffmanTree {
	public PriorityQueue globalQueue = new PriorityQueue();
	public PriorityQueue<TreeNode> binaryTree = new PriorityQueue<TreeNode>();
	
	public void frequencyCounter() throws IOException {
	File file = new File("frequencyCountInput.txt");
	BufferedReader kb = new BufferedReader(new FileReader("frequencyCountInput.txt"));
	HashMap<String, Integer> map = new HashMap<String, Integer> ();
	while(kb.ready()) {
		Integer counter = 0;
		map.put((char)kb.read() + "", counter++);
	}
	
	for (String potato: map.keySet())
	{
		//add frequency and char to create an ordered priorityqueue
		globalQueue.add(new TreeNode(map.get(potato),potato, null, null));
	}
	/*for(int i = 0; i < map.size(); i++) {
		 
		} */
	kb.close();
	}
/*t
* First find two nodes with lowest frequency that don't have any parents
* Give those two nodes a parent
* Parent will have a combined frequency, and that node should be considered with other
* nodes that don't have parents
* Do this process repeatedly until you get Huffman Tree
*/
	public void binaryTree() {
		int size = globalQueue.size();
		for (int i = size; i > 1; i--)
		{
			TreeNode firstNode = (TreeNode) globalQueue.peek();
			binaryTree.add(firstNode);
			globalQueue.remove();
			TreeNode secondNode = (TreeNode) globalQueue.peek();
			binaryTree.add(secondNode);
			globalQueue.remove();
			int totalFrequency = firstNode.getFrequency() + secondNode.getFrequency();
			TreeNode parent = new TreeNode(totalFrequency, null , firstNode, secondNode);
			globalQueue.add(parent);
			binaryTree.add(parent);
		}
	}
	public void printer() throws FileNotFoundException {
		PrintWriter pw = new PrintWriter("huffmanTester.txt");
		for (TreeNode node: binaryTree)
		{
			pw.print(node);
		}
		pw.close();
	}
	
	public void encode(TreeNode x) {
		//recursive
		//String binaryText = "";
		//check left (if yes --> 0)
		//01010 = 'a'
		String binaryText = "";
		if 
		{
			
		}
	}
	
	public void decode () {
		
		//recursive
		//010101 --> traverse through tree --> get char
	}
	//printwriter pw = new PrintWriter("frequencyCountInput.txt");
	//pw.print();
	//pw.close();
	//Integer.parseInt("1001", 2) --> 9
	//Integer.toBinareyString(9) --> "1001"
	//CodeGenerator --> code file
	//Encoder(code file, file to compress) --> compressed file
	//Decoder(code file, compressed file) --> original file
}


