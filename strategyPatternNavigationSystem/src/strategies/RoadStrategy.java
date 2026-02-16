package strategies;

public class RoadStrategy implements RouteStrategy {

    @Override
    public double buildRoute(int distance) {
        return ((double)distance / 60) * 60;
    }
}
