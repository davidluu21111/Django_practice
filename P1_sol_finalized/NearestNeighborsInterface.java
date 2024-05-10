// Family name: Khoi Nguyen 
//# Student number:  0300232884
//# Course: CSI 2110 
//# Assignment Number 1
//# year 2022
import java.util.*;

public interface NearestNeighborsInterface {
    public List<Point3D> rangeQuery(double eps, Point3D P);
    public List<Point3D> rangeQuery(Point3D point, double eps, List<Point3D> neighbors, KDTree.KDNode node);
    public KDTree getKdTree();
}
