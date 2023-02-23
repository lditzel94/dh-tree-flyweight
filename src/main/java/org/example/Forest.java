package org.example;

import java.util.ArrayList;
import java.util.List;

import static org.example.TreeType.FRUTAL;
import static org.example.TreeType.ORNAMENTAL;

public class Forest {
    private List<Tree> trees = new ArrayList<>();

    public void plant( int forestSize ) {
        for ( int i = 0; i < forestSize / 2; i++ ) {
            trees.add( TreeFactory.createTree( ORNAMENTAL ) );
        }

        for ( int i = 0; i < forestSize / 2; i++ ) {
            trees.add( TreeFactory.createTree( FRUTAL ) );
        }
    }

    public List<Tree> getTrees() {
        return trees;
    }
}
