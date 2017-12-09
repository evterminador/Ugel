package com.chasquionline.ugel;

import com.chasquionline.ugel.login.view.LoginActivity;
import com.sun.javafx.application.LauncherImpl;


/**
 * class App initialize
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        LauncherImpl.launchApplication(LoginActivity.class, MyPreloader.class, args);
    }
}
