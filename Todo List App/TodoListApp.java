import java.util.ArrayList;
import java.util.Scanner;

public class TodoListApp {

    static class Task{

        String description;
        boolean isCompleted;

        Task(String description){
            this.description=description;
            this.isCompleted=false;
        }


        public String toString(){
            return (isCompleted?"[x] " : "[ ]")+description;
        }

    }

    public static void main(String[] args) {
        ArrayList<Task> tasks=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        int choice;


        do{

            System.out.println("To-Do List: ");
            System.out.println("1. Add Task");
            System.out.println("2. Display Task");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Remove Task");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            choice=scanner.nextInt();
            scanner.nextLine();


            switch (choice){
                case 1:
                    System.out.println("Enter task description: ");
                    String description=scanner.nextLine();
                    tasks.add(new Task(description));
                    break;
                case 2:
                    System.out.println("Task: ");
                    for (int i=0; i<tasks.size(); i++){
                        System.out.println((i+1)+". "+tasks.get(i));
                    }
                    break;
                case 3:
                    System.out.println("Enter task number to mark as completed: ");
                    int taskNumberToCompleted=scanner.nextInt();
                    if (taskNumberToCompleted>0 && taskNumberToCompleted<=tasks.size()){

                        tasks.get(taskNumberToCompleted-1).isCompleted=true;
                    }
                    else
                    {
                        System.out.println("Invalid task number.");
                    }
                    break;
                case 4:
                    System.out.println("Enter task number to remove: ");
                    int taskNumberToRemove=scanner.nextInt();
                    if (taskNumberToRemove>0 && taskNumberToRemove<=tasks.size()){

                        tasks.remove(taskNumberToRemove-1);
                    }
                    else
                    {
                        System.out.println("Invalid task number.");
                    }
                    break;
                case 5:
                    System.out.println("Existing the To-Do List app.Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice.Please enter a number between 1 and 5");
                    break;

            }
            System.out.println();
        }while (choice!=5);
        scanner.close();
    }
}
