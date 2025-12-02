package com.jaf.org;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class Utils {
    public static List<String> readFileToStringList(int day) {
        if (day < 1 || day > 12) {
            System.out.println("Day out of range");
            return Collections.emptyList();
        }

        try (var inputStream = Utils.class.getClassLoader().getResourceAsStream("day" + day + ".txt");
             var br = new BufferedReader(new InputStreamReader(Objects.requireNonNull(inputStream)))) {
            return br.lines().toList();
        } catch (IOException e) {
            System.out.println("Could not open file :(");
            return Collections.emptyList();
        }
    }
}
