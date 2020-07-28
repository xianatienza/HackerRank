import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;


public class ScratchPaper {

    class Title {
        private String title;
        private String url;
        private String author;
        private int num_comments;
        private String story_id;
        private String story_title;
        private String parent_id;
        private int created_at;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public int getNum_comments() {
            return num_comments;
        }

        public void setNum_comments(int num_comments) {
            this.num_comments = num_comments;
        }

        public String getStory_id() {
            return story_id;
        }

        public void setStory_id(String story_id) {
            this.story_id = story_id;
        }

        public String getStory_title() {
            return story_title;
        }

        public void setStory_title(String story_title) {
            this.story_title = story_title;
        }

        public String getParent_id() {
            return parent_id;
        }

        public void setParent_id(String parent_id) {
            this.parent_id = parent_id;
        }

        public int getCreated_at() {
            return created_at;
        }

        public void setCreated_at(int created_at) {
            this.created_at = created_at;
        }
    }

    public static String sampleJsonReturn = "{\n" +
            "page: \"1\",\n" +
            "per_page: 10,\n" +
            "total: 3,\n" +
            "total_pages: 1,\n" +
            "data: [\n" +
            "{\n" +
            "title: \"A Message to Our Customers\",\n" +
            "url: \"http://www.apple.com/customer-letter/\",\n" +
            "author: \"epaga\",\n" +
            "num_comments: 967,\n" +
            "story_id: null,\n" +
            "story_title: null,\n" +
            "story_url: null,\n" +
            "parent_id: null,\n" +
            "created_at: 1455698317\n" +
            "},\n" +
            "{\n" +
            "title: \"“Was isolated from 1999 to 2006 with a 486. Built my own late 80s OS”\",\n" +
            "url: \"http://imgur.com/gallery/hRf2trV\",\n" +
            "author: \"epaga\",\n" +
            "num_comments: 265,\n" +
            "story_id: null,\n" +
            "story_title: null,\n" +
            "story_url: null,\n" +
            "parent_id: null,\n" +
            "created_at: 1418517626\n" +
            "},\n" +
            "{\n" +
            "title: \"Apple’s declining software quality\",\n" +
            "url: \"http://sudophilosophical.com/2016/02/04/apples-declining-software-quality/\",\n" +
            "author: \"epaga\",\n" +
            "num_comments: 705,\n" +
            "story_id: null,\n" +
            "story_title: null,\n" +
            "story_url: null,\n" +
            "parent_id: null,\n" +
            "created_at: 1454596037\n" +
            "}\n" +
            "]\n" +
            "}";

    /**
     SELECT "customer", id,  customer_name
     FROM customer
     WHERE id NOT IN (SELECT DISTINCT(customer_id) FROM invoice);
     *
     * */

    public static List<String> getArticleTitles2(String author) {
        //get page 1 for now
        //String listOfTitles = httpGetter("https://jsonmock.hackerrank.com/api/articles?author="+author+"&page=1");

        String sample = sampleJsonReturn;
//
//        GSON

        return null;
    }


    public static void main(String[] args) {
        try {
            URL robotsUrl = new URL("http://www.techcoil.com/robots.txt");
            HttpURLConnection urlConnection = (HttpURLConnection) robotsUrl.openConnection();
        } catch(Exception ex) {

        }

    }

//    public static List<String> getArticleTitles(String author) {
//
////            //get page 1 for now
////            String listOfTitles = httpGetter("https://jsonmock.hackerrank.com/api/articles?author="+author+"&page=1");
////            System.out.println(listOfTitles);
////
////            return new ArrayList();
//
//        }

        public static String httpGetter(String url) throws Exception {

            //initialize http client
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();

            //Call get
            HttpResponse<String> response = client.send(request,
                    HttpResponse.BodyHandlers.ofString());

            return response.body();
        }

    public static void sampleGet2() throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://webcode.me"))
                .build();

        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());

    }
    public static int findMinString(String t) {
        int max = -1;
        for(int i=0;i<t.length();i++) {
            if(t.replaceAll(t.substring(0,i),"").length() == 0) {
                if(i > max) {
                    max = i;
                }
            }
        }

        if(max == -1) {
            max = t.length();
        }
        return max;
    }

    public static boolean isDivisible(String s, String t) {
        if(s.replaceAll(t,"").length()==0) {
            return true;
        }
        return false;

    }

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {

        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<arr.length-3;i++) {
            for(int j=0; j<arr.length-3;j++) {
                sum = getArea(arr, i,j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    static int getArea(int[][] arr, int x, int y) {
        return arr[x][y]   +  arr[x+1][y]   + arr[x+2][y] +
                                 arr[x+1][y+1] +
                  arr[x][y+2] +  arr[x+1][y+2] + arr[x+2][y+2];
    }
}
