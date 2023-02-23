package org.example;

public class Main {
    public static void main( String[] args ) {
        var forest = new Forest();
        forest.plant( 1_000_000 );
        System.out.println( "Forest size: " + forest.getTrees().size() );
        Runtime runtime = Runtime.getRuntime();
        System.out.println( "Memoria usada: " + ( runtime.totalMemory() - runtime.freeMemory() ) / ( 1024 * 1024 ) );
    }
}