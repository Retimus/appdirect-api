package net.retimus.appdirect.client.action;

public interface AppDirectAction {
   <T> ActionResult<T> execute(Class<T> resultType);
}
