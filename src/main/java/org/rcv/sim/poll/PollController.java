package org.rcv.sim.poll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controllers are purely concerned with I/O - receiving and responding to requests over REST
 */
@RestController
@RequestMapping("/polls")
public class PollController {

    @Autowired
    PollService pollService;


    /**
     * Donald/Jeff - getting your head around
     * - understanding
     *         where
     * @param input Input data for the poll to be created (received as JSON in body of POST)
     */
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public void createPoll(Poll.DTO input){
        //TODO implement this IN SPRINT 3
    }

    /**
     * Donald / Jeff: Realizing where this input object came from was a big Aha! moment for both of you.
     *
     * @param input the
     */
    @RequestMapping(value = "/{pollId}", method = RequestMethod.GET)
    public Poll getPoll(@PathVariable String pollId){
        return pollService.loadPoll(pollId);
    }



}
