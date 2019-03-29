package org.reaactivestreams;

public interface Subscriber<T> {

    void onSubscribe(Subscription subscription);

    void onNext(T t);

    void onError(Throwable t);

    void onComplete();
}
