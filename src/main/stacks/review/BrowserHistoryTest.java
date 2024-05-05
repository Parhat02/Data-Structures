package main.stacks.review;

public class BrowserHistoryTest {

    public static void main(String[] args) {

        BrowserHistory bh=new BrowserHistory("leetcode.com");

        bh.visit("google.com");
        bh.visit("facebook.com");
        bh.visit("youtube.com");
        System.out.println(bh.back(2));

    }
}
