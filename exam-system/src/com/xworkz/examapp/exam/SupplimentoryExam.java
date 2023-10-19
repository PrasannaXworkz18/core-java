package com.xworkz.examapp.exam;

import com.xworkz.examapp.hallticket.HallTicket;

public class SupplimentoryExam extends Exam {

    public int noOfAttempts=2;
    public boolean write(HallTicket hallticket ,int fees){
        if (noOfAttempts>1)
        return super.write(ticket);

    return  false;
    }
}
