package com.serveless;

import com.serverless.ResponderModel;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ResponderModelTest {

    ResponderModel responderModel;

    @Before
    public void setUp() {
        responderModel = new ResponderModel();
    }

    @Test
    public void answerWithQuestion () {
        String question = "what is the sum of 3 and 2";
        String reply =  responderModel.answer( question);
        assertEquals("5", reply);
    }

    @Test
    public void answerWithNull () {
        String question = "";
        String reply =  responderModel.answer( question);
        assertEquals("Ceiba", reply);
    }

    @Test
    public void answerWithPlus () {
        String question = "what is 3 plus 6";
        String reply =  responderModel.answer( question);
        assertNotEquals("Ceiba", reply);
        assertEquals("9", reply);

    }

    @Test
    public void answerWithReplyDiferent () {
        String question = "what is the sum of 3 and 2";
        String reply =  responderModel.answer(question);
        assertNotEquals("8", reply);
        assertEquals("5", reply);
    }

    @Test
    public void answerWithlargestNumber () {
        String question = "which of the following numbers is the largest: 526, 6";
        String reply =  responderModel.answer(question);
        assertNotEquals("8", reply);
        assertEquals("526", reply);
    }

    @Test
    public void answerWithMiltipledNumber () {
        String question = "what is 2 multiplied by 2";
        String reply =  responderModel.answer(question);
        assertNotEquals("8", reply);
        assertEquals("4", reply);
    }

    @Test
    public void answerWithMinusNumber () {
        String question = "what is 9 minus 14";
        String reply =  responderModel.answer(question);
        assertNotEquals("8", reply);
        assertEquals("-5", reply);
    }

    @Test
    public void answerWithPrimesNumber () {
        String question = "which of the following numbers are primes: 3, 2";
        String reply =  responderModel.answer(question);
        assertNotEquals("8", reply);
        assertEquals("3", reply);
    }

    @Test
    public void answerWithBananaNumber () {
        String question = "what colour is a banana";
        String reply =  responderModel.answer(question);
        assertEquals("yellow", reply);
    }

    @Test
    public void answerWithAgentNumber () {
        String question = "who played James Bond in the film Dr No";
        String reply =  responderModel.answer(question);
        assertEquals("Sean Connery", reply);
    }
}
