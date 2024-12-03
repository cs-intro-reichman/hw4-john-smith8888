public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        char v = args[1].charAt(0);
        boolean verbose = v=='v';
        int counter = 0;
        System.out.println("Prime numbers up to " + n + ":");
        // array initialization
        boolean arr[] = new boolean[n+1];
        for(int i=2;i<arr.length;i++){
            arr[i] = true;
        }

        // corssing out primes by multilpiers
        for (int i=2;i<arr.length;i++){
            if (arr[i]) {
                for (int j=2*i;j<=arr.length-1;j=j+i){
                    arr[j] = false;
                }
                if (verbose) {
                    System.out.println(i);
                }
            }
        }
        // counting primes
        for(int i=0;i<arr.length;i++){
            if (arr[i]) {
                counter++;
            }
        }

        double ratio = 100*counter/n;
        String pct = String.format("%,.0f", ratio);
        System.out.println("There are " + counter + " primes between "+"2"+" and " + n + " ("+pct+"% are primes)");
    }
}