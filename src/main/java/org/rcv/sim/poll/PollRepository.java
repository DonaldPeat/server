package org.rcv.sim.poll;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;

/**
 *
 */
@Repository
public interface PollRepository extends GraphRepository<PollNode> {

    //This is a "finder method": http://docs.spring.io/spring-data/data-neo4j/docs/4.1.1.RELEASE/reference/html/#_queries_derived_from_finder_method_names
    PollNode findById(String id);


    @Query(" MATCH (poll:poll)<-[:CAST_IN]-(vote:vote)-[:CAST_TO]->(cand:candidate) " +
           " WHERE poll.id = {0} " +
           " RETURN poll, COLLECT(vote) AS votes, COLLECT(cand) AS candidates")
    PollQueryResult fetch(String  id);



}

