package context;

import strategies.RouteStrategy;

public class Navigator {

    public void executeRoute(RouteStrategy strategy, int distance) {
        double minutes = strategy.buildRoute(distance);
        System.out.println("Estimated time " + minutes + " minutes");
    }
}
