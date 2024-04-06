package algorithmAnalysis;

import java.util.HashMap;

public class GenerateDocumentProblem {
    public static void main(String[] args) {

        String characters = "!veDJaCyd vaeo perelo xw";
        String document = "Cydeo Java Developer";

        System.out.println(generateDocumentBruteForce(characters, document));
        System.out.println(generateDocumentOptimal(characters, document));

    }

    public static boolean generateDocumentBruteForce(String characters, String document){
        for (int i = 0; i < document.length(); i++) {
            char ch = document.charAt(i);
            int documentChCount = countCharacterFreq(ch, document);
            int chCount = countCharacterFreq(ch, characters);

            if (documentChCount > chCount ){
                return false;
            }
        }
        return true;
    }

    public static boolean generateDocumentOptimal(String characters, String document){
        //create HashMap (char, int)
        HashMap<Character, Integer> charCounts = new HashMap<>();

        //Iterate and count the chars in the characters list
        for (int i = 0; i < characters.length(); i++) {
            char ch = characters.charAt(i);
            charCounts.put(ch, charCounts.getOrDefault(ch, 0)+1);
        }

        //Iterate document string and update char frequency from HashMap
        for (int i = 0; i < document.length(); i++) {
            char ch = document.charAt(i);
            if (!charCounts.containsKey(ch) || charCounts.get(ch) ==0){
                return false;
            }
            charCounts.put(ch, charCounts.get(ch)-1);
        }
        // Return true if previous loop is complete without returning false
        return true;
    }

    public static int countCharacterFreq(Character ch, String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)){
                count++;
            }
        }
        return count;
    }
}
