public class Set {

// Make global LinkedNode head 
	LinkedNode head;

	void add(int x) {

		// If integer x doesn't already exists in the list add it as the new head node
		// of the list
		if (!exists(x)) {
			LinkedNode newNode = new LinkedNode(x);
			newNode.next = head;
			head = newNode;
		}
	}

	void del(int x) {

		// Create pointer nodes
		LinkedNode current = head;
		LinkedNode previous = null;

		// If x doesn't exist in list, return list
		if (!exists(x)) {
			return;
		}

		// If head equals x move head to next node (deleting link from x to next node)
		if (current.x == x) {
			head = current.next;
			return;
		}

		// If current doesn't equal x traverse through list to find x with two pointers
		while (current.x != x) {
			previous = current;
			current = current.next;

		}
		// Current is unlinked from list
		previous.next = current.next;

	}

	// Check to see if integer x exists in the list
	boolean exists(int x) {
		LinkedNode current = head;

		// Loop to check if current(pointer) id equal to integer, if not, it moves on to
		// the next node
		// If integer is not found it returns false.
		while (current != null) {
			if (current.x == x) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

	// Change LinkedList to string for user to view
	public String toString() {

		String string = "";
		LinkedNode current = head;
		while (current != null) {
			string += current.x + " ";
			current = current.next;
		}
		return string;
	}
}
