package org.nextrtc.signalingserver;

import dagger.Component;
import org.nextrtc.signalingserver.api.NextRTCEndpoint;
import org.nextrtc.signalingserver.domain.resolver.ManualSignalResolver;
import org.nextrtc.signalingserver.eventbus.ManualEventDispatcher;
import org.nextrtc.signalingserver.modules.*;
import org.nextrtc.signalingserver.property.ManualNextRTCProperties;

import javax.inject.Singleton;

@Singleton
@Component(modules = {NextRTCBeans.class,
        NextRTCSignals.class,
        NextRTCRepositories.class,
        NextRTCFactories.class,
        NextRTCMedia.class})
public interface NextRTCComponent {

    ManualNextRTCProperties manualProperties();

    ManualEventDispatcher manualEventDispatcher();

    ManualSignalResolver manualSignalResolver();

    void inject(NextRTCEndpoint endpoint);

}
