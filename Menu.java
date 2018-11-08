package Microblog;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu
{
    static Scanner keyboard = new Scanner(System.in);

    public static User currentUser;

    public static ArrayList allPosts = new ArrayList();
    public static ArrayList allUsers = new ArrayList();


    //menu

    public void displayMenu()
    {
        String[] menuOptions = new String[5];
        menuOptions[0] = "1) Create a new user";
        menuOptions[1] = "2) Log in as an existing user";
        menuOptions[2] = "3) Create a post as the current user";
        menuOptions[3] = "4) Print all posts";
        menuOptions[4] = "5) Print all users";

        for (int i = 0; i < menuOptions.length; i++) {
            System.out.println(menuOptions[i]);
        }
        menu();

    }


    //actual menu where user makes selections...

    public void menu()
    {
        boolean keepGoing = true;

        while (keepGoing)
        {
            System.out.println("You are currently user " + currentUser);
            System.out.println("Please choose an option from the Main Menu.");
            System.out.println(" ");
            String userChoice = keyboard.nextLine();

            if (userChoice.equals("1"))
            {
                currentUser = createNewUser();
                addNewUser(currentUser);
            } else if (userChoice.equals("2"))
            {
                selectUser();
                System.out.println("Please choose a user.");
                int userNameChoice = keyboard.nextInt();
                keyboard.skip("\n");
                currentUser = (User) allUsers.get(userNameChoice);
            } else if (userChoice.equals("3"))
            {
                currentUser.getLastPost();
                System.out.println(" ");
                Post newPost = createNewPost(currentUser);
                currentUser.addNewPost(newPost);
            } else if (userChoice.equals("4"))
            {
                for(int i = 0; i < allUsers.size(); i++)
                {
                    currentUser = (User) allUsers.get(i);
                    printAllPosts();
                }
            } else if (userChoice.equals("5"))
            {
                for(int i = 0; i < allUsers.size(); i++)
                {
                    currentUser = (User) allUsers.get(i);
                    printAllUsers();
                }
            } else if (userChoice.equals("exit") || userChoice.equals("Exit"))
            {
                keepGoing = false;
            } else
            {
                System.out.println("Error: choose valid option: ");
            }

        }
    }


    //option 1: create a new user

    public static User createNewUser()
    {
        System.out.println("Please enter your avatar URL: ");
        String avatar = keyboard.nextLine();
        System.out.println("Please enter your username: ");
        String username = keyboard.nextLine();
        System.out.println("Please enter your first and last name: ");
        String realName = keyboard.nextLine();
        System.out.println("Please enter your email address: ");
        String email = keyboard.nextLine();

        User newUser = new User(avatar, username, realName, email);
        return newUser;
    }


    //option 1, part 2: save new user

    public void addNewUser(User newUser)
    {
        allUsers.add(newUser);
    }


    //option 2: log in as existing user

    public void selectUser()
    {
        for(int i = 0; i < allUsers.size(); i++)
        {
            User user = (User) allUsers.get(i);
            System.out.println(i + ": " + user.getUsername());
        }
        System.out.println();
    }


    //option 3: create a post as the current user

    public Post createNewPost(User user)
    {
        System.out.println("Write your message: ");
        String postMessage = keyboard.nextLine();
        System.out.println("Please enter the URL to this message: ");
        String urlMessage = keyboard.nextLine();

        Post newPost = new Post(user, postMessage, urlMessage);
        allPosts.add(newPost);
        return newPost;
    }


    //option 4: print all posts

    public void printAllPosts()
    {
        for(int i = 0; i < allPosts.size(); i++)
        {
            Post post = (Post) allPosts.get(i);
            System.out.println(i + ", " + "\n" + post.getPost());
        }
        System.out.println();
    }


    //option 5: print all users

    public void printAllUsers()
    {
        for(int i = 0; i < allUsers.size(); i++)
        {
            User user = (User) allUsers.get(i);
            System.out.println(i + ", " + "\n" + user.getUserDescription());
        }
        System.out.println();
    }


    //main menu

    public static void main(String[] args)
    {
        Menu blog = new Menu();
        blog.displayMenu();
    }

}