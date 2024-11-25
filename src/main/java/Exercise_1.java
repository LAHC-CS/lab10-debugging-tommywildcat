class Exercise_1 {

    /*
     * We consider a new type of error: DESIGN error.  Since arr[i] == i for
     * all values of i, we can write
     * 
     * public static void findDivisableBy(int n) {
     *
     *     // for every value of i
     *     boolean first = true;
     *     for(int i = 0; i < NUM_ELEMENTS; i++) {
     *
     *         // check if value is divisible by n
     *         if((i % n) == 0) {
     *             //print if divisibile
     *             System.out.print((first ? "" : ", ") + i);
     *             first = false;
     *         };
     *     };
     *     System.out.println("");
     * }
     */

    //number of elements we want to check for
    public static final int NUM_ELEMENTS = 100;

    public static void main(String[] args) {

        // Check if given a single argument
        if(args.length != 1) {
            System.out.println("./Exercise_1 value");
            return; 
        }

        int n = Integer.parseInt(args[0]);

        //create new array of numElements long
        int[] arr = new int[NUM_ELEMENTS];

        //populate array from 0 to NUM_ELEMENTS-1
        for(int i = 0; i < NUM_ELEMENTS; i++) {
            arr[i] = i;
        };

        //find Divisable by n
        findDivisableBy(arr, n);
    }

    public static void findDivisableBy(int arr[], int n) {

        // for every element of the array
        boolean first = true;
        for(int i = 0; i < NUM_ELEMENTS; i++) {

            // check if element is divisible by n
            if((arr[i] % n) == 0) {
                //print if divisibile
                System.out.print((first ? "" : ", ") + arr[i]);
                first = false;
            };
        };
        System.out.println("");
    }
}
