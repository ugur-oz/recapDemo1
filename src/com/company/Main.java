package com.company;

public class Main {

    public static void main(String[] args) {
	int zahl1 = 24;
    int zahl2 = 25;
    int zahl3 = 44;
    int größereZahl = zahl1;
    if(größereZahl<zahl2) {
        größereZahl = zahl2;
    }
    if(größereZahl<zahl3) {
        größereZahl = zahl3;
    }
        System.out.println("Größte Zahl ist : "+ größereZahl);
    }
}
