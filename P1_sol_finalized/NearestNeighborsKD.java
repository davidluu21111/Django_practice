
/*
 * Linear neighbors search
 *
 * CSI2510 Algorithmes et Structures de Donnees
 * www.uottawa.ca
 *
 * Robert Laganiere, 2022
 *
*/
// Family name: Khoi Nguyen 
//# Student number:  0300232884
//# Course: CSI 2110 
//# Assignment Number 1
//# year 2022
import java.util.List;
import java.util.ArrayList;

public class NearestNeighborsKD implements NearestNeighborsInterface{

  protected java.util.List<Point3D> points;
  protected KDTree kdTree;

  public KDTree getKdTree() {
    return kdTree;
  }

  // construct with list of points
  public NearestNeighborsKD(java.util.List<Point3D> points) {

    this.points = points;
    kdTree = new KDTree();

    for (Point3D p : points) {
      kdTree.add(p, 0); // the add method should call the
      // insert method given in pseudo-code
    }
  }

  public List<Point3D> rangeQuery(Point3D point, double eps, List<Point3D> neighbors, KDTree.KDNode node) {
    
    if (neighbors == null) {
      neighbors = new ArrayList<Point3D>();
    }

    if (node == null) {
      return neighbors;
    }
    if (point.distance(node.point) < eps)
      neighbors.add(node.point);
    if (point.get(node.axis) - eps <= node.value)
      rangeQuery(point, eps, neighbors, node.left);
    if (point.get(node.axis) + eps > node.value)
      rangeQuery(point, eps, neighbors, node.right);

    return neighbors;
  }

  public List<Point3D> rangeQuery(double eps, Point3D P) {
    return null;
  }
  
}
