package scr.lab10.HTML;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.io.*;
import java.util.List;

public class MegaHTML {
    public static void main(String[] args) {
        String url = "https://asbestadm.ru/govinfo/govinfomvd/ ";
        String path = SetNewFile("scr/lab10/HTML/asb_news.txt");
        BufferedWriter bufWriter = null;

        try {
            bufWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path), "UTF-8"));

            Document doc = connectToURL(url);
            if (doc == null) {
                System.out.println("Не удалось загрузить страницу.");
                return;
            }

            Elements newParent = doc.select("div.uil-mo-table-1 > table > tbody");
            if (newParent.isEmpty()) {
                System.out.println("Не найдена таблица с новостями.");
                return;
            }

            List<Node> nodes = newParent.get(0).childNodes();

            for (int i = 2; i < nodes.size(); i++) {
                Node node = nodes.get(i);
                if (node instanceof Element row) {
                    Element link = row.getElementsByTag("a").first();
                    Element dateEl = row.getElementsByClass("left top min-width nowrap").first();

                    String title = link != null ? link.text() : "Нет заголовка";
                    String date = dateEl != null ? dateEl.text() : "Нет даты";

                    // Выводим в консоль
                    System.out.println("Подробная информация: " + title);
                    System.out.println("Дата размещения: " + date);
                    System.out.println();

                    // Записываем в файл
                    bufWriter.write("Подробная информация: " + title);
                    bufWriter.newLine();
                    bufWriter.write("Дата размещения: " + date);
                    bufWriter.newLine();
                    bufWriter.write(" ");
                    bufWriter.newLine();
                }
            }

            System.out.println("Данные успешно сохранены в файл: " + path);

        } catch (IOException e) {
            System.err.println("Ошибка ввода-вывода: " + e.getMessage());
        } finally {
            try {
                if (bufWriter != null) {
                    bufWriter.flush();
                    bufWriter.close();
                }
            } catch (IOException e) {
                System.err.println("Ошибка при закрытии файла: " + e.getMessage());
            }
        }
    }

    public static String SetNewFile(String path) {
        try {
            File file = new File(path);

            if (file.createNewFile()) {
                System.out.println("Файл создан: " + file.getAbsolutePath());
            } else {
                System.out.println("Файл уже существует: " + file.getAbsolutePath());
            }

            return file.getAbsolutePath();

        } catch (IOException e) {
            System.err.println("Ошибка создания файла: " + e.getMessage());
            return path;
        }
    }

    public static Document connectToURL(String url) {
        int maxAttempts = 3;
        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            try {
                System.out.println("Подключение к сайту... Попытка " + attempt);
                return Jsoup.connect(url).timeout(10000).get();
            } catch (IOException e) {
                System.err.println("Ошибка подключения (попытка " + attempt + "): " + e.getMessage());
                if (attempt < maxAttempts) {
                    try {
                        Thread.sleep(3000); // Пауза перед повторной попыткой
                    } catch (InterruptedException ie) {
                        Thread.currentThread().interrupt();
                        System.err.println("Поток прерван.");
                        return null;
                    }
                }
            }
        }
        return null;
    }
}