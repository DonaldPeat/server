package org.rcv.sim.poll;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositories are concerned with persistence - loading and saving things
 * Note that we don't actually have to implement this: Because it extends GraphRepository, Spring creates a dynamic
 * "proxy" class that implements it for us.
 *
 * http://docs.spring.io/spring-data/data-neo4j/docs/4.1.1.RELEASE/reference/html/#reference_programming-model_repositories
 */
@Repository
public interface PollRepository extends GraphRepository<PollNode> {

    //This is a "finder method": http://docs.spring.io/spring-data/data-neo4j/docs/4.1.1.RELEASE/reference/html/#_queries_derived_from_finder_method_names
    PollNode findById(String id);


    @Query(" MATCH (poll:poll)<-[:CAST_IN]-(vote:vote)-[:CAST_TO]->(cand:candidate) " +
           " WHERE poll.id = {0} " +
           " RETURN poll, COLLECT(vote) AS votes, COLLECT(cand) AS candidates")//return result of reducer function instead of entire objects peep cypher handbook
    PollQueryResult fetch(String  id);



}

