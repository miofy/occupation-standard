package org.reaactivestreams;

/**
 * 数据流发布者. 生产数据流.
 */
public interface Publisher<T> {

    /**
     * 添加消息订阅者.
     * 
     * @param s 消息订阅者
     */
    void subscribe(Subscriber<? super T> s);
}
