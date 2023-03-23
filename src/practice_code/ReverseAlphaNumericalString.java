package practice_code;

public class ReverseAlphaNumericalString {
    public static void main(String[] args) {
        String inputString = "alpha123beta123";
        String reversedString = reverseAlpha(inputString);
        System.out.println(reversedString); // prints "aplha123ahpla"
    }
    
    public static String reverseAlpha(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        
        while (left < right) {
            if (!Character.isAlphabetic(charArray[left])) {
                left++;
            } else if (!Character.isAlphabetic(charArray[right])) {
                right--;
            } else {
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;
                
                left++;
                right--;
            }
        }
        return new String(charArray);
    }
}

