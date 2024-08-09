package main.trie;

public class Trie {

    TrieNode root;

    // Construct an empty Trie Object
    public Trie(){
        root = new TrieNode();
    }

    public void insert(String word){
        TrieNode currentNode=root;
        char[] arr = word.toCharArray();
        for (char c : arr) {
            if (!currentNode.children.containsKey(c)){
                currentNode.children.put(c, new TrieNode());
            }
            currentNode=currentNode.children.get(c);  // Move to next node
        }
        currentNode.isWord=true;
    }

    public boolean search(String word){
        TrieNode currentNode=root;
        char[] arr = word.toCharArray();
        for (char c : arr) {
            if (!currentNode.children.containsKey(c)){return false;}

            currentNode=currentNode.children.get(c);
        }
        return currentNode.isWord;
    }

    public boolean startsWith(String prefix){
        TrieNode currentNode=root;
        char[] arr = prefix.toCharArray();
        for (char c : arr) {
            if (!currentNode.children.containsKey(c)){return false;}

            currentNode=currentNode.children.get(c);
        }
        return true;
    }
}

/*
  Your Trie object will be instantiated and called as such:
  Trie obj = new Trie();
  obj.insert(word);
  boolean param_2 = obj.search(word);
  boolean param_3 = obj.startsWith(prefix);
 */