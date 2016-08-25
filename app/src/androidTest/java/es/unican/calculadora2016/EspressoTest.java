package es.unican.calculadora2016;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;

/**
 * Created by alejandro on 22/08/16.
 */
@RunWith(AndroidJUnit4.class)
public class EspressoTest {

    @Rule
    public ActivityTestRule<MainActivity> rule =
            new ActivityTestRule(MainActivity.class);

    @Test
    public void checkResta(){
        //Select an element of a spinner
        onView(withId(R.id.spinnerOperation)).perform(click());
        onData(allOf(is(instanceOf(String.class)))).atPosition(1).perform(click());
        //Write on editTexts
        onView(withId(R.id.editTextFirst)).perform(typeText("2.0"));
        onView(withId(R.id.editTextSecond)).perform(typeText("1.0"));
        //Click on the button Calcula
        onView(withId(R.id.buttonCalcula)).perform(click());
        onView(withId(R.id.textViewRes)).check(matches(withText("1.0")));
    }
}
