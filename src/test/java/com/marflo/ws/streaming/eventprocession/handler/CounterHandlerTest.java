package com.marflo.ws.streaming.eventprocession.handler;

import com.espertech.esper.client.EPServiceProvider;
import com.marflo.ws.streaming.eventprocessing.event.CounterEvent;
import com.marflo.ws.streaming.eventprocessing.handler.CounterHandler;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

public class CounterHandlerTest {
    private static Logger LOG = LoggerFactory.getLogger(CounterHandlerTest.class);
    CounterEvent event;
    CounterHandler handler;
    EPServiceProvider epService;

    @Before
    public void setup() {
        handler = new CounterHandler();
        epService = handler.getEpService();
    }

    @Test
    public void createMultipleCounterEventsTest() {
        epService = handler.getEpService();
        epService.getEPRuntime().sendEvent(new CounterEvent("id-1", new BigDecimal(12.0)));
        epService.getEPRuntime().sendEvent(new CounterEvent("id-1", new BigDecimal(12.0)));
        epService.getEPRuntime().sendEvent(new CounterEvent("id-1", new BigDecimal(12.0)));
        epService.getEPRuntime().sendEvent(new CounterEvent("id-2", new BigDecimal(12.0)));

    }
}
