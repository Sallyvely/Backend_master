
public class HideNumber {

	public static String main(String phone_number) {

        String answer1 = phone_number.substring(phone_number.length()-4,phone_number.length());
        String answer2 = "";
        for(int i=0; i<=(phone_number.length()-5);i++){
            answer2=answer2+"*";
        }
        String answer=answer2+answer1;
        return answer;
	}

}
