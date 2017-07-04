package org.araymond.joal.core.events.announce;

import com.google.common.base.Preconditions;
import org.araymond.joal.core.ttorent.client.announce.Announcer;
import org.araymond.joal.core.ttorent.client.bandwidth.TorrentWithStats;

/**
 * Created by raymo on 22/05/2017.
 */
public class AnnouncerHasStoppedEvent extends AnnouncerEvent {

    public AnnouncerHasStoppedEvent(final Announcer announcer) {
        super(announcer);
    }

}
