package com.java_essential.tsarenko.lesson8.examples.example;

import java.io.IOException;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        try {
            String data = getData();
            System.out.println(data);
        } catch (IOException | ApiCallException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String getData() throws IOException, ApiCallException {
        URL url = new URL("https://gorest.co.in/public-api/userssss");
        throw new ApiCallException("api call failed");
//        URLConnection urlConnection = url.openConnection();
//        Scanner reader = new Scanner(urlConnection.getInputStream());
//        StringBuilder response = new StringBuilder();
//        while (reader.hasNext()) {
//            response.append(reader.nextLine());
//        }

    }
}
