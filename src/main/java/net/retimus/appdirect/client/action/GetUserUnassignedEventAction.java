package net.retimus.appdirect.client.action;

import net.retimus.appdirect.client.AppDirectClient;
import net.retimus.appdirect.domain.appdirect.event.access.UserUnassignedEvent;

public class GetUserUnassignedEventAction extends GetEventAction {

    public GetUserUnassignedEventAction(final AppDirectClient client) {
        super(client);
    }

    public ActionResult<UserUnassignedEvent> execute() {
        return super.execute(UserUnassignedEvent.class);
    }
}
