package designpattern.template_method.networks;

/**
 * @Auther: Soul_
 * @Date: 2022/10/27 15:01
 * @Description: 基础社交网络类
 */
public abstract class Network {
    String username;
    String password;

    Network() {}

    /**
     * Publish the data to whatever network.
     */
    public boolean post(String meesage){
        // Authenticate before posting. Every network uses a different
        // authentication method.
        if(logIn(this.username, this.password)) {
            // Send the post data.
            boolean result = sendData(meesage.getBytes());
            logOut();
            return result;
        }

        return false;
    }

    abstract boolean logIn(String username, String password);
    abstract boolean sendData(byte[] data);
    abstract void logOut();
}
