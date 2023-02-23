package org.example;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static Map<TreeType, Tree> treesByType = new HashMap<>();

    public static Tree createTree( TreeType type ) {
        Tree tree = treesByType.get( type );

        if ( tree == null ) {
            tree = new Tree( type );
            switch ( type ) {
                case ORNAMENTAL:
                    tree.setHeight( 200 );
                    tree.setWidth( 400 );
                    tree.setColor( "verde" );
                    break;
                case FRUTAL:
                    tree.setHeight( 500 );
                    tree.setWidth( 300 );
                    tree.setColor( "rojo" );
                    break;
                case FLORAL:
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
