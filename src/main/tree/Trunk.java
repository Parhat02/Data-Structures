package main.tree;

public class Trunk {
    Trunk prev;
    String str;
    Trunk(Trunk prev, String str)
    {
        this.prev = prev;
        this.str = str;
    }
}
