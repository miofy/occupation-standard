package org.reaactivestreams;

public interface Subscription {

    void request(long n);

    void cancel();
}
