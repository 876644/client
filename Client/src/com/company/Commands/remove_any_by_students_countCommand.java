package com.company.Commands;

public class remove_any_by_students_countCommand extends AbstractCommand {
    public  Long countOfStudents;
    private static final long serialVersionUID = 10;

    public remove_any_by_students_countCommand(Long countOfStudents) {
       this.countOfStudents = countOfStudents;
    }
}
