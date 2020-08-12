package hackerrank;

import java.util.*;
import java.util.stream.Collectors;

/**
 *
 * MAS,DVO
 * CEB,SOR
 * SOR,MAS
 * DVO,PLW
 * MNL,CEB
 *
 * starting point, ending point
 *
 *
 *
 */

public class FlightRoutes {



    public static void main(String[] args) {

        List<Route> routes = new ArrayList<>();
        routes.add(new Route("MAS","DVO"));
        routes.add(new Route("CEB","SOR"));
        routes.add(new Route("SOR","MAS"));
        routes.add(new Route("DVO","PLW"));
        routes.add(new Route("MNL","CEB"));

        findStartAndEnd(routes);
    }

    public static void findStartAndEnd(List<Route> routes){

        Map<String, String> mapRoutes = new HashMap<>();
        routes.stream().forEach( route -> mapRoutes.put(route.start, route.end));

        Set endPoints =  new HashSet(mapRoutes.values());
        Set startPoints = mapRoutes.keySet();

        String start = (String) startPoints.stream().filter( startPoint -> !endPoints.contains(startPoint)).findFirst().get();
        String last;


        String currPoint = start;
        while(mapRoutes.get(currPoint)!=null) {
            currPoint = mapRoutes.get(currPoint);
        }

        last = currPoint;
        System.out.println(start+","+last);
    }

    static class Route {

        public Route(String start, String end) {
            this.start = start;
            this.end = end;
        }
        public String start;

        public String end;


    }

}
