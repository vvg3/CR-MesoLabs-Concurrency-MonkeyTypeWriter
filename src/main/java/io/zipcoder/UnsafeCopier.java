package io.zipcoder;

/**
 * Modify the run function so that the monkeys each grab the next word and write it to the copy.
 */
public class UnsafeCopier extends Copier implements Runnable {

    public UnsafeCopier(String toCopy) {
        super(toCopy);
    }

    public void run() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.copied);

        while (this.stringIterator.hasNext()) {
            sb.append(this.stringIterator.next());
            sb.append(" ");
        }

        this.copied = sb.toString();
    }

    public String getCopied() {
        return this.copied;
    }
}
