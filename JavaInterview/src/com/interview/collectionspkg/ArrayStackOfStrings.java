package com.interview.collectionspkg;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ArrayStackOfStrings {
	private String[] items;  // holds the items
    private int n;           // number of items in stack

    public ArrayStackOfStrings(int capacity) {
        items = new String[capacity];
    }

    public boolean isEmpty() {
        return n == 0; 
    }

    public boolean isFull() {
        return n == items.length; 
    }

    public void push(String item) {
        items[n++] = item;
    }

    public String pop() {
        return items[--n];
    }

    public Iterator<String> iterator() {
        return new ReverseArrayIterator();
    }

    // an iterator, doesn't implement remove() since it's optional
    private class ReverseArrayIterator implements Iterator<String> {
        private int i = n-1;
        public boolean hasNext()  { return i >= 0;                              }
        public void remove()      { throw new UnsupportedOperationException();  }

        public String next() {
            if (!hasNext()) throw new NoSuchElementException();
            return items[i--];
        }
    }


    @SuppressWarnings("resource")
	public static void main(String[] args) {
        int capacity = Integer.parseInt(args[0]);
        ArrayStackOfStrings stack = new ArrayStackOfStrings(capacity);
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        while (!str.isEmpty()) {
            String item = str.toString();
            if (!item.equals("-")) {
                stack.push(item); 
            }
            else {
                System.out.println(stack.pop() + " ");
            }
        }
        System.out.println();
    } 
}
