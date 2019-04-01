package org.reaactivestreams;

/**
 * 数据流处理者. 
 * 
 * 位于数据流生产者和数据流消费者之间,用于在发布者和订阅者之间转换消息.
 */
public interface Processor<T, R> extends Subscriber<T>, Publisher<R> {
}
