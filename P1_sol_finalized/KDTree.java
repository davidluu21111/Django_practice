// Family name: Khoi Nguyen 
//# Student number:  0300232884
//# Course: CSI 2110 
//# Assignment Number 2
//# year 2022
import java.util.*;

public class KDTree {
    public class KDNode {

        public Point3D point;
        public int axis;
        public double value;
        public KDNode left;
        public KDNode right;

        public KDNode(Point3D pt, int axis) {
            this.point = pt;
            this.axis = axis;
            this.value = pt.get(axis);
            left = right = null;
        }
    }

    private KDNode root;
    private static final int DIM = 3;

    public KDNode getRoot() {
        return this.root;
    }

    // construct empty tree
    public KDTree() {
        root = null;
    }

    public void add (Point3D point, int axis) {
        root = addRecursive(point, root, axis);
    }

    public KDNode addRecursive(Point3D point, KDNode node, int axis) {
        if (node == null) 
            node = new KDNode(point, axis);
        else if (point.get(axis) <= node.value)
            node.left = addRecursive(point, node.left, (axis+1) % DIM);
        else
            node.right = addRecursive(point, node.right, (axis+1) % DIM);

        return node;
    }

    
}