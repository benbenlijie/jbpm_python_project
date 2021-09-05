package com.myspace.script_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class HelloServices implements java.io.Serializable {

    private static final HelloServices INSTANCE = new HelloServices();
    
    public static HelloServices getInstance()
    {
        return INSTANCE;
    }
    
    static final long serialVersionUID = 1L;

    public HelloServices() {
    }

    public void sayHello(String name)
    {
        System.out.println("Hello "+name + " Working Directory: " + System.getProperty("user.dir"));

        Process proc;
        try {
            proc = Runtime.getRuntime().exec("python src/main/resources/python/test.py");
            BufferedReader reader = new BufferedReader(new InputStreamReader(proc.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
            proc.waitFor();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }



}