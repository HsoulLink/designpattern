package designpattern.builder.components;

/**
 * @Auther: Soul_
 * @Date: 2022/10/24 22:36
 * @Description: 产品特征2
 */
public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        this.route = "221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London";
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }
}
