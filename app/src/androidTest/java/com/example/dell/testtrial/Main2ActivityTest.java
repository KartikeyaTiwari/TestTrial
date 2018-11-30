package com.example.dell.testtrial;

import android.support.test.espresso.Espresso;

import android.support.test.espresso.ViewAction;
import android.support.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;

import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withInputType;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;


public class Main2ActivityTest {

    @Rule
    public ActivityTestRule<Main2Activity> main2ActivityActivityTestRule=new ActivityTestRule<Main2Activity>(Main2Activity.class);

    @Before
    public void setUp() throws Exception {
    }


    private  int a=12;
    private  int b=12;
    private  int c=24;

    @Test
    public void testdd(){

        onView(withId(R.id.editTextnum1)).perform(typeText(String.valueOf(a)));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.editTextnum2)).perform(typeText(String.valueOf(b)));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.add)).perform(click());
        onView(withId(R.id.result)).check(matches(withInputType(c)));

    }

    @After
    public void tearDown() throws Exception {
    }

}