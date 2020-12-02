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
        String reply =  responderModel.answer(question);
        assertEquals("5", reply);
    }

    @Test
    public void answerWithNull () {
        String question = "";
        String reply =  responderModel.answer(question);
        assertEquals("Ceiba", reply);
    }

    @Test
    public void answerWithReplyDiferent () {
        String question = "what is the sum of 3 and 2";
        String reply =  responderModel.answer(question);
        assertNotEquals("8", reply);
        assertEquals("5", reply);
    }
}
