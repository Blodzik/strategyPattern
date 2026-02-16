package strategies;

public class WalkingStrategy implements RouteStrategy {

    @Override
    public double buildRoute(int distance) {
        return ((double)distance / 4) * 60;
    }
}
