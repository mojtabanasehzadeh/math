package com.rapid.math.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.stream.IntStream;

@Service
public class MathLibService {

    private final boolean useRecursion;

    @Autowired
    public MathLibService(@Value("${mathlib.useRecursion}") boolean useRecursion) {
        this.useRecursion = useRecursion;
    }

    public long factorial(int n) {
        return useRecursion ? factorialRecursive(n) : factorialList(n);
    }

    private long factorialRecursive(int n) {
        if (n <= 1) return 1;
        return n * factorialRecursive(n - 1);
    }

    private long factorialList(int n) {
        return IntStream.rangeClosed(1, n)
                .reduce(1, (a, b) -> a * b);
    }

    public long unevenFactorial(int n) {
        return IntStream.rangeClosed(1, n)
                .filter(x -> x % 2 != 0)
                .reduce(1, (a, b) -> a * b);
    }

    public long squareFactorial(int n) {
        return IntStream.rangeClosed(1, n)
                .map(x -> x * x)
                .reduce(1, (a, b) -> a * b);
    }
}