class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        
        System.out.println("First element: " + numbers[0]);
        System.out.println("Third element: " + numbers[2]);
        
        System.out.println("\nAll elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }
        
        String[] fruits = {"Apple", "Banana", "Orange", "Mango"};
        System.out.println("\nFruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("\nSum of numbers: " + sum);
    }
}
