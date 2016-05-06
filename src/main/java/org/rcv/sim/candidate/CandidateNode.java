package org.rcv.sim.candidate;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * Representation of candidate in database.
 */
@NodeEntity()
public class CandidateNode implements Candidate {

    public CandidateNode(String id, String name,String photo, Integer votes) {
        this.name = name;
        this.id = id;
        this.photo = photo;
        this.votes = votes;
    }

    private CandidateNode(){}
    @GraphId private Long neo4jPrivateId;

    @Override
    public String getId() {
        return this.id;
        //throw new RuntimeException("not implemented");
    }

    @Override
    public String getName() {
        return this.name;
       // throw new RuntimeException("not implemented");
    }

    @Override
    public String getPhoto() {
        return this.photo;
        //throw new RuntimeException("not implemented");
    }

    @Override
    public Integer getVoteCount{
        return this.votes;
    }
}
