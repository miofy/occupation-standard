package org.reaactivestreams;

public interface Processor<T, R> extends Subscriber<T>, Publisher<R> {
}
