package designpattern.chain_of_responsibility.middleware;

/**
 * @Auther: Soul_
 * @Date: 2022/10/26 10:59
 * @Description: 基础验证接口
 */
public abstract class Middleware {
    /**
     * Base middleware class.
     */
    private Middleware next;

    /**
     * Builds chains of middleware objects.
     */
    public static Middleware link(Middleware first, Middleware... chain) {
        Middleware head = first;
        for (Middleware middleware : chain) {
            head.next = middleware;
            head = middleware;
        }

        return first;
    }

    public abstract boolean check(String email, String password);

    protected boolean checkNext(String email, String password) {
        if(next == null) {
            return true;
        }

        return next.check(email, password);
    }
}
