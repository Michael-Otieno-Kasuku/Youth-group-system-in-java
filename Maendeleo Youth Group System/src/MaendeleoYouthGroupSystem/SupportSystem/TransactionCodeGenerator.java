package MaendeleoYouthGroupSystem.SupportSystem;

import java.util.Random;

public class TransactionCodeGenerator {
    public String generate(){
        String alphanumeric = "ABCDEFGHIJKLMNOPQRSTUVWXYZ012456789";
        //create a string builder
        StringBuilder sb = new StringBuilder();
        //Specify the length of the random String
        int length = 7;
        String randomString = "";
        Random random = new Random();//creating an object of random class
        for(int i = 0; i<length;i++){
            //generate random index
            int index = random.nextInt(alphanumeric.length());
            //set the character specified by the index from the string
            char randomChar = alphanumeric.charAt(index);
            //append the character to the string
            sb.append(randomChar);
            randomString = sb.toString();
        }
        return randomString;
    }
}
