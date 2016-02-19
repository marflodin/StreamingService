package com.marflo.ws.streaming.eventprocessing.handler;

import com.espertech.esper.client.*;
import com.marflo.ws.streaming.eventprocessing.listener.CounterListener;

public class CounterHandler {
    private Configuration config = new Configuration();
    private EPServiceProvider epService;
    private static final String EVENT_LOCATION = "com.marflo.ws.streaming.eventprocessing.event";
    private CounterListener counterListener = new CounterListener();

    public CounterHandler() {
        // Recognise domain objects in this package in Esper.
        config.addEventTypeAutoName(EVENT_LOCATION);
        epService = EPServiceProviderManager.getDefaultProvider(config);
        createCounterExpression();
    }

    public EPServiceProvider getEpService() {
        return epService;
    }

    public CounterListener getListener() {
        return counterListener;
    }

    private void createCounterExpression() {
        String counterExpression = "select avg(amount) from CounterEvent.win:time(30 sec)";
        EPStatement statement = epService.getEPAdministrator().createEPL(counterExpression);
        statement.addListener(counterListener);
    }
}
