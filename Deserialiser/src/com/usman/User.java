package com.usman;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 1;// Note that once we have declared a distinct value for our serialVersionUID, it is recommended because any v

    String name;
    transient String password; // Note taht if we put transient, it automatically ignores the particular characteristics of the class instance for example, the password here is out as null instead of the saved password

    public void sayHello(){
        System.out.println("Hello" + name);
    }
}
