package bag;
import utils.Node;

public class LinkedBag <T> implements BagInterface <T> {
    private Node <T> head;
    private int numberOfEntries = 0;

    public LinkedBag () {    // empty bag
        head = null;
    }

    @Override
    public int getCurrentSize() {
        return numberOfEntries;
    }

    @Override
    public boolean isEmpty() {
	if (numberOfEntries == 0 ^ head == null) {
            throw new IllegalStateException(
                    "Corrupted chain of nodes");
        }
        return numberOfEntries == 0;
    }

    @Override
    public boolean add(T newEntry) {
        Node <T> newNode = new Node <>(newEntry);
        newNode.setNext(head);
        head = newNode;
        numberOfEntries ++;
        return true;

    }

    @Override
    public boolean remove(T anEntry) {
        for (Node <T> currNode = head; currNode != null; currNode = currNode.getNext()) {
            if (anEntry.equals (currNode.getData())) {
                currNode.setData(head.getData());
                head = head.getNext();
                numberOfEntries --;
                return true;
            }
        }
        return false;
    }

    @Override
    public T remove() {
        if (isEmpty())
            return null;
        T outData = head.getData();
        head = head.getNext();
        numberOfEntries --;
        return outData;
    }

    @Override
    public void clear() {
        head = null;
        numberOfEntries = 0;
    }

    @Override
    public boolean contains(T anEntry) {
    	Node <T> bag = head;
    	while(bag.getNext() != null) {
        	if(bag.getData().equals(anEntry)) {
        		return true;
        	}
        	bag = bag.getNext();
        }
        return false;
    }

    @Override
    public int getFrequencyOf(T anEntry) {
        int count = 0;
        Node <T> bag = head;
    	while(bag.getNext() != null) {
        	if(bag.getData().equals(anEntry)) {
        		count++;
        	}
        	bag = bag.getNext();
        }
        return count;
    }

    @Override
    public T[] toArray() {
        T[] result = (T[]) new Object [numberOfEntries];
        int idx = 0;
        for (Node <T> currNode = head; currNode != null; currNode = currNode.getNext()) {
            result[idx ++] = currNode.getData();
        }
        return result;
    }

    public LinkedBag <T> copy() {
        LinkedBag <T> result = new LinkedBag <> ();
        for (Node <T> currNode = head; currNode != null; currNode = currNode.getNext())
            result.add (currNode.getData());
        return result;
    }

    public boolean equals (Object o) {
        LinkedBag <T> otherBag = (LinkedBag <T>) o;
        if (otherBag.getCurrentSize() != numberOfEntries)
            return false;
        otherBag = otherBag.copy();
        for (Node <T> currNode = head; currNode != null; currNode = currNode.getNext()) {
            if (!otherBag.remove(currNode.getData()))
                return false;
        }
        return true;
    }

    public LinkedBag <T> union (LinkedBag <T> otherBag) {
        LinkedBag <T> result = otherBag.copy();
        for (Node <T> currNode = head; currNode != null; currNode = currNode.getNext())
            result.add (currNode.getData());
        return result;
    }

    public LinkedBag <T> intersection ( LinkedBag <T> other) {
        LinkedBag <T> result = new LinkedBag <> ();
        Node <T> bag = head;
    	while(bag.getNext() != null) {
        	if(other.contains(bag.getData())) {
        		result.add(bag.getData());
        		other.remove(bag.getData());
        	}
        	bag = bag.getNext();
        }
        
        return result;
    }
}