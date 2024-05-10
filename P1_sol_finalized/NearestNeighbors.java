/** 
 * Kyle Sprague
 * SN
 * CSI 2110
 *
 * Nearest Neighbors (NN) has the sole purpose of finding points within a certain
 * distance (inside the neighborhood) of a given point P. When using NN,
 * you should initialize only one NN insance with all of your points and use
 * it for all of you NN calls. This implementation is made more efficient by
 * sorting the points to avoid extra (relatively expensive) distance calculations.
 *
 * @author Kyle Sprague
 */

import java.util.*;
public class NearestNeighbors implements NearestNeighborsInterface{

    Point3D[] pointset; // storage for 3D points
    public NearestNeighbors(List<Point3D> points){
        pointset = points.toArray(new Point3D[0]);
    }
    
    /**
	* Find all points in a neighborhood of P
    * @param eps The radius we consider to be 'inside' the neighborhood
    * @param P   The point we want to find neighbors of
    * @return A list of points in the neihborhood of P
	*/
    public List<Point3D> rangeQuery(double eps, Point3D P){
        
        ArrayList<Point3D> out = new ArrayList<Point3D>();

        // Loop through all points
        for(Point3D q: pointset){
            //Check distance to see if q counts as a neighbor
            if (P.distance(q)<=eps){
                out.add(q);
            }
        }
        return out;
    }

    public List<Point3D> rangeQuery(Point3D point, double eps, List<Point3D> neighbors, KDTree.KDNode node) {
        return null;
    }

    public KDTree getKdTree() {
        return null;
    }
}
