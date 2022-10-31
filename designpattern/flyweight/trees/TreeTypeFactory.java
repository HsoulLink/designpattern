package designpattern.flyweight.trees;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: Soul_
 * @Date: 2022/10/25 21:31
 * @Description: 树的创建工厂，封装创建享元数据的复杂机制
 */
public class TreeTypeFactory {
    static Map<String, TreeType> treeTypeMap = new HashMap<>();

    // 创建一个享元对象，如果在缓存中存在则直接从缓存中获取，如果没有就新建一个加入到缓存中并返回
    public static TreeType getTreeType(String name, Color color, String otherTreeData){
        TreeType treeType = treeTypeMap.get(name);

        if(treeType == null){
            treeType = new TreeType(name, color, otherTreeData);
            treeTypeMap.put(name, treeType);
        }

        return treeType;
    }
}
