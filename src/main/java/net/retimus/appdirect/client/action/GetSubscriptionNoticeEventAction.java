package net.retimus.appdirect.client.action;

import net.retimus.appdirect.client.AppDirectClient;
import net.retimus.appdirect.domain.appdirect.event.subscription.SubscriptionNoticeEvent;

public class GetSubscriptionNoticeEventAction extends GetEventAction {

    public GetSubscriptionNoticeEventAction(final AppDirectClient client) {
        super(client);
    }

    public ActionResult<SubscriptionNoticeEvent> execute() {
        return execute(SubscriptionNoticeEvent.class);
    }
}
