package net.retimus.appdirect.domain.appdirect.event.subscription;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import net.retimus.appdirect.domain.appdirect.event.Event;
import net.retimus.appdirect.domain.appdirect.event.EventType;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@XmlRootElement(name = "event")
public class SubscriptionNoticeEvent extends Event {

    private SubscriptionNoticePayload payload;

    public SubscriptionNoticeEvent() {
        super(EventType.SUBSCRIPTION_NOTICE);
    }
}
