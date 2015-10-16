package net.retimus.appdirect.client.action;

import net.retimus.appdirect.client.AppDirectClient;
import net.retimus.appdirect.domain.appdirect.event.subscription.SubscriptionCancelEvent;

public class GetSubscriptionCancelEventAction extends GetEventAction {

    public GetSubscriptionCancelEventAction(final AppDirectClient client) {
        super(client);
    }

    public ActionResult<SubscriptionCancelEvent> execute() {
        return execute(SubscriptionCancelEvent.class);
    }
}
