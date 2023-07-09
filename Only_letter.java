package Sem3;

public class Only_letter {
    public static boolean isOnlyLetter(String string){
        if(string == null || string.isEmpty()){
            throw new IllegalArgumentException("String not valid");
        }
        char[] chatString = string.toCharArray();
        for(Character character : chatString){
            if(!Character.isLetter(character) && !Character.isSpaceChar(character)){
                return false;
            }
        }
        return true;
    }
}
