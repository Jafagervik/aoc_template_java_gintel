package com.jaf.org;

import java.util.List;

public class Day8 {
    private static int part1(List<String> input) {
        return input.size();
    }

    private static int part2(List<String> input) {
        return input.size();
    }

    public static void main(String[] args) {
        final List<String > input = Utils.readFileToStringList(8);
        input.forEach(System.out::println);

        final int result_part1 = part1(input);
        System.out.println("Result of part1: " + result_part1);

        final int result_part2 = part2(input);
        System.out.println("Result of part2: " + result_part2);
    }
}
