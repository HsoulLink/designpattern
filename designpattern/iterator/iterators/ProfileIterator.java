package designpattern.iterator.iterators;

import designpattern.iterator.profile.Profile;

/**
 * @Auther: Soul_
 * @Date: 2022/10/26 15:05
 * @Description: 定义档案接口
 */
public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
