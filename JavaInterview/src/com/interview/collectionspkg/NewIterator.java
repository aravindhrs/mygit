package com.interview.collectionspkg;

public abstract interface NewIterator<E> {
	public boolean hasNextElement();
	E returnNextElement();
}
