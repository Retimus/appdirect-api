package net.retimus.appdirect.client.action;

import net.retimus.appdirect.client.AppDirectClient;

public abstract class AppDirectActionImpl implements AppDirectAction {

    protected AppDirectClient client;

    public AppDirectActionImpl(AppDirectClient client) {
        this.client = client;
    }
}
