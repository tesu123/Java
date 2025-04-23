public class Array {
    public static void main(String[] args) {
        // declare and initialize and array
        // int[] age = { 12, 4, 5, 2, 5 };

        // declare an array
        int[] age = new int[5];

        // initialize array
        age[0] = 12;
        age[1] = 4;
        age[2] = 5;
        age[3] = 2;
        age[4] = 5;

        // access each array elements
        System.out.println("Accessing Elements of Array:");
        System.out.println("First Element: " + age[0]);
        System.out.println("Second Element: " + age[1]);
        System.out.println("Third Element: " + age[2]);
        System.out.println("Fourth Element: " + age[3]);
        System.out.println("Fifth Element: " + age[4]);

        /*
         * // loop through the array
         * // using for loop
         * System.out.println("Using for Loop:");
         * for(int i = 0; i < age.length; i++) {
         * System.out.println(age[i]);
         * }
         */

    }
}
