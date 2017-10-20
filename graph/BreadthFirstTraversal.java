package graph;

/* See restrictions in Graph.java. */

import java.util.ArrayDeque;

/** Implements a breadth-first traversal of a graph.  Generally, the
 *  client will extend this class, overriding the visit method as desired
 *  (by default, it does nothing).
 *  @author Neha Kompella
 */
public class BreadthFirstTraversal extends Traversal {

    /** A breadth-first Traversal of G. */
    protected BreadthFirstTraversal(Graph G) {
        super(G, new ArrayDeque<Integer>());
    }

    @Override
    protected boolean visit(int v) {
        return super.visit(v);
    }

}