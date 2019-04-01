package org.reaactivestreams;

/**
 * 在发布者和订阅者之间创建异步非阻塞链接.
 */
public interface Subscription {

    /**
     * 请求数据上游发布者产生的数据.
     * 
     * @param n 该次需请求的项目数
     */
    void request(long n);

    /**
     * 取消数据流订阅. 
     */
    void cancel();
}
