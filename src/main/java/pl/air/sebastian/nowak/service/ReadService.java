package pl.air.sebastian.nowak.service;

import java.util.Scanner;

public class ReadService {
    private static Scanner read = new Scanner(System.in);

    public static String ReadString(String prompt){
        System.out.print(prompt);
        String line = read.nextLine();
        return line;
    }

    public static double ReadGrade(String prompt){
        while (true){
            String line = ReadString(prompt);

            double grade = Double.parseDouble(line);
            return grade;
        }
    }

    public static void close() {
        read.close();
    }
}
