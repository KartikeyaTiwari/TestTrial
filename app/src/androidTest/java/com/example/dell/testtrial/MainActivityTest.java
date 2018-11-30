package com.example.dell.testtrial;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.TypeTextAction;
import android.support.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static java.lang.Thread.sleep;
import static org.junit.Assert.*;

public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule= new ActivityTestRule<MainActivity>(MainActivity.class);

    private String nm="Utter";

    @Before
    public void setUp() throws Exception {
    }


    @Test
    public void testuser(){

        onView(withId(R.id.editTextenter)).perform(typeText(nm));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.button)).perform(click());
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.textView)).check(matches(withText(nm)));

    }



    @Test
    public void testclick(){



        onView(withId(R.id.editTextenter)).perform(typeText(nm));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.button)).perform(click());
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.textView)).check(matches(withText(nm)));
        onView(withId(R.id.nxt)).perform(click());

    }

    @Test
    public void loader(){

//be the  change
        onView(withId(R.id.butchat)).perform(click());

        onView(withId(R.id.showprogress))
                .check(matches(isDisplayed()));
        try {
            sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }


    @After
    public void tearDown() throws Exception {
    }
}