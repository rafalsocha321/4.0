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

    Scanner scan = new Scanner(System.in);
    int wybor;
    System.out.println("Co zrobić? 0-zakończ program, 1-dodaj nowego studenta, 2-wypisz studentów");
    wybor = scan.nextInt();
    switch(wybor)
      {
        case 0:
          break;

        case 1:
            String imie;
          String nazwisko;
          int wiek;
          System.out.println("Podaj imię: ");
          imie = scan.next();
          System.out.println("Podaj nazwisko: ");
          nazwisko = scan.next();
          System.out.println("Podaj wiek: ");
          wiek = scan.nextInt();
            try {
                Service s = new Service();
                s.addStudent(new Student(imie, nazwisko, wiek));
                
            }
              catch (IOException e){};
          
           break;
          
           case 2:
          try{
          Service s = new Service();  
          var students = s.getStudents();
      for(Student current : students) {
        System.out.println(current.ToString());}
      }
          catch (IOException e){};
          break;
      }
         
  }
            }
              
          
                
    
    /*try {
      Service s = new Service();
      s.addStudent(new Student("Krzysztof", 20));
      s.addStudent(new Student("Janusz", 40));

      var students = s.getStudents();
      for(Student current : students) {
        System.out.println(current.ToString());
      }
    } catch (IOException e) */
      

  
  
