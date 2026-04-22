public class DataTypes {
    public static void main(String[] args) {
        // boolean (size not precisely defined, typically 1 bit logical)
        boolean hasActiveSubscription = true;
        System.out.println(hasActiveSubscription);

// byte (8-bit, 1 byte)
        byte moduleLevel = 5;
        System.out.println(moduleLevel);

// short (16-bit, 2 bytes)
        short contestScore = 1500;
        System.out.println(contestScore);

// int (32-bit, 4 bytes)
        int totalUsers = 250000;
        System.out.println(totalUsers);

// long (64-bit, 8 bytes)
        long platformVisits = 15000000000L;
        System.out.println(platformVisits);

// double (64-bit, 8 bytes)
        double averageCompletionTime = 3.75;
        System.out.println(averageCompletionTime);

// float (32-bit, 4 bytes)
        float discountRate = 12.5F;
        System.out.println(discountRate);

// char (16-bit, 2 bytes)
        char gradeLevel = 'A';
        System.out.println(gradeLevel);

        char symbol = '\u2605';
        System.out.println(symbol);
    }
}
