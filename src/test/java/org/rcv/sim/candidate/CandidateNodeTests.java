package org.rcv.sim.candidate;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.neo4j.ogm.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CandidateNodeTests {

        @Autowired
        Session session;

        @Autowired
        CandidateRepository repo;

        static final String TEST_CANDIDATE_ID = "CAND ID";
        static final String TEST_CANDIDATE_NAME = "CAND NAME";
        static final Integer TEST_VOTE_COUNT = 42;

        @Before
        public void createNode(){
            Candidate c = new CandidateNode(TEST_CANDIDATE_ID, TEST_CANDIDATE_NAME, TEST_VOTE_COUNT);
            repo.save(c);
        }

        @After
        public void buildGDB(){
            session.purgeDatabase();
        }


        @Test
        public void testBasicGetters(){
            Candidate c = repo.findById(TEST_CANDIDATE_ID);
            assertEquals(c.getName(), TEST_CANDIDATE_NAME);
            assertEquals(c.getId(), TEST_CANDIDATE_ID);
            assertEquals(c.getVoteCount(),TEST_VOTE_COUNT);
        }

        //TODO - write a unit test for every method on every class you implement



    }





