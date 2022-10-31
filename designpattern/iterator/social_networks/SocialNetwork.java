package designpattern.iterator.social_networks;

import designpattern.iterator.iterators.ProfileIterator;

/**
 * @Auther: Soul_
 * @Date: 2022/10/26 15:17
 * @Description: 定义通用的社交网络接口
 */
public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}
