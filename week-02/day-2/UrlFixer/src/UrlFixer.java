public class UrlFixer {
    public static void main(String... args) {
        String url = "https//www.reddit.com/r/nevertellmethebots";
        oddsbots(url);
        //httpsCor(url);
        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crutial component, find out what it is and insert it too!
        // Try to solve it more than once using different String functions!

        System.out.println(oddsbots(url));
    }

    public static String oddsbots(String url) {
        String newUrl = url.replace("bots", "odds");
        String newUrl2 = newUrl.replace("https", "https:");
        return newUrl2;
    }
}