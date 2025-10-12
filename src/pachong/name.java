package pachong;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class name {
    public static void main(String[] args) throws IOException {
        //从网站爬取姓氏和小男孩以及小女孩的名字，留取备用
        
        //先用字符串存网址
        String famliyNameNet = "http://www.360doc.com/content/23/0305/18/773384_1070583542.shtml";
        String boyNameNet = "https://zhuanlan.zhihu.com/p/4628460131";
        String girlNameNet = "https://www.hmz8.com/qiming/qiming8/57228.html";
        
        //三个都要用爬虫来爬取，这里写一个爬虫方法来爬取网页
        
        //爬取姓氏
        String getfamliyName = getname(famliyNameNet);

        ArrayList<String> famliyNameList = getData(getfamliyName, "(.{1,2})(,)" ,1);

        System.out.println(famliyNameList);
        //爬取小男孩名字
        String getboyName = getname(boyNameNet);

        //爬取小女孩名字
        String getgirlName = getname(girlNameNet);

    }

    private static ArrayList<String> getData(String getfamliyName,String regex,int index) {
        Pattern pattern = Pattern.compile(regex);
        ArrayList<String> list = new ArrayList<String>();

        Matcher matcher = pattern.matcher(getfamliyName);
        while (matcher.find()) {
            list.add(matcher.group(index));
        }

        return list;
    }

    //爬虫方法来爬取网页
    private static String getname(String net) throws IOException {
        //先定义装爬取的数据
        StringBuffer sb = new StringBuffer();
        //先打开网站
        URL url = new URL(net);

        URLConnection conn = url.openConnection();

        InputStreamReader isr = new InputStreamReader(conn.getInputStream());

        int len = 0;
        while ((len = isr.read()) !=-1){
            sb.append((char)len);
        }

        isr.close();

        return sb.toString();
    }
}
