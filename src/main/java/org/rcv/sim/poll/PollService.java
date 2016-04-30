package org.rcv.sim.poll;

import org.springframework.stereotype.Service;

/**
 * Services are concerned with the business logic of the application - e.g. executing the procedure for creating a poll
 */
@Service
public interface PollService {

    Poll loadPoll(String id);

    void createPoll(Poll.DTO input);


}
