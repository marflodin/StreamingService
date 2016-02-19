package com.marflo.ws.streaming.eventprocessing.listener;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CounterListener implements UpdateListener {

    private static Logger LOG = LoggerFactory.getLogger(CounterListener.class);

    @Override
    public void update(EventBean[] newEvents, EventBean[] oldEvents) {
        EventBean event = newEvents[0];
        System.out.println("avg=" + event.get("avg(amount)"));
        LOG.debug("test!");
    }
}
