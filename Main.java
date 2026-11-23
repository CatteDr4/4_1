/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/

import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    try {
      Service s = new Service();
      // s.addStudent(new Student("Krzysztof", 20));
      // s.addStudent(new Student("Janusz", 40));

      boolean is_running = true;

      while (is_running) {
        System.out.println("--------MENU--------");
        System.out.println("1. Dodaj studenta");
        System.out.println("2. Wypisz studentow");
        System.out.println("0. Zamknij program");
        System.out.println("----------------------------");

        int c = scanner.nextInt();
        scanner.nextLine();

        switch (c) {
          case 1:
            System.out.println("-----WSTAWIANIE STUDENTA-----");
            System.out.print("Podaj imie studenta: ");
            String imie = scanner.nextLine();
            System.out.print("Podaj nazwisko studenta: ");
            String nazwisko = scanner.nextLine();
            System.out.print("Podaj wiek studenta: ");
            int wiek = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Podaj nr albumu studenta: ");
            int nr_albumu = scanner.nextInt();
            scanner.nextLine();
            System.out.println("----------------------------");

            s.addStudent(new Student(imie, wiek, nazwisko, nr_albumu));
            break;
            
          case 2:
            var students = s.getStudents();
            System.out.println("-----LISTA STUDENTOW-----");
            for(Student current : students) {
              System.out.println(current.ToString());
            }
            System.out.println("----------------------------");
            break;
            
          case 0:
            is_running = false;
            break;

          default:
            System.out.println("Whar?");
        }
      }
    } catch (IOException e) {

    }
  }
}