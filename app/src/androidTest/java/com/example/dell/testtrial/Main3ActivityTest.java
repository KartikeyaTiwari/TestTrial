package com.example.dell.testtrial;

import android.support.test.espresso.contrib.RecyclerViewActions;

import android.support.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import android.support.v7.widget.RecyclerView;
import static android.support.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static java.lang.Thread.sleep;
import static org.junit.Assert.*;

public class Main3ActivityTest {

    @Rule
    public ActivityTestRule<Main3Activity> activityTestRule=new ActivityTestRule<Main3Activity>(Main3Activity.class);
    private RecyclerView myrecyclerView;




    @Before
    public void setUp() throws Exception {
    }



    @Test
    public void Adapter(){

      // onView(withId(R.id.recyclerView)).perform(click());

for(int i=0;i<6;i++) {

   // onView(withId(R.id.recyclerView)).perform(RecyclerViewActions.actionOnItemAtPosition(1, click()));


    onView(withId(R.id.recyclerView)).perform(RecyclerViewActions.actionOnItemAtPosition(i, click()));
    try {
        sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

}

    }




    @After
    public void tearDown() throws Exception {
    }
}