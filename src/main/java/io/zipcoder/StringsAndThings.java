package io.zipcoder;


/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     *           countYZ("day fez"); // Should return 2
     *           countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input){
        // declare counter numWords
        Integer numWords = 0;
        //split input by " "
        String[] words = input.split(" ");
        //iterate over resulting array
        for (String s : words) {
            // it's not in the test cases, but the description and hints imply that we should account for the last character in a word not being a letter?
            char compChar = '\0';
            //iterate over the word, starting from the end
            for (int i = s.length()-1; i >= 0; i--) {
                //if the character is a letter,
                if (Character.isLetter(s.charAt(i))){
                    // then that's what we'll be using to check for x/y
                    compChar = s.charAt(i);
                    break;
                }
            }
            // if the word ends in y or z
            // we have to make sure we got a character to compare
            if (compChar != '\0' && (compChar == 'y' || compChar == 'z')) {
                numWords++;
            }
            //else do nothing
        }
        //return numWords
        return numWords;
    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     *
     * example : removeString("Hello there", "llo") // Should return "He there"
     *           removeString("Hello there", "e") //  Should return "Hllo thr"
     *           removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove){
        //split base by " "
        String[] words = base.split(" ");
        //iterate over the resulting array
        for (int i = 0; i < words.length; i++) {
            //perform String.replaceAll
            String replaced = words[i].replaceAll(remove, "");
            words[i] = replaced;
        }
        //join the strings back together
        String joined = String.join(" ", words);
        return joined;
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     *
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     *           containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     *           containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input){
        //declare is and not counters
        Integer isCounter = 0;
        Integer notCounter = 0;
        //we can't use string.split here

        // look for not first
        // startIndex = 0
        int startIndex = 0;
        //while true
        while (true) {
            //if input has not in it
            int foundIndex = input.indexOf("not", startIndex);
            if (foundIndex != -1) {
                //increase the not counter
                notCounter++;
                //update startIndex
                startIndex = foundIndex + 3 ;
            }
            // else break;
            else break;
        }

        startIndex = 0;
        while (true) {
            int foundIndex = input.indexOf("is", startIndex);
            if (foundIndex != -1) {
                isCounter++;
                startIndex = foundIndex + 2;
            }
            else break;
        }
        /**
         *
         * /////// N O T E   T O   S E L F ////////////
         * Make a helper function for the above code!
         *
         */

        return (isCounter == notCounter);
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input){
        //declare boolean happyGs (false by default in case of a String with no g's?
        //iterate through the string
            //if the char at index i is a g
            //check to its right
                //if that character is a g
                    //happyGs is true
                    //continue
                //else
                    //check to its left
                        //if that character is a g
                            //happyGs is true
                            //continue
        return null;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input){
        return null;
    }
}
