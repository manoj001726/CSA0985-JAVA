import java.util.Scanner;
 class WordReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String inputWord = scanner.nextLine();
        scanner.close();
        String reversedWord = reverseWord(inputWord);
        System.out.println("Reversed word: " + reversedWord);
    }
    public static String reverseWord(String word) {
        char[] characters = word.toCharArray();
        int left = 0;
        int right = characters.length - 1;
        while (left < right) {
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;
            left++;
            right--;
        }

        return new String(characters);
    }
}