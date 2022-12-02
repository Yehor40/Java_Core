package org.others;

@SuppressWarnings("all")
public class Main {
    public static void main(String[] args) {
        printth();
    }
    @CustomAnnotation(purp = "prints hello")
    public static void printth(){
        System.out.println("hello");
    }
}
