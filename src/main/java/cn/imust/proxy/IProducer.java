package cn.imust.proxy;

/**
 * 对生产厂家的要求接口
 *      代理商挑选生产厂家是要求 厂家必须要有销售和售后功能
 */
public interface IProducer {

    /**
     * 销售
     * @param money
     */
    public void saleProduct(float money);

    /**
     * 售后
     * @param money
     */
    public void afterService(float money);
}
