package net.retimus.appdirect.domain.appdirect.event.subscription;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import net.retimus.appdirect.domain.appdirect.event.Event;
import net.retimus.appdirect.domain.appdirect.event.EventType;

@Data
@ToString
@EqualsAndHashCode(callSuper = true)
@XmlRootElement(name = "event")
public class SubscriptionCancelEvent extends Event {

    private SubscriptionCancelPayload payload;

    public SubscriptionCancelEvent() {
        super(EventType.SUBSCRIPTION_CANCEL);
    }


}
