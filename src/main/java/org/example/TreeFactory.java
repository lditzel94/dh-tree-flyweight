package org.example;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static Map<String, Tree> treesByType = new HashMap<>();

    public static Tree createTree( String type ) {
        Tree tree = treesByType.get( type );

        if ( tree == null ) {
            tree = new Tree( type );
            switch ( type ) {
                case "ORNAMENTAL":
                    tree.setHeight( 200 );
                    tree.setWidth( 400 );
                    tree.setColor( "verde" );
                    System.out.println("ORNAMENTAL");
                    break;
                case "FRUTAL":
                    tree.setHeight( 500 );
                    tree.setWidth( 300 );
                    tree.setColor( "rojo" );
                    System.out.println("FRUTAL");
                    break;
                case "FLORAL":
                    tree.setHeight( 100 );
                    tree.setWidth( 200 );
                    tree.setColor( "celeste" );
                    break;
            }

            treesByType.put( type, tree );
        }

        return tree;
    }
}
