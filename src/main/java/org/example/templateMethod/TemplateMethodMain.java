package org.example.templateMethod;

public class TemplateMethodMain {
    public static void main(String[] args) {
        Cook cookFord = new CookFord();
        cookFord.cook();
        cookFord = new CookRBQ();
        cookFord.cook();
    }

}
