import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoodAnalyserTest {

	 @Test
	    public void givenSadMoodShouldreturnSad(){
	        MoodAnalyser moodAnalyser = new MoodAnalyser();
	        String result = moodAnalyser.analyseMood("I am in sad mood");
	        assertEquals("Sad",result);
	    }
	    @Test
	    public void givenAnyMoodShouldreturnSad(){
	        MoodAnalyser moodAnalyser = new MoodAnalyser();
	        String result = moodAnalyser.analyseMood("I am in any mood");
	        assertEquals("Happy",result);
	    }
	    @Test
	    public void givenHappyMoodShouldreturnHappy(){
	        MoodAnalyser moodAnalyser = new MoodAnalyser();
	        String result = moodAnalyser.analyseMood("I am in Happy mood");
	        assertEquals("Happy",result);
	    }
}
