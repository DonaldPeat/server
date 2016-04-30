package org.rcv.sim.vote;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.rcv.sim.candidate.Candidate;
import org.rcv.sim.poll.Poll;

import java.util.Map;

/**
 *
 */

public interface Vote {
    Poll getCastIn();
    Map<Integer, ? extends Candidate> getChoices();


    /**
     *
     */
    class DTO {
        @JsonProperty
        String pollId;

        @JsonProperty
        String[] choices;

    }
}
