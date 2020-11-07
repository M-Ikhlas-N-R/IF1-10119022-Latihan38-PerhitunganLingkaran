package com.minr;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lingkaran {
    private final double Pi = 3.14159265359;
    private boolean isNumber = false;
    private double diameter = 0;

    public void setDiameter() {
        // membuat scanner baru
        Scanner userInput = new Scanner(System.in);

        while (!isNumber) {
            System.out.print("Masukkan nilai diameter lingkaran : ");
            if (userInput.hasNextInt()) {
                diameter = userInput.nextDouble();
                isNumber = true;

            } else if (!userInput.hasNextInt()) {
                System.out.println("Nilai Diameter Tidak Sesuai");
                userInput.next();
            }
            System.out.println();
        }
    }

    private double getJariJari(){
        return this.diameter / 2;
    }

    private double getLuas(){
        return this.Pi * Math.pow(this.getJariJari(), 2);
    }

    private double getKeliling(){
        return 2 * this.Pi * this.getJariJari();
    }

    public void getResult(){
        DecimalFormat df = new DecimalFormat("###.##");
        System.out.println("Jari-jari Lingkaran = " + df.format(this.getJariJari()) + " cm");
        System.out.println("Luas Lingkaran = " + df.format(this.getLuas()) + " cm");
        System.out.println("Keliling Lingkaran = " + df.format(this.getKeliling()) + " cm");

    }
}
