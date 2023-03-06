package com.epam.mjc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class CollectionService {

    public List<Integer> filterEvenNumbers(List<Integer> list) {
        List<Integer> out = new ArrayList<>();
        list.stream().filter(num -> (num %2==0)).forEach(out::add);
        return out;
    }

    public List<String> toUpperCaseCollection(List<String> list) {
        List <String> out = new ArrayList<>();
        list.stream().map(String::toUpperCase).forEach(out::add);
        return out;
    }

    public Optional<Integer> findMax(List<Integer> list) {
    return list.stream().max(Integer::compare);
    }

    public Optional<Integer> findMin(List<List<Integer>> list) {
    return list.stream().flatMap(Collection::stream).min(Integer::compare);
    }

    public Integer sum(List<Integer> list) {
return list.stream().reduce(0,Integer::sum);
    }
}
