package com.example.dell.testtrial;

import android.support.design.widget.NavigationView;
import android.support.test.espresso.ViewAction;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.contrib.DrawerActions;
import android.support.test.espresso.contrib.NavigationViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.v4.media.MediaMetadataCompat;
import android.view.Gravity;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;

import static android.support.test.espresso.action.ViewActions.click;
//import static android.support.test.espresso.contrib.NavigationViewActions.navigateTo;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.action.ViewActions.swipeLeft;
import static android.support.test.espresso.action.ViewActions.swipeUp;
import static android.support.test.espresso.action.ViewActions.typeTextIntoFocusedView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.contrib.DrawerActions.open;
import static android.support.test.espresso.contrib.DrawerMatchers.isClosed;
import static android.support.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withInputType;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

public class NavactTest {


    @Rule
    public ActivityTestRule<Navact> navactActivityTestRule = new ActivityTestRule<Navact>(Navact.class);


    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testnav() {
//Add dependence of "contrib" for navigation drawer recycler view and card view


        //onView(withId(R.id.drawer_layout))            (Working FINe)other way
        //   .check(matches(isClosed(Gravity.LEFT))) // Left Drawer should be closed.
        //   .perform(open());
        //  onView(withId(R.id.drawer_layout)).perform(DrawerActions.close());

        //onView(withText("Import"))
        //    .perform(click());   //Working fine for clicking menu item

        onView(withId(R.id.drawer_layout)).perform(DrawerActions.open());   //Working fine



        onView(withText("Import")).perform(click());

        onView(withId(R.id.drawer_layout)).perform(DrawerActions.close());  //Working fine
      //  onView(withContentDescription("action_settings")).perform(click());



    }


    @After
    public void tearDown() throws Exception {
    }
}