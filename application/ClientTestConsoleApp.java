package application;

import model.TextTransformer;

import java.util.Scanner;

/**
 * Created by Администратор on 07.04.2016.
 */
public class ClientTestConsoleApp {

    public static void main(String[] args) {
        System.out.println("Enter your text:");
        Scanner userText = new Scanner(System.in);
        TextTransformer text = new TextTransformer(userText.nextLine());
        System.out.println(text.getWarpedText());
    }

}
