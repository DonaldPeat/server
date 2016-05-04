package org.rcv.sim.candidate;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 *
 */
@NodeEntity()
public class CandidateNode implements Candidate {

    //TODO add fields (which get persisted as properties on the node )

    public CandidateNode(String id, String name,String photo, Integer votes) {
        this.name = name;
        this.id = id;
        this.photo = photo;
        this.votes = votes;
    }


     // sdn boilerplate
    private CandidateNode(){}
    @GraphId private Long neo4jPrivateId;

    @Override
    public String getId() {
        //TODO
        return this.id;
        //throw new RuntimeException("not implemented");
    }

    @Override
    public String getName() {
        //TODO
        return this.name;
       // throw new RuntimeException("not implemented");
    }

    @Override
    public String getPhoto() {
        return this.photo;
        //TODO
        throw new RuntimeException("not implemented");
    }

    @Override
    public Integer getVoteCount{
        return this.votes;
    }
}
