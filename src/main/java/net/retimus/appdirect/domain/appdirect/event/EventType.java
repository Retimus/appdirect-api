package net.retimus.appdirect.domain.appdirect.event;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public enum EventType {
    SUBSCRIPTION_ORDER,
    SUBSCRIPTION_CHANGE,
    SUBSCRIPTION_CANCEL,
    SUBSCRIPTION_NOTICE,
    USER_ASSIGNMENT,
    USER_UNASSIGNMENT
}
