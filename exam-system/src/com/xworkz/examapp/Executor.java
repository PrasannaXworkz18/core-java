package com.xworkz.examapp;

import com.xworkz.examapp.exam.Exam;
import com.xworkz.examapp.exam.SupplimentoryExam;
import com.xworkz.examapp.hallticket.HallTicket;

public class Executor {
    public static void main(String args[]){

        HallTicket ticket = new HallTicket(345,"Highway","18CV872","Prasanna","4CA19CV011");

        //HallTicket ticket =null;
        Exam exam = new Exam();
        exam.fees=1300;

        //has a relationship
        exam.write(ticket);
        SupplimentoryExam supplimentoryExam = (SupplimentoryExam) exam;
        supplimentoryExam.write(hallTicket,1200);


    }
}
