import java.util.Scanner;

/*
* File: MainController.java
* Author: Fehér Mátyás
* Copyright: 2023, Fehér Mátyás
* Group: Szoft I 1 N
* Date: 2021-09-03
* Github: https://github.com/MatiasX/
* Licenc: GNU GPL
*/

public class MainController {
    public void main(){
        System.out.println("Név: Fehér Mátyás\n Osztály: Szoft I 1 N\nDátum: 2023.04.27\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("A oldal: ");
        double a = scanner.nextDouble();
        System.out.print("B oldal: ");
        double b = scanner.nextDouble();
        System.out.print("C oldal: ");
        double c = scanner.nextDouble();

        Calc calc = new Calc();
        double result = calc.calculate(a, b, c);

        System.out.println("A paralelepipedon térfogata: "+result);

    }
}
