package org.rcv.sim.poll;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import org.neo4j.ogm.annotation.Transient;
import org.rcv.sim.candidate.CandidateNode;
import org.rcv.sim.vote.CastToRelationship;
import org.rcv.sim.vote.VoteNode;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;


/**
 * Representation of a Poll in the database
 */

@NodeEntity()
public class PollNode implements Poll {
    @Transient
    public static final String CAST_IN_RELATIONSHIP_TYPE = "CAST_IN";

    String name;

    String id;

    @Relationship(direction = Relationship.INCOMING)
    Set<CastToRelationship>  votesIn = new HashSet<>(); // note:

    @Relationship
    Set<CandidateNode> candidates = new HashSet<>();

    public PollNode(String id, String name) {
        this.name = name;
        this.id = id;
    }





    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getId() {
        return this.id;
    }


    @Override
    public Collection<CandidateNode> getCandidates() {
        return candidates;   //TODO donald: super straight-forward
        throw new RuntimeException("not implemented");
    }

    @Override
    public Collection<VoteNode> getVotes() {
        //TODO donald: slightly less straight-forward
        throw new RuntimeException("not implemented");
    }


    // sdn boilerplate
    private PollNode(){}
    @GraphId private Long neo4jPrivateId;

}
