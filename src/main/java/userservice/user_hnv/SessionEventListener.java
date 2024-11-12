package userservice.user_hnv;

import org.springframework.context.event.EventListener;
import org.springframework.session.events.SessionCreatedEvent;
import org.springframework.session.events.SessionDeletedEvent;
import org.springframework.session.events.SessionDestroyedEvent;
import org.springframework.session.events.SessionExpiredEvent;
import org.springframework.stereotype.Component;

@Component
public class SessionEventListener {

    @EventListener
    public void processSessionCreatedEvent(SessionCreatedEvent event) {
        System.out.println("Session created: " + event.getSessionId());
    }

    @EventListener
    public void processSessionDeletedEvent(SessionDeletedEvent event) {
        System.out.println("Session deleted: " + event.getSessionId());
    }

    @EventListener
    public void processSessionDestroyedEvent(SessionDestroyedEvent event) {
        System.out.println("Session destroyed: " + event.getSessionId());
    }

    @EventListener
    public void processSessionExpiredEvent(SessionExpiredEvent event) {
        System.out.println("Session expired: " + event.getSessionId());
    }
}
