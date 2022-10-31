package designpattern.prototype.shapes.cache;

import designpattern.prototype.shapes.Circle;
import designpattern.prototype.shapes.Rectangle;
import designpattern.prototype.shapes.Shape;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: Soul_
 * @Date: 2022/10/24 21:04
 * @Description: 原型注册站（原型工厂）
 * 原型工厂中包含一系列预定义的原型对象，只需要通过传递对象名称就能从工厂中获取到新的对象。工厂将搜索合适的原型，然后对其进行克隆，最后将副本返回
 */
public class BundledShapeCache {
    private Map<String, Shape> cache = new HashMap<>();

    public BundledShapeCache() {
        Circle circle = new Circle();
        circle.x = 5;
        circle.y = 7;
        circle.radius = 45;
        circle.color = "Green";

        Rectangle rectangle = new Rectangle();
        rectangle.x = 6;
        rectangle.y = 9;
        rectangle.width = 8;
        rectangle.height = 10;
        rectangle.color = "Blue";

        cache.put("Big green circle", circle);
        cache.put("Medium blue rectangle", rectangle);
    }

    public Shape put(String key, Shape shape){
        cache.put(key, shape);
        return shape;
    }

    public Shape get(String key) {
        // 返回克隆副本
        return cache.get(key).clone();
    }
}
