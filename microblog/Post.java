package microblog;

public class Post
{
    //has a
    private static int nextPostNumber = 0;
    private int postNumber;
    private String postMessage;
    private String urlMessage;
    String newUser;

    //can do
    public Post(User username, String postMessage, String urlMessage)
    {
        this.postNumber = nextPostNumber;
        nextPostNumber++;
        this.postMessage = postMessage;
        this.urlMessage = urlMessage;
        this.newUser = username.getUsername();
    }

    public String getPost()
    {
        return "Post information: " + "\n" + postNumber + ") " + newUser + "\n" + postMessage + "\n" + urlMessage;
    }

}