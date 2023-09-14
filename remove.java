class RemoveHalfOfString {
    public static void main(String[] args)
     {
        String fullString = "Leg piece.";
        
        String result = removeSecondHalf(fullString);
        System.out.println("Modified string: " + result);
    }

    public static String removeSecondHalf(String input) {
        int length = input.length();
        int middleIndex = length / 2;
        
        // Extract the first half of the string
        String firstHalf = input.substring(0, middleIndex);
        
        return firstHalf;
    }
}
