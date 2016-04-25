package org.rcv.sim.vote;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 */
public class VoteInput {
    @JsonProperty
    String userId;

    @JsonProperty
    String pollId;

    @JsonProperty
    String[] choices;




}
