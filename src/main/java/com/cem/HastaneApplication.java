package com.cem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import static com.cem.constants.RestApiUrls.*;

@SpringBootApplication
public class HastaneApplication {
    public static void main(String[] args) {
        SpringApplication.run(HastaneApplication.class,args);
//        System.setProperty("java.awt.headless", "false");
//        // Create Swing components
//        JFrame frame = new JFrame("Swing UI");
//        JButton hastaKayitButton = new JButton("Get Data");
//        JLabel label = new JLabel();
//
//        // Add components to frame
//        frame.getContentPane().add(hastaKayitButton);
//        frame.getContentPane().add(label);
//        frame.setSize(300, 200);
//        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
//        frame.setVisible(true);
//
//        // Add ActionListener to button
//        hastaKayitButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                try {
//                    // Make HTTP GET request to Spring controller
//                    URL url = new URL("http://localhost:8080"+HASTA+GET_ALL);
//                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//                    connection.setRequestMethod("POST");
//
//                    // Read response
//                    BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//                    String response = reader.readLine();
//
//                    // Set response text to label
//                    label.setText(response);
//
//                    // Close connection
//                    connection.disconnect();
//                } catch (IOException ex) {
//                    ex.printStackTrace();
//                }
//            }
//        });
    }
}