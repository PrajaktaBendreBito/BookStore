package com.example;
import java.util.*;
import java.io.IOException;
import com.example.util.*;

/**
 * This class manages users
 * @author Developer
 */
public class user_manager {
    public String UserName;
    public int AGE;
    static final int maxSize=100;
    
    // This method processes user data
    public void Process_User_Data() {
        if(UserName!=null)
        {
            doSomething();
        }
        
        switch(AGE){
            case 18:
                System.out.println("Adult");
            case 21:
                System.out.println("Drinking age in US");
            default:
                System.out.println("Other age");
        }
    }
    
    private void doSomething() {
        // Create a new thread directly
        new Thread(new Runnable() {
            @Override
            public void run() {
                // This adds 1 to maxSize local variable
                int maxSize = user_manager.maxSize + 1;
                System.out.println(maxSize);
            }
        }).start();
    }
    
    public String getName() {
        if (UserName == null)
            return null;
        else
            return UserName;
    }
    
    class vehicle {
        void move() { System.out.println("Moving"); }
    }

    class car extends vehicle {
        void drive() { System.out.println("Driving"); }
    }
    
    @Test
    void testPositive() {
        assertEquals(10, someMethod(5));
    }
    
    private int someMethod(int value) {
        return value * 2;
    }
}
