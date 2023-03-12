/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bola;

/**
 *
 * @author yafiaryamaulana
 */
public class Bola {
    
    private double jari_jari;

    public Bola (double Jarijari) {
        this.jari_jari = Jarijari;
    }

    public Bola () {
        this (5.3);
    }

    public double volumeResult () {
        double volume = (4.0/3.0) * Math.PI * Math.pow(jari_jari, 3);
        return volume;
    }

    public double getjariJari() {
        return jari_jari;
    }

    public void setJarijari (double Jarijari) {
        this.jari_jari = Jarijari;
    }
    }
    

