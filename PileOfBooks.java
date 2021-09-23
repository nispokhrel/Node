package Assignment03;

/**
 * OUTLINE A class of bags whose entries are stored in a chain of linked nodes.
 * The bag is never full.
 * @author NPokhrel
 */

public class PileOfBooks<T> implements PileInterface<T> {
	// reference to first node
	private Node<T> firstNode;
	private int numberOfBooks;

	public PileOfBooks() {
		firstNode = null;
		numberOfBooks = 0;
	}

	@Override
	public void add(T newBook) {
		// Add to beginning of chain:
		Node<T> newNode = new Node<T>(newBook);
		newNode.setNextNode(firstNode); // Make new node reference rest of chain
		// (firstNode is null if chain is empty)
		firstNode = newNode; // New node is at beginning of chain
		numberOfBooks++;

	}

	@Override
	public T remove() {
		T result = null;
		if (firstNode != null) {
			result = firstNode.getData();
			firstNode = firstNode.getNextNode(); // Remove first node from chain
			numberOfBooks--;
		}
		return result;
	}

	@Override
	public T getTopBook() {
		if (firstNode != null) {
			return firstNode.getData();
		} else {
			return null;
		}
	}

	@Override
	public boolean isEmpty() {
		return firstNode == null;

	}

	@Override
	public void clear() {
		while (!isEmpty()) // running the while loop until everything is removed
			remove();

	}

	@Override
	public T[] toArray() {
		// The cast is safe because the new array contains null entries.
		@SuppressWarnings("unchecked")
		T[] result = (T[]) new Object[numberOfBooks]; // Unchecked cast
		int index = 0;
		Node<T> currentNode = firstNode;
		while ((index < numberOfBooks) && (currentNode != null)) {
			result[index] = (T) currentNode.getData();
			index++;
			currentNode = currentNode.getNextNode();
		}

		return result;
	}
}