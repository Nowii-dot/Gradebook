package pl.air.sebastian.nowak.service;

import java.util.Scanner;

public class ManagementService {

    private static   Scanner console = new Scanner(System.in);
    private static boolean shouldContinue=true;

    public static void Gradebook(){
        EduService edu = new EduService();
        CreateService.insertData(edu);
        CreateService crs = new CreateService();


        while (shouldContinue){
            System.out.println("--------Gradebook--------");
            System.out.println("1.Lista studentow");
            System.out.println("2.Dodaj studenta");
            System.out.println("3.Średnia ocena studentow");
            System.out.println("4.Liczba studentow");
            System.out.println("5.Koniec");
            System.out.println("-------------------------");
            int userNumber = console.nextInt();

            switch(userNumber){
               case 1 -> {
                   edu.rankByGrade();
                   edu.printData();
                   break;
               }
               case 2 -> crs.CreateStudent(edu);
               case 3 -> {
                   double avg = edu.getAvg();
                   System.out.println("Średnia ocen: " +avg);
               }
               case 4 ->{
                   int count = edu.getCount();
                   System.out.println("Liczba studentów: " +count);
               }
               case 5 -> shouldContinue=false;


                default -> throw new RuntimeException("Liczba poza zakresem!");
            }
        }
    }
}
