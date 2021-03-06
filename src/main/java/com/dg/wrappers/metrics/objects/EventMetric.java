package com.dg.wrappers.metrics.objects;

import com.dg.wrappers.metrics.reporters.MetricsReporter;

/**
 * @author dima.golomozy
 */
public class EventMetric extends BaseMetric {
    public EventMetric(String aspect, MetricsReporter metricsReporter) {
        super(aspect, metricsReporter);
    }

    public void recordSetEvent(String eventName) {
        metricsReporter.setEvent(aspect, eventName);
    }
}
