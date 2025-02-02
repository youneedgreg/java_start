/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spring2025;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class AreaTriangle {
    double Area;
    double side1;
    double side2;
    double side3;
    double s;
    
    public void getValues(){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the first side of the triangle:");
        side1 = obj.nextDouble();
        System.out.println("Enter the second side of the triangle:");
        side2 = obj.nextDouble();
        System.out.println("Enter the third side of the triangle:");
        side3 = obj.nextDouble();
        
        s = (side1 + side2 + side3) / 2.0;
    }
    public void calculateArea() {
        Area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    public void displayResult() {
        System.out.printf("Area of the triangle: %.2f cubic units%n", Area);
    }
    public static void main(String[] args) {
        AreaTriangle cyl = new AreaTriangle();
        cyl.getValues();
        cyl.calculateArea();
        cyl.displayResult();
    }
}
