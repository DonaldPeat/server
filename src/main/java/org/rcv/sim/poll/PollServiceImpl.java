package org.rcv.sim.poll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 */
@Component
public class PollServiceImpl implements PollService {

    @Autowired
    PollRepository pollRepo;

    @Override
    public Poll loadPoll(String id) {
        //TODO donald
        throw new RuntimeException("not implemented");
    }

    @Override
    public void createPoll(Poll.DTO input) {
        //TODO donald - do this one last
        throw new RuntimeException("not implemented");
    }
}
