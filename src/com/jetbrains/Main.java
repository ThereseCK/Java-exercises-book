package com.jetbrains;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*line();
	System.out.println("!!   Introduction to Java Programming      !!");
	line();
	starLine();
	star();
	star();
	star();
	star();
	starLine();
	Addition();
	Format();
	Rhombus2();
	TwoShips();
	DrawLine();
	DrawTop();
	DrawBottom();
	DrawLine();*/

        BMICalculator(77, 162);
        NestedLoops();
        Diamond();
        giveIntro();
        Scanner console = new Scanner(System.in);
        double bmi1 = getBMI(console);
        double bmi2 = getBMI(console);
        reportResults(bmi1, bmi2);

    }

    public static void line() {
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }

    public static void starLine() {
        System.out.println("*****************");
    }

    public static void star() {
        System.out.println("*               *");
    }

    public static void Addition() {
        System.out.println("A Java Program for addition contains " +
                "\nthree variables; a, b and sum. " +
                "\nVariable \"sum\" holds the added result. " +
                "\n" +
                "\nThe System.out.println statement " +
                "\nin the program prints values of the variables " +
                "\na = 2 and b = 3" +
                "\nsum = 5" +
                "\nSum of 2 and 3 is 5 ");
    }

    public static void Format() {
        System.out.println("What is the difference between " +
                "\n\"\\t\" and \"\\n\"?" +
                "\n\"\\t\" like \\t This\\tis\\tcool, does this: \tThis\tis\tcool \n" +
                "\n\"\\n\" like \\n This\\nis\\ncool, does this: \nThis\nis\ncool");
    }

    public static void Rhombus() {
        System.out.println("   $$$   ");
        System.out.println("  $   $  ");
        System.out.println(" $     $ ");
        Rhombus1();
    }

    public static void Rhombus1() {
        System.out.println("\"_'_\"_'_\"");
        System.out.println(" $     $ ");
        System.out.println("  $   $  ");
        System.out.println("   $$$   ");
    }

    public static void Rhombus2() {
        Rhombus();
        Rhombus1();
        Rhombus();
    }

    /*public static void common1(){
        System.out.print(" | Sea | ");
        System.out.print(" |Horse| ");

    }*/
    public static char common2() {
        System.out.print("  |  |   ");
        return 0;
    }

    public static char common3() {
        System.out.print(" -------");
        return 0;
    }
   /* public  static void common4(){
        System.out.println(" @     @");
        System.out.println("  @   @");
        System.out.println("   ----");
    }*/

    public static void TwoShips() {
        System.out.print(" | Sea | ");
        System.out.println(" | Sea | ");
        System.out.print(" |Horse| ");
        System.out.println(" |Horse| ");
        System.out.print(common2());
        System.out.println(common2());
        System.out.print(common2());
        System.out.println(common2());
        System.out.print(common2());
        System.out.println(common2());
        System.out.print(common3());
        System.out.println(common3());
        System.out.print(" @     @");
        System.out.println(" @     @");
        System.out.print("  @   @ ");
        System.out.println("  @   @");
        System.out.print("   ----");
        System.out.println("   ----");
    }

    public static final int SUB_HEIGHT = 5;     //Bestemmer høyden på time-glasset

    public static void DrawLine() {
        System.out.print("+");
        for (int i = 1; i <= (2 * SUB_HEIGHT); i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    public static void DrawTop() {
        for (int line = 1; line <= SUB_HEIGHT; line++) {
            System.out.print("|");
            for (int i = 1; i <= (line - 1); i++) {
                System.out.print(" ");
            }
            System.out.print("\\");
            int dots = 2 * SUB_HEIGHT - 2 * line;
            for (int i = 1; i <= dots; i++) {
                System.out.print(".");
            }
            System.out.print("/");
            for (int i = 1; i <= (line - 1); i++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

    public static void DrawBottom() {
        for (int line = 1; line <= SUB_HEIGHT; line++) {
            System.out.print("|");
            for (int i = 1; i <= (SUB_HEIGHT - line); i++) {
                System.out.print(" ");
            }
            System.out.print("/");
            for (int i = 1; i <= 2 * (line - 1); i++) {
                System.out.print(".");
            }
            System.out.print("\\");
            for (int i = 1; i <= (SUB_HEIGHT - line); i++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

    public static void BMICalculator(float weight, float height) {

        float bmi;
        bmi = weight / (height * height) * 10000;
        System.out.println("Din BMI er: " + bmi);
    }

    public static void NestedLoops() {
        for (int Pattern1 = 0; Pattern1 <= 5; Pattern1++) { //outerLoop
            for (int Pattern11 = 0; Pattern11 <= Pattern1; Pattern11++) { //innerLoop
                System.out.print("+");
            }
            System.out.println();
        }

        for (int Pattern2 = 0; Pattern2 <= 4; Pattern2++) {
            for (int Pattern22 = 4; Pattern22 >= Pattern2; Pattern22--) {
                System.out.print("+");
            }
            System.out.println();
        }
    }

    public static void Diamond() {
        int size = 9;
        //øvre del
        for (int i = 1; i < size; i += 2) {
            for (int k = size; k >= i; k -= 2) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //nedre del
        for (int i = 1; i <= size; i += 2) {
            for (int k = 1; k <= i; k += 2) {
                System.out.print(" ");
            }
            for (int j = size; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void giveIntro(){
        System.out.println("This program reads data for two");
        System.out.println("People and computes their body");
        System.out.println("mass inex and Weight status");
        System.out.println();
    }
    public static double getBMI(Scanner console){
        System.out.println("Enter person's information:");
        System.out.print("heigth (in inches)? ");
        double height = console.nextDouble();
        System.out.print("weigth (in pounds)? ");
        double weight = console.nextDouble();
        double bmi = BMIFor(height, weight);
        System.out.println();
        return bmi;
    }
    public static double BMIFor(double height, double weight){
        return weight/ (height * height) * 703;
    }

    private static void reportResults(double bmi1, double bmi2) {
        System.out.printf("Person #1 body mass index = %5.2f\n", bmi1);
        reportStatus(bmi1);
        System.out.printf("Person # body mass index = %5.2f\n", bmi1);
        reportStatus(bmi2);
    }

    private static void reportStatus(double bmi) {

        if (bmi < 18.5) {
            System.out.println("underweight");
        } else if (bmi < 25) {
            System.out.println("normal");
        } else if (bmi < 30) {
            System.out.println("overweight");
        } else {
            System.out.println("obese");

        }
    }
}




