package com.xworkz.trainee;

public class TraineeName{
    int index = 0;
    String[] traineeeName = new String[4];
    public void addName(String name) {
        System.out.println("addName method invoked");
        if (index < traineeeName.length) {
            System.out.println("length is checked");
            traineeeName[index] = name;
            System.out.println("index is: " + index);
            System.out.println("name is : " + name);
            index++;
            System.out.println("now index is: " + index);
        } else {
            System.out.println("full");
        }
    }

    public void update(String oldValue, String newValue) {
        System.out.println("update method is invoked");
        System.out.println("oldValue is: " + oldValue + "  newValue is: " + newValue);
        boolean isFound = false;
        for (int i = 0; i < traineeeName.length; i++) {
            if (traineeeName[i] == oldValue) {
                System.out.println("name found");
                traineeeName[i] = newValue;
                isFound = true;
            }
        }
        if (isFound == true) {
            System.out.println("update is done");
            getNames();
        } else {
            System.out.println("update is not done");
        }
    }

    public void onDelete(String name) {
        System.out.println("Delete method is invoked");
        System.out.println("deleted name is: " + name);
        boolean isDeleted = false;
        for (int i = 0; i < traineeeName.length; i++) {
            if (traineeeName[i] == name) {
                traineeeName[i] = null;
                System.out.println("name is deleted");
                isDeleted = true;
            }
        }
        if (isDeleted == true) {
            read();

        } else {
            System.out.println("not deleted");
        }
    }


    public void getNames() {
        for (int i = 0; i < traineeeName.length; i++) {
            System.out.println(traineeeName[i]);
        }

    }

    public void read() {
        for (int i = 0; i < traineeeName.length; i++) {
            if (traineeeName[i] != null) {
                System.out.println(traineeeName[i]);
            }
        }


    }
}
