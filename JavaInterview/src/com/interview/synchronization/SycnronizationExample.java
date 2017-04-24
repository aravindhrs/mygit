package com.interview.synchronization;

public class SycnronizationExample {
	public static synchronized void lockedByClassLock(){
        System.out.println("This static synchronized method is locked by class level lock of this class i.e. SychronizationExample.class");
    }

	public static void main(String[] args) {
		SycnronizationExample.lockedByClassLock();
	}
}
