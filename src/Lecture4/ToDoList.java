package Lecture4;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        ArrayList<Boolean> completed = new ArrayList<>();

        while (true) {
            System.out.println("\nTo-Do List Manager");
            System.out.println("1. Add a new task");
            System.out.println("2. Mark task as completed");
            System.out.println("3. Remove completed tasks");
            System.out.println("4. Display tasks");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter a new task: ");
                String task = sc.nextLine();
                tasks.add(task);
                completed.add(false);
                System.out.println("Task added!");
            } else if (choice == 2) {
                System.out.print("Enter task number to mark as completed: ");
                int taskNum = sc.nextInt();
                if (taskNum > 0 && taskNum <= tasks.size()) {
                    completed.set(taskNum - 1, true);
                    System.out.println("Task marked as completed!");
                } else {
                    System.out.println("Invalid task number.");
                }
            } else if (choice == 3) {
                for (int i = completed.size() - 1; i >= 0; i--) {
                    if (completed.get(i)) {
                        completed.remove(i);
                        tasks.remove(i);
                    }
                }
                System.out.println("Completed tasks removed.");
            } else if (choice == 4) {
                System.out.println("\nCurrent tasks:");
                if (tasks.isEmpty()) {
                    System.out.println("No tasks.");
                } else {
                    for (int i = 0; i < tasks.size(); i++) {
                        String status = completed.get(i) ? "[Completed]" : "[Pending]";
                        System.out.println((i + 1) + ". " + tasks.get(i) + " " + status);
                    }
                }
            } else if (choice == 5) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid option, try again.");
            }
        }

    }
}
