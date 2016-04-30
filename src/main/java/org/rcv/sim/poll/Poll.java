package org.rcv.sim.poll;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.rcv.sim.candidate.Candidate;
import org.rcv.sim.vote.Vote;

import java.util.Collection;

/**
 *
 */
public interface Poll {

    String getName();
    String getId();
    Collection<? extends Vote> getVotes();
    Collection<? extends Candidate> getCandidates();

    class DTO {
        @JsonProperty
        String name;

        @JsonProperty
        String id;

        @JsonProperty
        Collection<Candidate.DTO> candidates;

        @JsonProperty
        Collection<Vote.DTO> votes;

    }

}
