package io.zipcoder;

import java.util.NoSuchElementException;
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

            try {
                this.copied += this.stringIterator.next() + " ";
            } catch (NoSuchElementException nsee) {
                System.out.println("Caught ya");
            } finally {
                sharedLock.unlock();
            }


        }
    }


    public String getCopied() {
        return this.copied;
    }
}
