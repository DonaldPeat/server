package org.rcv.sim.poll;

import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public interface PollService {

    Poll loadPoll(String id);

    void createPoll(Poll.DTO input);


}
