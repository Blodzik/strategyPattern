import context.Navigator;
import strategies.RoadStrategy;
import strategies.WalkingStrategy;

public class Main {
    public static void main(String[] args) {
        Navigator navigator = new Navigator();
        navigator.executeRoute(new RoadStrategy(), 40);
        navigator.executeRoute(new WalkingStrategy(), 10);
    }
}