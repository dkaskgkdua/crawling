package com.mj.crawling.naver.shop;

import org.jsoup.Connection;
import org.jsoup.Jsoup;

import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException {

        final String[] ctgrys = {"50000006", "50000008", "50000002", "50000003", "50000005", "50000004", "50000000", "50000007", "50000009", "50000010"
                , "50000023", "50000024", "50012520", "50000148", "50000160", "50013360", "50000149", "50012782", "50013881", "50000026"};

        for(int i = 0; i < ctgrys.length; i++) {
            Connection.Response response = Jsoup.connect("https://search.shopping.naver.com/api/search/all?catId=" + ctgrys[i] + "&eq=&frm=NVSHCAT&iq=&origQuery=%ED%9A%A8%EC%86%8C&pagingIndex=1&pagingSize=40&productSet=total&query=%ED%9A%A8%EC%86%8C&sort=rel&viewType=list&xq=")
                    .header("Accept", "application/json, text/plain, */*")
                    .header("Accept-Language", "ko-KR,ko;q=0.9,en-US;q=0.8,en;q=0.7")
                    .header("Connection", "keep-alive")
                    .cookie("NNB", "D7ZHYHPUUZWWI")
                    .cookie("SHP_BUCKET_ID", "1")
                    .cookie("ASID", "b6e4da24000001886b19241e00000053")
                    .cookie("_fbp", "fb.1.1692110280222.503272320")
                    .cookie("_ga", "GA1.2.1614141252.1692110281")
                    .cookie("_ga_Z0BR5YQQPG", "GS1.2.1692110281.1.0.1692110281.0.0.0")
                    .cookie("spage_uid", "")
                    .header("Referer", "https://search.shopping.naver.com/search/all?query=%ED%9A%A8%EC%86%8C&cat_id=&frm=NVSHATC")
                    .header("Sec-Fetch-Dest", "empty")
                    .header("Sec-Fetch-Mode", "cors")
                    .header("Sec-Fetch-Site", "same-origin")
                    .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/118.0.0.0 Safari/537.36")
                    .header("logic", "PART")
                    .header("sbth", "5abf6116aeb48be241d7f7a27fd4df87373c8068f2498f53b93074248e147d7bba9b491f0b5dd69e07ff4274320dd49b")
                    .header("sec-ch-ua", "\"Chromium\";v=\"118\", \"Google Chrome\";v=\"118\", \"Not=A?Brand\";v=\"99\"")
                    .header("sec-ch-ua-arch", "\"x86\"")
                    .header("sec-ch-ua-bitness", "\"64\"")
                    .header("sec-ch-ua-full-version-list", "\"Chromium\";v=\"118.0.5993.70\", \"Google Chrome\";v=\"118.0.5993.70\", \"Not=A?Brand\";v=\"99.0.0.0\"")
                    .header("sec-ch-ua-mobile", "?0")
                    .header("sec-ch-ua-model", "\"\"")
                    .header("sec-ch-ua-platform", "\"Windows\"")
                    .header("sec-ch-ua-platform-version", "\"10.0.0\"")
                    .header("sec-ch-ua-wow64", "?0")
                    .method(org.jsoup.Connection.Method.GET)
                    .ignoreContentType(true)
                    .execute();

            System.out.println("response = " + response.statusCode());
            if(i == 19) {
                System.out.println(response.parse());
            }

        }


    }
}
