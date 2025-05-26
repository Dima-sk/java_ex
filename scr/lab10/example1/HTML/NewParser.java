package scr.lab10.example1.HTML;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.io.*;
import java.util.List;

public class NewParser {
    public static void main(String[] args) throws IOException {
        try {
            Document doc = Jsoup.connect("https://asbestadm.ru/govinfo/govinfomvd/ ").get();
            Elements newParent = doc.select("div.uil-mo-table-1 > table > tbody");
            List<Node> nodes = newParent.get(0).childNodes();

            for (int i = 2; i < nodes.size(); i++) {
                Node node = nodes.get(i);
                if (node instanceof Element row) {
                    Element link = row.getElementsByTag("a").first();
                    if (link != null) {
                        System.out.println("Подробная информация: " + link.text());
                    }

                    Element dateEl = row.getElementsByClass("left top min-width nowrap").first();
                    if (dateEl != null) {
                        System.out.println("Дата размещения: " + dateEl.text());
                    }

                    System.out.println();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}