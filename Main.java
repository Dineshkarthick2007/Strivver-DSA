public class Main {
    public static void main(String[] args) {
        String original = "Hello! World_123 #Java$%";
        
        // Matches any lowercase letter, uppercase letter, or digit
        String result = original.replaceAll("[a-zA-Z0-9]", "");
        
        System.out.println("Original: " + original);
        System.out.println("Result:   " + result); 
        // Output: ! _  #$% (spaces and special characters remain)
    }
}
