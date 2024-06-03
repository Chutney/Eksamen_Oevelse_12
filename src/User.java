import java.util.Random;

public class User {

    private String fullName;
    private String userID;

    public User(String fullName) {
     this.fullName = fullName;
    }

    public boolean validUserID() {
        String firstHalf = userID.substring(0,4);
        String secondHalf = userID.substring(5);
        if(secondHalf.length() > 4) {
            return false;
        }

        if(!firstHalf.toLowerCase().equals(firstHalf)) {
            return false;
        }

        try {
            Integer.parseInt(secondHalf);
        }catch(Exception e) {
            return false;
        }

        return true;
    }

    public void createUserID() {
        String[] firstNameSplit = fullName.split(" ");

        String firstNameChar = firstNameSplit[0].substring(0,2);
        String secondNameChar = firstNameSplit[firstNameChar.length()-1].substring(0,2);
        Random rn = new Random();
        String randomNumber = "";
        for (int i = 0; i < 4; i++) {
            randomNumber += rn.nextInt(0,10);
        }

        userID = firstNameChar.toLowerCase() + secondNameChar.toLowerCase() + randomNumber;


    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }



}
