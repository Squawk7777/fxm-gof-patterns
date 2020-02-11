package net.mgvyshinskiy.designpatterns.gof.proxy;

import net.mgvyshinskiy.designpatterns.gof.proxy.api.CalculatorSoap;

import java.util.*;

public class CalculatorProxy implements CalculatorSoap {
    private CalculatorSoap soap;
    private Map<Integer, Map<Integer, Integer>> additions = new HashMap<>();
    private Map<Integer, Map<Integer, Integer>> substractions = new HashMap<>();
    private Map<Integer, Map<Integer, Integer>> multiplications = new HashMap<>();
    private Map<Integer, Map<Integer, Integer>> divisions = new HashMap<>();

    public CalculatorProxy(CalculatorSoap soap) {
        this.soap = soap;
    }


    @Override
    public int add(int intA, int intB) {
        return findResult(intA, intB, additions, true)
                .orElseGet(() -> {
                    Integer value = soap.add(intA, intB);
                    additions.compute(intA, (key, val) -> {
                        if (Objects.isNull(val)) {
                            Map<Integer, Integer> map = new HashMap<>();
                            map.put(intB, value);
                            return map;
                        } else {
                            val.put(intB, value);
                            return val;
                        }
                    });
                    return value;
                });
    }

    @Override
    public int subtract(int intA, int intB) {
        return findResult(intA, intB, substractions, false)
                .orElseGet(() -> {
                    Integer value = soap.subtract(intA, intB);
                    substractions.compute(intA, (key, val) -> {
                        if (Objects.isNull(val)) {
                            Map<Integer, Integer> map = new HashMap<>();
                            map.put(intB, value);
                            return map;
                        } else {
                            val.put(intB, value);
                            return val;
                        }
                    });
                    return value;
                });
    }

    @Override
    public int multiply(int intA, int intB) {
        return findResult(intA, intB, multiplications, true)
                .orElseGet(() -> {
                    Integer value = soap.multiply(intA, intB);
                    multiplications.compute(intA, (key, val) -> {
                        if (Objects.isNull(val)) {
                            Map<Integer, Integer> map = new HashMap<>();
                            map.put(intB, value);
                            return map;
                        } else {
                            val.put(intB, value);
                            return val;
                        }
                    });
                    return value;
                });
    }

    @Override
    public int divide(int intA, int intB) {
        return findResult(intA, intB, divisions, false)
                .orElseGet(() -> {
                    Integer value = soap.divide(intA, intB);
                    divisions.compute(intA, (key, val) -> {
                        if (Objects.isNull(val)) {
                            Map<Integer, Integer> map = new HashMap<>();
                            map.put(intB, value);
                            return map;
                        } else {
                            val.put(intB, value);
                            return val;
                        }
                    });
                    return value;
                });
    }

    private Optional<Integer> findResult(Integer intA, Integer intB, Map<Integer, Map<Integer, Integer>> results, Boolean anyOrder) {
        if (results.containsKey(intA) && results.get(intA).containsKey(intB)) {
            System.out.println("Found (cached): " + intA + ", " + intB);
            return Optional.ofNullable(results.get(intA).get(intB));
        } else if (Boolean.TRUE.equals(anyOrder)) {
            if (results.containsKey(intB) && results.get(intB).containsKey(intA)) {
                System.out.println("Found (cached): " + intA + ", " + intB);
                return Optional.ofNullable(results.get(intB).get(intA));
            }
        }
        System.out.println("Not found: " + intA + ", " + intB);
        return Optional.ofNullable(null);
    }
}
