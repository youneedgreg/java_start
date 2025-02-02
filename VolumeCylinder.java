/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spring2025;

import java.util.Scanner;

public class VolumeCylinder {
    double volume;
    double radius;
    double height;
    
    public void getValues() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder:");
        radius = obj.nextDouble();
        System.out.println("Enter the height of the cylinder:");
        height = obj.nextDouble();
    }
    public void calculateVolume() {
        volume = Math.PI * Math.pow(radius, 2) * height;
    }
    public void displayResult() {
        System.out.printf("Volume of the cylinder: %.2f cubic units%n", volume);
    }
    public static void main(String[] args) {
        VolumeCylinder cyl = new VolumeCylinder();
        cyl.getValues();
        cyl.calculateVolume();
        cyl.displayResult();
    }
}
