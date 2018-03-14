package io.zipcoder;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Make this extend the Copier like `UnsafeCopier`, except use locks to make sure that the actual intro gets printed
 * correctly every time.  Make the run method thread safe.
 */
public class SafeCopier extends Copier {

    Lock sharedLock = new ReentrantLock();

    public SafeCopier(String toCopy) {
        super(toCopy);
    }

    public void run() {

        while (this.stringIterator.hasNext()) {
            sharedLock.lock();
            this.copied += this.stringIterator.next() + " ";
            sharedLock.unlock();
        }
    }


    public String getCopied() {
        return this.copied;
    }
}
