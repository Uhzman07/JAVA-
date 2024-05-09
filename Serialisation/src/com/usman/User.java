package com.usman;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 1;// Note that once we have declared a distinct value for our serialVersionUID, it is recommended because any value we see other than the dictated value signifies an error and it is "static" because classes under serializable can not be affected
    String name;
    String password;

    public void sayHello(){
        System.out.println("Hello" + name);
    }
}
