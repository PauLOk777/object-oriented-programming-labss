package com.paul.sem1.lab1.view;

public class View {
    public static final String MAIN_MENU = "To select the option, write number of this and press enter:\n" +
            "1. Get a list of electives that " +
            "are taught by the instructor specified.\n"  +
            "2. Get an average student score " +
            "for the specified elective.\n" +
            "3. Get all electives.\n" +
            "If you want to exit from this app, write \"quit\".";
    public static final String INVITATION_TO_WRITE_TEACHER = "Write full name of teacher. " +
            "For example: \"Ivanov Ivan Ivanovich\".";
    public static final String INVITATION_TO_WRITE_ELECTIVE = "Write name of elective." +
            " For example: \"Ukrainian language\".";
    public static final String BAD_TEACHER_NAME = "Bad full name. Check instruction.";
    public static final String BAD_ELECTIVE_NAME = "Bad elective name. Check instruction.";
    public static final String BAD_QUERY = "Bad query, please read instruction again and choose correct variant.\n\n";
    public static final String QUIT = "Goodbye!";

    public void printOneMessage(String data) {
        System.out.println(data);
    }

    public void showAllElectives(String[] electives) {
        System.out.printf(
                ParseObjectElective.FORMAT,
                "Elective name", "Teacher", "Start date",
                "End date", "Students"
        );

        for (String elective: electives) {
            System.out.print(ParseObjectElective.parseToString(elective));
        }

        System.out.println("\n");
    }

    public void showElectives(String result) {
        if(result.isEmpty()) {
            System.out.println("This teacher does not teach anything\n\n");
        } else {
            System.out.println("Elective name\n" + result);
        }
    }

    public void averageMark(String electiveName, double average) {
        if(average == -1) {
            System.out.println("No any elective with this name.\n\n");
        } else {
            System.out.println("Average mark of " + electiveName + ": " + average + "\n\n");
        }
    }
}