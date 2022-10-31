package designpattern.chain_of_responsibility.middleware;

/**
 * @Auther: Soul_
 * @Date: 2022/10/26 11:16
 * @Description: 检查用户角色
 */
public class RoleCheckMiddleware extends Middleware {

    @Override
    public boolean check(String email, String password) {
        if(email.equals("admin@example.com")){
            System.out.println("Hello, admin!");
            return true;
        }

        System.out.println("Hello, user!");
        return checkNext(email, password);
    }
}
