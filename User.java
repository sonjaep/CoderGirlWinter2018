package Microblog;

import java.util.ArrayList;

public class User
{
    //has a:
    private String avatar;
    private String username;
    private String realName;
    private String email;
    //Post[] posts = new Post[];

    //for(int i = 0; i < post.size; i++)

    public ArrayList posts = new ArrayList();

    //can do:
    //make a post

    public User(String avatar, String username, String realName, String email)
    {
        this.avatar = avatar;
        this.username = username;
        this.realName = realName;
        this.email = email;
    }

    public String getUserDescription()
    {
        return "User Info: " + avatar + ", " + username + ", " + realName + ", " + email;
    }

    public String toString()
    {
        return this.username;
    }

    public String getUsername()
    {
        return username;
    }

    public void addNewPost(Post post)
    {
        posts.add(post);
    }

    public void getLastPost()
    {
        if(posts.size() > 0)
        {
            Post post = (Post) posts.get(posts.size() - 1);
            System.out.println(post.getPost());
        }
    }



}
