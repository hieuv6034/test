public class Main {
    public static int countVietnameseCharacters(String inputStr) {
        int count = 0;
        int i = 0;
        while (i < inputStr.length() - 1) {
            if(inputStr.charAt(i) == 'w'){
                count++;
                i++;
            } else if (inputStr.charAt(i) == 'a' && (inputStr.charAt(i+1) == 'a' || inputStr.charAt(i+1) == 'w')) {
                count++;
                i += 2;
            } else if (inputStr.charAt(i) == 'o' && (inputStr.charAt(i+1) == 'o' || inputStr.charAt(i+1) == 'w')) {
                count++;
                i += 2;
            } else if (inputStr.charAt(i) == 'e' && inputStr.charAt(i+1) == 'e') {
                count++;
                i += 2;
            } else if (inputStr.charAt(i) == 'd' && inputStr.charAt(i+1) == 'd') {
                count++;
                i += 2;
            } else {
                i++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String inputStr = "hfdawhwhcoomdd";
        int result = countVietnameseCharacters(inputStr);
        System.out.println(result);  
    }
}
