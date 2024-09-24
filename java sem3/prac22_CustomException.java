// Custom Exception class that extends Exception (checked exception)
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Main class
public class prac22_CustomException {

    // Method to check the age eligibility
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is less than 18. Not eligible to vote.");
        } else {
            System.out.println("You are eligible to vote.");
        }
    }

    public static void main(String[] args) {
        try {
            // Trying with an invalid age
            validateAge(15);
        } catch (InvalidAgeException e) {
            // Handling custom exception
            System.out.println("Caught Exception: " + e.getMessage());
        }

        try {
            // Trying with a valid age
            validateAge(20);
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
