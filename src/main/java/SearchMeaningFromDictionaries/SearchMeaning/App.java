package SearchMeaningFromDictionaries.SearchMeaning;

import static java.lang.System.*;
import java.net.*;
import java.util.Scanner;
import java.io.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;

class App {
	// WenScrap()throws Exception{
	public static void main(String[] args) throws Exception {

		Scanner x = new Scanner(new File("src/main/java/SearchMeaningFromDictionaries/SearchMeaning/WordsList.txt"));

		try {
			PrintStream myconsole = new PrintStream(
					"src/main/java/SearchMeaningFromDictionaries/SearchMeaning/MeaningsList.txt");

			System.setOut(myconsole);

			while (x.hasNext()) {
				String word = x.next();

				try {
					// String url = "https://en.oxforddictionaries.com/definition/"+word[i];
					String url = "https://en.oxforddictionaries.com/definition/" + word;
					Document document = Jsoup.connect(url).get();
					Elements links = document.select("span[class=ind]");
					for (Element link : links) {
						// System.out.println(word+" "+link.text());
						myconsole.println(word + "        " + link.text());

						break;
					}

				} catch (Exception e) {
					myconsole.println(word + "        " + "Connection Refused");
				}

				try {
					// String
					// url1="https://www.macmillandictionary.com/us/dictionary/american/"+word[i];
					String url1 = "https://www.macmillandictionary.com/us/dictionary/american/" + word;
					Document document1 = Jsoup.connect(url1).get();
					Elements links1 = document1.select("span[class=DEFINITION]");
					for (Element link : links1) {
						// System.out.println(word+" "+link.text());
						myconsole.println(word + "        " + link.text());
						break;
					}
				} catch (Exception e) {
					myconsole.println(word + "        " + "Connection Refused");
				}

				try {

					String url2 = "https://www.ldoceonline.com/dictionary/" + word;
					Document document2 = Jsoup.connect(url2).get();
					Elements metaTags = document2.getElementsByTag("meta");
					// Elements links2=document2.select("head[class=metadata]");
					for (Element metaTag : metaTags) {
						String content = metaTag.attr("content");
						String name = metaTag.attr("name");
						// System.out.println(word+" "+content);
						myconsole.print(word + "        " + content);
						break;
					}
				} catch (Exception e) {
					myconsole.println(word + "        " + "Connection Refused");
				}

				try {
					// String url3="https://www.merriam-webster.com/dictionary/"+word[i];
					String url3 = "https://www.merriam-webster.com/dictionary/" + word;

					Document document3 = Jsoup.connect(url3).get();
					Elements metaTags3 = document3.getElementsByTag("meta");
					String description3 = document3.select("meta[name=description]").get(0).attr("content");
					for (Element metaTag : metaTags3) {
						String content3 = metaTag.attr("content");
						String name3 = metaTag.attr("name");
						// System.out.println(word+" "+description3);
						myconsole.println(word + "        " + description3);
						break;
					}
				} catch (Exception e) {
					myconsole.println(word + "          " + "Connection Refused");
				}

				try {
					// String url4="http://www.thefreedictionary.com/"+word[i];
					String url4 = "http://www.thefreedictionary.com/" + word;
					Document document4 = Jsoup.connect(url4).get();
					Elements metaTags4 = document4.getElementsByTag("meta");
					String description4 = document4.select("meta[name=description]").get(0).attr("content");
					for (Element metaTag : metaTags4) {
						String content4 = metaTag.attr("content");
						String name4 = metaTag.attr("name");
						// System.out.println(word+" "+description4);
						myconsole.println(word + "        " + description4);
						break;
					}
				} catch (Exception e) {
					myconsole.println(word + "        " + "Connection Refused");
				}

				try {
					// String url5="https://www.vocabulary.com/dictionary/"+word[i];
					String url5 = "https://www.vocabulary.com/dictionary/" + word;
					Document document5 = Jsoup.connect(url5).get();
					Elements metaTags5 = document5.getElementsByTag("meta");
					String description5 = document5.select("meta[name=description]").get(0).attr("content");
					for (Element metaTag : metaTags5) {
						String content5 = metaTag.attr("content");
						String name5 = metaTag.attr("name");
						// System.out.println(word+" "+description5);
						myconsole.println(word + "        " + description5);
						break;
					}
				} catch (Exception e) {
					myconsole.println(word + "        " + "Connection Refused");
				}

				try {
					// String url6="http://www.dictionary.com/browse/"+word[i]+"?s=t";
					String url6 = "http://www.dictionary.com/browse/" + word + "?s=t";
					Document document6 = Jsoup.connect(url6).get();
					Elements metaTags6 = document6.getElementsByTag("meta");
					String description6 = document6.select("meta[name=description]").get(0).attr("content");
					for (Element metaTag : metaTags6) {
						String content6 = metaTag.attr("content");
						String name6 = metaTag.attr("name");
						// System.out.println(word+" "+description6);
						myconsole.println(word + "        " + description6);
						break;
					}
				} catch (Exception e) {
					myconsole.print("Connection Refused");
				}

				try {
					// String url7 = "http://learnersdictionary.com/definition/"+word[i];
					String url7 = "http://learnersdictionary.com/definition/" + word;
					Document document7 = Jsoup.connect(url7).get();
					Elements links7 = document7.select("span[class=def_text]");
					for (Element link : links7) {
						// System.out.println(word+" "+link.text());
						myconsole.println(word + "        " + link.text());
						break;
					}
				} catch (Exception e) {
					myconsole.println(word + "        " + "Connection Refused");
				}

				try {
					// String
					// url8="http://www.yourdictionary.com/"+word[i]+"?direct_search_result=yes";
					String url8 = "http://www.yourdictionary.com/" + word + "?direct_search_result=yes";
					Document document8 = Jsoup.connect(url8).get();
					Elements metaTags8 = document8.getElementsByTag("meta");
					String description8 = document8.select("meta[name=description]").get(0).attr("content");
					for (Element metaTag : metaTags8) {
						String content8 = metaTag.attr("content");
						String name8 = metaTag.attr("name");
						// System.out.println(word+" "+description8);
						myconsole.println(word + "        " + description8);
						break;
					}
				} catch (Exception e) {
					myconsole.println(word + "        " + "Connection Refused");
				}

				try {
					// String
					// url9="https://dictionary.cambridge.org/us/dictionary/english/"+word[i];
					String url9 = "https://dictionary.cambridge.org/us/dictionary/english/" + word;
					Document document9 = Jsoup.connect(url9).get();
					Elements metaTags9 = document9.getElementsByTag("meta");
					String description9 = document9.select("meta[name=description]").get(0).attr("content");
					for (Element metaTag : metaTags9) {
						String content9 = metaTag.attr("content");
						String name9 = metaTag.attr("name");
						// System.out.println(word+" "+description9);
						myconsole.println(word + "         " + description9);
						break;
					}
				} catch (Exception e) {
					myconsole.println(word + "        " + "Connection Refused");
				}

			}

		} catch (FileNotFoundException fx) {
			System.out.println(fx);
		}

		x.close();

	}

}