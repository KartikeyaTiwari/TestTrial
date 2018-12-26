package com.example.dell.testtrial;



import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.RootMatchers.isPlatformPopup;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withInputType;
import static android.support.test.espresso.matcher.ViewMatchers.withSpinnerText;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

import static java.lang.Thread.sleep;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;

import static org.hamcrest.core.AllOf.allOf;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.*;

public class LoaderActTest {

    @Rule
    public ActivityTestRule<LoaderAct> main2ActivityActivityTestRule=new ActivityTestRule<LoaderAct>(LoaderAct.class);



    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testspinner(){
        onView(withId(R.id.spinner)).perform(click());


        for(int i=0;i<5;i++)
        onData(allOf(is(instanceOf(String.class)))).atPosition(i).perform(click());
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



       // onView(withId( R.array.language)).check(matches((withText("Arabic"))));

    }


    @After
    public void tearDown() throws Exception {
    }
}