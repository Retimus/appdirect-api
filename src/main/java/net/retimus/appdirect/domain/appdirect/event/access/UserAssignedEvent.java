package net.retimus.appdirect.domain.appdirect.event.access;

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
public class UserAssignedEvent extends Event {

    private AssignmentPayload payload;

    public UserAssignedEvent() {
        super(EventType.USER_ASSIGNMENT);
    }
}
