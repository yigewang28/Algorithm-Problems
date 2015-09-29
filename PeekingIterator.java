// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
class PeekingIterator implements Iterator<Integer> {
    private Iterator<Integer> itr;
    private Integer next;

	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    itr = iterator;
	}

    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        if(next == null && itr.hasNext()) {
            next = itr.next();
        }
        return next;
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    if(next != null) {
	        Integer result = next;
	        next = null;
	        return result;
	    }
	    return itr.next();
	}

	@Override
	public boolean hasNext() {
	    if(next != null) {
	        return true;
	    }
	    return itr.hasNext();
	}
}