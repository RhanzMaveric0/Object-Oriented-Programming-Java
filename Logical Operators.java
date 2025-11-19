class LogicalOperators {
    public static void main(String[] args) {
        int age = 20;
        boolean hasLicense = true;
        
        if (age >= 18 && hasLicense) {
            System.out.println("You can drive!");
        }
        
        boolean isWeekend = false;
        boolean isHoliday = true;
        if (isWeekend || isHoliday) {
            System.out.println("No work today!");
        }
        
        boolean isRaining = false;
        if (!isRaining) {
            System.out.println("It's not raining, let's go out!");
        }
        
        int score = 85;
        boolean passed = score >= 75 && score <= 100;
        System.out.println("Passed: " + passed);
    }
}
