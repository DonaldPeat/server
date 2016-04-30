package org.rcv.sim.poll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
@RequestMapping("/polls")
public class PollController {

    @Autowired
    PollService pollService;


    @RequestMapping
    public void createPoll(Poll.DTO input){

    }

    @RequestMapping(value = "/{pollId}", method = RequestMethod.GET)
    public Poll getPoll(@PathVariable String pollId){
        return pollService.loadPoll(pollId);
    }



}
