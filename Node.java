package Assignment03;
/**
 * 
 * @author NPokhrel
 */
 public class Node <T>
{
	private T data; //Entry in bag
	private Node<T> next; //Link to next node
	
	public Node(T dataPortion) 
	{
		this(dataPortion, null);
	}
	
	public Node(T dataPortion, Node<T> nextNode) 
	{
		data= dataPortion;
		next=nextNode;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getNextNode() {
		return next;
	}

	public void setNextNode(Node<T> next) {
		this.next = next;
	}
	
	


}
