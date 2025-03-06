package org.example.adapter;

public class AdapterMain {
    public static void main(String[] args) {
        System.out.println(new AdapterSpeaker(new Speaker()).translate());
    }
}

