/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra_p19_vilcacundo;

import java.util.Scanner;

/**
 *
 * @author antonyvilvin
 */
public class Extra_P19_Vilcacundo {

    static int numberTeams;
    static String[] team;
    static int[] points;
    static int[] goalsScored;
    static int[] goalsRecived;

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int option = -1;
        do {
            userMenu();
            option = keyboard.nextInt();

            switch (option) {
                case 1:

                    System.out.println("Number of teams");
                    numberTeams = keyboard.nextInt();

                    team = new String[numberTeams];
                    points = new int[numberTeams];
                    goalsScored = new int[numberTeams];
                    goalsRecived = new int[numberTeams];

                    for (int i = 0; i < team.length; i++) {
                        System.out.println("Name of team: ");
                        team[i] = keyboard.next();

                    }

                    for (int i2 = 0; i2 < points.length; i2++) {
                        System.out.println("Point of team: ");
                        points[i2] = keyboard.nextInt();
                    }
                    for (int i3 = 0; i3 < goalsScored.length; i3++) {
                        System.out.println("Goals Scored: ");
                        goalsScored[i3] = keyboard.nextInt();
                    }
                    for (int i4 = 0; i4 < goalsRecived.length; i4++) {
                        System.out.println("Goals Received: ");
                        goalsRecived[i4] = keyboard.nextInt();
                    }

                    view(team, points, goalsScored, goalsRecived);

                    break;

                case 2:
                  
                    break;
                case 3:

                    break;

                case 4:

                    double markMin = 1000;
                    int positionMin = 0;
                    
                    for (int index = 0; index < numberTeams; index++) {

                        if (goalsScored[index] < markMin) {
                            markMin = goalsScored[index];
                            positionMin = index;
                        }
                    }

                    System.out.println("Min Goals " + team[positionMin] + " : " + markMin);

                    break;

                case 5:

                    double markMax = 0;

                    int positionMax = 0;

                    for (int index = 0; index < numberTeams; index++) {
                        if (goalsScored[index] > markMax) {
                            markMax = goalsScored[index];
                            positionMax = index;
                        }

                    }
                    System.out.println("Max Goals " + team[positionMax] + " : " + markMax);

                    break;
                case 6:

                    double sum = 0;
                    for (int index = 0; index < numberTeams; index++) {
                        sum += goalsScored[index];
                    }
                    double med = sum / numberTeams;
                    System.out.println("The media is: " + med);

                    break;
                case 7:
                    

                    
                    break;
                case 8:
                    System.out.println("DNI? ");
                    int dni=keyboard.nextInt();
                    char letter =functionDNI( dni);
                    
                    System.out.println(dni+"-"+letter);
                    break;
                case 9:

                    
                    
                    break;
                case 10:

             
                    System.out.println("Quieres salir?");
                    String res = keyboard.next();
                    if (res.equals("Y")) {
                        System.out.print("BY...");
                    } else {
                        option = 90;
                    }
                    break;
                default:
                    System.out.println("NOOOOO");
            }
        } while (option != 10);
    }

    private static void userMenu() {
        System.out.println("Option 1 - ");
        System.out.println("Option 2 - ");
        System.out.println("Option 3 - ");
        System.out.println("Option 4 - ");
        System.out.println("Option 5 - ");
        System.out.println("Option 6 - ");
        System.out.println("Option 7 - ");
        System.out.println("Option 8 - ");
        System.out.println("Option 9 - ");
        System.out.println("Option 10 - salir");

    }

    private static void p10() {
        System.out.println("Thanks you ..... BYE\n");
    }

    private static void view(String[] team, int[] points, int[] goalsScored, int[] goalsRecived) {

        for (int i5 = 0; i5 < team.length; i5++) { //array.length sirve para coger los elementos
            System.out.println("Team: " + team[i5] + "   Points:  " + points[i5] + "  Goalds Scored:  " + goalsScored[i5] + "  Goals Received:  " + goalsRecived[i5]);
            //System.out.println(arrayNumbers[i]); 
        }

    }

    private static char functionDNI(int dni) {

char letter= ' ';
String stringDNI = "TRWAGMYFPDXBNJZSQVHLCKE";
int  residuo =dni%23;
letter = stringDNI.charAt(residuo);

return letter;
    
    }

}
