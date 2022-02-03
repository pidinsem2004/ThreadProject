import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static java.util.Random.*;

public class Main {
   /* public static void main(String[] args) {
        ExecutorService service = null;
        try {

            service =  Executors.newSingleThreadExecutor();
            Future future =  service.submit(() ->{

                String[] t = {"bonjour", "bonsoir"};
                Arrays.asList(t).stream().forEach(System.out::println);

            });



        }finally {
            if (service != null)
            {

                service.shutdown();
            }
        }


    }*/

    public static void main(String... args) {
//        List<Integer> integers = new ArrayList<Integer>();
//        List<Integer> synchroIntegers = Collections.synchronizedList(integers);
//
//        Collections.addAll(synchroIntegers, new Integer[10000]);
//        System.out.println("Initial size = " + synchroIntegers.size() );
//
//        ExecutorService e  = Executors.newFixedThreadPool(10);
//
//        for(int i =0; i<integers.size(); i++) {
//            e.execute(()->synchroIntegers.remove(0));
//        }
//        e.shutdown();
//        try {
//            e.awaitTermination(1000, TimeUnit.SECONDS);
//        }catch ( InterruptedException ex ) {
//          ex.printStackTrace();
//        }
//        System.out.println(integers.size());

//        Optional.empty();
//        Optional.of(null);
//        Optional.ofNullable(50);


        System.out.println(" Thread en Cours" + Thread.currentThread().getName());


        Thread thread = new Thread(() -> {

            System.out.println("Bonjour Monsieur");
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.currentThread().wait(1000);
                Thread.currentThread().interrupt();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });

        thread.setDaemon(true);

        thread.start();

        if (thread.isDaemon())
            System.out.println("Thread is Daemond Thread");

        if (thread.isAlive())
            System.out.println("Thread is alive");
        if (thread.isInterrupted())
            System.out.println("Thread is interrupted");



        /*HashSet<ArrayList<String>> hashSet = new HashSet<ArrayList<String>>();
        hashSet.add(new ArrayList<String>(Arrays.asList("1", "2")));
        hashSet.add(new ArrayList<String>(Arrays.asList("1", "2")));
        hashSet.add(new ArrayList<String>(Arrays.asList("2", "3")));

        System.out.println(hashSet.size());

        System.out.println(hashSet.contains(new ArrayList<String>(Arrays.asList("1", "2"))));

        System.out.print("Print the hashSet ");

        System.out.println(hashSet);

        //interating
        Iterator<ArrayList<String>> iterator = hashSet.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //removing all
        ArrayList<ArrayList<String>> myList = new ArrayList<ArrayList<String>>();
        myList.add(new ArrayList<String>(Arrays.asList("1", "2")));
        myList.add(new ArrayList<String>(Arrays.asList("1", "2")));
        hashSet.removeAll(myList);

        System.out.println(hashSet);*/


        //Queu Demo

        /*ArrayDeque<String> deque = new ArrayDeque<>();
        System.out.println(deque.add("One"));
        System.out.println(deque.add("two"));
        System.out.println(deque.add("three"));
        System.out.println(deque.add("four"));
        System.out.println(deque.add("six"));

        System.out.println(deque);
        //push et poll
        deque.push("two");
        System.out.println(deque);
        System.out.println(deque.poll());
        System.out.println(deque.pop());
        System.out.println(deque);*/

        /*List<Rabbit> rabbitList =  new ArrayList<Rabbit>();
        rabbitList.add(new Rabbit(5));
        rabbitList.add(new Rabbit(2));
        rabbitList.add(new Rabbit(100));
        Collections.sort(rabbitList, );
        Iterator<Rabbit> rabbitIterator = rabbitList.iterator();
        while (rabbitIterator.hasNext()){
            System.out.println(rabbitIterator.next().id);
        }*/

       /*BigDecimal a = new BigDecimal("5");
        BigDecimal b = new BigDecimal("7");

        System.out.println("a+b=" + a.add(b));
        System.out.println("a-b=" + a.subtract(b));
        System.out.println("a%b=" + a.remainder(b));
        System.out.println("a puissance 2 =" + a.pow(2));
        System.out.println(" a  / b =" + a.divide(b, 10, RoundingMode.HALF_UP));

        System.out.println(" a  / b =" + a.divide(b, 6, RoundingMode.HALF_DOWN));*/


        //BigDecimal instead of float

//        float accountBalance = 10000.00f;
//        System.out.println("Operations using float:");
//        System.out.println("1000 operations for 1.99");
//        for(int i = 0; i<1000; i++){
//            accountBalance -= 1.99f;
//        }
//        System.out.println(String.format("Account balance after float operations: %f", accountBalance));
//
//        BigDecimal accountBalanceTwo = new BigDecimal("10000.00");
//        System.out.println("Operations using BigDecimal:");
//        System.out.println("1000 operations for 1.99");
//        BigDecimal operation = new BigDecimal("1.99");
//        for(int i = 0; i<1000; i++){
//            accountBalanceTwo = accountBalanceTwo.subtract(operation);
//        }
//        System.out.println(String.format("Account balance after BigDecimal operations: %f", accountBalanceTwo));


        //BigDecimal.valueOf ()
//        System.out.println(BigDecimal.valueOf(10L)); //Returns cached Object reference
//        System.out.println(new BigDecimal(10L)); //Does not return cached Object reference
//
//        System.out.println(BigDecimal.valueOf(20L)); //Does not return cached Object reference
//        System.out.println(new BigDecimal(20L)); //Does not return cached Object reference
//
//
//        System.out.println(BigDecimal.valueOf(15.15)); //Preferred way to convert a double (or float) into a BigDecimal, as the value returned is equal to that resulting from constructing a BigDecimal from the result of using Double.toString(double)
//        System.out.println(new BigDecimal(15.15)); //Return unpredictable result


    }


}

