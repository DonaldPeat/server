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
        return pollRepo.findById(id);
    }

    @Override
    public void createPoll(Poll.DTO input) {
        //TODO
        throw new RuntimeException("not implemented");
    }
}
