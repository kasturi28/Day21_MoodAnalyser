
public class MoodAnalyser {
	
	String msg;
    MoodAnalyser(){ }

    MoodAnalyser(String msg){
        this.msg = msg;
    }
    String analyseMood(){
        return analyseMood(msg);
    }
    String analyseMood(String msg){
        String stringArray[] = msg.split(" ");
        String result = " ";
        for(String var : stringArray){
            if(var.equalsIgnoreCase("happy")){
                result = "Happy";
                break;
            } else if (var.equalsIgnoreCase("sad")) {
                result = "Sad";
                break;
            }
        }

        if(result.equals(" ")){
            result = "Happy";
        }

        return result;
    }
}
class AnalyseMoodDemo{
    public static void main(String[] args) {

        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I am a Happy soul");
        System.out.println(mood);

    }

}
