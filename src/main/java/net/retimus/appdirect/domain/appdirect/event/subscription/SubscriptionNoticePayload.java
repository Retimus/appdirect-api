package net.retimus.appdirect.domain.appdirect.event.subscription;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;
import lombok.ToString;

import net.retimus.appdirect.domain.appdirect.Notice;

@Data
@ToString
@XmlRootElement(name = "payload")
public class SubscriptionNoticePayload {
    Notice notice;
}
