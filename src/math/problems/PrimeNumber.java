package math.problems;

public class PrimeNumber {

    public static void main(String[] args) {
        /*
         * Find list of Prime numbers from number 2 to 1 million.
         * Try the best solution as possible.Which will take less CPU life cycle.
         * Out put number of Prime numbers on the given range.
         *
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         *
         */
        int i;
        int num = 0;
        int maxChack= 100;
        boolean isPrime =true;
        String primeNumberFound = "";
        for (i=2; i<=maxChack; i++){
            isPrime=CheckPrime(i);
            if (isPrime){
                primeNumberFound=primeNumberFound + i+"";
            }
        }
        System.out.println("prime number of 2 and " +maxChack+ " are:");
        System.out.println(primeNumberFound);
    }
        public static boolean CheckPrime(int numberToCheck) {
            int reminder;
            for (int i=2; i<=numberToCheck / 2; i++){
                reminder = numberToCheck % i;
                if (reminder==0){
                    return false;
                }
            }
            return true;
        }
}
