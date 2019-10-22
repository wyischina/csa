package com.wyischina.func;

import java.util.*;
import java.util.function.Function;

public class FunctionDemonstration {


    private static final SortedMap<String, Function<Double, Double>> FUNCTIONS = new TreeMap<>(Map.of(
            "a(x) = x^2", x -> Math.pow(x, 2),
            "b(x) = 2x", x -> 2*x,
            "c(x) = x/2", x->x/2,
            "d(x) = -x", x->x*-1,
            "e(x) = sqrt(x)", Math::sqrt,
            "f(x) = abs(x)", Math::abs,
            "g(x) = x + 1", x-> x + 1,
            "h(x) = x", x-> x));
    private static final List<String> FUNCTIONS_INDEX = new ArrayList<>(FUNCTIONS.keySet());

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Please enter the number of compositions");
            int compositions = scanner.nextInt();
            double initial = random.nextInt(20) * 2;
            double input = initial;
            List<String> functionsApplied = new ArrayList<>();
            for (int i = 0; i < compositions; i++) {
                var functionName = FUNCTIONS_INDEX.get(random.nextInt(FUNCTIONS_INDEX.size()));
                functionsApplied.add(functionName);
                var function = FUNCTIONS.get(functionName);
                input = function.apply(input);
            }
            System.out.println("initial result: " + initial);
            System.out.println("final result: " + input);
            System.out.println("Press a key to review the answer");
            scanner.next();
            System.out.println("answers: " + functionsApplied);
        }
    }

}
