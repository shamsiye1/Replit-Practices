package day2021_08_25;

import java.util.Scanner;

public class Sms {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        String sender;
        String phoneNumber;
        String messageBody;

    int lessIndex= message.indexOf('<');
    int moreIndex=message.indexOf('>');
    int phoneOpenIndex= message.indexOf('[');
    int phoneCloseIndex= message.indexOf(']');
    int msgStartIndex=message.indexOf('{');
    int msgEndIndex= message.indexOf('}');

    sender= message.substring(lessIndex+1, moreIndex);
    phoneNumber= message.substring(phoneOpenIndex+1,phoneCloseIndex);
    messageBody= message.substring(msgStartIndex+1,msgEndIndex);

        System.out.println("Sender: "+sender);
        System.out.println("Phone Number: "+phoneNumber);
        System.out.println("Message body: "+messageBody);































    }
}
