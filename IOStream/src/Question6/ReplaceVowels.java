package Question6;

public class ReplaceVowels {

    public static void main(String[] args) {
        String inputString = "Hello, this is a sample string with vowels.";

        // Lambda expression to replace vowels with '#'
        VowelReplacer vowelReplacer = str -> str.replaceAll("[aeiouAEIOU]", "#");

        // Call the lambda function and print the result
        String result = vowelReplacer.replaceVowels(inputString);
        System.out.println("After Replacement: " + result);
    }
}





