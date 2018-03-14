package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SafeCopierTest {

    Copier safeCopier;
    private String intro;
    Thread safeMarky;
    Thread safeRicky;
    Thread safeDanny;
    Thread safeTerri;
    Thread safeWinston;

    @Before
    public void setup() {
        intro = "It was the best of times,\n" +
                "it was the blurst of times,\n" +
                "it was the age of wisdom,\n" +
                "it was the age of foolishness,\n" +
                "it was the epoch of belief,\n" +
                "it was the epoch of incredulity,\n" +
                "it was the season of Light,\n" +
                "it was the season of Darkness,\n" +
                "it was the spring of hope,\n" +
                "it was the winter of despair,\n" +
                "we had everything before us,\n" +
                "we had nothing before us,\n" +
                "we were all going direct to Heaven,\n" +
                "we were all going direct the other way--\n" +
                "in short, the period was so far like the present period, that some of\n" +
                "its noisiest authorities insisted on its being received, for good or for\n" +
                "evil, in the superlative degree of comparison only. ";
        safeCopier = new SafeCopier(intro);
        safeMarky = new Thread(safeCopier);
        safeRicky = new Thread(safeCopier);
        safeDanny = new Thread(safeCopier);
        safeTerri = new Thread(safeCopier);
        safeWinston = new Thread(safeCopier);
    }


    @Test
    public void safeTest1() {
        safeMarky.start();
        safeRicky.start();
        safeDanny.start();
        safeTerri.start();
        safeWinston.start();
        String expected = intro;
        String actual = safeCopier.copied;
        System.out.println(safeCopier.copied);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void safeTest2() {
        safeMarky.start();
        safeRicky.start();
        safeDanny.start();
        safeTerri.start();
        safeWinston.start();
        String expected = intro;
        String actual = safeCopier.copied;
        System.out.println(safeCopier.copied);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void safeTest3() {
        safeMarky.start();
        safeRicky.start();
        safeDanny.start();
        safeTerri.start();
        safeWinston.start();
        String expected = intro;
        String actual = safeCopier.copied;
        System.out.println(safeCopier.copied);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void safeTest4() {
        safeMarky.start();
        safeRicky.start();
        safeDanny.start();
        safeTerri.start();
        safeWinston.start();
        String expected = intro;
        String actual = safeCopier.copied;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void safeTest5() {
        safeMarky.start();
        safeRicky.start();
        safeDanny.start();
        safeTerri.start();
        safeWinston.start();
        String expected = intro;
        String actual = safeCopier.copied;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void safeTest6() {
        safeMarky.start();
        safeRicky.start();
        safeDanny.start();
        safeTerri.start();
        safeWinston.start();
        String expected = intro;
        String actual = safeCopier.copied;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void safeTest7() {
        safeMarky.start();
        safeRicky.start();
        safeDanny.start();
        safeTerri.start();
        safeWinston.start();
        String expected = intro;
        String actual = safeCopier.copied;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void safeTest8() {
        safeMarky.start();
        safeRicky.start();
        safeDanny.start();
        safeTerri.start();
        safeWinston.start();
        String expected = intro;
        String actual = safeCopier.copied;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void safeTest9() {
        safeMarky.start();
        safeRicky.start();
        safeDanny.start();
        safeTerri.start();
        safeWinston.start();
        String expected = intro;
        String actual = safeCopier.copied;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void safeTest10() {
        safeMarky.start();
        safeRicky.start();
        safeDanny.start();
        safeTerri.start();
        safeWinston.start();
        String expected = intro;
        String actual = safeCopier.copied;
        Assert.assertEquals(expected, actual);
    }

}
