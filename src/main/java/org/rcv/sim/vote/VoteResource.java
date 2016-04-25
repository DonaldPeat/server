package org.rcv.sim.vote;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
@RequestMapping("/votes")
public class VoteResource {

    @Autowired
    VoteService voteService;


    @RequestMapping(method = RequestMethod.POST)
    public void createVote(VoteInput input){
        voteService.saveVote(input);
    }







}
