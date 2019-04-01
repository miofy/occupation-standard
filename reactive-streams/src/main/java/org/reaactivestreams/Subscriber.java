package org.reaactivestreams;

/**
 * 数据流订阅者. 消费数据流.
 * 订阅者中的方法以严格的顺序进行调用.
 * 
 * onSubscribe -> onNext -> onError(可能不出现) -> onComplete
 */
public interface Subscriber<T> {

    /**
     * 订阅者在首次订阅发布者的消息时调用该方法.
     * 
     * @param subscription 调用subscription.request开始从处理器或发布者等上游接收项目.
     */
    void onSubscribe(Subscription subscription);

    /**
     * 当发布者收到项目时调用该方法.
     * 
     * @param t 待处理的项目
     */
    void onNext(T t);

    /**
     * 类似catch逻辑.
     * 当发生异常时调用该方法.
     * 
     * @param t 异常
     */
    void onError(Throwable t);

    /**
     * 类似finally逻辑. 
     * 用于发送流成功处理的通知.
     * 当发布者不再发布项目或发布者关闭时调用该方法.
     */
    void onComplete();
}
