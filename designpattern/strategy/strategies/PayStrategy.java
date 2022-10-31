package designpattern.strategy.strategies;

/**
 * @Auther: Soul_
 * @Date: 2022/10/27 11:19
 * @Description: 通用的支付方法接口
 */
public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
