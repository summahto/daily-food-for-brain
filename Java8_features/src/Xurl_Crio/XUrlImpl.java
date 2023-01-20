package Xurl_Crio;


import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class XUrlImpl implements XUrl {


    private static Map<String, String> longToShortUrlMap = new HashMap<>();
    private static Map <String, String> shortToLongUrlMap = new HashMap<>();
    private static Map <String, Integer> countMap = new HashMap<>();
    public static final String shorturlvalue = "http://short.url/";

    @Override
    public String registerNewUrl(String longUrl) {

        if(!longToShortUrlMap.containsKey(longUrl)){
            StringBuilder sb = new StringBuilder(shorturlvalue);
            sb.append(generateRandomString());

            String shortUrl = sb.toString();

            longToShortUrlMap.put(longUrl, shortUrl);
            countMap.put(longUrl, 0);
            shortToLongUrlMap.put(shortUrl, longUrl);
        }


        return longToShortUrlMap.get(longUrl);
    }

    //function to generate unique alphanumeric sequence of length 9
    private StringBuilder generateRandomString() {
        String charsList = "abcdefghijklmnopqrstuvwxyz123456789";
        StringBuilder buffer = new StringBuilder();
        Random random = new Random();

        while(buffer.length() <= 9){
            int index =  (int) (random.nextFloat() * charsList.length());
            // System.out.println(index);
            buffer.append(charsList.charAt(index));
        }

        return buffer;
    }

    @Override
    public String registerNewUrl(String longUrl, String shortUrl) {
        if(!longToShortUrlMap.containsValue(shortUrl)){
            longToShortUrlMap.put(longUrl, shortUrl);
            shortToLongUrlMap.put(shortUrl, longUrl);
            countMap.put(longUrl, 0);
            return shortUrl;
        }

        return null;
    }

    @Override
    public String getUrl(String shortUrl) {

        if(shortToLongUrlMap.containsKey(shortUrl)){
            String corresponsingLongUrl = shortToLongUrlMap.get(shortUrl);
            Integer count = countMap.get(corresponsingLongUrl);
            countMap.put(corresponsingLongUrl, count+1);
            return  corresponsingLongUrl;
        }

        return null;

    }

    @Override
    public Integer getHitCount(String longUrl) {
        if(longToShortUrlMap.containsKey(longUrl)){
            return countMap.get(longUrl);
        }

        return 0;
    }

    @Override
    public String delete(String longUrl) {
        String value = null;
        if(longToShortUrlMap.containsKey(longUrl)){
            value = longToShortUrlMap.remove(longUrl);
            shortToLongUrlMap.remove(value);
        }
        return value;
    }

}
