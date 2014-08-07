package com.my;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * Created by Tsa on 2014-08-03.
 */
@Named//("helloContr")
@SessionScoped
public class HelloBean implements Serializable{

    public String getMsg() {
        return "Ala ma kotę2223";
    }
}
