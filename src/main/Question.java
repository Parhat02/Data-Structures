package main;

public class Question {

    public static void main(String[] args) {
        System.out.println(removerCharacter("ASKHjshkfh", 'h'));
    }

    public static String removerCharacter(String str, char ch){
        str = str.toLowerCase();
        String newStr = "";
        for (char i:str.toCharArray()) {
            if (i!=ch){
                newStr = newStr+i;
            }
        }
        return newStr;
    }
}
