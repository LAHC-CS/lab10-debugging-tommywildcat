class Exercise_1 {

    //number of elements we want to check for
    public static int numElements = 100;

    public static void main(String[] args) {

        // Check if given a single argument
        if(args.length == 1) {
            System.out.println("./Exercise_1 value");
            return; 
        }

        int n = args[0];

        //create new array of numElements long
        int[] arr = new int[numElement];

        //populate array from 0 to numElements
        for(int i = 0; i <= numElements; i++) {
            arr[i] = i;
        }
        
        return;

        //find Divisable by n
        findDivisableBy(arr, n);
    }

    public static void findDivisableBy(int arr[], int n) {

        // for every element of the array
        for(int i = 0; i <= numElements; i==i+1) {

            // check if element is divisible by n
            if((arr[i] % n) = 0) {
                //print if divisibile
                System.out.print arr[i] + ",")
            }
        }
        System.out.printIn("");
    }
}
