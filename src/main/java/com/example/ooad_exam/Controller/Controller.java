package com.example.ooad_exam.Controller;

import com.example.ooad_exam.Data.User_Pay;
import com.example.ooad_exam.Service.Payment;

@org.springframework.stereotype.Controller

        //API

public class Controller {

    private Payment pay;

    //Оплата
    public User_Pay make_pay(){
        return pay.newUserPay();
    }
}
