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
    System.out.println("Co zrobić? 0-zakończ program, 1-dodaj nowego studenta, 2-wypisz studentów, 3-wyszukaj studenta po imieniu");
    wybor = scan.nextInt();
    switch(wybor)
      {
        case 0:
          break;

        case 1:
            String imie;
          String nazwisko;
          int wiek;
          String adres;
          String data;
          System.out.println("Podaj imię: ");
          imie = scan.next();
          System.out.println("Podaj nazwisko: ");
          nazwisko = scan.next();
          System.out.println("Podaj wiek: ");
          wiek = scan.nextInt();
          System.out.println("Podaj adres (ulicę): ");
          adres = scan.next();
          System.out.println("Podaj datę urodzenia (użyj formatu dd.mm.rrrr): ");
          data = scan.next();
           char[] adata = new char[data.length()];
            for(int i=0; i<data.length(); i++ )
              {
                adata[i] = data.charAt(i);
              }
          String kropka = "."; 
          char krop = kropka.charAt(0);
          if(data.length()==10 && adata[2]==krop && adata[5]==krop && adata[3]<2){
            try {
                Service s = new Service();
                s.addStudent(new Student(imie, nazwisko, wiek, adres, data));
                
            }
              catch (IOException e){};
            
          }
            else
          {
            System.out.println("Podano niewłaściwą datę!");
          }
          
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

        case 3:
          System.out.println("Podaj imię: ");
          String imie2;
          imie2 = scan.next();

          try {
                Service f = new Service();
                f.findStudentByName(imie2);
                
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
      

  
  
