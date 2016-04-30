package org.rcv.sim.poll;

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
public class PollNodeTests {

    @Autowired
    Session session;

    @Autowired
    PollRepository repo;

    static final String TEST_POLL_ID = "Dummy Poll";
    static final String TEST_POLL_NAME = "Dummy Poll";

    @Before
    public void createNode(){
        PollNode p = new PollNode(TEST_POLL_ID, TEST_POLL_NAME);
        repo.save(p);
    }

	@After
	public void buildGDB(){
		session.purgeDatabase();
	}


	@Test
	public void testBasicGetters(){
        Poll p = repo.findById(TEST_POLL_ID);
        assertEquals(p.getName(), TEST_POLL_NAME);
        assertEquals(p.getId(), TEST_POLL_ID);
    }

	//TODO - write a unit test for every method on every class you implement



}
